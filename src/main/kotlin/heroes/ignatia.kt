package heroes

import Action
import Card
import Color
import Item
import Modifier

val ignatia = setOf(
    Card(
        "Unreliable Jolt",
        """
            ::tiebreaker_blue::: Target a minion adjacent to you.
            ---
            ::tiebreaker_orange:: Target a hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Unreliable Jolt",
        """
            ::tiebreaker_blue::: Target a hero adjacent to you.
            ---
            ::tiebreaker_orange:: Target a hero in range not adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Equilibrium",
        """
            **This round:** Each time you perform or repeat
            a primary action, you may apply either ::tiebreaker_blue:: or ::tiebreaker_orange::
            card text, regardless of the Tie Breaker coin.
        """.trimIndent(),
        Color.SILVER,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryDefense = 7,
    ),
    Card(
        "Chaos Incarnate",
        """
            The first time each turn after youy perform
            a primary actionm you may flip the Tie Breaker
            coin; if you do, you may perform that action
            again, choosing different targets.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Abrupt Combustion",
        """
            ::tiebreaker_blue::: An enemy hero in radius, adjacent to a
            token or a minion discards a card, if able.
            ---
            ::tiebreaker_orange:: Remove an enemy minion in radius
            adjacent to an enemy hero.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Playing with Fire",
        """
            ::tiebreaker_blue::: Target a unit in range not in a straight line.
            ---
            ::tiebreaker_orange:: Target a unit in range in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Path of Ashes",
        """
            ::tiebreaker_blue::: Move up to 2 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 2 magma tokens in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Spontaneous Immolation",
        """
            ::tiebreaker_blue::: An enemy hero in radius adjacent to a
            token or a minion discards a card, if able.
            ---
            ::tiebreaker_orange:: Remove an enemy minion in radius
            adjacent to an enemy hero.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Searing Heat",
        """
            ::tiebreaker_blue::: Move a friendly hero in radius
            2 spaces in a straight line.
            ---
            ::tiebreaker_orange:: Move an enemy hero in radius
            2 spaces in a straight line.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Erratic Fireblast",
        """
            ::tiebreaker_blue::: Target a unit in range not in a straight line.
            ---
            ::tiebreaker_orange:: Target a unit in range in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Crack of Doom",
        """
            ::tiebreaker_blue:: Target a unit adjacent to you.
            ---
            ::tiebreaker_orange::: Target a unit at a maximum range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Path of Cinders",
        """
            ::tiebreaker_blue::: Move up to 3 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 3 magma tokens in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "Unstable Portal",
        """
            ::tiebreaker_blue::: Swap with a friendly unit in radius.
            ---
            ::tiebreaker_orange:: Swap with an enemy unit in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Violent Conflagration",
        """
            ::tiebreaker_blue::: An enemy hero in radius adjacent to a
            token or a minion discards a card, or is defeated.
            ---
            ::tiebreaker_orange:: Defeat an enemy minion in radius
            adjacent to an enemy hero.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.RANGE,
    ),
    Card(
        "Scorching Blaze",
        """
            ::tiebreaker_blue::: Move a friendly hero in radius
            2 or 3 spaces in a straight line.
            ---
            ::tiebreaker_orange:: Move an enemy hero in radius
            2 or 3 spaces in a straight line.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Loosely-Aimed Firebolts",
        """
            ::tiebreaker_blue::: Target a unit in range not in a straight line.
            ---
            ::tiebreaker_orange:: Target a unit in range in a straight line.
            May repeat once on a different hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Imminent Eruption",
        """
            ::tiebreaker_blue::: Target a unit adjacent to you.
            May repeat once on a minion.
            ---
            ::tiebreaker_orange:: Target a unit at maximum range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Path of Flames",
        """
            ::tiebreaker_blue::: Move up to 4 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 4 magma tokens in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Chaos Gate",
        """
            ::tiebreaker_blue::: Swap with a friendly unit in radius.
            You may move that unit 1 space.
            ---
            ::tiebreaker_orange:: Swap with an enemy unit in radius.
            You may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
)
