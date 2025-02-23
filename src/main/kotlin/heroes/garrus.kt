package heroes

import Action
import Card
import Color
import Item
import Modifier

val garrus = setOf(
    Card(
        "Angry Strike",
        """
            Target a hero adjacent to you.
            +1 ::attack_gold:: Attack for every card in your discard.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Angry Swipe",
        """
            Target a hero adjacent to you.
            +1 ::attack_gold:: Attack for every card in your discard.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Chilling Howl",
        """
            You may discard one of your resolved cards.
            **This round:** Enemy heroes in radius
            cannot fast travel, or move more than
            2 spaces with a movement action.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Battle Fury",
        """
            Each time after one of your resolved cards is
            discarded, you may perform its primary action.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Menace",
        """
            Move an enemy unit in range 1 space
            to a space farther away from you.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Trace",
        """
            **Choose one —**
            >> Before the attack: If you have one or more
            cards in the discard, you may move 1 space.
            >Target a hero adjacent to you.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Hold Ground",
        """
            If there at least two enemy heroes in
            radius, you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Threaten",
        """
            Move an enemy unit in range 1 space
            to a space farther away from you.
            May repeat once.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Chase",
        """
            **Choose one —**
            >> Before the attack: If you have one or more
            cards in the discard, move up to 2 spaces.
            >Target a hero adjacent to you.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Make a Stand",
        """
            If there are at least two enemy heroes in
            radius, you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Form Up!",
        """
            Move a friendly unit in range 1 space
            to a space closer to you.
            May repeat once.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Blunt Force",
        """
            Target a unit adjacent to you.
            After the attack: You may move 1 space to a
            space adjacent to an enemy hero; if you do,
            push that hero 3 spaces, ignoring obstacles.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Light Pilum",
        """
            An enemy hero in range discards a card,
            if able. You may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Terrify",
        """
            Move an enemy unit in range 1 space
            to a space farther away from you.
            May repeat up to two times.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Hunt Down",
        """
            **Choose one —**
            >> Before the attack: If you have one or more
            cards in the discard, move up to 3 spaces.
            >Target a hero adjacent to you.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Battle Ready",
        """
            If there are at least two enemy heroes
            in radius, you may retrieve up to
            two discarded cards.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Testudo!",
        """
            Move a friendly unit in range 1 space
            to a space closer to you.
            May repeat up to two times.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Send Flying",
        """
            Target a unit adjacent to you. After the attack:
            you may move up to 2 spaces to a space
            adjacent to an enemy hero; if you do, push
            that hero 3 spaces, ignoring obstacles.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.AREA,
    ),
    Card(
        "Heavy Pilum",
        """
            An enemy hero in range discards a card,
            or is defeated. You may move up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
)
