package heroes

import Action
import Card
import Color
import Item
import Modifier

val razzle = setOf(
    Card(
        "Stunt Doubles",
        """
            Target a unit adjacent to you. After the attack:
            Spawn up to 3 more of you in radius; each of
            you is the same hero, except when actions
            are performed. If defeated, remove all of you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Stunted Doubles",
        """
            Target a hero adjacent to you. After the attack:
            Spawn up to 3 more of you in radius; each of
            you is the same hero, except when actions
            are performed. If defeated, remove all of you.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Crowd Control",
        """
            When used as a defense action, +2 ::defense_silver::
            Defense for each other one of you in radius.
            When used as a skill action,
            remove all other you in play.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Card(
        "Phantom Strike",
        """
            Target a unit adjacent to you. After the attack:
            If there is more than one of you in play,
            you may remove one of you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 3,
    ),
    Card(
        "Tightrope",
        """
            After you move, you may move
            another one of you 1 space.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 1,
    ),
    Card(
        "Alleyoop",
        """
            Swap with a friendly hero in range.
            Move another one of you up to 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Hit and Gone",
        """
            Target a unit adjacent to you. After the attack:
            You may remove one or more of you
            in play, except the last one of you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        variant = 1 to 2,
    ),
    Card(
        "Rummage",
        """
            Target a unit adjacent to you.
            After the attack: If there is another one of you
            in radius, you may retrieve a discarded card.
            ~(All of you share cards in hand, deck, and discard.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        variant = 2 to 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "High Wire",
        """
            After you move, move another
            one of you up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 2,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 2,
        variant = 1 to 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Theatrics",
        """
            Swap with a minion in range.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        variant = 2 to 2,
        item = Item.ATTACK,
    ),
    Card(
        "Group Performance",
        """
            Swap with a friendly hero in range.
            Move another one of you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Magic Trick",
        """
            Push an unit adjacent to you up to 2 spaces;
            for every space the target moved, move this
            one of you one space in the opposite direction.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Wire Dancers",
        """
            After you move, move another
            one of you up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 1,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 2,
        variant = 1 to 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Spectacle",
        """
            Swap with a minion in range.
            May repeat once by another one of you,
            targeting a different minion.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        variant = 2 to 2,
        item = Item.ATTACK,
    ),
    Card(
        "Team Spirit",
        """
            Swap with a friendly hero in range.
            Move another one of you up to 3 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.AREA,
    ),
    Card(
        "Aaaand it's gone!",
        """
            Push an unit adjacent to you up to 3 spaces;
            for every space the target moved, move this
            one of you one space in the opposite direction.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Into Thin Air",
        """
            Target a unit adjacent to you. After the attack:
            You may remove one or more of you
            in play, including all of you.
            ~(If all are removed, you are not defeated. Respawn as normal.)
        """.trimIndent(),
        Color.RED,
        level = 3,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.RANGE,
        variant = 1 to 2,
    ),
    Card(
        "Ransack",
        """
            Target a unit adjacent to you.
            After the attack: For each other one of you
            in radius, you may retrieve a discarded card.
        """.trimIndent(),
        Color.RED,
        level = 3,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        variant = 2 to 2,
        item = Item.MOVEMENT,
    ),
    Card(
        "Twin Strike",
        """
            After you perform a basic attack action,
            another one of you may repeat it once,
            targeting a different unit.
        """.trimIndent(),
        Color.PURPLE,
        level = 4 ,
    ),
)