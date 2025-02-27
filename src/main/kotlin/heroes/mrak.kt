package heroes

import Action
import Card
import Color
import Item
import Modifier

val mrak = setOf(
    Card(
        "Fissure",
        """
            Target a unit adjacent to you. After the attack:
            Place a ::token_rock:: Rock token in each of the first
            three empty spaces in the straight line
            from you in the direction of the attack.
        """.trimIndent(),
        Color.GOLD,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 3,
    ),
    Card(
        "Lesser Fissure",
        """
            Target a hero adjacent to you. After the attack:
            Place a ::token_rock:: Rock token in each of the first
            three empty spaces in the straight line
            from you in the direction of the attack.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryMovement = 1,
        secondaryDefense = 2,
    ),
    Card(
        "Stone Grip",
        """
            Place exactly 3 ::token_rock:: Rock tokens into empty
            spaces adjacent to an enemy hero in range,
            and as far away from you as possible.
        """.trimIndent(),
        Color.SILVER,
        initiative = 12,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryDefense = 4,
    ),
    Card(
        "Seismic Slam",
        """
            An enemy hero in radius adjacent
            to terrain, or to a ::token_rock:: Rock token,
            discards a card, or is defeated.
            ~(The ::attack_silver:: secondary Attack action is non-ranged.)
        """.trimIndent(),
        Color.RED,
        level = 1,
        initiative = 7,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 3,
        secondaryAttack = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
    ),
    Card(
        "Boulder Rush",
        """
            Push a token, or an enemy unit, adjacent to
            you 1 or 2 spaces, ignoring obstacles;
            you may move up to 2 spaces in the
            direction of the push, ignoring obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 1,
        initiative = 8,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 6,
    ),
    Card(
        "Treacherous Ground",
        """
            You may move a unit in range 1 space to a
            space adjacent to terrain, or a ::token_rock:: Rock token.
        """.trimIndent(),
        Color.GREEN,
        level = 1,
        initiative = 6,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 3,
        secondaryMovement = 2,
        secondaryDefense = 4,
    ),
    Card(
        "Seismic Assault",
        """
            An enemy hero in radius adjacent
            to terrain, or to a ::token_rock:: Rock token,
            discards a card, or is defeated.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 1 to 2,
        initiative = 7,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryAttack = 6,
        secondaryMovement = 3,
        secondaryDefense = 7,
        item = Item.INITIATIVE,
    ),
    Card(
        "Stone Carapace",
        """
            **This round:** if you would discard a card from
            your hand, you may discard this card instead;
            you may discard this card to perform its
            defense action, as if it was in your hand.
        """.trimIndent(),
        Color.RED,
        level = 2,
        variant = 2 to 2,
        initiative = 7,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryAttack = 7,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Rockslide",
        """
            You may move a unit in range 1 space to a
            space adjacent to terrain, or a ::token_rock:: Rock token.
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.ATTACK,
    ),
    Card(
        "Rolling Stone",
        """
            Move any number of spaces in a straight
            line, ignoring obstacles, without moving
            through more than one empty space.
            ~(The starting space and the destination space do not count.)
        """.trimIndent(),
        Color.GREEN,
        level = 2,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 4,
        item = Item.INITIATIVE,
    ),
    Card(
        "Boulder Blitz",
        """
            Push a token, or an enemy unit, adjacent to
            you 1, 2 or 3 spaces, ignoring obstacles;
            you may move up to 3 spaces in the
            direction of the push, ignoring obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.DEFENSE,
    ),
    Card(
        "Stomping Step",
        """
            Move a unit in radius which is adjacent
            to terrain, or to a ::token_rock:: Rock token, 1 space.
            Place a Rock token in the space it occupied.
        """.trimIndent(),
        Color.BLUE,
        level = 2,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Avalanche",
        """
            You may move a unit in range 1 space to a
            space adjacent to terrain, or a ::token_rock:: Rock token.
            May repeat once.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 1 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        modifier = Modifier.RANGE,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.AREA,
    ),
    Card(
        "Strolling Stone",
        """
            Move any number of spaces in a straight
            line, ignoring obstacles, without moving
            through more than two empty space.
        """.trimIndent(),
        Color.GREEN,
        level = 3,
        variant = 2 to 2,
        initiative = 5,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 5,
        item = Item.INITIATIVE,
    ),
    Card(
        "Boulderdozer",
        """
            Push a token, or an enemy unit, adjacent to
            you 1, 2, 3 or 4 spaces, ignoring obstacles;
            you may move up to 4 spaces in the
            direction of the push, ignoring obstacles.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 1 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.MOVEMENT,
    ),
    Card(
        "Ground Shaker",
        """
            Move a unit in radius which is adjacent
            to terrain, or to a ::token_rock:: Rock token, 1 space.
            Place a Rock token in the space it occupied.
            May repeat once on a different target.
        """.trimIndent(),
        Color.BLUE,
        level = 3,
        variant = 2 to 2,
        initiative = 9,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryMovement = 2,
        secondaryDefense = 7,
        item = Item.ATTACK,
    ),
    Card(
        "Epicenter",
        """
            An enemy hero in radius adjacent to terrain,
            or to a ::token_rock:: Rock token, discards a card, or is
            defeated. May repeat once on a different target.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 1 to 2,
        initiative = 8,
        primaryAction = Action.SKILL,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryAttack = 7,
        secondaryMovement = 3,
        secondaryDefense = 8,
        item = Item.RANGE,
    ),
    Card(
        "Rock Solid",
        """
            You may retrieve a discarded card.
            **This round:** if you would discard a card from
            your hand, you may discard this card instead;
            you may discard this card to perform its
            defense action, as if it was in your hand.
        """.trimIndent(),
        Color.RED,
        level = 3,
        variant = 2 to 2,
        initiative = 8,
        primaryAction = Action.MOVEMENT,
        primaryValue = 4,
        secondaryAttack = 7,
        secondaryDefense = 6,
        item = Item.DEFENSE,
    ),
    Card(
        "Rock and a Hard Place",
        """
            Once per turn, after you place one or more
            ::token_rock:: Rock tokens into one or more spaces
            adjacent to one or more enemy heroes,
            each of those heroes discards a card, if able.
        """.trimIndent(),
        Color.PURPLE,
        level = 4,
    ),
)