package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val snorri = setOf(
    Card(
        "Rune Sigils",
        """
            Target a unit adjacent to you;
            if a rune is active:
            ::rune_bird::: You may target a minion in range instead.
            ::rune_axe::: +3 ::attack_gold:: Attack.
            ::rune_anvil::: If you target a hero, gain 3 coins.
            ::rune_horn::: Repeat once on a different hero in range.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT, Trait.ATTACK_HERO, Trait.ATTACK_MINION),
    ),
    Card(
        "Rune Shards",
        """
            Target a hero adjacent to you;
            if a rune is active:
            ::rune_axe::: +3 ::attack_gold:: Attack.
            ::rune_anvil::: Gain 2 coins.
            ::rune_horn::: Repeat once on a different hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_HERO),
    ),
    Card(
        "Inscribe the Runes",
        """
            Give yourself 4 ::rune_axe_marker::::rune_bird_marker::::rune_anvil_marker::::rune_horn_marker:: Rune markers
            and place one below each of your turn slots.
            A rune is active as long as it is below the
            turn slot matching the current turn.
            Rune markers are not removed at the
            end of round, nor if you are defeated.
        """.trimIndent(),
        Color.SILVER,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
        traits = setOf(Trait.END_OF_ROUND, Trait.USING_MARKERS),
    ),
    Card(
        "Rune Mastery",
        """
            Each time you perform an action, choose
            one inactive rune; that rune counts as
            a second active rune for this action.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = emptySet(),
    ),
    Card(
        "Safe Passage",
        """
            If the ::rune_bird:: rune is active,
            **This turn:** You may ignore obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        secondaryDefense = 5,
        traits = setOf(Trait.THIS_TURN, Trait.IGNORING_OBSTACLES),
    ),
    Card(
        "Runic Dagger",
        """
            Target a unit adjacent to you.
            After the attack: If the ::rune_anvil:: rune is active,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 6,
        traits = setOf(Trait.HEALING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Oath of Endurance",
        """
            If a rune is active:
            ::rune_horn::: Block a basic attack.
            ::rune_axe::: Block a non-ranged attack.
            **This Turn:** You are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN),
    ),
    Card(
        "Hidden Passage",
        """
            If a rune is active:
            ::rune_bird::: **This turn:** You may ignore obstacles.
            ::rune_anvil::: **This turn:** You are immune to enemy
            actions.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN, Trait.IGNORING_OBSTACLES),
    ),
    Card(
        "Ancestral Boon",
        """
            If a rune is active,
            a friendly hero in radius may:
            ::rune_axe::: Swap a resolved card with a card in hand.
            ::rune_anvil::: Retrieve all their discarded cards.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.DISCARD_TEAM),
    ),
    Card(
        "Runic Hammer",
        """
            Before the attack: If the ::rune_horn:: rune
            is active, you may move 1 space.
            Target a unit adjacent to you.
            After the attack: If the ::rune_anvil:: rune is active,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HEALING_SELF, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Runecaster",
        """
            Target a unit at maximum range.
            After the attack: If a rune is active:
            ::rune_horn::: Move up to 2 spaces.
            ::rune_axe::: An enemy hero who was adjacent to the
            target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.HIGH_RANGE_ATTACK, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Oath of Fortitude",
        """
            If a rune is active:
            ::rune_horn::: Block a basic attack;
            ::rune_axe::: Block a non-ranged attack;
            ::rune_bird::: Block a ranged attack;
            **This Turn:** You are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN),
    ),
    Card(
        "Runetrap",
        """
            If a rune is active, an enemy hero in radius:
            ::rune_horn::: Discards a green card, if able.
            ::rune_axe::: Discards a silver card, if able.
            ::rune_anvil::: Discards a blue card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD),
    ),
    Card(
        "Deep Passage",
        """
            If a rune is active:
            ::rune_bird::: **This turn:** You may ignore obstacles.
            ::rune_anvil::: **This turn:** You are immune to enemy
            actions.
            ::rune_horn::: Gain +2 ::movement_blue:: Movement.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN, Trait.IGNORING_OBSTACLES, Trait.STAT_CHANGING),
    ),
    Card(
        "Ancestral Grace",
        """
            If a rune is active,
            a friendly hero in radius may:
            ::rune_axe::: Swap a resolved card with a card in hand.
            ::rune_anvil::: Retrieve all their discarded cards.
            ::rune_bird::: Swap one of their items with an item on
            their card of the same tier and color.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.DISCARD_TEAM),
    ),
    Card(
        "Runic Battleaxe",
        """
            Before the attack: If the ::rune_horn:: rune
            is active, you may move 1 space.
            Target a unit adjacent to you.
            After the attack: If a rune is active:
            ::rune_axe::: May repeat once on an enemy minion.
            ::rune_anvil::: You may retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.AREA,
        traits = setOf(Trait.HEALING_SELF, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Runeblaster",
        """
            If the ::rune_bird:: rune is active, target a unit in range,
            otherwise target a unit at maximum range.
            After the attack: If a rune is active:
            ::rune_horn::: Move up to 2 spaces.
            ::rune_axe::: An enemy hero who was adjacent to the
            target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.HIGH_RANGE_ATTACK, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Oath of Perseverance",
        """
            Choose one active rune:
            ::rune_horn::: Block a basic attack;
            ::rune_axe::: Block a non-ranged attack;
            ::rune_bird::: Block a ranged attack;
            ::rune_anvil::: Block a non-basic attack;
            **This Turn:** You are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN),
    ),
    Card(
        "Runebomb",
        """
            Choose one active rune; depending on
            that rune, an enemy hero in radius:
            ::rune_horn::: Discards a green card, if able.
            ::rune_axe::: Discards a silver card, if able.
            ::rune_anvil::: Discards a blue card, if able.
            ::rune_bird::: Discards a gold card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD),
    ),
)