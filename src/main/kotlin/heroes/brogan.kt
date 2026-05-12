package heroes

import Action
import Card
import Color
import Item
import Modifier
import Trait

val brogan = setOf(
    Card(
        "Onslaught",
        """
            Target a unit adjacent to you. After the attack:
            Move into the space it occupied, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 3,
        traits = setOf(Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Leap Forward",
        """
            Target a hero adjacent to you. After the attack:
            Move into the space it occupied, if able.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 3,
        traits = setOf(Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_HERO),
    ),
    Card(
        "Bulwark",
        """
            You may retrieve a discarded card.
            **This turn:** You and friendly units in radius
            cannot be moved, pushed, swapped
            or placed by enemy heroes.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        traits = setOf(Trait.HEALING_SELF, Trait.PUSHING_HEROES, Trait.IMMUNITY_GAIN, Trait.THIS_TURN),
    ),
    Card(
        "One Man Army",
        """
            During minion battle you count as a heavy
            minion; if you would be removed,
            lose the push instead.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = setOf(Trait.MINION_BATTLE, Trait.COUNTS_AS),
    ),
    Card(
        "Brutal Jab",
        """
            You may move 1 space. Push an enemy unit
            or a token adjacent to you up to 1 space.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 5,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Mad Dash",
        """
            Before the attack: Move 2 spaces
            in a straight line to a space adjacent to
            an enemy unit, then target that unit.
            ~(If you cannot make this move, you cannot attack.)
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
        traits = setOf(Trait.MOVING_SELF, Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Shield",
        """
            **This round:** When any friendly minion in radius
            is defeated you may discard a silver card.
            If you do, the minion is not removed.
            ~(The enemy hero still gains the coins for defeating the minion.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 2,
        secondaryDefense = 4,
        traits = setOf(Trait.THIS_ROUND),
    ),
    Card(
        "Mighty Punch",
        """
            You may move 1 space. Push an enemy unit
            or a token adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Bullrush",
        """
            Before the attack: Move 2 or 3 spaces in
            a straight line to a space adjacent to an
            enemy unit, then target that unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
        traits = setOf(Trait.MOVING_SELF, Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Bolster",
        """
            **This round:** When any friendly minion in radius
            is defeated you may discard a silver card.
            If you do, the minion is not removed.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_ROUND),
    ),
    Card(
        "Shield Bash",
        """
            An enemy hero adjacent to you who
            has played an attack card this turn
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD, Trait.THIS_TURN),
    ),
    Card(
        "Throwing Axe",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>You may discard a card;
            if you do, target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.DEFENSE,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.ATTACK_UNIT),
    ),
    Card(
        "War Drummer",
        """
            A friendly hero in range gains 1 coin;
            if any hero was defeated this round,
            that friendly hero gains 3 coins instead.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.THIS_ROUND),
    ),
    Card(
        "Savage Kick",
        """
            Move up to 2 spaces. Push an enemy unit
            or a token adjacent to you up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.PUSHING_UNITS, Trait.PUSHING_TOKENS, Trait.MOVING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Furious Charge",
        """
            Before the attack: Move 2, 3, or 4 spaces
            in a straight line to a space adjacent to an
            enemy unit, then target that unit.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.MOVEMENT,
        traits = setOf(Trait.BEFORE_THE_ATTACK, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Fortify",
        """
            **This round:** When any friendly minion in radius
            is defeated you may discard a basic card.
            If you do, the minion is not removed.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_ROUND),
    ),
    Card(
        "Counterattack",
        """
            An enemy hero adjacent to you who
            has played an attack card this turn
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.RANGE,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.THIS_TURN),
    ),
    Card(
        "Throwing Spear",
        """
            **Choose one —**
            >>Target a unit adjacent to you.
            >>You may discard a card. If you have a card
            in the discard, target a unit in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.AREA,
        traits = setOf(Trait.MULTIPLE_CHOICE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Master Skald",
        """
            A friendly hero in range gains 2 coins;
            if any hero was defeated this round,
            that friendly hero gains 4 coins instead.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
        traits = setOf(Trait.FARMING_FOR_TEAM, Trait.THIS_ROUND),
    ),
)
