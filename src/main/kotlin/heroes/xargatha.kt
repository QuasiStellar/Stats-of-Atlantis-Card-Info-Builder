package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val xargatha = setOf(
    Card(
        "Backlash",
        """
            **This turn:** After you discard a card for any
            reason, perform the primary action on an
            attack card in your discard, if able.
            ~(First complete the action causing the discard).
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Counter-Swing",
        """
            Cannot target minions.
            **This turn:** After you discard a card for any
            reason, perform the primary action on an
            attack card in your discard, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Siren's Call",
        """
            Target the nearest non-immune enemy unit
            in range not adjacent to you; move that unit
            up to 2 spaces along the shortest valid path
            towards you. May repeat once.
        """.trimIndent(),
        Color.SILVER,
        initiative = 1,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Metamorphosis",
        """
            You may move through obstacles.
            Before you perform an action, one adjacent
            enemy hero discards a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Stone Gaze",
        """
            **This turn:** The nearest enemy heroes
            in radius are immune, cannot perform a
            movement action, and count as terrain.
            ~(Will affect multiple heroes if they are at the same distance.)
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
        "Dangerous Slash",
        """
            +1 ::attack_red:: Attack for every enemy
            unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 6,
    ),
    Card(
        "Charming Aura",
        """
            **This round:** Enemy melee minions in
            radius count as if on your team for the
            purpose of defense modifiers.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Petrifying Stare",
        """
            **This turn:** The nearest enemy heroes
            in radius are immune, cannot perform a
            movement action, and count as terrain.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Deadly Swipe",
        """
            +2 ::attack_red:: Attack for every enemy
            unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Aura of Control",
        """
            **This round:** Enemy ranged and melee
            minions in radius count as if on your team
            for the purpose of defense modifiers.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Fresh Converts",
        """
            If you are adjacent to a minion,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Long Thrust",
        """
            Target a unit not adjacent to you.
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
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Constrict",
        """
            **Next turn:** Adjacent enemy heroes cannot
            move, except when performing a movement
            action on a gold card or a red card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Turn into Statues",
        """
            **This turn:** Enemy heroes in radius are
            immune, cannot perform a movement
            action, and count as terrain.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Lethal Spin",
        """
            +3 ::attack_red:: Attack for every enemy
            unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Aura of Domination",
        """
            **This round:** All enemy minions, including the
            immune ones, in radius count as if on your
            team for the purpose of defense modifiers.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Devoted Followers",
        """
            If you are adjacent to a minion, you may
            retrieve a discarded card and **This turn:**
            You are immune to attack actions.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Rapid Thrusts",
        """
            Target a unit not adjacent to you. After the
            attack: If you are adjacent to an enemy hero,
            may repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Deadly Embrace",
        """
            **Next turn:** Adjacent enemy heroes
            cannot move, except when performing
            a movement action on a gold card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
)
