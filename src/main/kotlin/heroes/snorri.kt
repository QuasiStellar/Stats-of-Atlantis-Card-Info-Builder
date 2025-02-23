package heroes

import Action
import Card
import Color
import Item
import Modifier

val snorri = setOf(
    Card(
        "Rune Shards",
        """
            Target a hero adjacent to you;
            if a rune is active:

            ::rune_axe::: +3 ::attack_gold:: Attack
            ::rune_anvil::: Gain 2 coins.
            ::rune_horn::: Repeat once on a different hero in range.
        """.trimIndent(),
        Color.GOLD,
        handicapped = true,
        initiative = 10,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        primaryValueSign = Sign.PLUS,
        modifier = Modifier.RANGE,
        modifierValue = 2,
        secondaryMovement = 1,
        secondaryDefense = 1,
    ),
)