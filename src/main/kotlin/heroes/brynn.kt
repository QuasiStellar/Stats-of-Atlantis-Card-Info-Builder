package heroes

import Action
import Card
import Color
import Item
import Modifier

val brynn = setOf(
    Card(
        "Home Turf",
        """
            **Choose one —**
            >>Target a hero adjacent to you.
            >>Target a hero in range who is
            >adjacent to 3 or more obstacles.
            ~(You, other heroes, minions, tokens and terrain are obstacles.)
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 11,
        primaryAction = Action.ATTACK,
        primaryValue = 2,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
)