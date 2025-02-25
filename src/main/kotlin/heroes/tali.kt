package heroes

import Action
import Card
import Color
import Item
import Modifier

val tali = setOf(
    Card(
        "Turn to Ice",
        """
            Target a unit adjacent to you. If the target
            discards a card to defend, After the attack:
            Another enemy hero in radius discards a
            card of the same color, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Ice Shard",
        """
            Target a hero adjacent to you. If the target
            discards a card to defend, After the attack:
            Another enemy hero in radius discards a
            card of the same color, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Commune with Spirits",
        """
            A friendly hero in play names a color;
            you may discard a card of that color.
            Perform the primary aciton on a card
            of that color in your discard.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Reign of Winter",
        """
            Each time after you defeat a minion with your
            basic attack, an enemy hero in radius discards
            a card of the color of your choice, if able.
        """.trimIndent(),
        Color.PURPLE,
        modifier = Modifier.AREA,
        modifierValue = 4,
        level = 4,
    ),
    Card(
        "Cold Snap",
        """
            Choose a direction. Move each enemy unit
            in radius 1 space in that direction, if able.
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
        "Winter Dagger",
        """
            Target a unit adjacent to you.
            +3 ::attack_red:: Attack if this card is not in the discard.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Glacial Barrier",
        """
            Place an ::token_ice:: ice token in radius.
            Enemy heroes have -1 ::initiative:: Initiative for
            every Ice token they are adjacent to.
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
            Choose a direction. Move each enemy unit in
            radius 1 space in that direciton, if able.
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
        item = Item.DEFENSE,
    ),
    Card(
        "Winter Spear",
        """
            Target a unit adjacent to you.
            +3 ::attack_red:: Attack if this card is not in the discard.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Wall of Frost",
        """
            Place up to 2 ::token_ice:: ice tokens in radius.
            Enemy heroes have -1 ::initiative:: Initiative
            for every Ice token they are adjacent to.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Guardian Spirit",
        """
            Up to 1 friendly hero in radius
            may retrieve a discarded card.
            If "Guardian Spirit" is in the discard, retrieve it.
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
        item = Item.ATTACK,
    ),
    Card(
        "Spirit Wolf",
        """
            **Choose one —**
            >>If this card is not in the discard,
            >target a unit in range.
            >>Target a hero adjacent to you.
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
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Ancestral Totem",
        """
            Place a ::token_totem:: in range.
            If a friendly melee minion adjacent to a Totem
            would be defeated, remove the totem instead.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Blizzard",
        """
            Choose a direction. Move each enemy unit
            in radius 1 space in that direction, if able.
            If this card is in the discard, **End of turn:**
            May repeat once.
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
        item = Item.MOVEMENT,
    ),
    Card(
        "Winter Scepter",
        """
            Target a unit adjacent to you.
            +3 ::attack_red:: Attack if this card is not in the discard.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Pack Ice",
        """
            Place up to 3 ::token_ice:: ice tokens in radius.
            Enemy heroes have -1 ::initiative:: Initiative for
            every Ice token they are adjacent to.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Warrior Spirit",
        """
            Up to 1 friendly hero in radius may retrieve
            a discarded card. If "Warrior Spirit" is in the
            discard, you may retrieve a discarded card.
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
            **Choose one, or both,** on different targets —
            >>If this card is not in the discard,
            >target a unit in range.
            >>Target a hero adjacent to you.
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
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Venerated Totem",
        """
            Place a ::token_totem:: in range.
            If a friendly minion adjacent to a totem would
            be defeated, remove the totem instead.
            Totem tokens are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
)
