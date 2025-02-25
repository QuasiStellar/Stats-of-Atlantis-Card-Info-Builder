package heroes

import Action
import Card
import Color
import Item
import Modifier
import Sign

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
    ),
    Card(
        "Smoke Bomb",
        """
            Place a ::token_smoke_bomb:: smoke bomb token in radius;
            enemy heroes cannot target another you or another
            unit if there is the Smoke Bomb on a straight
            line between that enemy hero and their target.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 1,
    ),
    Card(
        "Flurry of blows",
        """
            Each time after you perform an attack action,
            you may repeat it once on a different target.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Trip Mine",
        """
            Place 2 mine tokens, 1 ::token_blast:: blast and 1 ::token_dud:: dud,
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
    ),
    Card(
        "Poof!",
        """
            Swap with a ::token_smoke_bomb:: Smoke bomb in range;
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
    ),
    Card(
        "Cluster Mine",
        """
            Place 3 mine tokens, 1 ::token_blast:: blast and 2 ::token_dud::
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
    ),
    Card(
        "Vanish",
        """
            Swap with a ::token_smoke_bomb:: Smoke bomb in range;
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
    ),
    Card(
        "Minefield",
        """
            Place 3 mine tokens, 2 ::token_blast:: blasts and 1 ::token_dud::
            dud, facedown in radius; units may move
            through them; remove mien tokens after an
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
    ),
    Card(
        "Holy Death Grenade",
        """
            Place a ::token_grenade:: grenade token into a space in
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
    ),
    Card(
        "Cobra Stance",
        """
            Target a unit adjacent to you.
            After the attack: You may swap with
            a ::token_smoke_bomb:: Smoke bomb radius; if you do, you may
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
    ),
    Card(
        "Perfect Self",
        """
            **Choose one, or both —**
            >> **This round:** Double your item bonuses.
            >> Take a Tier II card from your deck and add
            it to your dashboard as a permanent item.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.RANGE,
    ),
)
