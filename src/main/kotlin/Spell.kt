import kotlinx.serialization.Serializable

@Serializable
data class Spell(
    val name: String,
    val description: String,
    val color: Color,
    val school: School,
    val level: Int? = null,
    val variant: Pair<Int, Int> = 1 to 1,
    val primaryAction: Action? = null,
    val primaryValue: Int? = null,
    val primaryValueSign: Sign? = null,
    val modifier: Modifier? = null,
    val modifierValue: Int? = null,
    val modifierValueSign: Sign? = null,
)
