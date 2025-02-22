package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val sabina = setOf(
    Card(
        "Point Blank Shot",
        """
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Bang",
        """
            Target a hero adjacent to you.
            After the attack: Push the target 1 space.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Back to Back",
        """
            Swap with a friendly minion in radius.
        """.trimIndent(),
        Color.SILVER,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Big Sodding Gun",
        """
            Your basic attack has +2 ::range_gold:: Range and
            +2 ::attack_gold:: Attack. If you push an enemy hero,
            that hero discards a card, or is defeated.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Listen Up",
        """
            Swap two minions in radius.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryDefense = 3,
        secondaryMovement = 3,
    ),
    Card(
        "Quickdraw",
        """
            Target a unit in range. +3 ::attack_red:: Attack if the
            target played an attack card this turn.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Troop Movement",
        """
            Move a friendly minion in radius up to 1 space,
            to a space in radius. May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Roger Roger",
        """
            Swap two minions in radius.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Gunslinger",
        """
            Target a unit in range. +3 ::attack_red:: Attack if the
            target played an attack card this turn.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Marching Orders",
        """
            Move a friendly minion in radius 1 space,
            to a space in radius. May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Steady Advance",
        """
            If there are two or more friendly minions in
            radius, you may retrieve a discarded card;
            if you do, you may move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Shootout",
        """
            Target a unit in range. After the attack:
            If the target was adjacent to you, remove
            up to one enemy minion adjacent to you.
            ~(You gain no coins for removing a minion, only defeating.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Ready and Waiting",
        """
            Swap two minions in radius,
            ignoring heavy minion immunity.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Dead Shot",
        """
            Target a unit in range. +4 ::attack_red:: Attack if the
            target played an attack card this turn.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Path to Victory",
        """
            Move a friendly minion in radius 1 space, to a
            space in radius. May repeat up to two times.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.RANGE,
    ),
    Card(
        "Unwavering Resolve",
        """
            If there are two or more friendly minions in
            radius, you may retrieve a discarded card;
            if you do, you may up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Bullet Hell",
        """
            Target a unit in range. After the attack:
            If the target was adjacent to you, remove
            up to two enemy minions adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Covering Fire",
        """
            An enemy hero in radius adjacent to your
            friendly minion discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
)
