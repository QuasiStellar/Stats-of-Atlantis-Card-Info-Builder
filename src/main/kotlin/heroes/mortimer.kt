package heroes

import Action
import Card
import Color
import Item
import Modifier

val mortimer = setOf(
    Card(
        "Knife of the Living Dead",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Remove a Zombie token adjacent to the
            >target; if you do, gain +1 ::gold_attack:: Attack.
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
    ),
    Card(
        "Shallow Graves",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >>Remove a Zombie token adjacent to the
            >target; if you do, gain +1 ::gold_attack:: Attack.
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
    ),
    Card(
        "Corpse Slam",
        """
            **Choose one —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or token adjacent to it 1 space.
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
    ),
    Card(
        "Morbid Mosh",
        """
            **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or token adjacent to it 1 space.
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
    ),
    Card(
        "Macabre Mayhem",
        """
            **Choose up to three times —**
            >>Move a ::token_zombie:: Zombie token in range up to
            >1 space; that Zombie token may push a
            >unit or token adjacent to it 1 space.
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
    ),
)