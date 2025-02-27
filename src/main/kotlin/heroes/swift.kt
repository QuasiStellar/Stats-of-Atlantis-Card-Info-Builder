package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val swift = setOf(
    Card(
        "Reload!",
        """
            **Choose one —**
            >>Perform the primary action of your
            >rightmost resolved card.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 6,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Backup",
        """
            Perform the primary action of your rightmost
            resolved card. If you perform an Attack
            action this way, you cannot target minions.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 6,
        primaryAction = Action.SKILL,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Bounce",
        """
            Move 2 spaces in a straight line, ignoring
            obstacles; if this card is already resolved as
            you perform this action, may repeat once.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Bullet Time",
        """
            After you resolve a basic card, you may
            perform the primary action on that card;
            you cannot target the same enemy hero
            twice in the same turn this way.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Steam Jump",
        """
            Place yourself into a space in a straight
            line in radius. Push an enemy unit
            adjacent to you up to 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Snipe",
        """
            Target a unit at maximum range,
            and in in a straight line.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 4,
    ),
    Card(
        "Suppress",
        """
            An enemy hero in radius who is not
            adjacent to terrain discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Assault Jump",
        """
            Place yourself into a space in a straight
            line in radius. Push an enemy unit
            adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Prepared Shot",
        """
            Target a unit in range, in a straight
            line, and not adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Pin Down",
        """
            An enemy hero in radius who is not
            adjacent to terrain discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Delayed Jump",
        """
            **End of turn:** Place yourself into a space
            in radius not in a straight line from you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Shotgun",
        """
            Target a unit in range. Before the attack:
            An enemy hero adjacent to the target
            discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Mark for Death",
        """
            Move an enemy minion in radius up
            to 3 spaces to a space in radius.
            **Next turn:** The first time an enemy minion
            in radius is defeated, gain 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Drop Trooper",
        """
            Place yourself into a space in a straight line
            in radius. Push up to two enemy units
            adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Killshot",
        """
            Target a unit in range, in a straight
            line, and not adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Killing Ground",
        """
            An enemy hero in radius who is not adjacent
            to terrain discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.RANGE,
    ),
    Card(
        "Mobile Scout",
        """
            **End of turn:** Place yourself into a space in
            radius not in a straight line from you.
            You may then fast travel, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Super-Shotgun",
        """
            Target a unit in range. Before the attack:
            An enemy hero adjacent to the target
            discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.AREA,
    ),
    Card(
        "Hunting Season",
        """
            Move up to two enemy minions in radius,
            up to 3 spaces each, to spaces in radius.
            **Next turn:** The first two times an enemy
            minion in radius is defeated, gain 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
)
