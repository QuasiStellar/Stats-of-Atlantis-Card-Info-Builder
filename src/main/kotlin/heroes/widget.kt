package heroes

import Action
import Card
import Color
import Item
import Modifier

val widget = setOf(
    Card(
        "Follow Along",
        """
            Target a hero adjacent to you.
            After the attack: You may perform the primary
            action on one of your resolved skill cards,
            targeting a different unit.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        secondaryDefense = 1,
        secondaryMovement = 2,
    ),
)