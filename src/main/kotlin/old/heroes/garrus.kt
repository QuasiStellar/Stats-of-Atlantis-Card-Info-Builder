package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier

val garrus = setOf(
    Card(
        "Angry Strike",
        """
            Target a unit adjacent to you. +2 ::attack_gold:: Attack
            if you have exactly one card in the discard.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Angry Swipe",
        """
            Target a hero adjacent to you. +2 ::attack_gold:: Attack
            if you have exactly one card in the discard.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Chilling Howl",
        """
            You may discard a resolved card in the
            previous turn slot. **This round:** Enemy
            heroes in radius cannot fast travel, or move
            more than 2 spaces with a movement action.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Death Grip",
        """
            While you are adjacent to exactly one enemy
            hero, that hero cannot move or be moved,
            placed, or swapped and you cannot be
            moved, placed or swapped by enemy heroes.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Menace",
        """
            Move an enemy unit in radius to a space
            outside of radius by the shortest valid path.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Trace",
        """
            Before the attack: If you have exactly
            one card in the discard, you may move
            up to 1 space to a space adjacent to
            an enemy hero and target that hero.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Hold Ground",
        """
            If there is an enemy hero in range,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Threaten",
        """
            Move an enemy unit in radius to a space
            outside of radius by the shortest valid path.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Chase",
        """
            Before the attack: If you have exactly
            one card in the discard, you may move
            up to 2 spaces to a space adjacent to
            an enemy hero and target that hero.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Make a Stand",
        """
            If there is an enemy hero in range,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Shields Up!",
        """
            **This round:** You and friendly units in
            radius are immune to ranged actions of
            enemy heroes outside of radius. Cancel
            this effect if you move or fast travel.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Blunt Force",
        """
            Target a unit adjacent to you. After the attack:
            you may move up to 2 spaces to a space
            adjacent to the nearest enemy hero.
            Push that hero up to 2 spaces.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Light Pilum",
        """
            An enemy hero in range, not adjacent
            to you, discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Terrify",
        """
            Move an enemy unit in radius to a space
            outside of radius by the shortest valid path.
            If you do, **This turn:** That hero cannot move
            back into radius with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Hunt Down",
        """
            Before the attack: If you have exactly
            one card in the discard, you may move
            up to 3 spaces to a space adjacent to
            an enemy hero and target that hero.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Battle Ready",
        """
            If there is an enemy hero in range,
            you may retrieve a discarded card.
            **End of next turn:** May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Form Testudo!",
        """
            **This round:** You and friendly units in
            radius are immune to ranged actions
            of enemy heroes outside of radius.
            Cancel this effect if you move more than
            2 spaces in a single turn, or fast travel.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Send Flying",
        """
            Target a unit adjacent to you. After the attack:
            you may move up to 3 spaces to a space
            adjacent to the nearest enemy hero.
            Push that hero up to 2 spaces.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.AREA,
    ),
    Card(
        "Heavy Pilum",
        """
            An enemy hero in range, not adjacent
            to you, discards a card, or is defeated.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
)
