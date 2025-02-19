package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val wasp = setOf(
    Card(
        "Dazzling Dagger",
        """
            Target a unit adjacent to you. After the
             attack: Cancel active effects on skill
             cards of enemy heroes adjacent to you.
             **This turn:** Enemy heroes adjacent to
             you cannot perform skill actions.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Depleted Dagger",
        """
            Cannot target minions. After the attack:
            **This turn:** Adjacent enemy heroes
            cannot perform Skills. 
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Static Barrier",
        """
            **This turn:** Enemy units in radius cannot
            move or fast travel out of radius.
            Enemy units outside of radius cannot
            move or fast travel into radius.
        """.trimIndent(),
        Color.SILVER,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Thunder and Lightning",
        """
            After you perform a basic skill one enemy
            hero in play discards a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Lift Up",
        """
            Move a non-adjacent unit or a token in
            radius up to 1 space, without moving
            it away from you, or closer to you.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
    ),
    Card(
        "Shock",
        """
            Target an adjacent unit. Before the attack:
            Up to one adjacent enemy hero, except the
            target, discards a card, if able.
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
            If the attacker is not adjacent,
            block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
    ),
    Card(
        "Control Gravity",
        """
            Move a non-adjacent unit or a token in radius
            up to 1 space, without moving it away from
            you, or closer to you. May repeat once.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Electrocute",
        """
            Target an adjacent unit. Before the attack:
            Up to one enemy hero in radius, except the
            target, discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Deflect Projectiles",
        """
            If the attacker is not adjacent, block
            the attack. If you do, the attacker
            discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Kinetic Repulse",
        """
            Push every adjacent enemy unit 2 spaces;
            each enemy hero that was stopped by an
            obstacle discards a card, if able.
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
            Cannot target units in a straight line from you.
            ~(Adjacent units are in a straight line as well).
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Center of Mass",
        """
            Move a non-adjacent unit or a token in radius
            up to 1 space, without moving it away from
            you, or closer to you. Repeat up to two times.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Electroblast",
        """
            Target an adjacent unit. Before the attack:
            Up to one enemy hero in radius, except the
            target, discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Reflect Projectiles",
        """
            If the attacker is not adjacent to you, block
            the attack. If you do, the attacker discards
            a card, if able, **This turn:** Only heroes
            adjacent to you can target you with an attack.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.AREA,
    ),
    Card(
        "Kinetic Blast",
        """
            Push every adjacent enemy unit 3 spaces;
            each enemy hero that was stopped by an
            obstacle discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Thunder Boomerang",
        """
            Cannot target units in a straight line from you.
            If you defeat an enemy hero, may repeat once.
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
        item = Item.DEFENSE,
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
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
)
