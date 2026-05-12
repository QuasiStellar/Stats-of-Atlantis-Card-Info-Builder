package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign
import Trait

val trinkets = setOf(
    Card(
        "Rapid Redeployment",
        """
            **Choose one —**
            >>Move up to 3 spaces and place the
            >Turret into a space adjacent to you;
            >it counts as an obstacle.
            >>Defeat a minion adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        initiative = 12,
        primaryAction = Action.SKILL,
        secondaryMovement = 4,
        secondaryDefense = 1,
        traits = setOf(Trait.DEFEAT, Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE),
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
        traits = setOf(Trait.MOVING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Salvage Parts",
        """
            **Choose one —**
            >>Place the Turret into a space adjacent
            >to you; it counts as an obstacle.
            >>Remove the Turret; move up to 3 spaces.
            >>Remove the Turret; you may retrieve a
            >discarded card.
        """.trimIndent(),
        Color.SILVER,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryDefense = 2,
        traits = setOf(Trait.MOVING_SELF, Trait.MULTIPLE_CHOICE),
    ),
    Card(
        "Unlimited Firepower",
        """
            Gain +1 ::range_silver:: Range and +1 ::radius_silver:: Radius.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = setOf(Trait.STAT_CHANGING),
    ),
    Card(
        "Disruptor Jolt",
        """
            **This turn:** Before any enemy hero in radius
            of the Turret performs a primary action,
            that hero discards a card, if able;
            if they discard a card, deactivate this effect.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 3,
        traits = setOf(Trait.DISCARD, Trait.THIS_TURN),
    ),
    Card(
        "Makeshift Minigun",
        """
            Target a unit in range of both you and the
            Turret. If the target is in a straight line from
            you, and in a straight line from the Turret,
            gain +2 ::attack_red:: Attack.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 8,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 4,
        secondaryDefense = 5,
        traits = setOf(Trait.SCALING, Trait.STAT_CHANGING, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Early Prototype",
        """
            If you are in radius of the Turret, swap with
            a unit or a token in radius of the Turret,
            then remove the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 2,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_UNITS, Trait.REMOVING, Trait.USING_TOKENS),
    ),
    Card(
        "Disruptor Pulse",
        """
            **This turn:** Before any enemy hero in radius
            of the Turret performs a primary action,
            that hero discards a card, if able;
            if they discard a card, deactivate this effect.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD, Trait.THIS_TURN),
    ),
    Card(
        "Gatling Gun",
        """
            Target a unit in range of both you and the
            Turret. If the target is in a straight line from
            you, and in a straight line from the Turret,
            gain +2 ::attack_red:: Attack.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.SCALING, Trait.STAT_CHANGING, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Updated Design",
        """
            If you are in radius of the Turret, swap with
            a unit or a token in radius of the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.SWAPPING_SELF, Trait.SWAPPING_UNITS, Trait.USING_TOKENS),
    ),
    Card(
        "Deployable Barrier",
        """
            Place up to 2 ::token_barrier:: Barrier tokens in radius, with
            at least one of them adjacent to the Turret;
            you and friendly heroes gain +1 ::defense_silver:: Defense
            for each Barrier token they are adjacent to.
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
        item = Item.INITIATIVE,
        traits = setOf(Trait.USING_TOKENS, Trait.STAT_CHANGING),
    ),
    Card(
        "Steam Discharge",
        """
            Target a unit in range adjacent to the Turret.
            May repeat once on a different enemy unit.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.INITIATIVE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Self-Destruct",
        """
            Up to two enemy heroes in radius of the Turret
            discard a card, if able. Remove the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 3,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.DEFENSE,
        traits = setOf(Trait.REMOVING),
    ),
    Card(
        "Disruptor Grid",
        """
            **This turn:** Before any enemy hero in radius
            of the Turret performs a primary action,
            that hero discards a card, or is defeated;
            if they discard a card, deactivate this effect.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.THIS_TURN),
    ),
    Card(
        "Supercharged Cannon",
        """
            Target a unit in range of both you and the
            Turret. If the target is in a straight line from
            you and in a straight line from the Turret,
            gain +3 ::attack_red:: Attack.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.SCALING, Trait.STAT_CHANGING, Trait.STRAIGHT_LINE, Trait.ATTACK_UNIT),
    ),
    Card(
        "Perfected Design",
        """
            If you are in radius of the Turret,
            **Choose one —**
            >>Swap with a unit or a token in radius
            >of the Turret.
            >>Place yourself into a space in radius
            >of the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
        traits = setOf(Trait.PLACING_SELF, Trait.SWAPPING_SELF, Trait.SWAPPING_UNITS, Trait.MULTIPLE_CHOICE, Trait.USING_TOKENS),
    ),
    Card(
        "Deployable Bastion",
        """
            Place up to 3 ::token_barrier:: Barrier tokens in radius, with
            at least one of them adjacent to the Turret;
            you and friendly heroes gain +1 ::defense_silver:: Defense
            for each Barrier token they are adjacent to.
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
        traits = setOf(Trait.USING_TOKENS, Trait.STAT_CHANGING),
    ),
    Card(
        "Flame Belcher",
        """
            Target a unit in range adjacent to the Turret.
            May repeat up to two times on
            different enemy units.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.AREA,
        traits = setOf(Trait.HIGH_RANGE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Emergency Protocol",
        """
            Up to two enemy heroes in radius of the
            Turret discard a card, or are defeated.
            Remove the Turret.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.RANGE,
        traits = setOf(Trait.REMOVING),
    ),
)
