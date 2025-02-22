package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val wasp = setOf(
    Card(
        "Magnetic Dagger",
        """
            Target a unit adjacent to you.
            After the attack: **This turn:** Enemy units
            in radius cannot be swapped or placed
            by themselves or by enemy heroes.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Card(
        "Crackling Dagger",
        """
            Target a hero adjacent to you.
            After the attack: **This turn:** Enemy units
            in radius cannot be swapped or placed
            by themselves or by enemy heroes.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Card(
        "Static Barrier",
        """
            **This turn:** While an enemy hero outside of
            radius is performing an action, spaces in
            radius count as obstacles. While an enemy
            hero in radius is performing an action,
            spaces outside of radius count as obstacles.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 2,
    ),
    Card(
        "High Voltage",
        """
            Each time after you perform a basic skill,
            you may defeat an enemy minion in radius;
            an enemy hero who was adjacent to that
            minion discards a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Card(
        "Lift Up",
        """
            Move a unit, or a token, in radius 1 space,
            without moving it away from you or closer to
            you. May repeat once on the same target.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
    ),
    Card(
        "Shock",
        """
            Target a unit adjacent to you.
            After the attack: An enemy hero in radius and
            not adjacent to you discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Stop Projectiles",
        """
            Block a ranged attack.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
    ),
    Card(
        "Control Gravity",
        """
            Move a unit, or a token, in radius 1 space,
            without moving it away from you, or closer to 
            you. May repeat once on the same target.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Electrocute",
        """
            Target a unit adjacent to you.
            After the attack: An enemy hero in radius and
            not adjacent to you discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Deflect Projectiles",
        """
            Block a ranged attack; if you do, an enemy
            hero in range, other than the attacker,
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Kinetic Repulse",
        """
            Push up to 2 enemy units adjacent to you
            3 spaces; if a pushed hero is stopped by an
            obstacle, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Charged Boomerang",
        """
            Target a unit in range and not in a straight line.
            ~(Units adjacent to you are in a straight line from you.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Telekinesis",
        """
            Place a unit or a token in range, which is not
            in a straight line, into a space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Center of Mass",
        """
            Move a unit, or a token, in radius 1 space,
            without moving it away from you, or closer
            to you. May repeat up to two times
            on the same target.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Electroblast",
        """
            Target a unit adjacent to you. After the attack:
            An enemy hero in radius and not adjacent
            to you discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Reflect Projectiles",
        """
            Block a ranged attack; if you do, an enemy
            hero in range discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        item = Item.AREA,
    ),
    Card(
        "Kinetic Blast",
        """
            Push up to 2 enemy units adjacent to you
            3 or 4 spaces; if a pushed hero is stopped by
            an obstacle, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Thunder Boomerang",
        """
            Target a unit in range and not in a straight line.
            After the attack: If you targeted a hero,
            may repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Mass Telekinesis",
        """
            Place a unit or a token in range, which
            is not in a straight line, into a space
            adjacent to you. May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
)
