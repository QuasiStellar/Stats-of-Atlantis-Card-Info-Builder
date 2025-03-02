package heroes

import Action
import Card
import Color
import Item
import Modifier

val nebkher = setOf(
    Card(
        "Mind Grip",
        """
            **Choose one —**
            >>Perform an action on the card in the previous
            >turn slot of an enemy hero in range; if you
            >would place any tokens, place ::token_illusion::
            >Illusion tokens instead; skip giving markers.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Mind Probe",
        """
            Perform the action on the card in the previous
            turn slot of an enemy hero in range; if you
            would place any tokens this way, place ::token_illusion::
            Illusion tokens instead; do not use markers.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Diabolical Laughter",
        """
            Laugh diabolically;
            if you do, **choose up to three times —**
            >>Swap with an ::token_illusion:: Illusion token in radius.
            >>Place an Illusion token in an adjacent space.
            >>Swap two resolved cards of an enemy hero
            >in radius, without canceling active effects.
        """.trimIndent(),
        Color.SILVER,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 3,
    ),
    Card(
        "What the Hell Are You?",
        """
            Each time after you laugh diabolically as part
            of performing an action, all enemy heroes
            in radius discard a card, or are defeated.
        """.trimIndent(),
        Color.PURPLE,
        modifier = Modifier.AREA,
        modifierValue = 5,
        level = 4,
    ),
    Card(
        "Imbue Doubt",
        """
            Name a color. **Next turn, after playing cards:**
            An enemy hero in radius discards
            a card of that color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Phantasmal Sentry",
        """
            **Choose one —**
            >>Target a hero in range adjacent
            >to an ::token_illusion:: Illusion token in range.
            >>Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 6,
    ),
    Card(
        "Fleeting Image",
        """
            Place an ::token_illusion:: Illusion token in radius.
            You may swap with an Illusion token in play.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Time to Reconsider",
        """
            Name a color. **Next turn, after playing cards:**
            An enemy hero in radius discards
            a card of that color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Crack in Reality",
        """
            Split the board into two sides with a straight
            line of spaces drawn through your space.
            **This turn:** Units on either side of the line
            cannot interact with objects and spaces on the
            other side of the line, as if they did not exist.
            ~(This includes movement, placement, radius-based effects, etc.)
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Phantasmal Warrior",
        """
            **Choose one —**
            >>Before the attack: Move an ::token_illusion:: Illusion token
            >in range up to 1 space to a space adjacent
            >to an enemy hero in range. Target that hero.
            >>Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Twist Fate",
        """
            Target a unit in range. After the attack:
            You may swap an enemy unit in range
            with an ::token_illusion:: Illusion token adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Multiple Projections",
        """
            Place up to 2 ::token_illusion:: Illusion tokens in radius.
            You may swap with an Illusion token in play.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Illusionary Force",
        """
            Place up to 2 ::token_illusion:: Illusion tokens in radius.
            **This round:** While you are performing
            actions, all Illusion tokens count as both
            tokens and friendly melee minions.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "An Illusion of Choice",
        """
            Name a color. **Next turn, after playing cards:**
            Up to two enemy heroes in radius each
            discard a card of that color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.MOVEMENT,
    ),
    Card(
        "Shift Reality",
        """
            Split the board into two sides with a straight
            line of spaces drawn through your space.
            **This turn:** Units on either side of the line
            cannot interact with you, nor with objects
            and spaces on the other side of the line,
            as if they did not exist.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
    Card(
        "Phantasmal Champion",
        """
            **Choose one —**
            >>Before the attack: Move an ::token_illusion:: Illusion token
            >in range up to 2 spaces to a space adjacent
            >to an enemy hero in range. Target that hero.
            >>Target a unit adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Devious Scheme",
        """
            Target a unit in range. After the attack:
            You may swap an enemy unit in range
            with an ::token_illusion:: Illusion token in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Master of Illusions",
        """
            Place up to 3 ::token_illusion:: Illusion tokens in radius.
            You may swap with an Illusion token in play.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Illusionary Army",
        """
            Place up to 3 ::token_illusion:: Illusion tokens in radius.
            **This round:** While you are performing
            actions, all Illusion tokens count as both
            tokens and friendly melee minions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
)
