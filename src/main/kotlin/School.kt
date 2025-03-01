import kotlinx.serialization.Serializable

@Serializable
enum class School {
    CANTRIP, // Magic Missile, Expeditious Retreat, Shocking Grasp
    ABJURATION, // Shield, Banishment, Invulnerability
    CONJURATION, // Find Familiar, Dimension Door, Cloud Kill
    ENCHANTMENT, // Suggestion, Dominate Person, Power Word Kill
    EVOCATION, // Burning Hands, Fireball, Sunburst
    NECROMANCY, // Vampiric Touch, Create Undead, Energy Drain
    TRANSMUTATION, // Midas Touch, Disintegrate, Polymorph
    WISH, // Wish
}
