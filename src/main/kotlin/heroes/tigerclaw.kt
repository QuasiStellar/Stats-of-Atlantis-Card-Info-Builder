package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val tigerclaw = setOf(
    Card(
        "Blink Strike",
        """
            Before the attack: Move 2 spaces in a straight
            line through an enemy unit; target that unit.
            ~(If you cannot make this move, you cannot attack).
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Nimble Strike",
        """
            Before the attack: Move 2 spaces in a straight
            line through an enemy hero; target that hero.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Blend Into Shadows",
        """
            If adjacent to terrain, place yourself
            into a space in radius; if you do, **Next turn:**
            You are immune to enemy attack actions.
        """.trimIndent(),
        Color.SILVER,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Cloak and Daggers",
        """
            After you perform a basic action, you may
            repeat it once; if you repeat an attack
            action, you cannot target the same unit.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Dodge",
        """
            Block a ranged attack.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
    ),
    Card(
        "Hit and Run",
        """
            Target a unit adjacent to you.
            After the attack: You may move 1 space.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 3,
    ),
    Card(
        "Light-Fingered",
        """
            You may move 1 space.
            Take 1 coin from an enemy hero adjacent
            to you; if you do, you may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 1,
    ),
    Card(
        "Sidestep",
        """
            Block a ranged attack.
            You may move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Combat Reflexes",
        """
            Before the attack: You may move 1 space.
            Target a unit adjacent to you.
            After the attack: If you did not move before
            the attack, you may move 1 space.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Pick Pocket",
        """
            Move up to 2 spaces.
            Take 1 coin from an enemy hero adjacent to
            you; if you do, you may move 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 1,
        item = Item.ATTACK,
    ),
    Card(
        "Parry",
        """
            Block a non-ranged attack.
            The attacker discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Backstab",
        """
            Target a unit adjacent to you; if a friendly
            unit is adjacent to the target, +2 ::attack_red:: Attack.
            ~(A "friendly unit" is another hero or a minion on your team.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Poisoned Dagger",
        """
            Give a hero in range a ::marker_poison:: poison marker.
            The hero with a poison marker has
            -1 ::initiative:: Initiative, -1 ::attack_silver:: Attack, and -1 ::defense_silver:: Defense.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 1,
        item = Item.INITIATIVE,
    ),
    Card(
        "Evade",
        """
            Block a ranged attack.
            You may move 1 space. You may retrieve
            your resolved or discarded basic skill card.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Leaping Strike",
        """
            Before the attack: You may move 1 space.
            Target a unit adjacent to you.
            After the attack: You may move 1 space.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Master Thief",
        """
            Move up to 2 spaces.  Take 1 or 2 coins
            from an enemy hero adjacent to you;
            if you do, you may move up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Riposte",
        """
            Block a non-ranged attack. The attacker
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.RANGE,
    ),
    Card(
        "Backstab with a Ballista",
        """
            Target a unit in range;
            if a friendly unit is adjacent to the target
            +2 ::attack_red:: Attack, and the target cannot
            perform a primary action to defend.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Poisoned Dart",
        """
            Give a hero in range a ::marker_poison:: poison marker.
            The hero with a poison marker has
            -2 ::initiative:: Initiative, -2 ::attack_silver:: Attack, and -2 ::defense_silver:: Defense.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
)
