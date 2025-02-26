package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val cutter = setOf(
    Card(
        "Walk the Plank",
        """
            **Choose one —**
            >>Push an enemy hero adjacent to you
            >up to 4 spaces; if that hero is pushed
            >into another zone, that hero discards
            >a card, or is defeated.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Few More Steps",
        """
            Push an enemy hero adjacent to you
            up to 3 spaces; if that hero is pushed
            into another zone, that hero discards
            a card, or is defeated.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Grappling Bolt",
        """
            Target an obstacle in range and in a straight
            line, with no obstacles between you; ignore
            immunity. Move in a straight line towards
            that obstacle until you are adjacent to it.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
        modifier = Modifier.RANGE,
        modifierValue = 5,
    ),
    Card(
        "Legend of the Skies",
        """
            The first time each turn after you perform a
            primary action, you may perform the primary
            action of a card in the previous turn slot.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Bombardment",
        """
            A enemy hero in radius, adjacent to
            another enemy unit and not adjacent
            to you, discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
    ),
    Card(
        "Daring Strike",
        """
            **Choose one —**
            >> Before the attack: Move 1 space.
            Target a unit adjacent to you in the
            direction of the move; +2 ::attack_red:: Attack.
            >> Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Brace for Impact",
        """
            Move 3 spaces in a straight line, ignoring
            obstacles, to a space adjacent to an enemy
            hero; that hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Barrage",
        """
            A enemy hero in radius, adjacent to
            another enemy unit and not adjacent
            to you, discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Bold Thrust",
        """
            **Choose one —**
            >> Before the attack: Move 1 or 2 spaces in a
            straight line. Target a unit adjacent to you
            in the direction of the move; +2 ::attack_red:: Attack.
            >> Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Ramming Speed",
        """
            Move 3 or 4 spaces in a straight line, ignoring
            obstacles, to a space adjacent to an enemy
            hero; that hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "X Marks the Spot",
        """
            An enemy hero in radius **chooses one —**
            >> You place that hero in a space in radius.
            >> You gain 2 coins.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Evasive Shot",
        """
            Target a unit in range in a straight line
            After the attack: Move up to 2 spaces
            in the opposite direction.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Outmaneuver",
        """
            Swap with an enemy minion in radius;
            you may move that minion up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Broadside",
        """
            A enemy hero in radius, adjacent to
            another enemy unit and not adjacent
            to you, discards a card, if able.
            May repeat once on a different target.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Fearless Lunge",
        """
            **Choose one —**
            >> Before the attack: Move 1, 2 or 3 spaces in
            >a straight line. Target a unit adjacent to you
            >in the direction of the move; +2 ::attack_red:: Attack.
            >> Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Crashland",
        """
            Move 3, 4 or 5 spaces in a straight line,
            ignoring obstacles, to a space adjacent to an
            enemy hero; that hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.RANGE,
    ),
    Card(
        "A Fistful of Coins",
        """
            An enemy hero in radius **chooses one —**
            >> You place that hero in a space in radius.
            >> You gain 3 coins. If you have 13 or more
            >coins, you alone win the game.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Tumble Shot",
        """
            Target a unit in range in a straight line.
            After the attack: Move up to 3 spaces
            in the opposite direction.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Outsmart",
        """
            Swap with an enemy minion in radius;
            you may move that minion up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
)
