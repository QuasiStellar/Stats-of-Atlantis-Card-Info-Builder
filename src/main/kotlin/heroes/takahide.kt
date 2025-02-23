package heroes

import Action
import Card
import Color
import Item
import Modifier

val takahide = setOf(
    Card(
        "Shameful Display",
        """
            ~(You are defeated.)
        """.trimIndent(),
        Color.SILVER,
        handicapped = true,
        initiative = 5,
        primaryAction = Action.DEFENSE,
    ),
)