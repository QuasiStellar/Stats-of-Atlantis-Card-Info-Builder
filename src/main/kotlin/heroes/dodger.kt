package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign
import Trait

val dodger = setOf(
    Card(
        "Dread Razor",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>If you are adjacent to an empty spawn point
            >in the battle zone, target a unit in range.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.SPAWN_POINTS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Rusty Razor",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>If you are adjacent to an empty spawn point
            >in the battle zone, target a hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.SPAWN_POINTS, Trait.ATTACK_HERO),
    ),
    Card(
        "Death Trap",
        """
            An enemy hero in radius who is
            adjacent to an empty spawn point in
            the battle zone discards a card, if able.
        """.trimIndent(),
        Color.SILVER,
        initiative = 7,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 1,
        traits = setOf(Trait.DISCARD, Trait.SPAWN_POINTS),
    ),
    Card(
        "Tide of Darkness",
        """
            While you are performing an action, all spaces
            count as if they were in the battle zone and
            had a friendly minion spawn point.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = setOf(Trait.SPAWN_POINTS, Trait.COUNTS_AS),
    ),
    Card(
        "Shield of Decay",
        """
            +2 ::defense_blue:: Defense if there are 2 or more empty
            spawn points in radius in the battle zone.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.SPAWN_POINTS),
    ),
    Card(
        "Littlefinger of Death",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range who has one or
            >more cards in the discard.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Dark Ritual",
        """
            If there are 2 or more empty spawn points
            in radius in the battle zone, gain 1 coin.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Vampiric Shield",
        """
            +2 ::defense_blue:: Defense if there are 2 or more empty
            spawn points in radius in the battle zone.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        item = Item.INITIATIVE,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.SPAWN_POINTS),
    ),
    Card(
        "Finger of Death",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>Target a hero in range who has one or
            >more cards in the discard.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Darker Ritual",
        """
            If there are 2 or more empty spawn points
            in radius in the battle zone, gain 2 coins.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Weakness",
        """
            **This turn:** Enemy heroes
            in radius have -4 ::attack_silver:: Attack.
            ~(They can still attack, even with a negative attack value.)
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_TURN, Trait.STAT_CHANGING),
    ),
    Card(
        "Burning Skull",
        """
            Target a unit in range. After the attack:
            Move up to 1 minion adjacent to you
            1 space, to a space not adjacent to you.
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
        secondaryDefense = 5,
        item = Item.DEFENSE,
        traits = setOf(Trait.MOVING_MINIONS, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Necromancy",
        """
            Respawn a friendly minion in an empty friendly
            spawn point adjacent to you in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.RESPAWN, Trait.SPAWN_POINTS),
    ),
    Card(
        "Aegis of Doom",
        """
            +4 ::defense_blue:: Defense if there are 2 or more empty
            spawn points in radius in the battle zone.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        item = Item.INITIATIVE,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.SPAWN_POINTS),
    ),
    Card(
        "Middlefinger of Death",
        """
            **Choose one, or both, on different targets —**
            >>Target a unit adjacent to you.
            >>Target a hero in range who has one or 
            >more cards in the discard.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Darkest Ritual",
        """
            If there are 2 or more empty spawn points in
            radius in the battle zone, gain 2 coins. If you
            have your Ultimate, gain an ::attack_silver:: Attack item.
            ~(Use any spare card from the box with the corresponding icon.)
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Enfeeblement",
        """
            **This turn:** Enemy heroes in radius have
            -6 ::attack_silver:: Attack and cannot repeat actions.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_TURN, Trait.STAT_CHANGING),
    ),
    Card(
        "Blazing Skull",
        """
            Target a unit in range. After the attack:
            Move up to 2 minions adjacent to you
            1 space each, to spaces not adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.AREA,
        traits = setOf(Trait.MOVING_MINIONS, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Necromastery",
        """
            Respawn a friendly minion in an empty friendly
            spawn point in radius in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.RANGE,
        traits = setOf(Trait.RESPAWN, Trait.SPAWN_POINTS),
    ),
)
