package heroes

import Action
import Card
import Color
import Item
import Modifier

val emmitt = setOf(
    Card(
        "Shallow Graves",
        """
            Target a unit adjacent to you.
            Before the attack: **Choose up to two times —**
            >>Move a ::token_zombie:: Zombie token in radius 1 space.
            >> Remove a Zombie token adjacent to the
            >target; if you do, gain +1 ::gold_attack:: Attack.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 3,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.AREA,
        modifierValue = 4,
        secondaryDefense = 1,
        secondaryMovement = 1,
    ),
)