package old

import kotlinx.serialization.Serializable

@Serializable
enum class Item {
    ATTACK,
    DEFENSE,
    INITIATIVE,
    RANGE,
    AREA,
    MOVEMENT,
}
