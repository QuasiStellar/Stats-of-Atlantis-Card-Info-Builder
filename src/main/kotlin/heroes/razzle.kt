package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

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
        traits = setOf(Trait.REMOVING, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.REMOVING, Trait.AFTER_THE_ATTACK, Trait.ATTACK_HERO),
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
        traits = setOf(Trait.REMOVING, Trait.SCALING, Trait.STAT_CHANGING),
    ),
    Card(
        "Twin Strike",
        """
            After you perform a basic attack action,
            another one of you may repeat it once,
            targeting a different unit.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = emptySet(),
    ),
    Card(
        "Alleyoop",
        """
            Swap with a friendly hero in range.
            Move another one of you up to 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        traits = setOf(Trait.REMOVING, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.MOVING_SELF),
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
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.REMOVING, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "High Wire",
        """
            After you move, move another
            one of you up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
        traits = emptySet(),
    ),
    Card(
        "Magic Trick",
        """
            Push a unit adjacent to you up to 2 spaces;
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
        traits = setOf(Trait.PUSHING_UNITS),
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
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HEALING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Theatrics",
        """
            Swap with a minion in range.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_MINIONS),
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
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_TEAM),
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
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.RANGE,
        traits = setOf(Trait.REMOVING, Trait.AFTER_THE_ATTACK, Trait.RESPAWN, Trait.ATTACK_UNIT),
    ),
    Card(
        "Wire Dancers",
        """
            After you move, move another
            one of you up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
        traits = emptySet(),
    ),
    Card(
        "Aaaand it's gone!",
        """
            Push a unit adjacent to you up to 3 spaces;
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
        traits = setOf(Trait.PUSHING_UNITS),
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
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
        traits = setOf(Trait.HEALING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Spectacle",
        """
            Swap with a minion in range.
            May repeat once by another one of you,
            targeting a different minion.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_MINIONS),
    ),
)