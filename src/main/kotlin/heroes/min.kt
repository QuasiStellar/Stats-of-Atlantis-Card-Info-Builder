package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign
import Trait

val min = setOf(
    Card(
        "Fast as Lightning",
        """
            Target a unit in range. After the attack:
            Apply the "After the attack" text of your
            resolved or discarded red card.
            ~(If it has radius, use that card's value.)
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Chop Down",
        """
            Target a hero adjacent to you.
            After the attack: Apply the "After the attack"
            text of your resolved or discarded red card.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
        traits = setOf(Trait.AFTER_THE_ATTACK, Trait.ATTACK_HERO),
    ),
    Card(
        "Smoke Bomb",
        """
            Place the ::token_smoke_bomb:: Smoke bomb token in radius;
            enemy heroes cannot target you or another
            unit if the Smoke bomb token is on a straight
            line between that enemy hero and their target.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryDefense = 1,
        traits = setOf(Trait.USING_TOKENS, Trait.STRAIGHT_LINE),
    ),
    Card(
        "Flurry of blows",
        """
            Each time after you perform an attack action,
            you may repeat it once on a different target.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
        traits = emptySet(),
    ),
    Card(
        "Trip Mine",
        """
            Place 2 Mine tokens, 1 ::token_blast:: blast and 1 ::token_dud:: dud,
            facedown in radius; units may move through
            them; remove mine tokens after an enemy
            hero moves through them; for every blast
            removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        traits = setOf(Trait.DISCARD, Trait.REMOVING, Trait.IGNORING_OBSTACLES, Trait.USING_TOKENS),
    ),
    Card(
        "Crane Stance",
        """
            Target a unit adjacent to you.
            After the attack: Push an enemy unit
            adjacent to you up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 5,
        secondaryDefense = 5,
        traits = setOf(Trait.PUSHING_UNITS, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Poof!",
        """
            Swap with a ::token_smoke_bomb:: Smoke bomb token in range;
            if you do, block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 3,
        traits = setOf(Trait.SWAPPING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Cluster Mine",
        """
            Place 3 Mine tokens, 1 ::token_blast:: blast and 2 ::token_dud::
            duds, facedown in radius; units may move
            through them; remove mine tokens after an
            enemy hero moves through them; for every
            blast removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD, Trait.REMOVING, Trait.IGNORING_OBSTACLES, Trait.USING_TOKENS),
    ),
    Card(
        "Tiger Stance",
        """
            Target a unit adjacent to you.
            After the attack: You may move 1 space to a
            space adjacent to the target. Push an enemy
            unit adjacent to you up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
        traits = setOf(Trait.PUSHING_UNITS, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Vanish",
        """
            Swap with a ::token_smoke_bomb:: Smoke bomb token in range;
            if you do, block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 3,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.USING_TOKENS),
    ),
    Card(
        "Death Grenade",
        """
            Place a ::token_grenade:: Grenade token into a space in
            radius. **End of turn:** Up to 1 enemy hero
            adjacent to that token discards a card, or is
            defeated. Remove the Grenade token.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
        traits = setOf(Trait.DISCARD_OR_KILL, Trait.REMOVING, Trait.END_OF_TURN, Trait.USING_TOKENS),
    ),
    Card(
        "Viper Stance",
        """
            Target a unit adjacent to you.
            After the attack: You may swap
            with a ::token_smoke_bomb:: Smoke bomb in radius.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 5,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Inner Strength",
        """
            **This round:** Double your item bonuses.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 2,
        item = Item.ATTACK,
        traits = setOf(Trait.THIS_ROUND),
    ),
    Card(
        "Minefield",
        """
            Place 3 Mine tokens, 2 ::token_blast:: blasts and 1 ::token_dud::
            dud, facedown in radius; units may move
            through them; remove mine tokens after an
            enemy hero moves through them; for every
            blast removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.ATTACK,
        traits = setOf(Trait.DISCARD, Trait.REMOVING, Trait.IGNORING_OBSTACLES, Trait.USING_TOKENS),
    ),
    Card(
        "Dragon Stance",
        """
            Target a unit adjacent to you.
            After the attack: You may move 1 or 2 spaces
            to a space adjacent to the target. Push an
            enemy unit adjacent to you up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.MOVEMENT,
        traits = setOf(Trait.PUSHING_UNITS, Trait.MOVING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Ruse",
        """
            Swap with a ::token_smoke_bomb:: Smoke bomb in range;
            if you do, block the attack. You may place
            the Smoke bomb into a space in range.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 3,
        item = Item.AREA,
        traits = setOf(Trait.SWAPPING_SELF),
    ),
    Card(
        "Holy Death Grenade",
        """
            Place a ::token_grenade:: Grenade token into a space in
            radius. **End of turn:** Up to 2 enemy heroes
            adjacent to that token discard a card, or are
            defeated. Remove the Grenade token.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
        traits = setOf(Trait.REMOVING, Trait.END_OF_TURN, Trait.USING_TOKENS),
    ),
    Card(
        "Cobra Stance",
        """
            Target a unit adjacent to you.
            After the attack: You may swap with
            a ::token_smoke_bomb:: Smoke bomb in radius; if you do, you may
            place the Smoke bomb into a space in radius.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 5,
        secondaryDefense = 6,
        item = Item.DEFENSE,
        traits = setOf(Trait.SWAPPING_SELF, Trait.AFTER_THE_ATTACK, Trait.ATTACK_UNIT),
    ),
    Card(
        "Perfect Self",
        """
            **Choose one, or both —**
            >>**This round:** Double your item bonuses.
            >>Take a Tier II card from your deck and add
            >it to your dashboard as a permanent item.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 3,
        secondaryDefense = 3,
        item = Item.RANGE,
        traits = setOf(Trait.THIS_ROUND, Trait.MULTIPLE_CHOICE),
    ),
)
