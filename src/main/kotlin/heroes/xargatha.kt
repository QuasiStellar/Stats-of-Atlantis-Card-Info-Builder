package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign
import Trait

val xargatha = setOf(
    Card(
        "Cleave",
        """
            Target a unit adjacent to you.
            After the attack: May repeat once
            on a different enemy hero.
            ~(You may repeat even if the original target was a minion.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Desperate Cleave",
        """
            Target a hero adjacent to you.
            After the attack: May repeat once
            on a different enemy hero.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_HERO),
    ),
    Card(
        "Siren's Call",
        """
            Target an enemy unit not adjacent to you
            and in range; if able, move the target
            up to 3 spaces to a space adjacent to you.
        """.trimIndent(),
        Color.SILVER,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 3,
        traits = setOf(Trait.MOVING_UNITS),
    ),
    Card(
        "Metamorphosis",
        """
            Gain +1 ::movement_silver:: Movement and +1 ::initiative:: Initiative
            for each enemy unit adjacent to you.
            You may move through obstacles.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = setOf(Trait.MOVING_SELF, Trait.IGNORING_OBSTACLES, Trait.STAT_CHANGING),
    ),
    Card(
        "Stone Gaze",
        """
            **Next turn:** Enemy heroes in radius count
            as both heroes and terrain, and cannot
            perform movement actions.
            ~(If you move, the radius "moves" with you.)
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 5,
        traits = setOf(Trait.NEXT_TURN, Trait.TERRAIN, Trait.COUNTS_AS),
    ),
    Card(
        "Threatening Slash",
        """
            Target a unit adjacent to you. +1 ::attack_red:: Attack
            for each other enemy unit adjacent to you.
            ~(Do not count the target when calculating the attack bonus.)
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 6,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Charm",
        """
            Before or after movement, you may
            move an enemy ranged minion
            in radius up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 5,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
        traits = setOf(Trait.MOVING_ENEMY),
    ),
    Card(
        "Petrifying Stare",
        """
            **Next turn:** Enemy heroes in radius count
            as both heroes and terrain, and cannot
            perform movement actions.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.NEXT_TURN, Trait.TERRAIN, Trait.COUNTS_AS),
    ),
    Card(
        "Deadly Swipe",
        """
            Target a unit adjacent to you. +2 ::attack_red:: Attack
            for each other enemy unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Control",
        """
            Before or after movement, you may move
            an enemy ranged or melee minion
            in radius up to 2 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.MOVING_ENEMY),
    ),
    Card(
        "Fresh Converts",
        """
            If you are adjacent to an enemy minion,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.HEALING_SELF),
    ),
    Card(
        "Long Thrust",
        """
            Target a unit in range. +1 ::range_red:: Range
            for each enemy unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Constrict",
        """
            **End of round:** Defeat an enemy
            melee minion adjacent to you.
            ~(Before the end of round minion battle.)
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryDefense = 3,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.DEFEAT, Trait.END_OF_ROUND, Trait.MINION_BATTLE),
    ),
    Card(
        "Turn into Statues",
        """
            **Next turn:** Enemy heroes in radius count
            as both heroes and terrain, and cannot
            perform movement actions.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.NEXT_TURN, Trait.TERRAIN, Trait.COUNTS_AS),
    ),
    Card(
        "Lethal Spin",
        """
            Target a unit adjacent to you. +3 ::attack_red:: Attack 
            for each other enemy unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        primaryValueSign = Sign.PLUS,
        secondaryMovement = 5,
        secondaryDefense = 7,
        item = Item.AREA,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Dominate",
        """
            Before or after movement, you may move
            an enemy minion in radius up to 2 spaces;
            ignore heavy minion immunity.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.MOVING_ENEMY),
    ),
    Card(
        "Devoted Followers",
        """
            If you are adjacent to an enemy unit,
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.RANGE,
        traits = setOf(Trait.HEALING_SELF),
    ),
    Card(
        "Rapid Thrusts",
        """
            Target a unit in range. +1 ::range_red:: Range
            for each enemy unit adjacent to you.
            May repeat once on a different enemy hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.ATTACK_UNIT),
    ),
    Card(
        "Final Embrace",
        """
            **End of round:** Defeat an enemy melee
            or ranged minion adjacent to you.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
        traits = setOf(Trait.DEFEAT, Trait.END_OF_ROUND),
    ),
)
