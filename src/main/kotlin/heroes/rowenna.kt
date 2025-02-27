package heroes

import Action
import Card
import Color
import Item
import Modifier

val rowenna = setOf(
    Card(
        "Code of Chivalry",
        """
            Target a unit adjacent to you.
            Before the attack: If you target a hero,
            both you and the target may
            retrieve a discarded card.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Earn the Spurs",
        """
            Target a hero adjacent to you.
            Before the attack: Both you and the target
            may retrieve a discarded card.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Throw the Gauntlet",
        """
            Place yourself into a space in range adjacent
            to an enemy hero in range; that hero may
            move 1 space; if they do, gain 2 coins.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
    ),
    Card(
        "Token of Gratitude",
        """
            Target a unit adjacent to you. After the attack:
            A friendly hero in radius gains 1 coin.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.Attack,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Close Quarters",
        """
            After movement, if yhou are adjacent to
            an enemy hero, you may **Choose one —**
            >> Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >> Place an enemy minion in radius into a
            >space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Stand Guard",
        """
            Swap with a friendly unit in range
            which is adjacent to an enemy hero,
            or who has a card in the disacrd.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 6,
    ),
    Card(
        "Fair Share",
        """
            Target a unit adjacent to you. After the attack:
            A friendly hero in radius gains 1 coin.
        """.trimIndent(),
        Color.RED,
        level = 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 6,
        modifier = Modifier.AREA,
        modifierValue = 3,
        item = Item.INITIATIVE,
        variant = 1 to 2,
    ),
    Card(
        "Feat of Bravery",
        """
            Target a unit adjacent to you.
            After the attack: A friendly hero in radius
            may retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 7,
        variant = 2 to 2,
    ),
    Card(
        "Melee",
        """
            After movement, if you are adjacent to
            an enemy hero, you may **Choose one —**
            >> Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >> Place an enemy minion in radius into a
            >space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 11,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        variant = 1 to 2,
        item = Item.ATTACK,
    ),
    Card(
        "Opening Shots",
        """
            If both you and an enemy hero in radius
            have no cards in the discard, that hero
            discards ac ard, if able.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        variant = 2 to 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Protect the Weak",
        """
            Swap with a friendly unit in range
            which is adjacent to an enemy hero,
            or who has a card in the discard.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Accept Surrender",
        """
            Defeat an enemy hero adjacent to
            you with no cards in hand.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Grand Melee",
        """
            After movement, if you are adjacent to
            an enemy hero, you may **Choose one —**
            >> Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >> Place an enemy minion in radius into a
            >space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Opening Volley",
        """
            If both you and an enemy hero in radius
            have no cards in the discard, that hero
            discards a card, if able. May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryDefense = 4,
        secondaryMovement = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Defend the Innocent",
        """
            Swap with a friendly unit in range
            which is adjacent to an enemy hero,
            or who has a card in the discard.
            You may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 7,
        secondaryMovement = 2,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        item = Item.AREA,
    ),
    Card(
        "Glorious Triumph",
        """
            Defeat an enemy hero adjacent to you
            with no cards in hand; your friendly
            heroes gain triple assist coins.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 7,
        secondaryMovement = 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Paragon of Grace",
        """
            Target a unit adjacent to you. After the attack:
            A friendly hero in radius gains 1 coin.
            May repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3 ,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 7,
        variant = 1 or 2,
        item = Item.RANGE,
    ),
    Card(
        "Paragon of Valor",
        """
            Target a unit adjacent to you.
            After the attack: A friendly hero in radius
            may retrieve a discarded card; if they do,
            you may repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3 ,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 8,
        variant = 2 or 2,
        item = Item.DEFENSE,
    ),
    Card(
        "Fabled Lance",
        """
            All of your attack actions gain the "Ranged"
            subtype, target a unit in range, and count
            as having a printed ::range_purple:: Range value of 2.
        """.trimIndent(),
        Color.PURPLE,
        level = 4 ,
        modifier = Modifier.RANGE,
        modifierValue = 2,
    ),
)