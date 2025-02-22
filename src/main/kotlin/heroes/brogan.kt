package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val brogan = setOf(
    Card(
        "Onslaught",
        """
            Target a unit adjacent to you. After the attack:
            Move into the space it occupied, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Leap Forward",
        """
            Target a hero adjacent to you. After the attack:
            Move into the space it occupied, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Bulwark",
        """
            You may retrieve a discarded card.
            **This turn:** You and friendly units in radius
            cannot be moved, pushed, swapped
            or placed by enemy heroes.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
    ),
    Card(
        "One Man Army",
        """
            During minion battle you count as a heavy
            minion; if you would be removed,
            lose the push instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Brutal Jab",
        """
            You may move 1 space. Push an enemy unit
            or a token adjacent to you up to 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 5,
    ),
    Card(
        "Mad Dash",
        """
            Before the attack: Move 2 spaces
            in a straight line to a space adjacent to
            an enemy unit, then target that unit.
            ~(If you cannot make this move, you cannot attack.)
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
            **This round:** When any friendly minion in radius
            is defeated you may discard a silver card.
            If you do, the minion is not removed.
            ~(The enemy hero still gains the coins for defeating the minion.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Mighty Punch",
        """
            You may move 1 space. Push an enemy unit
            or a token adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
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
            **This round:** When any friendly minion in radius
            is defeated you may discard a silver card.
            If you do, the minion is not removed.
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
        item = Item.ATTACK,
    ),
    Card(
        "Shield Bash",
        """
            An enemy hero adjacent to you who
            has played an attack card this turn
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Throwing Axe",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>You may discard a card;
            if you do, target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "War Drummer",
        """
            A friendly hero in range gains 1 coin;
            if any hero was defeated this round,
            that friendly hero gains 3 coins instead.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Savage Kick",
        """
            Move up to 2 spaces. Push an enemy unit
            or a token adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
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
            **This round:** When any friendly minion in radius
            is defeated you may discard a basic card.
            If you do, the minion is not removed.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Counterattack",
        """
            An enemy hero adjacent to you who
            has played an attack card this turn
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Throwing Spear",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>You may discard a card. If you have a card
            in the discard, target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "Master Skald",
        """
            A friendly hero in range gains 2 coin2;
            if any hero was defeated this round,
            that friendly hero gains 4 coins instead.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
)
