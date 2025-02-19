package heroes

import Action
import Card
import Color
import Item
import Modifier

val wuk = setOf(
    Card(
        "Tree Slam",
        """
            If you are adjacent to a tree token, target
            a unit in range, otherwise, target a minion
            adjacent to you. After the attack:
            If the target was adjacent to you, move it
            1 space to a space adjacent to you, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Makeshift Weapon",
        """
            Cannot attack if you are not adjacent to a tree
            token. Target a unit in range. After the attack:
            If the target was adjacent to you, move it 1
            space to a space adjacent to you, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Mystic Saplings",
        """
            Place up to 3 ::token_tree:: tree tokens in radius, not
            adjacent to a tree token. Heroes may move
            through a space with a tree token. Do not
            remove the tree tokens at the end of round.
        """.trimIndent(),
        Color.SILVER,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
    ),
    Card(
        "March of Nature",
        """
            Adjacent Tree tokens in a battle zone count as
            melee minions immune to ranged attacks.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Gifts of Nature",
        """
            If you are adjacent to a tree, you
            may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Nature's Protector",
        """
            Target a unit in range, adjacent to a tree token.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Toss Away",
        """
            Move up to 1 space. Push an adjacent token
            up to 3 spaces. If the token is pushed 2 or
            more spaces, an enemy hero adjacent to
            that token discards a card, if able.    
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Tree of Plenty",
        """
            Either you, or a hero in radius, may
            retrieve a discarded card if either
            of you are adjacent to a tree.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Nature's Guardian",
        """
            Target a unit in range, adjacent to a tree token.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Mighty Throw",
        """
            Move up to 1 space. Push an adjacent token
            or a minion up to 4 spaces. If it is pushed 2 or
            more spaces, an enemy hero adjacent to that
            token or a minion discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Claim Dominance",
        """
            **This round:** Up to 1 adjacent non-immune
            enemy minion does not count towards the
            minion total during minion battle.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Trample",
        """
            If you move in a straight line: You may ignore
            units; if you moved through an enemy hero,
            that hero discards a card, or is defeated;
            defeat up to 1 minion you moved through.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Into the Canopy",
        """
            Swap places with a tree token in radius.
            You may then place a minion adjacent to
            that tree token into a space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Abundance",
        """
            Both you and a friendly hero in radius
            may retrieve a discarded card if either
            of you are adjacent to a tree.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.RANGE,
    ),
    Card(
        "Nature's Champion",
        """
            Target a unit in range, adjacent to a tree token.
            May repeat once, targeting a different hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
    ),
    Card(
        "Monstrous Throw",
        """
            Move up to 1 space. Push an adjacent unit
            or a token up to 5 spaces. If it is pushed 2
            or more spaces, an enemy hero adjacent to
            that unit or token discards a card, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Assert Dominance",
        """
            **This round:** Up to 2 adjacent enemy minion
            do not count towards the minion total during
            minion battle, regardless of immunity.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Angry Stampede",
        """
            If you move in a straight line: You may ignore
            units; if you moved through an enemy hero,
            that hero discards a card, or is defeated;
            defeat up to 2 minion you moved through.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryDefense = 8,
        item = Item.AREA,
    ),
    Card(
        "Treetop Ride",
        """
            Swap places with a tree token in radius.
            You may then place a minion adjacent to that
            tree token into a space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        item = Item.DEFENSE,
    ),
)
