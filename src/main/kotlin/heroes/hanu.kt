package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val hanu = setOf(
    Card(
        "Fight and Flight",
        """
            If your discard is empty, **choose one —**
            >>An enemy hero adjacent to you discards a
            >card, if able. You then move 2 spaces in a
            >straight line, if able.
            >>Defeat a non-heavy minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 1,
    ),
    Card(
        "Fight or Flight",
        """
            Target a hero adjacent to you.
            If the target is not defeated, After the attack:
            If able, move 3 spaces in a straight line.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Hurry up!",
        """
            If your discard is empty, set the printed
            ::initiative:: Initiative value of an unresolved card
            of a hero in range to 11, until it is resolved.
            **This turn:** If that hero performs a
            movement action, that hero must move in
            a straight line and the full distance, if able.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 1,
    ),
    Card(
        "The Ultimate Trick",
        """
            You choose the action, and how
            it is performed for a hero you
            target with the "Hurry Up!".
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Unexpected Journey",
        """
            Swap with an enemy hero in radius.
            **This turn:** That hero is immune.
            **End of turn:** Swap with that hero,
            regardless of radius, if able.
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
        "Helping Hand",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range, adjacent
            >to a friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 5,
    ),
    Card(
        "Little to Gain",
        """
            If yoy have no cards in the discard, block
            the attack. Discard your unresolved card,
            if you have one and and place yourself on
            a spawn point in your throne zone, if able.
            Each enemy hero gains 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
    ),
    Card(
        "There and Back Again",
        """
            Swap with an enemy unit in radius.
            **This turn:** That unit is immune.
            **End of turn:** Swap with that unit,
            regardless of radius, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Even the Odds",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range, adjacent
            >to a friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Barely a Nuisance",
        """
            If yoy have no cards in the discard, block
            the attack and place yourself on a spawn
            point in your throne zone, if able.
            Each enemy hero gains 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "This Way!",
        """
            A friendly hero in radius chooses a distance
            of 1 or 2. You choose a direction. You both
            move that number of spaces in the chosen
            direction, if able; stop if you reach an obstacle.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Outnumber",
        """
            +1 ::attack_red:: Attack for each friendly
            unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Hear Nothing",
        """
            Swap with an enemy hero in radius.
            Move up to 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Safe Travels",
        """
            Swap with an enemy unit in radius.
            **This turn:** You and that unit are immune.
            **End of turn:** Swap with that unit,
            regardless of radius, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Trusted Sidekick",
        """
            **Choose one, or both —**
            >>Target a unit adjacent to you.
            >>Target a hero in range, adjacent
            >to a friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
    ),
    Card(
        "Killing Joke",
        """
            If yoy have no cards in the discard, block the
            attack and place yourself on a spawn point in
            your throne zone, if able. If you do, retrieve
            this card. Each enemy hero gains 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "That Way!",
        """
            A friendly hero in radius chooses a distance
            of 1, 2, or 3. You choose a direction. You both
            move that number of spaces in the chosen
            direction; stop if you reach an obstacle.
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
        "Pile On",
        """
            +1 ::attack_red:: Attack for each friendly unit
            adjacent to you. If you target a hero,
            may repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "See Nothing",
        """
            Move up to 1 space. Swap with an enemy
            hero in radius. Move up to 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
)
