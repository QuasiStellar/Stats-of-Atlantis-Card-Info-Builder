package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val tigerclaw = setOf(
    Card(
        "Blink Strike",
        """
            Before the attack: Move 2 spaces in a straight
            line through an enemy unit; Target that unit.
            ~(If you cannot make this move, you cannot attack). 
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 2,
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
        primaryValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Blend Into Shadows",
        """
            If adjacent to an obstacle, place yourself into
            a space in radius not adjacent to an enemy
            unit. If you do, **Next turn:** You are immune,
            and may move through units.
        """.trimIndent(),
        Color.SILVER,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Cloak and Daggers",
        """
            If you are immune: Before you perform
            (or repeat) any action, move up to 2 spaces;
            after you perform a basic attack, you may
            repeat it once on a different target.
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
            After the attack: Move up to 1 space.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 3,
    ),
    Card(
        "Light-Fingered",
        """
            Move up to 2 spaces, then take up to 1 coin
            from an enemy hero adjacent to you.
            Then move 2 spaces in a straight line, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 2,
    ),
    Card(
        "Sidestep",
        """
            Block a ranged attack. If you do, you may
            move 2 spaces in a straight line.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Combat Reflexes",
        """
            Before or After the attack:
            Move up to 1 space.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Pick Pocket",
        """
            Move up to 2 spaces, then take up to 2 coins
            from an enemy hero adjacent to you.
            Then move 2 spaces in a straight line, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 2,
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
        item = Item.ATTACK,
    ),
    Card(
        "Backstab",
        """
            Target a unit adjacent to you. +2 ::attack_red:: Attack
            if a friendly unit is adjacent to the target.
            ~(A "friendly unit" is another hero or a minion on your team).
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Poisoned Dagger",
        """
            Give a hero in range a ::marker_poison:: poison marker.
            Each ::initiative:: Initiative and ::attack_silver:: Attack item of a
            hero with a poison marker reduces that
            value by 1, instead of increasing it by 1.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Evade",
        """
            Block a ranged attack. If you do, you may
            move 2 spaces in a straight line and you
            may swap this card with a card in your hand.
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
            Before the attack: Move up to 1 space.
            After the attack: Move up to 1 space.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Master Thief",
        """
            Move up to 2 spaces, then take up to 3 coins
            from an enemy hero adjacent to you.
            Then move 2 spaces in a straight line, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Reposte",
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
            Target a unit in range. +3 ::attack_red:: Attack
            and this attack cannot be blocked,
            if a friendly unit is adjacent to the target.
            ~("Block" is a keyword - the target hero can still defend!)
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
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
            Each ::initiative:: Initiative, ::item_attack:: Attack, and ::item_defense:: Defense
            item of a hero with a poison marker reduce
            that value by 1, instead of increasing it by 1.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.MOVEMENT,
    ),
)
