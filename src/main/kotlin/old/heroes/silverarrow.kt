package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val silverarrow = setOf(
    Card(
        "Hit and Run",
        """
            Cannot attack if you are adjacent to
            an enemy unit. Target a unit in range.
            After the attack: You may fast travel, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 1,
    ),
    Card(
        "Keep the Distance",
        """
            Cannot attack if you are adjacent to an
            enemy unit. Target a hero in range.
            After the attack: You may fast travel
            within the same zone, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Trailblazer",
        """
            If you are not adjacent to an enemy unit, you
            may move up to 4 spaces in a straight line to
            a space not adjacent to an enemy unit.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        secondaryDefense = 1,
    ),
    Card(
        "Wild Hunt",
        """
            Each time before you perform an action
            you may move 2 spaces in a straight line.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Grasping Roots",
        """
            **This turn:** Enemy heroes in radius adjacent
            to terrain cannot fast travel, or move more
            than 1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Snap Shot",
        """
            -2 ::range_red:: Range for every unit adjacent to the
            target, including you. Target a hero in range,
            or a minion adjacent to you and in range.
            ~(If your range is below 1, you cannot perform this action).
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        modifierValueSign = Sign.MINUS,
        secondaryMovement = 5,
        secondaryDefense = 5,
    ),
    Card(
        "Disorient",
        """
            Move an enemy unit adjacent to you up
            to 1 space. If you do, move up to that
            number of spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 1,
    ),
    Card(
        "Entangling Vines",
        """
            **This turn:** Enemy heroes in radius
            adjacent to terrain, or to their friendly
            hero, cannot fast travel, or move more
            than 1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Opportunity Shot",
        """
            -2 ::range_red:: Range for every unit adjacent to the
            target, including you. Target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        modifierValueSign = Sign.MINUS,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Divert Attention",
        """
            Move an enemy unit adjacent to you up
            to 2 spaces. If you do, move up to that
            number of spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Warning Shot",
        """
            If you are not adjacent to an enemy unit,
            **End of turn:** An enemy hero in radius
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Long Shot",
        """
            Target a unit at maximum range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Fae Healing",
        """
            If you are not adjacent to an enemy unit,
            another hero in radius may retrieve a
            discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Grappling Branches",
        """
            **This turn:** Enemy heroes in radius
            adjacent to terrain, or to their friendly
            unit, cannot fast travel, or move more
            than 1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Clear Shot",
        """
            -2 ::range_red:: Range for every unit adjacent to the
            target, including you. target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        modifierValueSign = Sign.MINUS,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Lead Astray",
        """
            Move an enemy unit adjacent to you up
            to 3 spaces. If you do, move up to that
            number of spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Treetop Sentinel",
        """
            If you are not adjacent to an enemy unit,
            **End of turn:** An enemy hero in radius,
            discards a card or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Rain of Arrows",
        """
            Target a unit at maximum range.
            If you target a hero, may repeat
            up to two times on different heroes.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Nature's Blessing",
        """
            If you are not adjacent to an enemy unit,
            you and up to one hero in radius may
            retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.RANGE,
    ),
)
