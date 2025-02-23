package heroes

import Action
import Card
import Color
import Item
import Modifier

val trinkets = setOf(
    Card(
        "Rapid Deployment",
        """
            **Choose one —**
            >>You may remove the turret. Move up to
            >3 spaces and place the Turret into an
            >adjacent space. It counts as terrain.
            >>An enemy hero in range of both you and
            >the Turret discards a card, if able.
            >>Defeat an enemy minion in range of both
            >you and the Turret.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 1,
    ),
    Card(
        "Ramshackle Turret",
        """
            Move up to 3 spaces and place
            the Turret into a space adjacent to you;
            it counts as an obstacle.
            ~(The Turret is not a token and remains in play between rounds.)
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryMovement = 4,
        secondaryDefense = 1,
    ),
    Card(
        "Salvage Parts",
        """
            **Choose one —**
            >>Place the Turret into an adjacent space.
            >It counts as terrain.
            >>Remove the Turret. If you do, move
            >up to 3 spaces.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
    ),
    Card(
        "Fortified Positions",
        """
            Whenever you perform an action, barrier
            tokens and friendly minions count as a Turret.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Disruptor Jolt",
        """
            **This turn:** Enemy heroes in radius of the
            Turret cannot perform non-basic skills.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
    ),
    Card(
        "Makeshift Minigun",
        """
            Target a unit in range of both you and the
            Turret. After the attack: **Next turn:**
            Gain +1 ::range_red:: Range if you target a hero.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 4,
    ),
    Card(
        "Early Prototype",
        """
            Swap yourself, a friendly unit, or a token,
            in radius of the Turret, with the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 2,
    ),
    Card(
        "Disruptor Pulse",
        """
            Cancel skills with active effects of enemies in
            radius of the Turret. **This turn:** Enemy heroes
            in radius of the Turret cannot perform skills.
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
        "Gatling Gun",
        """
            Target a unit in range of both you and the
            Turret. After the attack: **Next turn:**
            Gain +1 ::range_red:: Range; if you target a hero
            with no cards in their hand with your
            basic skill, defeat that hero, instead.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Teleportation Device",
        """
            Swap yourself, a friendly unit, or a token,
            in radius of the Turret, with the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Deployable Barrier",
        """
            Place up to 2 ::token_barrier:: barrier tokens in radius of
            the Turret and adjacent to another barrier
            token, if able. You and friendly heroes gain
            +1 ::defense_silver:: Defense for each adjacent barrier token.
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
        "Steam Discharge",
        """
            Target a unit in range of both you and the
            Turret. After the attack: One other enemy
            hero in range of you and adjacent to the
            Turret discards a card, if able.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
    ),
    Card(
        "Self-Destruct",
        """
            Enemy heroes in radius of the Turret discard
            a card, if able. Remove the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 4,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.INITIATIVE,
    ),
    Card(
        "Disruptor Grid",
        """
            Cancel skills with active effects of
            enemies in radius of the Turret.
            **This turn and next turn:** Enemies in
            radius of the Turret cannot perform skills.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.DEFENSE,
    ),
    Card(
        "Repeater Cannon",
        """
            Target a unit in range of both you and the
            Turret. After the attack: **Next turn:**
            Gain +2 ::range_red:: Range; if you target a hero
            with no cards in their hand with your
            basic skill, defeat that hero, instead.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Perfected Design",
        """
            Swap yourself, any unit, or a token,
            in radius of the Turret, with the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
    Card(
        "Deployable Bastion",
        """
            Place up to 3 ::token_barrier:: barrier tokens in radius of
            the Turret and adjacent to another barrier
            token, if able. You and friendly heroes gain
            +1 ::defense_silver:: Defense for each adjacent barrier token.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Flame Belcher",
        """
            Target a unit in range of both you and the
            Turret. After the attack: One other enemy
            hero in range of both you and the Turret
            discards a card, if able.
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
        secondaryDefense = 6,
        item = Item.MOVEMENT,
    ),
    Card(
        "Emergency Protocol",
        """
            Enemy heroes in radius of the Turret discard
            a card, or are defeated. Remove the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.RANGE,
    ),
)
