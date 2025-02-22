package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

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
    ),
    Card(
        "Death Trap",
        """
            An enemy hero in radius who is
            adjacent to an empty spawn point in
            the battle zone, discards a card, if able.
        """.trimIndent(),
        Color.SILVER,
        initiative = 7,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 1,
    ),
    Card(
        "Tide of Darkness",
        """
            While you are performing an action, all spaces
            count as if they are in the battle zone and
            havd a friendly minion spawn point.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
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
    ),
    Card(
        "Littlefinger of Death",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
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
        secondaryMovement = 5,
        secondaryDefense = 4,
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
    ),
    Card(
        "Vampiric Shield",
        """
            +2 ::defense_blue:: Defense if there are 2 or more empty
            minion spawn points in radius in the battle zone.
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
    ),
    Card(
        "Finger of Death",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
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
    ),
    Card(
        "Aegis of Doom",
        """
            +4 ::defense_blue:: if there are 2 or more empty
            spawn points in radius in a battle zone.
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
    ),
    Card(
        "Middlefinger of Death",
        """
            **Choose one, or both, on different targets —**
            >>Target a hero adjacent to you.
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
    ),
)
