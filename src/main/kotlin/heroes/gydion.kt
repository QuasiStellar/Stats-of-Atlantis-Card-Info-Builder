package heroes

import Action
import Card
import Color
import Item
import Modifier
import Spell

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

val spells = setOf(
    Spell(
        "Magic Missile",
        """
            Target a unit in range
            and not adjacent to you.
        """.trimIndent(),
        Color.GOLD,
        school = School.CANTRIP,
        variant = 1 to 3,
        primaryAction = Action.ATTACK,
        primaryValue = 1,
        modifier = Modifier.RANGE,
        modifierValue = 3,
    )
)
