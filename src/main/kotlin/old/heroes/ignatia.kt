package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier

val ignatia = setOf(
    Card(
        "Chaos Bolt",
        """
            ::tiebreaker_blue::: Target a non-adjacent minion in range.
            ---
            ::tiebreaker_orange:: Target a non-adjacent hero in range.
            ~(Effect is based on the visible side of the Tie Breaker coin).
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Unreliable Jolt",
        """
            ::tiebreaker_blue::: Target an adjacent hero in range.
            ---
            ::tiebreaker_orange:: Target a non-adjacent hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Moment of Equilibrium",
        """
            Flip the Tie Breaker coin to a side of your
            choice. **This turn and next turn:**
            The coin is not flipped after a tie.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
    ),
    Card(
        "Chaos Incarnate",
        """
            After you perform a primary action, you may
            flip the Tie Breaker token to the other side
            and repeat that action once, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Abrupt Combustion",
        """
            ::tiebreaker_blue::: An enemy hero in radius, adjacent to a
            token, or a minion, discards a card, If able.
            ---
            ::tiebreaker_orange:: An adjacent enemy hero
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Playing with Fire",
        """
            ::tiebreaker_blue::: Target a hero in a straight line.
            ---
            ::tiebreaker_orange:: Target a hero not in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Path of Ashes",
        """
            ::tiebreaker_blue::: Move up to 2 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 2 magma tokens in radius
            adjacent to another magma token, if able.
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
        "Spontaneous Immolation",
        """
            ::tiebreaker_blue::: An enemy hero in radius, adjacent to a
            token, or a minion, discards a card, If able.
            ---
            ::tiebreaker_orange:: An adjacent enemy hero
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Erratic Fireblast",
        """
            ::tiebreaker_blue::: Target a unit in a straight line.
            ---
            ::tiebreaker_orange:: Target a unit not in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Path of Cinders",
        """
            ::tiebreaker_blue::: Move up to 3 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 3 magma tokens in radius
            adjacent to another magma token, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Searing Heat",
        """
            ::tiebreaker_blue::: Move an adjacent enemy
            unit up to 3 spaces.
            ---
            ::tiebreaker_orange:: Move a non-adjacent enemy
            unit in radius up to 1 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Crack of Doom",
        """
            ::tiebreaker_blue::: Target a unit at a maximum range.
            ---
            ::tiebreaker_orange:: Target an adjacent unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Unstable Portal",
        """
            ::tiebreaker_blue::: You swap with a friendly unit in radius.
            ---
            ::tiebreaker_orange:: You swap with an enemy unit in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Violent Conflagration",
        """
            ::tiebreaker_blue::: An enemy hero in radius,
            adjacent to a token, or a minion,
            discards a card, or is defeated.
            ---
            ::tiebreaker_orange:: An adjacent enemy hero
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
    Card(
        "Loosely-Aimed Firebolts",
        """
            ::tiebreaker_blue::: Target a unit in a straight line.
            Repeat once on a different hero.
            ---
            ::tiebreaker_orange:: Target a unit not in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
    ),
    Card(
        "Path of Flames",
        """
            ::tiebreaker_blue::: Move up to 4 spaces in a straight line.
            Place a ::token_magma:: magma token in each empty
            space you moved through, or out of.
            ---
            ::tiebreaker_orange:: Place up to 4 magma tokens in radius
            adjacent to another magma token, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Scorching Blaze",
        """
            ::tiebreaker_blue::: Move an adjacent enemy unit up to 4
            spaces. Repeat once on a different target.
            ---
            ::tiebreaker_orange:: Move a non-adjacent enemy
            unit in radius up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Imminent Eruption",
        """
            ::tiebreaker_blue::: Target a unit at a maximum range.
            ---
            ::tiebreaker_orange:: Target an adjacent unit.
            Repeat once on a minion.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.AREA,
    ),
    Card(
        "Chaos Gate",
        """
            ::tiebreaker_blue::: You swap with a friendly unit in radius.
            ---
            ::tiebreaker_orange:: You swap with an enemy unit in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        item = Item.DEFENSE,
    ),
)
