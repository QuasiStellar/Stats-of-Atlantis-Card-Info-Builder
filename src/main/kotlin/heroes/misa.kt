package heroes

import Action
import Card
import Color
import Item
import Modifier

val misa = setOf(
    Card(
        "Watch Me Soar",
        """
            You may move through obstacles.
            **This turn:** You are immune to non-ranged
            attacks and skills. Ignore the effects of
            tokens. Other units may move through you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 5,
        secondaryDefense = 6,
    ),
    Card(
        "???",
        """
            You may move through obstacles.
            **This turn:** You are immune to non-ranged
            attacks and skills. Ignore the effects of
            tokens. Other units may move through you.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Swoop In",
        """
            Place yourself into a space in radius,
            adjacent to an enemy hero. **This turn:**
            Heroes in radius must attack you, if able,
            when performing an attack action. The first
            time you discard a card, gain 2 coins.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Power Overwhelming",
        """
            You may move through obstacles.
            Your actions with **"Next turn"**
            active effects count as if they had a
            **"This round"** active effect instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Sudden Breeze",
        """
            Move up to 3 spaces in a straight line
            ignoring the obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Challenge Accepted",
        """
            Target a unit adjacent to you.
            After the attack: If the target defends
            successfully, gain 2 coins.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Focus",
        """
            **Next turn:** After you resolve a skill,
            you may repeat it once.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Gust of Wind",
        """
            Move up to 3 spaces in a straight line
            ignoring obstacles. You may place 1 unit
            moved through into a space adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Matter of Honor",
        """
            Target a unit adjacent to you.
            After the attack: If the target defends
            successfully, gain 3 coins.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 1,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Discipline",
        """
            **Next turn:** After you resolve an attack or a
            skill, you may repeat it once. Cannot attack
            the same hero twice this way.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Living Tornado",
        """
            Swap two enemy units in radius,
            not adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Power Shot",
        """
            Target a unit in range. After the attack: If the
            target is not adjacent to you, you may move
            it 1 space, to a space farther away from you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
        item = Item.DEFENSE,
    ),
    Card(
        "Dash and Slash",
        """
            **Next turn:** The first enemy hero you move
            through discards a card, if able. If a hero
            discards a card this way, gain 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Crushing Squall",
        """
            Move up to 4 spaces in a straight line
            ignoring obstacles. You may place 1 unit
            moved through into a space adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.RANGE,
    ),
    Card(
        "Worthy Opponent",
        """
            Target a unit adjacent to you. If you target a
            hero, that hero cannot choose to not defend.
            After the attack: If the target defends
            successfully, gain 4 coins.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 1,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Mastery",
        """
            **Next turn:** After you resolve an action,
            you may repeat it once. Cannot attack
            the same hero twice this way.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 5,
        secondaryMovement = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Storm Spirit",
        """
            Swap with an enemy unit in radius, not
            adjacent to you, or swap two enemy
            units in radius, not adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Thunder Shot",
        """
            Target a unit in range. After the attack:
            If the target is not adjacent to you, you
            may move it 1 space, to a space farther
            away from you, up to two times.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
        item = Item.AREA,
    ),
    Card(
        "Death from Above",
        """
            **Next turn:** The first enemy hero you
            move through this turn discards a card,
            or is defeated. If a hero discards a
            card this way, gain 2 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 7,
        secondaryMovement = 3,
        item = Item.ATTACK,
    ),
)
