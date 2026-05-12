package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val wuk = setOf(
    Card(
        "Tree Slam",
        """
            **Choose one —**
            >>Target a minion adjacent to you.
            >>Remove a ::token_tree:: Tree token adjacent to you.
            >Target a unit in range.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 3,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT, Trait.ATTACK_MINION),
    ),
    Card(
        "Makeshift Weapon",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>Remove a ::token_tree:: Tree token adjacent to you.
            >Target a hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_HERO),
    ),
    Card(
        "Mystic Saplings",
        """
            Place up to 3 ::token_tree:: Tree tokens in radius; Tree
            tokens are not removed at the end of round.
        """.trimIndent(),
        Color.SILVER,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        traits = setOf(Trait.END_OF_ROUND, Trait.USING_TOKENS),
    ),
    Card(
        "March of Nature",
        """
            Each time after you resolve a card, you
            may place a ::token_tree:: Tree token in radius.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        traits = setOf(Trait.USING_TOKENS),
    ),
    Card(
        "Gifts of Nature",
        """
            Remove a ::token_tree:: Tree token in radius.
            You may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        traits = setOf(Trait.HEALING_SELF, Trait.REMOVING, Trait.USING_TOKENS),
    ),
    Card(
        "Nature's Protector",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>Target a unit in range adjacent
            >to a ::token_tree:: Tree token.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Toss Away",
        """
            Place a token, or an enemy unit,
            adjacent to you into a space in range.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        traits = setOf(Trait.PLACING_TOKENS, Trait.USING_TOKENS),
    ),
    Card(
        "Tree of Plenty",
        """
            Remove a ::token_tree:: Tree token in radius.
            **Choose one —**
            >>You may retrieve a discarded card.
            >>A friendly hero in radius may retrieve a
            >discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.HEALING_SELF, Trait.DISCARD_TEAM, Trait.REMOVING, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Nature's Guardian",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>Target a unit in range adjacent
            >to a ::token_tree:: Tree token.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Mighty Throw",
        """
            Place a token, or an enemy unit,
            adjacent to you into a space in range.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_TOKENS, Trait.USING_TOKENS),
    ),
    Card(
        "Claim Dominance",
        """
            **This round:** Up to 1 enemy minion adjacent
            to you does not count towards the minion total
            during minion battle, regardless of immunity.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.THIS_ROUND, Trait.MINION_BATTLE),
    ),
    Card(
        "Trample",
        """
            If you move in a straight line: You may ignore
            obstacles; each enemy hero you moved
            through discards a card, or is defeated;
            defeat up to one minion you moved through.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
        traits = setOf(Trait.DEFEAT, Trait.DISCARD_OR_KILL, Trait.IGNORING_OBSTACLES, Trait.STRAIGHT_LINE),
    ),
    Card(
        "Into the Canopy",
        """
            **Choose one —**
            >>Swap with a ::token_tree:: Tree token in radius.
            >>Swap a friendly unit in radius with
            >a Tree token in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Abundance",
        """
            Remove a ::token_tree:: Tree token in radius.
            **Choose one or both —**
            >>You may retrieve a discarded card.
            >>A friendly hero in radius may retrieve a
            >discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.RANGE,
        traits = setOf(Trait.HEALING_SELF, Trait.DISCARD_TEAM, Trait.REMOVING, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Nature's Champion",
        """
            **Choose one, or both,** on different targets **—**
            >>Target a hero adjacent to you.
            >>Target a unit in range adjacent to
            a ::token_tree:: Tree token.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Monstrous Throw",
        """
            Place a token, or an enemy unit,
            adjacent to you into a space in range.
            May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_TOKENS, Trait.USING_TOKENS),
    ),
    Card(
        "Assert Dominance",
        """
            **This round:** Up to 2 enemy minions adjacent
            to you do not count towards the minion total
            during minion battle, regardless of immunity.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
        traits = setOf(Trait.THIS_ROUND, Trait.MINION_BATTLE),
    ),
    Card(
        "Angry Stampede",
        """
            If you move in a straight line: You may ignore
            obstacles; each enemy hero you moved
            through discards a card, or is defeated;
            defeat up to two minions you moved through.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryDefense = 7,
        item = Item.AREA,
        traits = setOf(Trait.DEFEAT, Trait.DISCARD_OR_KILL, Trait.IGNORING_OBSTACLES, Trait.STRAIGHT_LINE),
    ),
    Card(
        "Treetop Ride",
        """
            **Choose up to two times —**
            >>Swap with a ::token_tree:: Tree token in radius.
            >>Swap a friendly unit in radius with
            >a Tree token in radius.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
)
