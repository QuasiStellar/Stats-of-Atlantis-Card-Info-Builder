package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val swift = setOf(
    Card(
        "Reload!",
        """
            Perform the primary action of the
            resolved card in your previous turn slot.
        """.trimIndent(),
        Color.GOLD,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 1,
    ),
    Card(
        "Backup",
        """
            Perform the primary action of your resolved
            card in the previous turn slot. If you perform
            an attack this way, you cannot target minions.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 1,
    ),
    Card(
        "Bounce",
        """
            Swap this card with a red or a gold card
            in your hand or discard. If you do, you may
            push an enemy unit adjacent to you 1 space,
            then move 2 spaces in a straight line, if able.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Bullet Time",
        """
            After you perform any action on your Gold
            card, you may perform an action on your
            Gold card again; it can be the same action.
            Cannot target the same enemy hero twice.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Steam Jump",
        """
            Place yourself into a space in a straight line
            and at maximum radius. You may then push
            an enemy unit adjacent to you 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Snipe",
        """
            Target a unit at maximum range
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
        secondaryDefense = 5,
    ),
    Card(
        "Suppress",
        """
            An enemy hero in radius, not adjacent
            to you and not adjacent to terrain, or a
            token, discards a card, if able.
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
            Place yourself into a space in a straight line in
            radius and not adjacent to you. You may then
            push an enemy unit adjacent to you 1 space.
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
            An enemy hero in radius, not adjacent
            to you and not adjacent to terrain, or a
            token, discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Tactical Jump",
        """
            You may place yourself into a space in
            radius not in a straight line from you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 1,
        item = Item.DEFENSE,
    ),
    Card(
        "Shotgun",
        """
            Target a unit in range. +3 ::attack_red:: Attack if you
            target a unit adjacent to you. Before the
            attack: Up to one enemy hero adjacent to
            the target discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Steam Cover",
        """
            **Next turn:** Before you perform an action, you
            may swap any two of your resolved cards.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Drop Trooper",
        """
            Place yourself into a space in a straight
            line in radius. You may then push up to two
            enemy units adjacent to you 1 space.
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
        modifierValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Killing Ground",
        """
            An enemy hero in radius, not adjacent to
            you and not adjacent to terrain, or a token,
            discards a card, or is defeated.
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
        "Steam Valkyrie",
        """
            You may place yourself into a space in
            radius not in a straight line from you.
            You may then fast travel once, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 1,
        item = Item.MOVEMENT,
    ),
    Card(
        "Super-Shotgun",
        """
            Target a unit in range. +3 ::attack_red:: Attack if you
            target a unit adjacent to you. Before the
            attack: Up to one enemy hero adjacent to
            the target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Fog of War",
        """
            **Next turn:** Before or After you perform
            an action, you may swap any two
            of your resolved cards.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
)
