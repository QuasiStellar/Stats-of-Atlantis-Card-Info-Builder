package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

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
        traits = setOf(Trait.DEFEAT, Trait.MULTIPLE_CHOICE),
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
        traits = emptySet(),
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
        traits = setOf(Trait.MOVING_SELF, Trait.IGNORING_OBSTACLES, Trait.STRAIGHT_LINE),
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
        traits = emptySet(),
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
        traits = setOf(Trait.PUSHING_UNITS, Trait.PLACING_SELF, Trait.STRAIGHT_LINE),
    ),
    Card(
        "Snipe",
        """
            Target a unit at maximum range,
            and in a straight line.
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
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.DISCARD, Trait.TERRAIN),
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
        traits = setOf(Trait.PUSHING_UNITS, Trait.PLACING_SELF, Trait.STRAIGHT_LINE),
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
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.DISCARD, Trait.TERRAIN),
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
        traits = setOf(Trait.PLACING_SELF, Trait.END_OF_TURN, Trait.STRAIGHT_LINE, Trait.NOT_STRAIGHT_LINE),
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
        traits = setOf(Trait.DISCARD, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.MOVING_ENEMY, Trait.NEXT_TURN),
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
        traits = setOf(Trait.PUSHING_UNITS, Trait.PLACING_SELF, Trait.STRAIGHT_LINE),
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
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.TERRAIN),
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
        traits = setOf(Trait.PLACING_SELF, Trait.END_OF_TURN, Trait.FAST_TRAVEL, Trait.STRAIGHT_LINE, Trait.NOT_STRAIGHT_LINE),
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
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.NEXT_TURN),
    ),
)
