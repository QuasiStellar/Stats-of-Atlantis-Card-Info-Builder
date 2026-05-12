package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

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
        secondaryDefense = 2,
        traits = setOf(Trait.HEALING_TEAM, Trait.HEALING_ENEMY, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
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
        traits = setOf(Trait.BEFORE_THE_ATTACK, Trait.ATTACK_HERO),
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
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 3,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.MOVING_SELF, Trait.PLACING_SELF),
    ),
    Card(
        "Fabled Lance",
        """
            All your attack actions gain the "Ranged"
            subtype, target a unit in range, and count
            as having a printed ::range_purple:: Range value of 2.
        """.trimIndent(),
        Color.PURPLE,
        level = 4 ,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        traits = setOf(Trait.COUNTS_AS),
    ),
    Card(
        "Stand Guard",
        """
            Swap with a friendly unit in range
            which is adjacent to an enemy hero,
            or who has a card in the discard.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 6,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 4,
        secondaryDefense = 6,
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Close Quarters",
        """
            After movement, if you are adjacent to
            an enemy hero, you may **Choose one —**
            >>Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >>Place an enemy minion in radius into a
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
        traits = setOf(Trait.PLACING_TEAM, Trait.PLACING_ENEMY, Trait.MULTIPLE_CHOICE),
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
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        item = Item.DEFENSE,
        traits = setOf(Trait.HEALING_TEAM, Trait.DISCARD_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Melee",
        """
            After movement, if you are adjacent to
            an enemy hero, you may **Choose one —**
            >>Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >>Place an enemy minion in radius into a
            >space adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 11,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        variant = 1 to 2,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_TEAM, Trait.PLACING_ENEMY, Trait.MULTIPLE_CHOICE),
    ),
    Card(
        "Opening Shots",
        """
            If both you and an enemy hero in radius
            have no cards in the discard, that hero
            discards a card, if able.
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
        traits = setOf(Trait.DISCARD),
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
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        traits = setOf(Trait.DEFEAT),
    ),
    Card(
        "Grand Melee",
        """
            After movement, if you are adjacent to
            an enemy hero, **Choose up to two times —**
            >>Place a friendly minion in radius into a
            >space adjacent to that enemy hero.
            >>Place an enemy minion in radius into a
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
        traits = setOf(Trait.PLACING_TEAM, Trait.PLACING_ENEMY, Trait.MULTIPLE_CHOICE),
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
        traits = setOf(Trait.DISCARD),
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
        traits = setOf(Trait.HEALING_SELF, Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.DEFEAT),
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
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.RANGE,
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 8,
        item = Item.DEFENSE,
        traits = setOf(Trait.HEALING_TEAM, Trait.DISCARD_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
)