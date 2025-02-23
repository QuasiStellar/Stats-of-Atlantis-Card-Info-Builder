package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

val bain = setOf(
    Card(
        "Dead or Alive",
        """
            Target a unit adjacent to you.
            After the attack: You may give an enemy
            hero in radius the ::marker_bounty:: Bounty marker.
            A hero with the Bounty marker spends
            1 additional ::life_counters:: life counter when defeated.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Side Quest",
        """
            If you are adjacent to an enemy unit,
            give a hero in radius a ::marker_bounty:: Bounty marker.
            A hero with the Bounty marker spends
            1 additional ::life_counters:: life counter when defeated.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Get over here!",
        """
            Target a unit or a token in range and in a
            straight line, with no obstacles between you
            and the target. Move that target towards you
            in a straight line, until you are adjacent.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 2,
    ),
    Card(
        "A Complicated Profession",
        """
            After you give a hero the ::marker_bounty:: Bounty marker,
            that hero discards a card.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "A Game of Chance",
        """
            An enemy hero in radius with two or more
            cards in hand chooses one of those cards.
            Guess that card's color, then reveal it.
            If you guessed correctly, discard that card;
            otherwise you gain 1 coin.
            ~(You can only guess colors that could be in that player's hand.)
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Light Crossbow",
        """
            Target a unit in range and in a straight line
            with no other units or terrain between you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Close Call",
        """
            If the hero in play has a ::marker_bounty:: Bounty marker,
            block the attack and that hero
            gives the marker to you.
            ~(The marker's effect is applied to you.)
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
    ),
    Card(
        "Dead Man's Hand",
        """
            An enemy hero in radius with two or more
            cards in hand chooses one of those cards.
            Guess that card's color, then reveal it.
            If you guessed correctly, discard that card;
            otherwise you gain 2 coins.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Heavy Crossbow",
        """
            Target a unit in range and in a straight line
            with no units or terrain between you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Narrow Escape",
        """
            If the hero in play has a ::marker_bounty:: Bounty marker,
            block the attack and retrieve the marker.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Drinking Buddies",
        """
            You may have a hero in radius retrieve a
            discarded card. If they do, you may
            also retrieve a discarded card.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Hand Crossbow",
        """
            **Choose one —**
            >>Target a hero in range with
            >a ::marker_bounty:: Bounty marker.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Vantage Point",
        """
            Ignore obstacles. If a hero in play has
            a ::marker_bounty:: Bounty marker, +1 ::movement_green:: movement.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "We're Not Done Yet!",
        """
            An enemy hero in radius with two or more
            cards in hand chooses one of those cards.
            Guess that card's color, then reveal it.
            If you guessed correctly, discard that card;
            otherwise may repeat once or gain 2 coins.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
    Card(
        "Arbalest",
        """
            Target a unit in range and in a straight line
            with no units or terrain between you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Perfect Getaway",
        """
            If the hero in play has a ::marker_bounty:: Bounty marker,
            block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Another One!",
        """
            You may have a hero in radius retrieve a
            discarded card. If they do, you may
            also retrieve a discarded card.
            **End of turn:** May repeat once.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.ATTACK,
    ),
    Card(
        "Hunter-Seeker",
        """
            **Choose one, or both,** on different targets —
            >>Target a hero in range with
            >a ::marker_bounty:: Bounty marker.
            >>Target a hero adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "High Ground",
        """
            Ignore obstacles. If a hero in play has
            a ::marker_bounty:: Bounty marker, +2 ::movement_green:: movement.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        primaryValueSign = Sign.PLUS,
        secondaryDefense = 4,
        item = Item.AREA,
    ),
)
