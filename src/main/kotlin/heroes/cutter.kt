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
            >>Push an enemy hero adjacent to you up
            >to 3 spaces; if that hero is pushed into
            >another zone, that hero discards a card,
            >or is defeated.
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
            line, with no obstacles between you, ignore
            immunity. Move any number of spaces in a
            straight line towards that obstacle.
        """.trimIndent(),
        Color.SILVER,
        initiative = 2,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 2,
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
        "Barrage",
        """
            A enemy hero in radius adjacent to
            another enemy unit, and not adjacent
            to you, discards a card, if able.
            ~(The target hero must be adjacent to their friendly unit)
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Daring Strike",
        """
            Before the attack: You may move
            1 space and target a unit adjacent to
            you in the direction of the move;
            if you do, gain +2 ::attack_red:: Attack.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Brace for Impact",
        """
            Move 3 spaces in a straight line, ignoring
            obstacles, to a space adjacent to an enemy
            hero. That hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Bombardment",
        """
            A enemy hero in radius adjacent to
            another enemy unit, and not adjacent
            to you, discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Bold Thrust",
        """
            Before the attack: You may move 1 or 2
            spaces in a straight line and target a unit
            adjacent to you in the direction of the move;
            if you do, gain +2 ::attack_red:: Attack.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Ramming Speed",
        """
            Move 3 or 4 spaces in a straight line, ignoring
            obstacles, to a space adjacent to an enemy
            hero. That hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "X Marks the Spot",
        """
            Place a coin in a space in radius.
            **End of turn:** You may place yourself in
            a space with a coin. Any hero in a space
            with a coin gains 1 coin. Remove the coin.
            ~(A coin is not an obstacle. The space with a coin is empty.)
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
        item = Item.DEFENSE,
    ),
    Card(
        "Evasive Shot",
        """
            Target a unit in range in a straight line, with
            no other units, or terrain, between you.
            After the attack: Move up to 2 spaces in a
            straight line directly away from the target.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Mediocre!",
        """
            If the attacker has a card in their discard,
            block the attack. If you do, the attacker
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Broadside",
        """
            A enemy hero in radius adjacent to
            another enemy unit, and not adjacent
            to you, discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Fearless Lunge",
        """
            Before the attack: You may move 1, 2 or 3
            spaces in a straight line and target a unit
            adjacent to you in the direction of the move;
            if you do, gain +3 ::attack_red:: Attack.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Crashland",
        """
            Move 3, 4 or 5 spaces in a straight
            line, ignoring obstacles, to a space
            adjacent to an enemy hero.
            That hero discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.MOVEMENT,
    ),
    Card(
        "A Fistful of Coins",
        """
            Place a coin in up to 2 spaces in radius.
            **End of turn:** You may place yourself in a
            space with a coin. Heroes in a space with
            a coin gain 1 coin. Remove the coins.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
    Card(
        "Thumble Shot",
        """
            Target a unit in range in a straight line, with no
            other units, or terrain, between you. After the
            attack: Move up to 2 spaces in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Pathetic!",
        """
            If the attacker has a card in their discard,
            block the attack. If you do, the attacker
            discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.AREA,
    ),
)
