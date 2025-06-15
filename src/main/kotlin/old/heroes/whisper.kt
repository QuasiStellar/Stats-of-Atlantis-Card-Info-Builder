package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val whisper = setOf(
    Card(
        "Swift Justice",
        """
            **Choose one —**
            >>An enemy hero in range discards a card,
            >if able; then, if able, that hero moves the
            >number of spaces equal to that card's
            >printed movement value in a straight line.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Vile Accusation",
        """
            An enemy hero in range discards a card,
            if able; then, if able, that hero moves the
            number of spaces equal to that card's
            printed movement value in a straight line.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Death Seeker",
        """
            If an enemy hero in radius has a card
            in the discard, **choose one —**
            >>**This turn:** You are immune to attacks.
            >>You may retrieve a discarded card.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 2,
    ),
    Card(
        "Grim Reaper",
        """
            After you perform a basic action,
            you may repeat it once, chosing
            the same, or a different option.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Cause Fear",
        """
            Move up to 3 enemy minions in radius
            up to 1 space in the same direction.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
    ),
    Card(
        "Blood Trail",
        """
            Before the attack: Move up to 1 space for
            every empty minion spawn point in radius
            in the battle zone, up to a maximum of
            2 spaces, then target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 4,
        secondaryDefense = 6,
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
    ),
    Card(
        "Instill Dread",
        """
            Move up to 3 enemy minions in radius
            up to 2 spaces in the same direction;
            they can be moved through obstacles.
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
        item = Item.ATTACK,
    ),
    Card(
        "Crimson Thirst",
        """
            Before the attack: Move up to 1 space for
            every empty minion spawn point in radius
            in the battle zone, up to a maximum of
            2 spaces, then target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
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
        item = Item.INITIATIVE,
    ),
    Card(
        "Lesser Evil",
        """
            An enemy hero in range **chooses one —**
            >>That hero discards a card, if able.
            >>You defeat a minion adjacent to you.
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
        item = Item.DEFENSE,
    ),
    Card(
        "Sense Blood",
        """
            If able, target a hero in range
            with a card in their discard.
            Otherwise, target an adjacent unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "No Escape",
        """
            If an enemy hero in radius has a card
            in the discard, +2 ::movement_green:: Movement.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Strike Terror",
        """
            Move up to 3 enemy minions in radius
            up to 3 spaces in the same direction;
            they can be moved through obstacles.
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
        item = Item.AREA,
    ),
    Card(
        "Sanguine Fury",
        """
            Before the attack: Move up to 2 spaces for
            every empty minion spawn point in radius
            in the battle zone, up to a maximum of
            4 spaces, then target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Creeping Shadow",
        """
            Place yourself into an empty minion spawn
            point in range in the battle zone, or into a
            space in range adjacent to that spawn point.
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
        item = Item.INITIATIVE,
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
        item = Item.RANGE,
    ),
    Card(
        "Blind Frenzy",
        """
            Target a hero in range with a card in the
            discard, or a unit adjacent to you.
            May repeat once on a different hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Dark Stalker",
        """
            If an enemy hero in radius has a card
            in the discard, +3 ::movement_green:: Movement.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
)
