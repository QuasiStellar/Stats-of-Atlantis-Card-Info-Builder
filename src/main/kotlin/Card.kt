import kotlinx.serialization.Serializable

@Serializable
data class Card(
    val name: String,
    val description: String,
    val color: Color,
    val handicapped: Boolean = false,
    val level: Int? = null,
    val variant: Pair<Int, Int> = 1 to 1,
    val initiative: Int? = null,
    val primaryAction: Action? = null,
    val primaryValue: Int? = null,
    val primaryValueSign: Sign? = null,
    val modifier: Modifier? = null,
    val modifierValue: Int? = null,
    val modifierValueSign: Sign? = null,
    val secondaryMovement: Int? = null,
    val secondaryDefense: Int? = null,
    val secondaryAttack: Int? = null,
    val item: Item? = null,
)
