package heroes

import Action
import Card
import Color
import Item
import Modifier

val emmitt = setOf(
    Card(
        "Reverse Time",
        """
            Target a unit adjacent to you. After the attack:
            **Next turn:** Heroes with lower initiative act
            before heroes with higher initiative;
            this effect ignores immunity.
            ~(Resolve ties as normal.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryDefense = 2,
        secondaryMovement = 1,
    ),
    Card(
        "Tear in Time",
        """
            Target a unit adjacent to you.
            After the attack: **Next turn:** Heroes with
            lower initiative act before heroes with higher
            initiative. This effect ignores immunity.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
    Card(
        "Unstable Timeline",
        """
            Place 2 ::token_glitch:: Glitch tokens in radius, with at
            least two spaces between each token;
            if used as a defense, place 3 tokens instead.
            An enemy hero in play chooses one of the
            Glitch tokens; you swap with that token.
            **End of turn:** Remove all Glitch tokens.
        """.trimIndent(),
        Color.SILVER,
        initiative = 1,
        primaryAction = Action.DEFENSE_SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
    ),
    Card(
        "Alternative Timelines",
        """
            You may play two cards each turn;
            if you do, after the cards are revealed,
            retrieve one of your unresolved cards.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Time Snare",
        """
            An enemy hero in range who has
            already resolved a card this turn
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Temporal Punch",
        """
            Target a unit adjacent to you; when defending,
            the enemy hero must use the ::initiative:: Initiative
            value of their card and items instead of the
            ::defense_silver:: Defense value of their card and items.
            ~(Minion defense modifiers are applied as normal.)
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 9,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Time Walk",
        """
            Move an enemy hero in range, who
            remained in the same space since
            the last turn, 2 spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Time Trap",
        """
            An enemy hero in range who has
            already resolved a card this turn
            discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Time Loop",
        """
            Swap with an enemy hero in range
            who has already resolved a card this turn.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Temporal Slam",
        """
            Target a unit adjacent to you; when defending,
            the enemy hero must use the ::initiative:: Initiative
            value of their card and items instead of the
            ::defense_silver:: Defense value of their card and items.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 11,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Flashback",
        """
            Target a unit adjacent to you. After the attack:
            You may place 3 ::token_glitch:: Glitch tokens in radius,
            with at least two spaces between each token;
            if you do, up to 1 enemy hero in radius
            swaps with a Glitch token of their choice.
            **End of turn:** Remove all Glitch tokens.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Fast Forward",
        """
            Move an enemy hero in range, who
            remained in the same space since
            the last turn, 2 spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Time Capsule",
        """
            You, and friendly heroes in radius, may
            retrieve all cards discarded this turn.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Time Bomb",
        """
            An enemy hero in range who has
            already resolved a card this turn
            discards a card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Time Warp",
        """
            **Choose one —**
            >>Swap with an enemy hero in range who
            >has already resolved a card this turn.
            >>An enemy hero in range swaps their
            >unresolved card with one of their
            >resolved cards of their choice.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
    Card(
        "Temporal Judgement",
        """
            Target a unit adjacent to you; when defending,
            the enemy hero must use the ::initiative:: Initiative
            value of their card and items instead of the
            ::defense_silver:: Defense value of their card and items.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 12,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.RANGE,
    ),
    Card(
        "Deja Vu",
        """
            Target a unit adjacent to you. After the attack:
            You may place 2 ::token_glitch:: Glitch tokens in radius,
            with at least two spaces between each token;
            if you do, up to 1 enemy hero in radius
            swaps with a Glitch token of their choice.
            **End of turn:** Remove all Glitch tokens.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Back to the Future",
        """
            **Choose one —**
            >>Place a unit in range into the space where
            that unit was at the start of this turn.
            >>Move an enemy hero in range, who
            >remained in the same space since
            >the last turn, 2 spaces in a straight line.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Future Proof",
        """
            **Choose one —**
            >>You, and friendly heroes in radius, may
            >retrieve all cards discarded this turn.
            >>**This turn:** Friendly heroes in radius
            are immune to enemy actions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
)