package heroes

import Action
import Card
import Color
import Item
import Modifier

val takahide = setOf(
    Card(
        "Float like a Butterfly",
        """
            Swap this card with a different
            gold card in your deck.
            ~(This card starts the game in your hand.)
        """.trimIndent(),
        Color.GOLD,
        variant = 1 to 3,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 5,
        secondaryDefense = 8,
    ),
    Card(
        "Sting like a Bee",
        """
            Target a unit at maximum range.
            After the attack: Swap this card with
            a different gold card in your deck.
            ~(This card starts the game in your deck.)
        """.trimIndent(),
        Color.GOLD,
        variant = 2 to 3,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
    Card(
        "Strike like a Tiger",
        """
            Target a unit adjacent to you.
            After the attack: Swap this card with
            a different gold card in your deck.
            ~(This card starts the game in your deck.)
        """.trimIndent(),
        Color.GOLD,
        variant = 3 to 3,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryDefense = 3,
        secondaryMovement = 3,
    ),
    Card(
        "Shameful Display",
        """
            ~(You are defeated.)
        """.trimIndent(),
        Color.SILVER,
        handicapped = true,
        initiative = 5,
        primaryAction = Action.DEFENSE,
    ),
    Card(
        "Bushido",
        """
            Swap your gold card with a different
            gold card in your deck; if you swap a
            resolved or discarded card this way,
            place the new card facedown.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryDefense = 6,
    ),
    Card(
        "Set an Example",
        """
            Target a unit adjacent to you. After the attack:
            A friendly hero in radius may swap their
            unresolved card with a card in their hand.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
    Card(
        "Proven Warrior",
        """
            Choose a card in the discard of a friendly
            hero in radius. An enemy hero in radius
            discards a card of the same color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 4,
        secondaryMovement = 2,
    ),
    Card(
        "Come to Aid",
        """
            A friendly hero in range may discard a card.
            If that hero has a card in the discard,
            you may move up to 3 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 3,
        secondaryMovement = 2,
    ),
    Card(
        "Lead from the Front",
        """
            Target a unit adjacent to you. After the attack:
            A friendly hero in radius may swap their
            unresolved card with a card in their hand.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 2,
        secondaryMovement = 1,
        item = Item.INITIATIVE,
    ),
    Card(
        "Spinning Blade",
        """
            Target a unit adjacent to you. After the attack:
            **This turn:** Empty spaces adjacent to you
            count as obstacles for enemy units.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryDefense = 2,
        secondaryMovement = 1,
        item = Item.DEFENSE,
    ),
    Card(
        "Hold my Sake",
        """
            Target a unit adjacent to you.
            After the attack: A friendly hero in radius
            may swap their unresolved card with
            a card in their hand, or in their discard.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 2,
        secondaryMovement = 1,
        item = Item.MOVEMENT,
    ),
    Card(
        "Blade Helix",
        """
            Target a unit adjacent to you.
            After the attack: **This turn:** Empty spaces in
            radius to you count as obstacles for enemy units.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryDefense = 2,
        secondaryMovement = 1,
        item = Item.RANGE,
    ),
    Card(
        "Chosen Champion",
        """
            Choose a card in the discard of a friendly
            hero in radius. An enemy hero in radius
            discards a card of the same color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Calculated Risk",
        """
            A friendly hero in radius may discard an
            attack card. If that hero has a card in the
            discard, that hero may move up to 2 spaces.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "The Right Hand",
        """
            Choose a card in the discard of a friendly
            hero in radius. Up to two enemy heroes in
            radius discard a card of the same color, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 5,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Tactical Gambit",
        """
            A friendly hero in radius may discard
            an attack card. If that hero has a card
            in the discard, that hero may move
            up to 2 spaces, ignoring obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 5,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Bring the Relief",
        """
            A friendly hero in range may discard a card.
            If that hero has a card in the discard,
            you may move up to 4 spaces.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Pledge of Allegiance",
        """
            A friendly hero in radius may discard a card.
            If that hero has a card in the discard,
            both you and that hero gain 1 coin and
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "Commit Reserves",
        """
            A friendly hero in range may discard a card.
            If that hero has a card in the discard, you may
            move up to 4 spaces, ignoring obstacles.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.AREA,
    ),
    Card(
        "Loyal Retainer",
        """
            A friendly hero in radius may discard a card.
            If that hero has a card in the discard,
            both you and that hero gain 2 coins and
            you may retrieve a discarded card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 4,
        secondaryMovement = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "Ready for War",
        """
            Return your silver card to your deck and take
            two gold cards from your deck into your hand.
            ~(You now have a total hand size of 6 cards.)
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
)