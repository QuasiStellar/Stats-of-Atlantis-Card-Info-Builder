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
            After the attack: You may swap this card
            with a resolved or discarded attack card
            and apply that card's text.
        """.trimIndent(),
        Color.GOLD,
        initiative = 13,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 2,
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
            Place a ::token_smoke_bomb:: smoke bomb token in radius.
            Units can move through the smoke bomb.
            Enemy heroes cannot target another unit
            if there is a smoke bomb on a straight line
            between them and the target.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValue = 2,
        modifier = Modifier.AREA,
        modifierValue = 3,
    ),
    Card(
        "Flurry of blows",
        """
            After you perform a movement action,
            all adjacent enemy heroes discard
            a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
    Card(
        "Trip Mine",
        """
            Place 2 mine tokens, 1 ::token_blast:: blast and 1 ::token_dud::
            dud, facedown in radius. Units may move
            through them. After an enemy hero moves
            through a mine, remove it. For every blast
            removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 10,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Crane Stance",
        """
            After the attack: Push an adjacent
            enemy hero up to 1 space.
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
    ),
    Card(
        "Poof!",
        """
            Swap with a mine, a grenade,
            or a smoke bomb in radius.
            If you do, block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 2,
        primaryAction = Action.DEFENSE,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
    ),
    Card(
        "Cluster Mine",
        """
            Place 3 mine tokens, 1 ::token_blast:: blast and 2 ::token_dud::
            duds, facedown in radius. Units may move
            through them. After an enemy hero moves
            through a mine, remove it. For every blast
            removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.DEFENSE,
    ),
    Card(
        "Tiger Stance",
        """
            After the attack: Push an adjacent
            enemy hero up to 2 spaces.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 4,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Vanish",
        """
            Swap with a mine, a grenade, or a
            smoke bomb in radius. If you do, when
            used as a defense, block the attack.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 2,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        item = Item.ATTACK,
    ),
    Card(
        "Death Grenade",
        """
            Place a ::token_grenade:: grenade token into a space in
            range, not adjacent to you. **End of turn:**
            An enemy hero adjacent to the grenade
            discards a card, if able, remove the grenade.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Viper Stance",
        """
            After the attack: You may swap with a
            smoke bomb or a mine in radius.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Inner Strength",
        """
            If your discard is empty, **This round:** Double
            your item bonuses. If you discard a card,
            cancel this effect after the action is resolved.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 2,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.INITIATIVE,
    ),
    Card(
        "Mine Field",
        """
            Place 3 mine tokens, 2 ::token_blast:: blasts and 1 ::token_dud::
            dud, facedown in radius. Units may move
            through them. After an enemy hero moves
            through a mine, remove it. For every blast
            removed, that hero discards a card, if able.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 3,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Dragon Stance",
        """
            After the attack: Move up to 1 space to a
            space adjacent to the target, if able. Push
            an adjacent enemy hero up to 3 spaces.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 5,
        secondaryMovement = 4,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Ruse",
        """
            Swap with a mine, a grenade, or a smoke
            bomb in radius. If you do, when used as
            a defense, block the attack and you may
            retrieve a resolved or discarded silver card.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 1,
        primaryAction = Action.DEFENSE_SKILL,
        primaryValueSign = Sign.EXCLAMATION,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 2,
        item = Item.DEFENSE,
    ),
    Card(
        "Holy Death Grenade",
        """
            Place a ::token_grenade:: grenade token into a space in
            range, not adjacent to you. **End of turn:** An
            enemy hero adjacent to the grenade discards
            a card, or is defeated, remove the grenade.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 11,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 3,
        secondaryDefense = 4,
        item = Item.MOVEMENT,
    ),
    Card(
        "Cobra Stance",
        """
            After the attack: You may swap with
            a smoke bomb or a mine in radius.
            If you do, repeat once on a different hero.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryMovement = 4,
        secondaryDefense = 5,
        item = Item.RANGE,
    ),
    Card(
        "Perfect Self",
        """
            You may retrieve a discarded card. If your
            discard is empty, **This round:** Double your
            item bonuses. If you discard a card, cancel
            this effect after the action is resolved.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 1,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 3,
        item = Item.ATTACK,
    ),
)
