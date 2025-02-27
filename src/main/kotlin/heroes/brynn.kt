package heroes

import Action
import Card
import Color
import Item
import Modifier

val brynn = setOf(
    Card(
        "Familiar Ground",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range who is
            >adjacent to 3 or more obstacles.
            ~(You, other heroes, minions, tokens and terrain are obstacles.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 1,
    ),
    Card(
        "Home Turf",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>Target a hero in range who is
            >adjacent to 3 or more obstacles.
            ~(You, other heroes, minions, tokens and terrain are obstacles.)
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
    Card(
        "Decoy",
        """
            **Choose up to two times,**, on different targets —
            >> Move an enemy minion in radius 1 space.
            >> Move an enemy hero in radius who is
            adjacent to 3 or more obstacles 2 space.
        """.trimIndent(),
        Color.SILVER,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 2,
    ),
    Card(
        "High Ground",
        """
            Target a unit adjacent to you.
            If you target a hero adjacent to
            3 or more obstacles, +2 ::attack_red:: attack.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 6,
        secondaryMovement = 4,
    ),
    Card(
        "Tread Lightly",
        """
            Swap with either a unit adjacent to you,
            or with an enemy hero in radius who is
            adjacent to 3 or more obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 5,
        secondaryMovement = 3,
    ),
    Card(
        "Bear Trap",
        """
            **Choose one —**
            >>An enemy hero adjacent to you discards
            >a card, if able.
            >>An enemy hero in radius who is adjacent to
            3 or more obstacles discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
        secondaryMovement = 2,
    ),
    Card(
        "Elevated Ambush",
        """
            Target a unit adjacent to you.
            If you target a hero adjacent to
            3 or more obstacles, +2 ::attack_red:: attack.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 6,
        secondaryMovement = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Split Attack",
        """
            Target a unit in range. If you target a hero
            who is adjacent to 3 or more obstacles, may
            repeat once on a different unit adjacent to you.

        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 3,
        secondaryMovement = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Log Trap",
        """
            **Choose one —**
            >>An enemy hero adjacent to you discards
            >a card, if able.
            >>An enemy hero in radius who is adjacent to
            3 or more obstacles discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 3,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "True Grit",
        """
            You may retrieve a discarded attack card.
            If an enemy hero in radius is adjacent to
            3 or more obstacles, move up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 3,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Cover Tracks",
        """
            Swap with either a unit adjacent to you,
            or with an enemy hero in radius who is
            adjacent to 3 or more obstacles.
            You may move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 5,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Mountain Guide",
        """
            You may move a friendly unit, which is adjacent
            to you, up to 3 spaces. If an enemy hero in
            radius is adjacent to 3 or more obstacles, move
            a different friendly unit in radius up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 5,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Deadfall Trap",
        """
            **Choose one —**
            >>An enemy hero adjacent to you discards
            >a card, or is defeated.
            >>An enemy hero in radius who is adjacent to
            3 or more obstacles discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Die Hard",
        """
            You may retrieve a discarded attack card.
            If an enemy hero in radius is adjacent to
            3 or more obstacles, move up to 4 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Hide Traces",
        """
            Swap with either a unit adjacent to you,
            or with an enemy hero in radius who is
            adjacent to 3 or more obstacles.
            Move up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 6,
        secondaryMovement = 3,
        item = Item.RANGE,
    ),
    Card(
        "Expedition Leader",
        """
            You may move a friendly unit, which is adjacent
            to you, up to 3 spaces. If an enemy hero in
            radius is adjacent to 3 or more obstacles, move
            a different friendly unit in radius up to 3 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 6,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Peak Precision",
        """
            Target a unit adjacent to you.
            If you target a hero adjacent to
            3 or more obstacles, +2 ::attack_red:: attack and After
            the attack: You may retrieve this card.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 7,
        secondaryMovement = 4,
        item = Item.AREA,
    ),
    Card(
        "Split Attack",
        """
            Target a unit in range. If you target a hero
            who is adjacent to 3 or more obstacles,
            may repeat once on a different unit.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 4,
        secondaryMovement = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Over the Top",
        """
            While you are performing actions, all
            enemy heroes in play count as being
            adjacent to 3 or more obstacles.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
)