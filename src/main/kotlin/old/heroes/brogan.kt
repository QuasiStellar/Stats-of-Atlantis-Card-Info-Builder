package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val brogan = setOf(
    Card(
        "Onslaught",
        """
            Target a unit adjacent to you. After the attack:
            Move into the space it occupied.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Leap Forward",
        """
            Target a hero adjacent to you. After the attack:
            Move into the space it occupied. 
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Bulwark",
        """
            **Choose one —**
            >>**This round:** You and friendly units in radius
            >cannot be moved, pushed, swapped, or
            >forced to move by enemy heroes.
            >>If your discard is empty, retrieve this card.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
    ),
    Card(
        "One Man Army",
        """
            You count as 2 minions during minion battle.
            If you would be removed during minion
            battle, you lose the push instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Brutal Jab",
        """
            **Choose one —**
            >>Remove a token adjacent to you.
            >>Push an enemy minion adjacent to you
            >up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
    ),
    Card(
        "Mad Dash",
        """
            Before the attack: Move 2 spaces in
            a straight line to a space adjacent to
            an enemy unit, then target that unit.
            ~(If you cannot make this move, you cannot attack).
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Shield",
        """
            **This round:** If a friendly melee minion in
            radius would be defeated, you may discard
            a card. If you do, the minion is not defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Crushing Punch",
        """
            Move up to 1 space, then **Choose one —**
            >>Remove a token adjacent to you.
            >>Push an enemy minion adjacent to you up
            >to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Bullrush",
        """
            Before the attack: Move 2 or 3 spaces in
            a straight line to a space adjacent to an
            enemy unit, then target that unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
    ),
    Card(
        "Bolster",
        """
            **This round:** If a friendly non-heavy minion in
            radius would be defeated, you may discard a
            card. If you do, the minion is not defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Shield Bash",
        """
            An enemy hero adjacent to you, who
            has played an attack card this turn
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Throwing Axe",
        """
            Before the attack: You may discard a card.
            If you do, +2 ::range_red:: Range. Target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "War Drummer",
        """
            A friendly hero in range may retrieve
            a discarded card if either you, or that
            hero, is adjacent to an enemy unit.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Savage Kick",
        """
            Move up to 1 space, then **Choose one —**
            >>Remove a token adjacent to you.
            >>Push an enemy unit adjacent to you up to
            >2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Furious Charge",
        """
            Before the attack: Move 2, 3 or 4 spaces
            in a straight line to a space adjacent to an
            enemy unit, then target that unit.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.MOVEMENT,
    ),
    Card(
        "Fortify",
        """
            **This round:** If a friendly minion in radius
            would be defeated, you may discard a card.
            If you do, the minion is not defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Counterattack",
        """
            An enemy hero adjacent to you, who
            has played an attack card this turn
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.RANGE,
    ),
    Card(
        "Throwing Spear",
        """
            Before the attack: You may discard a card.
            +2 ::range_red:: Range if you have a card in the
            discard. Target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "Master Skald",
        """
            A friendly hero in range may retrieve a
            resolved or discarded card if either you,
            or that hero, is adjacent to an enemy unit.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
)
