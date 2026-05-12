package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val mortimer = setOf(
    Card(
        "Knife of the Living Dead",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Remove a Zombie token adjacent to the
            >target; if you do, gain +1 ::attack_gold:: Attack.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 3,
        secondaryMovement = 1,
        traits = setOf(Trait.BEFORE_THE_ATTACK, Trait.SCALING, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Shallow Graves",
        """
            Target a hero adjacent to you.
            Before the attack: **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Remove a Zombie token adjacent to the
            >target; if you do, gain +1 ::attack_gold:: Attack.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 1,
        secondaryMovement = 1,
        traits = setOf(Trait.BEFORE_THE_ATTACK, Trait.SCALING, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.STAT_CHANGING, Trait.ATTACK_HERO),
    ),
    Card(
        "Awaken!",
        """
            Place up to 4 ::token_zombie:: Zombie tokens into
            spaces adjacent to you, or into spawn
            points in radius. Zombie tokens are
            not removed at the end of round.
        """.trimIndent(),
        Color.SILVER,
        initiative = 6,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 4,
        traits = setOf(Trait.END_OF_ROUND, Trait.USING_TOKENS, Trait.SPAWN_POINTS),
    ),
    Card(
        "Crawling Dead",
        """
            Target a unit adjacent to you.
            After the attack: **Choose one —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Another enemy hero in radius, adjacent to
            >a Zombie token, discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 7,
        secondaryMovement = 3,
        traits = setOf(Trait.DISCARD, Trait.MOVING_HEROES, Trait.AFTER_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Corpse Slam",
        """
            **Choose one —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or a token adjacent to it 1 space.
            >>Move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 6,
        secondaryMovement = 3,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Stage Dive",
        """
            **Choose one —**
            >>Move a ::token_zombie:: Zombie token in range 1 space.
            >>Swap with a Zombie token in range.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 3,
        secondaryMovement = 2,
        traits = setOf(Trait.SWAPPING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Walking Dead",
        """
            Target a unit adjacent to you.
            After the attack: **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Another enemy hero in radius, adjacent to
            >a Zombie token, discards a card, if able;
            >each enemy hero can only be targeted once.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 7,
        secondaryMovement = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.DISCARD, Trait.MOVING_HEROES, Trait.AFTER_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Braains...!",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>If an enemy hero in radius is adjacent to
            >a Zombie token, retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 7,
        secondaryMovement = 3,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HEALING_SELF, Trait.MOVING_HEROES, Trait.BEFORE_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Racing Dead",
        """
            Target a unit adjacent to you.
            After the attack: **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Another enemy hero in radius, adjacent to
            >a Zombie token, discards a card, if able;
            >each enemy hero can only be targeted once.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 8,
        secondaryMovement = 3,
        item = Item.RANGE,
        traits = setOf(Trait.DISCARD, Trait.MOVING_HEROES, Trait.AFTER_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Braaaaaaaains...!",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>If an enemy hero in radius is adjacent to
            >a Zombie token, retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 8,
        secondaryMovement = 3,
        item = Item.MOVEMENT,
        traits = setOf(Trait.HEALING_SELF, Trait.MOVING_HEROES, Trait.BEFORE_THE_ATTACK, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Morbid Mosh",
        """
            **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or a token adjacent to it 1 space.
            >>Move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 6,
        secondaryMovement = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Robbing Zombies",
        """
            **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space. Gain 1 coin.
            >>Move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 6,
        secondaryMovement = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Macabre Mayhem",
        """
            **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or a token adjacent to it 1 space.
            >>Move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 7,
        secondaryMovement = 3,
        item = Item.AREA,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Stalking Scalpers",
        """
            **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space. Gain 1 coin.
            >>Move 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 7,
        secondaryMovement = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),


    Card(
        "Crowd Drift",
        """
            **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in range 1 space.
            >>Swap with a Zombie token in range.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.SWAPPING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Gathering Horde",
        """
            **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in range 1 space.
            >>Once per turn: Replace an enemy minion
            >in range adjacent to two or more Zombie
            >tokens with a Zombie token.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.PLACING_ENEMY, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Crowd Surf",
        """
            **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in range 1 space.
            >>Swap with a Zombie token in range.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.SWAPPING_SELF, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Army of Darkness",
        """
            **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in range 1 space.
            >>Once per turn: Replace an enemy minion
            >in range adjacent to two or more Zombie
            >tokens with a Zombie token.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.PLACING_ENEMY, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Master of Puppets",
        """
            Whenever you would choose up
            to three times, you may choose
            up to five times instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = emptySet(),
    ),
)