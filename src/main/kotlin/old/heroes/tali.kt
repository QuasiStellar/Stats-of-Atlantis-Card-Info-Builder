package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier

val tali = setOf(
    Card(
        "Turn to Ice",
        """
            **Choose one —**
            >>A hero in range with an unresolved card
            >may choose to retrieve that card. If they
            >do not, name a color. That hero discards
            >a card of that color, if able.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Cold Touch",
        """
            A hero in range with an unresolved card
            may choose to retrieve that card.
            If they do not, name a color. That hero
            discards a card of that color, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Commune with Spirits",
        """
            The nearest friendly hero names a color,
            you may then **choose one —**
            >>Discard a card of that color. If you do,
            >perform any one action on that card.
            >>Retrieve a discarded card of that color.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Reign of Winter",
        """
            Whenever an enemy hero in play
            retrieves a card as a result of an action,
            that hero discards a card, if able, and
            you may retrieve your discarded card.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Cold Snap",
        """
            The nearest enemy hero in radius discards a
            card, if able. **Next turn, after playing cards:**
            That hero may retrieve that discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
    ),
    Card(
        "Frost Dagger",
        """
            Target a unit adjacent to you. After the attack:
            If you target a hero, that hero discards a card,
            if able. **Next turn, after playing cards:**
            That hero may retrieve that card.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Glacial Barrier",
        """
            Place an ::token_ice:: ice token in radius, adjacent
            to another ice token, if able. Enemy
            heroes have -1 ::initiative:: Initiative penalty for
            every ice token they are adjacent to.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Snowstorm",
        """
            Name a color. The nearest enemy hero in
            radius discards a card of that color, if able.
            **Next turn, after playing cards:** That hero
            may retrieve a discarded card of that color.
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
        item = Item.ATTACK,
    ),
    Card(
        "Frost Spear",
        """
            Target a unit adjacent to you. After the
            attack: If you target a hero, name a color.
            That hero discards a card of that color,
            if able. **Next turn, after playing cards:**
            That hero may retrieve that card.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Wall of Frost",
        """
            Place up to 2 ::token_ice:: ice tokens in radius,
            adjacent to another ice token, if able.
            Enemy heroes have -1 ::initiative:: Initiative penalty
            for every ice token they are adjacent to.
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
        "Guardian Spirit",
        """
            If you have a card in the discard,
            a friendly hero in radius may
            retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Spirit Wolf",
        """
            If you have a card in the discard, target a
            minion in range, or a hero adjacent to you.
            Otherwise, target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Ancestral Totem",
        """
            Place a ::token_totem:: totem token in radius.
            If a friendly melee minion adjacent
            to a totem would be defeated, you
            may remove the totem instead.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Blizzard",
        """
            Name a color. The nearest enemy hero in
            radius discards a card of that color, if able.
            **End of next turn:** That hero may retrieve
            a discarded card of that color.
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
        "Frost Scepter",
        """
            Target a unit adjacent to you. After the attack:
            If you target a hero, name a color. That hero
            discards a card of that color, if able. **End of**
            **next turn:** That hero may retrieve that card.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Pack Ice",
        """
            Place up to 3 ::token_ice:: ice tokens in radius,
            adjacent to another ice token, if able.
            Enemy heroes have -1 ::initiative:: Initiative penalty
            for every ice token they are adjacent to.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Vengeful Spirit",
        """
            If you have a card in the discard,
            you, or a friendly hero in radius,
            may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
    ),
    Card(
        "Spirit Bear",
        """
            If you have a card in the discard,
            target a unit in range. Otherwise,
            target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Venerated Totem",
        """
            Place a ::token_totem:: totem token in radius. If a
            friendly minion adjacent to a totem would be
            defeated, you may remove the totem instead.
            Totems are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
)
