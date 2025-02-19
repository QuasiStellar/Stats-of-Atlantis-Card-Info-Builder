package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier

val arien = setOf(
    Card(
        "Noble Blade",
        """
            Before the attack: You may move another
            unit that is adjacent to the target 1 space.
            ~("Another unit" does not include you). 
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Ceremonial Blade",
        """
            Cannot target minions.
            Before the attack: You may move a minion
            that is adjacent to the target 1 space.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Spell Break",
        """
            **This turn:** Enemy heroes in radius
            cannot perform skills.
            ~(Spell Break will not stop an attack action).
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Living Tsunami",
        """
            After you perform a basic skill, you
            may trigger a minion battle in the
            battle zone you are in.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Aspiring Duelist",
        """
            Ignore all minion defense modifiers.
            ~(This includes your minions, as well as the enemy minions).
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.DEFENSE,
        primaryValue = 5,
        secondaryMovement = 3,
    ),
    Card(
        "Gush of Water",
        """
            After the attack: You may push every
            adjacent token and enemy unit 1 space.
            ~(If you choose this option, push all units that can be pushed).
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 4,
        secondaryDefense = 3,
    ),
    Card(
        "Waveform",
        """
            Place yourself into a space in range
            without a spawn point and not adjacent
            to an empty spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Expert Duelist",
        """
            Ignore all minion defense modifiers.
            **This turn:** You are immune
            to all other enemy attacks.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 6,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "High Tide",
        """
            After the attack: You may push every
            adjacent token and enemy unit 1 space.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Magical Current",
        """
            Place yourself into a space in range
            without a spawn point and not adjacent
            to an empty spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Slippery Ground",
        """
            **This turn:** Enemies in radius may not move
            more than 1 space with a movement action.
            ~(Enemies who start movement out of radius are unaffected).
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Violent Torrent",
        """
            Before the attack: One enemy hero in any of
            the 3 spaces in a straight line directly behind
            the target discards a card, or is defeated.
            ~(You cannot target an empty spcae with an attack).
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Arcane Swap",
        """
            Swap with a minion or a friendly hero in range.
            ~(Swap places with the target. This is not movement).
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Master Duelist",
        """
            Ignore all minion defense modifiers.
            **This turn:** You are immune
            to all other enemy actions.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 6,
        secondaryMovement = 3,
        item = Item.RANGE,
    ),
    Card(
        "Rogue Wave",
        """
            After the attack: Move the target 1 space.
            You may push every token and enemy
            unit adjacent to you 1 space.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Stranger Tide",
        """
            Place yourself into a space in
            range without a spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Deluge",
        """
            **This turn and next turn:**
            Enemies in radius may not move more
            than 1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Raging Waters",
        """
            Before the attack: One enemy hero in any of
            the 5 spaces in a straight line directly behind
            the target discards a card, or is defeated.
            May repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Empowered Swap",
        """
            Swap with a unit or a token in range.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
)
