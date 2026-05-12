package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign
import Trait

val takahide = setOf(
    Card(
        "Float like a Butterfly",
        """
            Swap this card with a different
            gold card in your deck.
            ~(This card starts the game in your hand.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 5,
        secondaryDefense = 8,
        traits = emptySet(),
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
        extra = true,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 1,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        extra = true,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 7,
        secondaryDefense = 3,
        secondaryMovement = 3,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = emptySet(),
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
        primaryValueSign = Sign.EXCLAMATION,
        traits = emptySet(),
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
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.DISCARD, Trait.DISCARD_TEAM),
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.MOVING_SELF),
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
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.THIS_TURN, Trait.AFTER_THE_ATTACK, Trait.COUNTS_AS, Trait.ATTACK_UNIT),
    ),
    Card(
        "Hold my Saké",
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Blade Helix",
        """
            Target a unit adjacent to you.
            After the attack: **This turn:** Empty spaces in
            radius count as obstacles for enemy units.
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
        traits = setOf(Trait.THIS_TURN, Trait.AFTER_THE_ATTACK, Trait.COUNTS_AS, Trait.ATTACK_UNIT),
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
        traits = setOf(Trait.DISCARD, Trait.DISCARD_TEAM),
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.MOVING_SELF),
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
        traits = setOf(Trait.DISCARD_TEAM),
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.MOVING_SELF, Trait.IGNORING_OBSTACLES),
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.MOVING_SELF),
    ),
    Card(
        "Pledge of Allegiance",
        """
            A friendly hero in range may discard a card.
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
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.FARMING_FOR_TEAM, Trait.HEALING_SELF, Trait.DISCARD_TEAM),
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
        traits = setOf(Trait.DISCARD_TEAM, Trait.MOVING_SELF, Trait.IGNORING_OBSTACLES),
    ),
    Card(
        "Loyal Retainer",
        """
            A friendly hero in range may discard a card.
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
        traits = setOf(Trait.FARMING_FOR_SELF, Trait.FARMING_FOR_TEAM, Trait.HEALING_SELF, Trait.DISCARD_TEAM),
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
        traits = emptySet(),
    ),
)