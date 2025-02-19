package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier

val nebkher = setOf(
    Card(
        "Mind Grip",
        """
            **Choose one —**
            >>Perform the primary action of the card in
            >the previous turn slot of an enemy hero in
            >range; apply no item bonuses. If you would
            >place a token, place an illusion token
            >instead. Ignore effects that give markers.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Mind Probe",
        """
            Perform the primary action of a non-attack
            card in the previous turn slot of an enemy
            hero in range; apply no item bonuses. If you
            would place a token, place an illusion token
            instead. Ignore effects that give markers.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Diabolical Laughter",
        """
            Laugh diabolically. If you do, **choose one —**
            >>You swap with an illusion token in radius.
            >>You swap with a friendly minion in radius.
            >>You are defeated. Enemies gain no coins.
            >>**Next turn:** Gain +2 ::initiative:: Initiative.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 4,
    ),
    Card(
        "What the Hell Are You?",
        """
            If you would be defeated as part of your own
            action, first defeat all enemy minions in radius
            and enemy heroes in radius discard a card, or
            are defeated. Spend no life counters.
        """.trimIndent(),
        Color.PURPLE,
        modifier = Modifier.AREA,
        modifierValue = 2,
        level = 4,
    ),
    Card(
        "Imbue Doubt",
        """
            A hero in radius must swap their unresolved
            card with another card in their hand, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
    ),
    Card(
        "Assume Control",
        """
            **Choose one —**
            >>Before the attack: Move a friendly minion in
            >range up to 3 spaces to a space adjacent to
            >an enemy hero in range. Target that hero.
            >>Target a minion adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Fleeting Image",
        """
            Place an ::token_illusion:: illusion token in radius.
            **This round:** After an action makes you
            discard a card, swap with an illusion token,
            regardless of radius, then remove that token.
            ~(Complete the action causing the discard before the swap).
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Time to Reconsider",
        """
            A hero in radius must swap their unresolved
            card with another card in their hand, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Direct Control",
        """
            **Choose one —**
            >>Before the attack: Move a friendly minion in
            >range up to 4 spaces to a space adjacent to
            >an enemy hero in range. Target that hero.
            >>Target a minion adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.INITIATIVE,
    ),
    Card(
        "Multiple Projections",
        """
            Place up to 2 ::token_illusion:: illusion tokens in radius.
            **This round:** After an action makes you
            discard a card, swap with an illusion token,
            regardless of radius, then remove that token.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
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
        "Crack in Reality",
        """
            Split the board with a straight line of spaces
            drawn through your space: **This turn:**
            Units on either side of the line are immune to
            actions of units on the opposite side of the line.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Twist Fate",
        """
            Target a unit in range. After the attack:
            If you target a hero, you may swap any
            two of their resolved cards.
            ~(Any active effects on the swapped cards are canceled).
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
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Phantasmal Warrior",
        """
            Place an ::token_illusion:: illusion token in radius. **This**
            **round:** While you are performing actions, the
            illusion tokens count as friendly melee minions.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "An Illusion of Choice",
        """
            A hero in radius must swap their unresolved
            card with another card in their hand, if able.
            May repeat once on the same Hero.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Master of Puppets",
        """
            **Choose one, or both**, in any order **—**
            >>Before the attack: Move a friendly minion in
            >range up to 4 spaces to a space adjacent to
            >an enemy hero in range. Target that hero.
            >>Target a minion adjacent to you.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.MOVEMENT,
    ),
    Card(
        "Master Of Illusions",
        """
            Place up to 3 ::token_illusion:: illusion tokens in radius.
            **This round:** After an action makes you
            discard a card, swap with an illusion token,
            regardless of radius, then remove that token.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Shift Reality",
        """
            Split the board with a straight line of spaces
            drawn through your space: **This turn:** You are
            immune to actions of units on either side of
            the line. All other units are immune to actions
            of units on the opposite side of the line.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
        item = Item.ATTACK,
    ),
    Card(
        "Devious Scheme",
        """
            Target a unit in range. After the attack:
            If you target a hero, you may swap
            any two of their resolved, unresolved,
            or discarded cards.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Phantasmal Colossus",
        """
            Place an ::token_illusion:: illusion token in radius. **This**
            **round:** Illusion tokens are immune to enemy
            actions. While you are performing actions, the
            illusion tokens count as friendly melee minions.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
)
