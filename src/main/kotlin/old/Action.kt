package old

import kotlinx.serialization.Serializable

@Serializable
enum class Action {
    SKILL,
    ATTACK,
    MOVEMENT,
    DEFENSE,
    DEFENSE_SKILL,
}
