package heroes

import Action
import Card
import Color
import Item
import Modifier

val mrak = setOf(
    Card(
        "Lesser Fissure",
        """
            Target a hero adjacent to you. After the attack:
            Place a ::token_rock:: rock token in each of the first
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
)