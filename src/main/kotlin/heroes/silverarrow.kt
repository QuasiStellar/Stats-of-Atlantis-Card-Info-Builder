package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val silverarrow = setOf(
    Card(
        "Shoot and Scoot",
        """
            Target a unit at maximum range.
            After the attack: If able, you may
            fast travel to an adjacent zone.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Keep the Distance",
        """
            Target a hero at maximum range.
            After the attack: If able, you may
            fast travel up to an adjacent zone.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Trailblazer",
        """
            You may fast travel, if able.
            **This round:** You and friendly heroes
            in radius may ignore obstacles while
            performing movement actions.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 1,
    ),
    Card(
        "Wild Hunt",
        """
            Each time before you perform an action,
            you may move 2 spaces in a straight line.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Grasping Roots",
        """
            **This turn:** Enemy heroes in radius cannot
            fast travel, or move more than 1 space
            with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
        secondaryMovement = 3,
    ),
    Card(
        "Snap Shot",
        """
            **Choose one —**
            >>Target a unit in range, which is not
            adjacent to any other unit.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 5,
    ),
    Card(
        "Disorient",
        """
            Move an enemy unit adjacent to you 1 space;
            if you do, you may move 1 space.
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
            **This turn:** Enemy heroes in radius cannot
            fast travel, or move more than 1 space
            with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Opportunity Shot",
        """
            **Choose one —**
            >>Target a unit in range, which is not
            >>adjacent to any other unit.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Divert Attention",
        """
            Move an enemy unit adjacent to you up
            to 2 spaces; if you do, move up to that
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Fae Healing",
        """
            A hero  in radius may retrieve a discarded
            card; if they do, that hero gains 1 coin.
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
            **This turn:** Enemy heroes in radius cannot
            fast travel, or move more than 1 space
            with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Clear Shot",
        """
            **Choose one —**
            >>Target a unit in range, which is not
            >adjacent to any other unit.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 6,
        secondaryMovement = 5,
        item = Item.AREA,
    ),
    Card(
        "Lead Astray",
        """
            Move an enemy unit adjacent to you up
            to 3 spaces; if you do, move up to that
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
            **End of turn:** An enemy hero in radius
            discards a card, or is defeated.
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
        item = Item.RANGE,
    ),
    Card(
        "Rain of Arrows",
        """
            Target a unit at maximum range.
            If you target a hero, repeat once on a different
            hero; if you do, may repeat once on a minion.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Nature's Blessing",
        """
            A hero in radius may retrieve a discarded
            card; if they do, that hero gains 2 coins.
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
        item = Item.ATTACK,
    ),
)
