package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val whisper = setOf(
    Card(
        "Swift Justice",
        """
            **Choose one —**
            >>Target a hero in range with an empty discard.
            >After the attack: If able, that hero performs a
            >movement action on the card they defended
            >with, moving full distance in a straight line.
            >>Target a unit adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.AFTER_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT, Trait.ATTACK_HERO),
    ),
    Card(
        "Vile Accusation",
        """
            **Choose one —**
            >>Target a hero in range with an empty discard.
            >After the attack: If able, that hero performs a
            >movement action on the card they defended
            >with, moving full distance in a straight line.
            >>Target a hero adjacent to you.
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
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.STRAIGHT_LINE, Trait.ATTACK_HERO),
    ),
    Card(
        "Death Seeker",
        """
            If an enemy hero in radius has a card
            in the discard, **choose one —**
            >>**This turn:** You are immune to enemy actions.
            >>You may retrieve a discarded card.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 2,
        traits = setOf(Trait.HEALING_SELF, Trait.IMMUNITY_GAIN, Trait.THIS_TURN, Trait.MULTIPLE_CHOICE),
    ),
    Card(
        "Grim Reaper",
        """
            When performing basic actions,
            you may choose one, or both.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = emptySet(),
    ),
    Card(
        "Seeds of Fear",
        """
            Target an enemy unit in radius occupying
            a spawn point. Move that unit 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        traits = setOf(Trait.MOVING_UNITS, Trait.SPAWN_POINTS),
    ),
    Card(
        "Crimson Trail",
        """
            Before the attack: You may move up
            to 1 space if there is an empty minion spawn
            point in radius in the battle zone.
            Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        traits = setOf(Trait.MOVING_SELF, Trait.BEFORE_THE_ATTACK, Trait.SPAWN_POINTS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Shadow Step",
        """
            Place yourself into an empty minion
            spawn point in range in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Sprouts of Panic",
        """
            Target an enemy unit in radius occupying a
            spawn point. Move that unit up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
        traits = setOf(Trait.MOVING_UNITS, Trait.SPAWN_POINTS),
    ),
    Card(
        "Sanguine Path",
        """
            Before the attack: You may move up to
            1 space for every empty minion spawn point
            in radius in the battle zone, up to a maximum
            of 2 spaces. Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.MOVING_SELF, Trait.BEFORE_THE_ATTACK, Trait.SPAWN_POINTS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Shadow Walk",
        """
            Place yourself into an empty minion
            spawn point in range in the battle zone.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Lesser Evil",
        """
            An enemy hero in range **chooses one —**
            >>That hero discards a card, if able.
            >>You may defeat a minion adjacent to you.
            ~(Any option can be chosen, even if it would have no effect.)
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
        traits = setOf(Trait.DEFEAT, Trait.DISCARD),
    ),
    Card(
        "Blood Fury",
        """
            Target a unit adjacent to you. After the attack:
            If an enemy hero in radius has a card in the
            discard, may repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Cruel Twist",
        """
            Swap with a unit adjacent to you, or with
            an enemy hero in range with a card in
            the discard. Move up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 3,
        secondaryMovement = 2,
        item = Item.DEFENSE,
        traits = setOf(Trait.MOVING_SELF, Trait.SWAPPING_SELF, Trait.SWAPPING_UNITS),
    ),
    Card(
        "Blooming Nightmare",
        """
            Target an enemy unit in radius occupying
            a spawn point. Move that unit up to 3 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.MOVING_UNITS, Trait.SPAWN_POINTS),
    ),
    Card(
        "Blood Pilgrimage",
        """
            Before the attack: You may move up to
            1 space for every empty minion spawn point
            in radius in the battle zone, up to a maximum
            of 3 spaces. Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.MOVEMENT,
        traits = setOf(Trait.MOVING_SELF, Trait.BEFORE_THE_ATTACK, Trait.SPAWN_POINTS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Creeping Shadow",
        """
            Place yourself into an empty minion spawn
            point in range in the battle zone, or into a
            space in range adjacent to such a spawn point.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.AREA,
        traits = setOf(Trait.PLACING_SELF, Trait.SPAWN_POINTS),
    ),
    Card(
        "Greater Good",
        """
            An enemy hero in range **chooses one —**
            >>That hero discards a card, or is defeated.
            >>You defeat up to 3 minions adjacent to you.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.DEFEAT, Trait.DISCARD_OR_KILL),
    ),
    Card(
        "Blood Frenzy",
        """
            Target a unit adjacent to you.
            After the attack: If an enemy hero
            in radius has a card in the discard,
            repeat up to five times on different targets.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.RANGE,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Sealed Fate",
        """
            Swap with a unit adjacent to you, or with
            an enemy hero in range with a card in
            the discard. Move up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.DEFENSE,
        traits = setOf(Trait.MOVING_SELF, Trait.SWAPPING_SELF, Trait.SWAPPING_UNITS),
    ),
)
