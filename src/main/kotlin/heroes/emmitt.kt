package heroes

import Action
import Card
import Color
import Item
import Modifier

val emmitt = setOf(
    Card(
        "Tear in Time",
        """
            Target a unit adjacent to you.
            After the attack: **Next turn:** Heroes with
            lower initiative act before heroes with higher
            initiative. This effect ignores immunity.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
)