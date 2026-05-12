package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val arien = setOf(
    Card(
        "Noble Blade",
        """
            Target a unit adjacent to you.
            Before the attack: You may move another
            unit that is adjacent to the target 1 space.
            ~("Another unit" never includes you.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        secondaryDefense = 2,
        secondaryMovement = 1,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        traits = setOf(Trait.MOVING_UNITS, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Ceremonial Blade",
        """
            Target a hero adjacent to you.
            Before the attack: You may move a minion
            that is adjacent to the target 1 space.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.MOVING_MINIONS, Trait.BEFORE_THE_ATTACK, Trait.ATTACK_HERO),
    ),
    Card(
        "Spell Break",
        """
            **This turn:** Enemy heroes in radius cannot
            perform skill actions, except on gold cards.
            ~(Skill ::skill_silver:: is an action type. Other action types are unaffected.)
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
        traits = setOf(Trait.THIS_TURN),
    ),
    Card(
        "Living Tsunami",
        """
            Once per turn, before performing an
            Attack action, you may move 1 space.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = setOf(Trait.MOVING_SELF),
    ),
    Card(
        "Aspiring Duelist",
        """
            Ignore all minion defense modifiers.
            ~(This includes your minions, as well as enemy minions.)
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.DEFENSE,
        primaryValue = 5,
        secondaryMovement = 3,
        traits = emptySet(),
    ),
    Card(
        "Dangerous Current",
        """
            Target a unit adjacent to you. Before the
            attack: Up to 1 enemy hero in any of the
            2 spaces in a straight line directly behind
            the target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 4,
        secondaryDefense = 6,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Liquid Leap",
        """
            Place yourself into a space in range
            without a spawn point and not adjacent
            to an empty spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Expert Duelist",
        """
            Ignore all minion defense modifiers.
            **This turn:** You are immune to attack actions
            of all enemy heroes, except this attacker.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 6,
        secondaryMovement = 3,
        item = Item.INITIATIVE,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_TURN),
    ),
    Card(
        "Rogue Wave",
        """
            Target a unit in range.
            After the attack: You may push an enemy
            unit adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.PUSHING_UNITS, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Magical Current",
        """
            Place yourself into a space in range
            without a spawn point and not adjacent
            to an empty spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Slippery Ground",
        """
            **This turn:** Enemy heroes adjacent
            to you cannot fast travel, or move more
            than 1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_TURN, Trait.FAST_TRAVEL, Trait.STAT_CHANGING),
    ),
    Card(
        "Raging Stream",
        """
            Target a unit adjacent to you. Before the
            attack: Up to 1 enemy hero in any of the
            3 spaces in a straight line directly behind
            the target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Arcane Whirlpool",
        """
            Swap with an enemy minion in range.
            ~(Swap places with the target. This is not movement.)
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_ENEMY, Trait.SWAPPING_MINIONS),
    ),
    Card(
        "Master Duelist",
        """
            Ignore all minion defense modifiers.
            **This round:** You are immune to attack actions
            of all enemy heroes, except this attacker.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.DEFENSE,
        primaryValue = 6,
        secondaryMovement = 3,
        item = Item.RANGE,
        traits = setOf(Trait.IMMUNITY_GAIN, Trait.THIS_ROUND),
    ),
    Card(
        "Violent Torrent",
        """
            Target a unit adjacent to you. Before the
            attack: Up to 1 enemy hero in any of the 5
            spaces in a straight line directly behind the
            target discards a card, or is defeated.
            May repeat once on a different unit.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Stranger Tide",
        """
            Place yourself into a space in
            range without a spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.AREA,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Deluge",
        """
            **This turn:** Enemy heroes in radius
            cannot fast travel, or move more than
            1 space with a movement action.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_TURN, Trait.FAST_TRAVEL, Trait.STAT_CHANGING),
    ),
    Card(
        "Tidal Blast",
        """
            Target a unit in range.
            After the attack: You may push an enemy
            unit adjacent to you up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
        traits = setOf(Trait.PUSHING_UNITS, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Ebb and Flow",
        """
            Swap with an enemy minion in range;
            if it was adjacent to you, may repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_ENEMY, Trait.SWAPPING_MINIONS),
    ),
)
