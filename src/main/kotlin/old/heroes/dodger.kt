package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val dodger = setOf(
    Card(
        "Dread Razor",
        """
            +1 ::range_gold:: Range if you are adjacent to
            an empty minion spawn point in the
            battle zone. Target a unit in range.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Rusty Razor",
        """
            +1 ::range_gold:: Range if you are adjacent to
            an empty minion spawn point in the
            battle zone. Target a hero in range. 
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Death Trap",
        """
            You may remove a friendly minion in radius.
            One enemy hero in radius who is adjacent
            to an empty minion spawn point in the
            battle zone, discards a card, if able.
        """.trimIndent(),
        Color.SILVER,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 1,
    ),
    Card(
        "Tide of Darkness",
        """
            Whenever you perform an action, all spaces
            count as if they are in a battle zone
            and have a minion spawn point.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Shield of Decay",
        """
            +3 ::defense_blue:: Defense if there are 2 or more
            empty minion spawn points in
            radius in the battle zone.
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
            Target a unit in range. +2 ::attack_red:: Attack if you
            target a hero with a card in the discard.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 3,
    ),
    Card(
        "Dark Ritual",
        """
            You may remove a friendly minion in radius.
            If there are 3 or more empty minion spawn
            points in radius in the battle zone, gain 1 coin.
            ~(Removing the minion is optional!)
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
            You may remove a friendly minion in radius.
            +3 ::defense_blue:: Defense if there are 2 or more
            empty minion spawn points in
            radius in the battle zone.
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
        item = Item.ATTACK,
    ),
    Card(
        "Finger of Death",
        """
            Target a unit in range. +3 ::attack_red:: Attack if you
            target a hero with a card in the discard.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Darker Ritual",
        """
            You may remove a friendly minion in radius.
            If there are 3 or more empty minion spawn
            points in radius in the battle zone, gain 2 coins.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Drain Essence",
        """
            Perform a non-attack action of a card in
            the discard of an enemy hero in radius;
            apply no item bonuses.
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
        item = Item.DEFENSE,
    ),
    Card(
        "Burning Skull",
        """
            Target a unit in range. After the attack:
            Push every enemy unit adjacent to the target
            1 space away from the target's space.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Necromancy",
        """
            If an enemy hero in radius has a card in
            the discard, respawn a friendly minion in a
            spawn point adjacent to you in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Aegis of Doom",
        """
            You may remove a friendly minion in radius.
            If there are 2 or more empty minion spawn
            points in radius in a battle zone +4 ::defense_blue::
            Defense and **This turn:** You are immune.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.DEFENSE,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        item = Item.RANGE,
    ),
    Card(
        "Middlefinger of Death",
        """
            Target a unit in range. +3 ::attack_red:: Attack if you
            target a hero with a card in the discard.
            **This turn:** The target cannot retrieve cards.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Darkest Ritual",
        """
            You may remove a friendly minion in radius.
            If there are 3 or more empty minion spawn
            points in radius in the battle zone, gain 2
            coins, and you may retrieve a discarded card.
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Soul Siphon",
        """
            Perform an action of a card in the
            discard of an enemy hero in radius,
            apply no item bonuses.
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
            Target a unit in range. Before the attack:
            Push every enemy unit adjacent to the
            target 1 space away from the target's space.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
    ),
    Card(
        "Necromastery",
        """
            If an enemy hero in radius has a card in
            the discard, respawn a friendly minion in
            a spawn point in radius in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
)
