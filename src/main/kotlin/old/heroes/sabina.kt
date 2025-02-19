package old.heroes

import old.Action
import old.Card
import old.Color
import old.Item
import old.Modifier
import old.Sign

val sabina = setOf(
    Card(
        "Point Blank Shot",
        """
            After the attack: If the target
            is adjacent, push the target 1 space.
            ~(A unit pushed into an obstacle will stop. This is a valid push) 
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Bang",
        """
            Cannot target minions. After the attack: If the
            target is adjacent, push it 1 space, if able. 
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
    Card(
        "Back to Back",
        """
            You may swap with a friendly minion
            adjacent to you. **This turn:** You and friendly
            heroes in radius gain +1 ::defense_silver:: Defense
            if adjacent to one or more friendly minions.
        """.trimIndent(),
        Color.SILVER,
        initiative = 13,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 2,
    ),
    Card(
        "Big Sodding Gun",
        """
            Your basic attack has +2 ::range_gold:: Range and
            +2 ::attack_gold:: Attack. If you push an enemy hero,
            that hero discards a card, or is defeated.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Basic Drill",
        """
            **This round:** When you, or a friendly hero
            performs a basic attack, friendly minions in
            radius, including the immune ones, reduce the
            defense total as if they were ranged minions.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 9,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 3,
    ),
    Card(
        "Quickdraw",
        """
            Target a non-adjacent unit.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Command",
        """
            Move any 1 friendly minion in radius up to
            2 spaces; ignore heavy minion immunity.
            ~(You may move a heavy minion with this skill).
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 2,
    ),
    Card(
        "Battle Drill",
        """
            **This round:** Friendly minions in radius,
            including the immune ones, reduce the
            defense total as if they were ranged minions.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Gunslinger",
        """
            Target a non-adjacent unit.
            +2 ::attack_red:: Attack if the target hero
            played an attack card this turn.
            ~(A revealed card is "played" even if it's not resolved yet).
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Control",
        """
            Move any 1 friendly minion in radius up to
            3 spaces; ignore heavy minion immunity.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Close Support",
        """
            If you are adjacent to a friendly minion, an
            enemy hero in radius discards a card, if able.
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
        item = Item.DEFENSE,
    ),
    Card(
        "Shootout",
        """
            Target a unit in range. After the attack: If you
            defeated a minion with this attack, and there
            is no enemy hero in range, you may remove
            a non-heavy enemy minion adjacent to you.
            ~(You gain no coins for removing a minion.)
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Lead the Charge",
        """
            If you are adjacent to a friendly minion,
            block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Field Promotion",
        """
            **This round:** Friendly minions in radius,
            including the immune ones, reduce the
            defense total as if they each were both
            a ranged minion and a melee minion.
            ~(This can reduce the defense total by up to 2 per minion.)
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.MOVEMENT,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Dead Shot",
        """
            +2 ::attack_red:: Attack if the target hero
            played an attack card this turn.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.AREA,
    ),
    Card(
        "Tactical Advantage",
        """
            Move any 1 friendly minion in radius up to
            3 spaces; ignore heavy minion immunity.
            May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.DEFENSE,
    ),
    Card(
        "Covering Fire",
        """
            If you are adjacent to a friendly minion,
            an enemy hero in radius discards a
            card, or is defeated.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.RANGE,
    ),
    Card(
        "Bullet Hell",
        """
            Target a unit in range. After the attack:
            If you defeated a minion with this attack, and
            there is no enemy hero in range, you may
            remove a non-heavy enemy minion in range.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.MOVEMENT,
    ),
    Card(
        "Plot Armor",
        """
            If you are adjacent to a friendly minion,
            block the attack and **This turn:** You are
            immune to all other enemy action.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        secondaryMovement = 2,
        item = Item.INITIATIVE,
    ),
)
