package heroes

import Action
import Card
import Color
import Item
import Modifier

val widget = setOf(
    Card(
        "Fight as One",
        """
            Target a unit adjacent to you.
            After the attack: You may perform the primary
            action on one of your resolved skill cards,
            targeting a different unit.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryDefense = 2,
        secondaryMovement = 1,
    ),
    Card(
        "Follow Along",
        """
            Target a hero adjacent to you.
            After the attack: You may perform the primary
            action on one of your resolved skill cards,
            targeting a different unit.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 2,
    ),
    Card(
        "Dragon Bond",
        """
            **Choose one —**
            >>Place Pyro into a space in radius.
            >Pyro counts as a token, but is not
            >removed at the end of round.
            >>If Pyro is in play, move both yourself and
            >Pyro up to 2 spaces, in any order.
        """.trimIndent(),
        Color.SILVER,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 6,
    ),
    Card(
        "Diversionary Strike",
        """
            Target a unit adjacent to you.
            After the attack: Move Pyro up to 2 spaces.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryDefense = 6,
        secondaryMovement = 4,
    ),
    Card(
        "All Aboard",
        """
            Swap Pyro in range with yourself
            or with a friendly hero in range.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 3,
        secondaryMovement = 3,
    ),
    Card(
        "Fiery Breath",
        """
            An enemy hero in range of Pyro and in a
            straight line from Pyro discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 1,
        secondaryMovement = 2,
    ),
    Card(
        "Diversionary Attack",
        """
            Target a unit adjacent to you.
            After the attack: Move Pyro up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryDefense = 6,
        secondaryMovement = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Airborne Attack",
        """
            Before the attack: You may swap with Pyro
            in radius. Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        secondaryMovement = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Diversionary Assault",
        """
            Target a unit adjacent to you.
            After the attack: Move Pyro up to 4 spaces.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryDefense = 7,
        secondaryMovement = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Airborne Assault",
        """
            Before the attack: You may swap with Pyro
            in radius. Target a unit adjacent to you.
            After the attack: You may swap
            with Pyro in radius.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 5,
        secondaryMovement = 4,
        item = Item.RANGE,
    ),
    Card(
        "Take-Off",
        """
            Swap Pyro in range with yourself
            or with a friendly hero in range.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 3,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Drag Off",
        """
            Move both Pyro, and an enemy unit
            adjacent to Pyro, either 2 or 3 spaces
            each, in the same direction.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Safe Landing",
        """
            You may move Pyro in range 1 space.
            Swap Pyro in range with yourself
            or with a friendly hero in range.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 4,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Carry Away",
        """
            Move both Pyro, and an enemy unit
            adjacent to Pyro, either 2 or 3 spaces
            each, in the same direction, ignoring obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 4,
        secondaryMovement = 3,
        item = Item.AREA,
    ),
    Card(
        "Flaming Breath",
        """
            An enemy hero in range of Pyro and in a
            straight line from Pyro discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Nibble",
        """
            Remove an enemy minion in range
            adjacent to Pyro. Remove Pyro.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Scorching Breath",
        """
            An enemy hero in range of Pyro and in a
            straight line from Pyro
            discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Gnaw",
        """
            Defeat a minion in range adjacent to Pyro.
            Remove Pyro.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Dragon Knight",
        """
            Each time after you perform a movement
            action, you may perform the primary
            action on one of your faceup skill cards.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
)