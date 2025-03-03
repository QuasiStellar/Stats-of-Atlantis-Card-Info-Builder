package heroes

import Action
import Card
import Color
import Item
import Modifier
import Spell

val gydion = setOf(
    Card(
        "Cantrip",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Shocking Grasp" ~(To repel a foe!)
            >> "Magic Missile" ~(To blast at range!)
            >> "Expeditious Retreat" ~(To dart a great distance!)
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryDefense = 1,
    ),
    Card(
        "Cheap Trick",
        """
            Cast the "Expeditious Retreat"
            spell in the spellbook.
            ~(To dart a great distance!)
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 1,
    ),
    Card(
        "Prepare Spells",
        """
            Add all spell cards to the spellbook. Only
            Gydion can look at the cards in the spellbook.
            As each spell is cast, remove it from the
            spellbook faceup. The action on the spell card
            is performed by the hero casting the spell.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Elementary Enchantment",
        """
            Cast the "Suggestion" spell in the spellbook.
            ~(Compel the opposing champion to take a few extra steps.)
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
        secondaryMovement = 2,
    ),
    Card(
        "Elementary Evocation",
        """
            Cast the "Burning Hands" spell in the spellbook.
            ~(Burn multiple opponents in near vicinity.)
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Elementary Abjuration",
        """
            Cast the "Shield" spell in the spellbook.
            ~(The magic shield protects against mundane threats.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Lesser Evocation",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Burning Hands"
            >> "Fireball"
            ~(Wait for your allies to clear the area before hurling a fireball!)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Lesser Necromancy",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Vampiric Touch"
            >> "Create Undead"
            ~(Harm your foe to heal yourself. Raise an undead servant.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Greater Evocation",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Burning Hands"
            >> "Fireball"
            >> "Sunburst"
            ~(Sunburst's reach and power grows with every cast spell.)
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Greater Necromancy",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Vampiric Touch"
            >> "Create Undead"
            >> "Energy Drain"
            ~(Drain energy from a foe in sight to restore your vitality.)
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Lesser Enchantment",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Suggestion"
            >> "Dominate Person"
            ~(Turn the dominated person against their own troops.)
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Lesser Transmutation",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Midas Touch"
            >> "Disintegrate"
            ~(Create gold. Turn objects and lesser creatures into dust.)
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Greater Enchantment",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Suggestion"
            >> "Dominate Person"
            >> "Power Word Kill"
            ~(Command a weakened foe within earshot to perish instantly.)
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.RANGE,
    ),
    Card(
        "Greater Transmutation",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Midas Touch"
            >> "Disintegrate"
            >> "Polymorph"
            ~(Polymorph enemies into creatures or objects and vice versa.)
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Lesser Abjuration",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Shield"
            >> "Banishment"
            ~(Touch anything to have it banished where you please.)
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Lesser Conjuration",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Find Familiar"
            >> "Dimension Door"
            ~(Summon a familiar to assist you. Travel to a faraway place.)
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Greater Abjuration",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Shield"
            >> "Banishment"
            >> "Invulnerability"
            ~(Invulnerability makes you impervious to deadly perils.)
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Greater Conjuration",
        """
            **Choose and cast one** spell in the spellbook —
            >> "Find Familiar"
            >> "Dimension Door"
            >> "Cloud Kill"
            ~(Create a deadly cloud within distance to weaken your foe.)
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.MOVEMENT,
    ),
    Card(
        "The Archwizard",
        """
            Whenever you would add cards
            to the spellbook, you may cast the
            "Wish" spell in the spellbook instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
)

val spells = setOf(
    Spell(
        "Magic Missile",
        """
            Target a unit in range
            and not adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        school = School.CANTRIP,
        variant = 1 to 3,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 3,
    ),
    Spell(
        "Shocking Grasp",
        """
            Target a unit adjacent to you.
            After the attack: Move the
            target up to 1 space.
        """.trimIndent(),
        Color.GOLD,
        school = School.CANTRIP,
        variant = 2 to 3,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
    ),
    Spell(
        "Expeditious Retreat",
        """
            Move only in a straight line.
        """.trimIndent(),
        Color.GOLD,
        school = School.CANTRIP,
        variant = 3 to 3,
        primaryAction = Action.MOVEMENT,
        primaryValue = 5,
    ),
    Spell(
        "Burning Hands",
        """
            Target a unit adjacent to you.
            Before the attack: Up to  enemy
            hero adjacent to the target
            discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 1,
        school = School.EVOCATION,
        variant = 1 to 2,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
    ),
    Spell(
        "Fireball",
        """
            Target a unit in range,
            not adjacent to you or
            to your friendly unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        school = School.EVOCATION,
        variant = 1 to 2,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
    ),
    Spell(
        "Sunburst",
        """
            Target a unit at maximum range.
            +1 ::attack_red:: Attack and +1 ::range_red:: Range
            for each other spell card
            removed from the spellbook.
        """.trimIndent(),
        Color.RED,
        level = 3,
        school = School.EVOCATION,
        variant = 1 to 2,
        primaryAction = Action.ATTACK,
        primaryValue = 0,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 0,
        modifierValueSign = Sign.PLUS,
    ),
    Spell(
        "Vampiric Touch",
        """
            Target a unit adjacent to you.
            After the attack: You may
            retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 2,
        school = School.NECROMANCY,
        variant = 2 to 2,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
    ),
    Spell(
        "Create Undead",
        """
            Respawn a friendly minion in an
            empty friendly spawn point in
            range in the battle zone.
        """.trimIndent(),
        Color.RED,
        level = 2,
        school = School.NECROMANCY,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
    ),
    Spell(
        "Energy Drain",
        """
            An enemy hero in range discards a
            non-basic card, if able. Your team
            regains 1 spent ::life_counters:: Life counter.
        """.trimIndent(),
        Color.RED,
        level = 3,
        school = School.NECROMANCY,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
    ),
    Spell(
        "Shield",
        """
            **This round:** You are
            immune to basic attacks.
            ~(Cancelled if the spell is returned to she spellbook.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        school = School.ABJURATION,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
    ),
    Spell(
        "Shield",
        """
            **This round:** You are
            immune to basic attacks.
            ~(Cancelled if the spell is returned to she spellbook.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        school = School.ABJURATION,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
    ),
    Spell(
        "Banishment",
        """
            Place a unit or a token adjacent
            to you into a space in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        school = School.ABJURATION,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Invulnerability",
        """
            **This Round:** You are immune
            to non-basic attacks.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        school = School.ABJURATION,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
    ),
    Spell(
        "Dimension Door",
        """
            Place yourself into a space
            at maximum radius.
            +1 ::area_green:: Radius for each other spell
            card removed from the spellbook.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        school = School.CONJURATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 0,
        modifierValueSign = Sign.PLUS,
    ),
    Spell(
        "Find Familiar",
        """
            Place a ::token_familiar:: Familiar token in radius.
            You may remove up to three  other spell
            cards from the spellbook faceup.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        school = School.CONJURATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Cloud Kill",
        """ An enemy hero in radius
            discards a basic card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        school = School.CONJURATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Suggestion",
        """
            If able, an enemy hero in radius
            moves 3 spaces in a straight line.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        school = School.ENCHANTMENT,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Dominate Person",
        """
            Target an enemy hero in radius.
            Defeat an enemy minion in
            radius adjacent to the target.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        school = School.ENCHANTMENT,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Power Word Kill",
        """
            Defeate an enemy hero in
            radius with no cards in hand.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        school = School.ENCHANTMENT,
        variant = 1 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Midas' Touch",
        """
            Gain 1 coin for every two other spell
            cards removed from the spellbook.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        school = School.TRANSMUTATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
    ),
    Spell(
        "Disintegrate",
        """
            Remove a token or an enemy
            non-heavy minion adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        school = School.TRANSMUTATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
    ),
    Spell(
        "Polymorph",
        """
            Swap an enemy hero in radius
            with a token in radius or with
            an enemy minion in radius.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        school = School.TRANSMUTATION,
        variant = 2 to 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Spell(
        "Wish",
        """
            Cast any spell in the Spellbook.
            After you cast the "Wish" spell three
            times your team wins the game.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        school = School.WISH,
        primaryAction = Action.SKILL,
    ),
)
