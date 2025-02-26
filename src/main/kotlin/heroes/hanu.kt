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
            Target a unit adjacent to you.
            If the target is not defeated, After the attack:
            If able, move 3 spaces in a straight line.
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        secondaryMovement = 2,
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
            Set the printed ::initiative:: Initiative value of an
            unresolved card of a hero in range to 11,
            until it is resolved, or otherwise changes state.
            ~(This may change the initiative order and tie breakers.)
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
            You choose the next action, and how
            it is performed, for a hero you
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
            regardless of radius and immunity.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Helping Hand",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range, adjacent to your
            >friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 4,
    ),
    Card(
        "Monkey Trick",
        """
            Swap two friendly units in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 2,
        secondaryDefense = 1,
    ),
    Card(
        "There and Back Again",
        """
            Swap with an enemy hero in radius.
            **This turn:** That hero is immune.
            **End of turn:** Swap with that hero,
            regardless of radius and immunity.
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
            >>Target a hero in range, adjacent to your
            >friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Monkey Twist",
        """
            Swap two friendly heroes in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "This Way!",
        """
            A friendly hero in radius chooses a distance
            of 1 or 2; move both of you that number of
            spaces in the same direction of your choice.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Outnumber",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a minion in range, adjacent to your
            >friendly hero.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Hear Nothing",
        """
            Swap with an enemy hero in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Safe Travels",
        """
            Swap with an enemy hero in radius.
            **This turn:** That hero is immune.
            **End of turn:** Swap with that hero, regardless
            of radius and immunity. You may move 1 space.
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
            **Choose one, or both,** in any order —
            >>Target a unit adjacent to you.
            >>Target a hero in range, adjacent to your
            >friendly hero and not adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.MOVEMENT,
    ),
    Card(
        "Monkey Business",
        """
            Swap two friendly units in radius.
            You may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "That Way!",
        """
            A friendly hero in radius chooses a distance
            of 1, 2, or 3; move both of you that number of
            spaces in the same direction of your choice.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Pile On",
        """
            **Choose one, or both,** in any order —
            >>Target a unit adjacent to you.
            >>Target a minion in range, adjacent to your
            >friendly.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "See Nothing",
        """
            Swap with an enemy hero in radius.
            You may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.RANGE,
    ),
)
