package heroes

import Action
import Card
import Color
import Item
import Modifier

val razzle = setOf(
    Card(
        "Stunted Doubles",
        """
            Target a hero adjacent to you. After the attack:
            Spawn up to 3 more of you in radius; each of
            you is the same hero, except when actions
            are performed. If defeated, remove all of you.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 12,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.AREA,
        modifierValue = 1,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
)