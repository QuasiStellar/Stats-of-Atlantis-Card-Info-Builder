#!/usr/bin/env python3
"""
Regenerate `traits = setOf(...)` for all hero cards.

Usage:
  python scripts/update_hero_traits.py
"""

from __future__ import annotations

import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
HEROES_DIR = ROOT / "src" / "main" / "kotlin" / "heroes"

CARD_OR_SPELL_RE = re.compile(r"(?P<kind>Card|Spell)\((?P<body>.*?)\n\s*\),", re.S)

TRAIT_ORDER = [
    "FARMING_FOR_SELF",
    "FARMING_FOR_TEAM",
    "HEALING_SELF",
    "HEALING_TEAM",
    "HEALING_ENEMY",
    "DEFEAT",
    "DISCARD",
    "DISCARD_OR_KILL",
    "DISCARD_TEAM",
    "HIGH_RANGE_ATTACK",
    "PUSHING_UNITS",
    "PUSHING_HEROES",
    "PUSHING_MINIONS",
    "PUSHING_TOKENS",
    "IMMUNITY_GAIN",
    "IMMUNITY_IGNORE",
    "MOVING_HEROES",
    "MOVING_SELF",
    "MOVING_TEAM",
    "MOVING_ENEMY",
    "MOVING_MINIONS",
    "MOVING_TOKENS",
    "MOVING_UNITS",
    "PLACING_HEROES",
    "PLACING_SELF",
    "PLACING_TEAM",
    "PLACING_ENEMY",
    "PLACING_MINIONS",
    "PLACING_TOKENS",
    "PLACING_UNITS",
    "SWAPPING_HEROES",
    "SWAPPING_SELF",
    "SWAPPING_TEAM",
    "SWAPPING_ENEMY",
    "SWAPPING_MINIONS",
    "SWAPPING_TOKENS",
    "SWAPPING_UNITS",
    "REMOVING",
    "THIS_TURN",
    "NEXT_TURN",
    "END_OF_TURN",
    "THIS_ROUND",
    "END_OF_ROUND",
    "AFTER_THE_ATTACK",
    "BEFORE_THE_ATTACK",
    "SCALING",
    "MINION_BATTLE",
    "FAST_TRAVEL",
    "MULTIPLE_CHOICE",
    "IGNORING_OBSTACLES",
    "GIVING_MARKERS",
    "USING_MARKERS",
    "USING_TOKENS",
    "STAT_CHANGING",
    "RESPAWN",
    "SPAWN_POINTS",
    "STRAIGHT_LINE",
    "NOT_STRAIGHT_LINE",
    "TERRAIN",
    "COUNTS_AS",
    "ATTACK_UNIT",
    "ATTACK_HERO",
    "ATTACK_MINION",
]
TRAIT_INDEX = {trait: i for i, trait in enumerate(TRAIT_ORDER)}


def parse_field(body: str, name: str) -> str | None:
    match = re.search(rf"\b{name}\s*=\s*([^,\n]+)", body)
    return match.group(1).strip() if match else None


def normalize(description: str) -> str:
    value = description.lower()
    value = value.replace("**", " ")
    value = value.replace("—", "-")
    value = re.sub(r"::[^:]+::", " ", value)
    return re.sub(r"\s+", " ", value)


def add(traits: set[str], condition: bool, trait: str) -> None:
    if condition:
        traits.add(trait)


def infer_traits(body: str, description_raw: str, description: str) -> set[str]:
    traits: set[str] = set()

    primary_action = parse_field(body, "primaryAction")
    primary_action = primary_action.split(".")[-1] if primary_action else None
    modifier = parse_field(body, "modifier")
    modifier = modifier.split(".")[-1] if modifier else None
    secondary_attack = parse_field(body, "secondaryAttack")

    modifier_value_raw = parse_field(body, "modifierValue")
    try:
        modifier_value = (
            int(re.sub(r"[^0-9-]", "", modifier_value_raw))
            if modifier_value_raw
            else None
        )
    except ValueError:
        modifier_value = None

    primary_value_sign = parse_field(body, "primaryValueSign")
    modifier_value_sign = parse_field(body, "modifierValueSign")
    moves_the_target = "move the target" in description
    targets_hero = bool(re.search(r"\btarget (an? )?(enemy |friendly )?hero\b", description))
    targets_minion = bool(re.search(r"\btarget (an? )?(enemy |friendly )?minion\b", description))
    targets_unit = bool(re.search(r"\btarget (an? )?(enemy |friendly )?unit\b", description))
    targets_token = bool(re.search(r"\btarget (an? )?token\b", description)) or (
        "target a unit or a token" in description
    )

    # Phrase traits.
    add(traits, "after the attack" in description, "AFTER_THE_ATTACK")
    add(traits, "before the attack" in description, "BEFORE_THE_ATTACK")
    add(traits, "count as" in description, "COUNTS_AS")
    add(traits, "this turn" in description, "THIS_TURN")
    add(traits, "next turn" in description or "previous turn slot" in description, "NEXT_TURN")
    add(traits, "end of turn" in description, "END_OF_TURN")
    add(traits, "this round" in description, "THIS_ROUND")
    add(traits, "end of round" in description, "END_OF_ROUND")
    add(traits, "minion battle" in description, "MINION_BATTLE")
    add(traits, "fast travel" in description, "FAST_TRAVEL")
    add(traits, "respawn" in description, "RESPAWN")
    add(traits, "spawn point" in description, "SPAWN_POINTS")
    add(traits, "terrain" in description, "TERRAIN")
    add(traits, " straight line" in description, "STRAIGHT_LINE")
    add(traits, "not in a straight line" in description, "NOT_STRAIGHT_LINE")
    add(
        traits,
        "ignore obstacles" in description
        or "ignoring obstacles" in description
        or "move through" in description
        or "moving through" in description,
        "IGNORING_OBSTACLES",
    )
    add(traits, "ignore immunity" in description, "IMMUNITY_IGNORE")
    add(
        traits,
        "you are immune" in description
        or "cannot be moved, pushed, swapped or placed by enemy heroes" in description,
        "IMMUNITY_GAIN",
    )
    marker_mentioned = "marker" in description
    marker_movement = bool(
        re.search(r"\b(give|gives|giving|retrieve|retrieves|retrieved|pass|passes|passed)\b[^.]{0,80}\bmarker\b", description)
        or re.search(r"\bmarker\b[^.]{0,80}\b(give|gives|given|retrieve|retrieves|retrieved|pass|passes|passed)\b", description)
    )
    marker_usage = bool(
        re.search(r"\b(has|have|with|if)\b[^.]{0,80}\bmarker\b", description)
        or re.search(r"\bmarker\b[^.]{0,80}\b(has|have|with)\b", description)
    )
    add(traits, marker_movement, "GIVING_MARKERS")
    add(traits, marker_mentioned and (marker_usage or not marker_movement), "USING_MARKERS")
    add(traits, " token" in description or "tokens" in description, "USING_TOKENS")
    add(traits, "choose " in description and ">>" in description_raw, "MULTIPLE_CHOICE")
    add(
        traits,
        primary_value_sign == "Sign.PLUS" or modifier_value_sign == "Sign.PLUS",
        "SCALING",
    )

    # Discard / healing / farming.
    discard_or_kill = (
        bool(re.search(r"\bdiscards? (an? )?[^.;]*card\b[^.;]*(, )?or is defeated\b", description))
        or "discards a card, or is defeated" in description
        or "discards a card or is defeated" in description
    )
    enemy_discard = bool(
        re.search(r"\benemy hero\b[^.;]*\bdiscards? (an? )?[^.;]*card\b", description)
    ) or bool(re.search(r"\bthat hero\b[^.;]*\bdiscards? (an? )?[^.;]*card\b", description))
    add(traits, discard_or_kill, "DISCARD_OR_KILL")
    add(
        traits,
        (not discard_or_kill)
        and (
            enemy_discard
            or ("enemy hero" in description and "discard that card" in description)
        ),
        "DISCARD",
    )
    add(traits, "friendly hero" in description and "discard" in description, "DISCARD_TEAM")

    generic_hero_retrieve = bool(re.search(r"\ba hero\b[^.]*\bretrieve a discarded card\b", description))
    explicit_team_retrieve = bool(
        re.search(r"\bfriendly hero\b[^.]*\bretrieve a discarded card\b", description)
    ) or bool(re.search(r"\bhave a friendly hero\b[^.]*\bretrieve a discarded card\b", description))
    explicit_enemy_retrieve = bool(
        re.search(r"\benemy hero\b[^.]*\bmay retrieve a discarded card\b", description)
    ) or bool(re.search(r"\bhave an enemy hero\b[^.]*\bretrieve a discarded card\b", description))

    add(
        traits,
        "you may retrieve a discarded card" in description
        or "you retrieve a discarded card" in description
        or "also retrieve a discarded card" in description
        or "retrieve a discarded attack card" in description
        or (
            "retrieve a discarded card" in description
            and "you may retrieve" not in description
            and "a hero" not in description
            and "friendly hero" not in description
            and "enemy hero" in description
        ),
        "HEALING_SELF",
    )
    add(traits, explicit_team_retrieve or generic_hero_retrieve, "HEALING_TEAM")
    add(traits, explicit_enemy_retrieve or generic_hero_retrieve, "HEALING_ENEMY")

    add(
        traits,
        ("you gain" in description and "coin" in description)
        or "gain 1 coin" in description
        or "gain 2 coin" in description
        or "gain 3 coin" in description
        or "gain 4 coin" in description,
        "FARMING_FOR_SELF",
    )
    add(
        traits,
        "friendly hero" in description and "gain" in description and "coin" in description,
        "FARMING_FOR_TEAM",
    )
    add(traits, bool(re.search(r"\bdefeat\b", description)), "DEFEAT")

    # Positioning: move/place/swap/push/remove.
    has_push = bool(re.search(r"\bpush(?:ed)?\b", description))
    add(
        traits,
        has_push and bool(re.search(r"\bpush(?:ed)?[^.;]*\bunit(s)?\b", description)),
        "PUSHING_UNITS",
    )
    add(
        traits,
        has_push and bool(re.search(r"\bpush(?:ed)?[^.;]*\bhero(es)?\b", description)),
        "PUSHING_HEROES",
    )
    add(
        traits,
        has_push and bool(re.search(r"\bpush(?:ed)?[^.;]*\bminion(s)?\b", description)),
        "PUSHING_MINIONS",
    )
    add(
        traits,
        has_push and bool(re.search(r"\bpush(?:ed)?[^.;]*\btoken(s)?\b", description)),
        "PUSHING_TOKENS",
    )
    add(traits, " remove " in f" {description} " and "not removed" not in description, "REMOVING")

    add(traits, "place yourself" in description, "PLACING_SELF")
    add(traits, "place friendly" in description or "place a friendly" in description, "PLACING_TEAM")
    add(
        traits,
        "place enemy" in description
        or "place an enemy" in description
        or "place that hero" in description,
        "PLACING_ENEMY",
    )
    add(traits, "place a minion" in description or "place minion" in description, "PLACING_MINIONS")
    add(traits, "place a token" in description or "place token" in description, "PLACING_TOKENS")
    add(
        traits,
        "place a hero" in description or "place that hero" in description,
        "PLACING_HEROES",
    )
    add(
        traits,
        "place a unit" in description or "place that unit" in description,
        "PLACING_UNITS",
    )

    has_swap = bool(re.search(r"\bswap\b", description))
    if "swap with" in description:
        traits.add("SWAPPING_SELF")
    add(
        traits,
        has_swap and ("swap with friendly" in description or "swap with a friendly" in description),
        "SWAPPING_TEAM",
    )
    add(
        traits,
        has_swap
        and (
            "swap with enemy" in description
            or "swap with an enemy" in description
            or "swap an enemy" in description
        ),
        "SWAPPING_ENEMY",
    )
    add(
        traits,
        has_swap
        and (
            "swap with a minion" in description
            or "swap with an enemy minion" in description
            or "enemy minion" in description
        ),
        "SWAPPING_MINIONS",
    )
    add(
        traits,
        has_swap
        and ("swap with a token" in description or "swap with token" in description or "with a token" in description),
        "SWAPPING_TOKENS",
    )
    add(
        traits,
        has_swap
        and (
            "swap with a hero" in description
            or "swap with an enemy hero" in description
            or "swap an enemy hero" in description
            or "swap a hero" in description
        ),
        "SWAPPING_HEROES",
    )
    add(
        traits,
        has_swap
        and (
            "swap with a unit" in description
            or "swap with either a unit" in description
            or "swap a unit" in description
        ),
        "SWAPPING_UNITS",
    )

    add(
        traits,
        bool(re.search(r"\bmove (an? )?enemy\b", description))
        or "move that hero" in description,
        "MOVING_ENEMY",
    )
    add(traits, bool(re.search(r"\bmove (an? )?friendly\b", description)), "MOVING_TEAM")
    add(
        traits,
        bool(re.search(r"\bmove (an? )?minion\b", description))
        or "move up to 1 minion" in description
        or "move up to 2 minions" in description
        or "move that minion" in description
        or (moves_the_target and targets_minion),
        "MOVING_MINIONS",
    )
    add(
        traits,
        bool(re.search(r"\bmove (an? )?token(s)?\b", description))
        or (moves_the_target and targets_token),
        "MOVING_TOKENS",
    )
    add(
        traits,
        bool(re.search(r"\bmove (an? )?hero(es)?\b", description))
        or "move that hero" in description
        or ("enemy hero in radius" in description and bool(re.search(r"\bmove\b", description)))
        or (moves_the_target and targets_hero),
        "MOVING_HEROES",
    )
    add(
        traits,
        bool(re.search(r"\bmove (an? )?unit(s)?\b", description))
        or "move another unit" in description
        or "move that unit" in description
        or (moves_the_target and targets_unit),
        "MOVING_UNITS",
    )

    self_move = False
    if re.search(r"\bmove (up to )?\d+(, \d+| or \d+)*( spaces?| space)\b", description):
        self_move = True
    if (
        "move into the space it occupied" in description
        or "move in the opposite direction" in description
        or "move in a straight line towards" in description
    ):
        self_move = True
    if "you may move" in description:
        if not re.search(
            r"you may move (another |an? |up to \d+ )?(enemy|friendly|minion|unit|hero|token)\b",
            description,
        ):
            self_move = True
    add(traits, self_move, "MOVING_SELF")

    # Attack traits.
    if primary_action == "ATTACK":
        add(
            traits,
            bool(re.search(r"target (an? )?(enemy )?hero\b", description))
            or "target that hero" in description,
            "ATTACK_HERO",
        )
        add(
            traits,
            bool(re.search(r"target (an? )?(enemy )?minion\b", description))
            or "target that minion" in description,
            "ATTACK_MINION",
        )
        add(
            traits,
            bool(re.search(r"target (an? )?(enemy |friendly )?unit\b", description))
            or "target that unit" in description,
            "ATTACK_UNIT",
        )
        add(traits, modifier == "RANGE" and modifier_value is not None and modifier_value >= 3, "HIGH_RANGE_ATTACK")

    if secondary_attack is not None:
        traits.add("ATTACK_UNIT")

    # Generic stat changes.
    stat_markers = [" attack", " defense", " initiative", " movement", " radius", " range"]
    stat_change = any(
        token in description for token in ["+1", "+2", "+3", "+4", "+5", "+6", "-1", "-2", "-3", "-4", "-5", "-6"]
    ) and any(marker in description for marker in stat_markers)
    stat_change = stat_change or "cannot fast travel, or move more than 1 space" in description
    add(traits, stat_change, "STAT_CHANGING")

    return traits


def render_traits(traits: set[str]) -> str:
    ordered = sorted(traits, key=lambda trait: TRAIT_INDEX[trait])
    if not ordered:
        return "traits = emptySet(),"
    values = ", ".join(f"Trait.{trait}" for trait in ordered)
    return f"traits = setOf({values}),"


def rewrite_entry(match: re.Match[str]) -> str:
    kind = match.group("kind")
    body = match.group("body")
    description_match = re.search(r'"""(.*?)"""\.trimIndent\(\)', body, re.S)
    description_raw = description_match.group(1) if description_match else ""
    description = normalize(description_raw)

    traits = infer_traits(body, description_raw, description)
    body_without_traits = re.sub(
        r"\n\s*traits\s*=\s*(setOf\(.*?\)|emptySet\(\))\s*,",
        "",
        body,
        flags=re.S,
    )
    traits_line = render_traits(traits)
    return f"{kind}({body_without_traits}\n        {traits_line}\n    ),"


def ensure_trait_import(content: str) -> str:
    if "import Trait" in content:
        return content

    lines = content.splitlines()
    insert_at = None
    for i, line in enumerate(lines):
        if line.startswith("import "):
            insert_at = i + 1

    if insert_at is None:
        return content

    lines.insert(insert_at, "import Trait")
    return "\n".join(lines) + ("\n" if content.endswith("\n") else "")


def main() -> None:
    updated_files = 0
    for file_path in sorted(HEROES_DIR.glob("*.kt")):
        original = file_path.read_text(encoding="utf-8")
        updated = ensure_trait_import(original)
        updated = CARD_OR_SPELL_RE.sub(rewrite_entry, updated)
        if updated != original:
            file_path.write_text(updated, encoding="utf-8")
            updated_files += 1

    print(f"Updated {updated_files} hero files.")


if __name__ == "__main__":
    main()
