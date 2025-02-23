package heroes

import Action
import Card
import Color
import Item
import Modifier

val rowenna = setOf(
    Card(
        "Earn the Spurs",
        """
            Target a hero adjacent to you.
            Before the attack: Both you and the target
            may retrieve a discarded card.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 4,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
)