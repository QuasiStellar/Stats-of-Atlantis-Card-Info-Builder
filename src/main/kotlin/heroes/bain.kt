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
            You may give a hero in radius a ::marker_bounty:: bounty
            marker. The hero with a bounty marker
            spends 1 additional ::life_counters:: life counter when
            defeated. You may then **choose one —**
            >>Defeat an adjacent enemy minion.
            >>Adjacent enemy hero discards a card, if able.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Side Quest",
        """
            If you are adjacent to an enemy unit,
            give a hero in radius a ::marker_bounty:: Bounty marker.
            A hero with the bounty marker spends
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
            Target a unit in a straight line, with no
            obstacles between you. Then, if able,
            move that unit towards you by the
            shortest valid path, until it is adjacent.
            **This turn:** If it's an enemy unit, it can't move.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryDefense = 2,
    ),
    Card(
        "A Complicated Profession",
        """
            After you perform a basic skill, an adjacent
            enemy hero discards a card, or is defeated.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "A Game of Chance",
        """
            An enemy hero in radius with 2 or more
            cards in hand discards a card facedown.
            Name a color and reveal that card.
            If it's not the color you named, gain 1 coin
            and the enemy hero may retrieve their card.
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
            Target a minion adjacent to you, or a
            hero in a straight line, with no other
            units, or terrain, between you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
    ),
    Card(
        "Close Call",
        """
            Block the attack. The attacker may swap
            their attack card with a card in their hand.
            ~(The card is swapped after the attack card is resolved).
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
            An enemy hero in radius with 2 or more
            cards in hand discards a card facedown.
            Name a color and reveal that card. If it's
            not the color you named, gain 2 coins and
            the enemy hero may retrieve their card.
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
            Target a unit in range, and in a straight line,
            with no other units, or terrain, between you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Narrow Escape",
        """
            Block the attack and move up to 1 space.
            The attacker may swap their attack
            card with a card in their hand.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 4,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Drinking Buddies",
        """
            A hero in radius may retrieve a discarded
            card. **This turn:** Enemy heroes in radius may
            not move to a space in a straight line from
            them with a movement action.
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
            +2 ::range_red:: Range if you target a
            hero with a ::marker_bounty:: bounty marker.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Vantage Point",
        """
            **Next turn:** You may ignore obstacles when
            choosing targets of attacks and skills.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "We're Not Done Yet!",
        """
            An enemy hero in radius with 2 or more cards
            in hand discards a card facedown. Name a
            color and reveal that card. If it's not the color
            you named, gain 1 coin and the enemy hero
            may retrieve their card. If they do, repeat once.
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
        "Impaler",
        """
            Target a unit in a straight line, with no friendly
            units, or terrain between you. Before the
            attack: Up to one enemy hero between you
            and the target discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 6,
        modifier = Modifier.RANGE,
        modifierValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Perfect Getaway",
        """
            Block the attack and move up to 3 spaces
            in a straight line. The attacker may swap
            their attack card with a card in their hand.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.AREA,
    ),
    Card(
        "Another One!",
        """
            A hero in radius may retrieve a discarded card.
            **This turn and next turn:** Enemy heroes in
            radius may not move to a space in a straight
            line from them with a movement action.
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
            +2 ::range_red:: Range if you target a hero with
            a ::marker_bounty:: bounty marker. If you do, may
            repeat once on a different adjacent unit.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        modifierValueSign = Sign.PLUS,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "High Ground",
        """
            You may ignore obstacles. **Next turn:**
            You may ignore obstacles for movement and
            when choosing targets of attacks and skills.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.MOVEMENT,
        primaryValue = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
)
