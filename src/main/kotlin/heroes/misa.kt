package heroes

import Action
import Card
import Color
import Item
import Modifier

val misa = setOf(
    Card(
        "Watch How I Soar",
        """
            **Choose one —**
            >>Place yourself into a space
            >at maximum range.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Leaf on the Wind",
        """
            Place yourself into a space
            at maximum range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 1,
    ),
    Card(
        "Swoop In",
        """
            Place yourself into a space in radius adjacent
            to two or more enemy units; if you do,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.SILVER,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Power Overwhelming",
        """
            Whenever you choose one, you may choose
            two different options instead, in any order.
            Each time after you place yourself, an enemy
            hero adjacent to you discards a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Sudden Breeze",
        """
            Move up to 3 spaces in a straight line, ignoring
            obstacles; you may place an enemy unit you
            moved through into a space adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 5,
    ),
    Card(
        "Challenge Accepted",
        """
            Target a unit adjacent to you. After the attack:
            **This turn:** Gain +2 ::defense_silver:: Defense.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Focus",
        """
            **Next turn:** Before you perform a
            primary action, you may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Gust of Wind",
        """
            Move up to 4 spaces in a straight line ignoring
            obstacles; you may place an enemy unit you
            moved through into a space adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Matter of Honor",
        """
            Target a unit adjacent to you. After the attack:
            **This turn:** Gain +3 ::defense_silver:: Defense.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Discipline",
        """
            **Next turn:** Before you perform a primary
            action, move up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Living Tornado",
        """
            Swap two units at maximum radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Power Shot",
        """
            Target a unit in range. After the attack: If the
            target was at maximum range, you may move
            it 1 space, to a space farther away from you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Dash and Slash",
        """
            Move up to 4 spaces in a straight line,
            ignoring obstacles. An enemy hero you
            moved through discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Crushing Squall",
        """
            Move up to 5 spaces in a straight line, ignoring
            obstacles; you may place an enemy unit you
            moved through into a space adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "Worthy Opponent",
        """
            Target a unit adjacent to you.
            After the attack:
            **This turn:** Gain +5 ::defense_silver:: Defense.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Mastery",
        """
            **Next turn:** Before you perform a
            primary action, you may move 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Storm Spirit",
        """
            Swap two units in radius and
            at equal distance from you.
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
        item = Item.ATTACK,
    ),
    Card(
        "Thunder Shot",
        """
            Target a unit in range. After the attack:
            If the target is not adjacent to you, you may move it
            1 space, to a space farther away from you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Death from Above",
        """
            Move up to 5 spaces in a straight line,
            ignoring obstacles; an enemy hero you
            moved through discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
)
