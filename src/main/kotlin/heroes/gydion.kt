package heroes

import Action
import Card
import Color
import Item
import Modifier

val gydion = setOf(
    Card(
        "Cheap Trick",
        """
            Cast the "Expeditious Retreat"
            spell in the spellbook.
            ~(To dart a great distance!)
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.SKILL,
        secondaryDefense = 1,
    ),
)