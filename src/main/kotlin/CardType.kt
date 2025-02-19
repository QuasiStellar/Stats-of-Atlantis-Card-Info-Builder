enum class CardType {
    Gold,
    Silver,
    Ultimate,
    BlueIA,
    RedIA,
    GreenIA,
    BlueIIA,
    RedIIA,
    GreenIIA,
    BlueIIB,
    RedIIB,
    GreenIIB,
    BlueIIIA,
    RedIIIA,
    GreenIIIA,
    BlueIIIB,
    RedIIIB,
    GreenIIIB,
    Handicap,
    ;

    val replacement: CardType? get() = when (this) {

        Gold -> Handicap
        BlueIIA -> BlueIIB
        RedIIA -> RedIIB
        GreenIIA -> GreenIIB
        BlueIIIA -> BlueIIIB
        RedIIIA -> RedIIIB
        GreenIIIA -> GreenIIIB

        Handicap -> Gold
        BlueIIB -> BlueIIA
        RedIIB -> RedIIA
        GreenIIB -> GreenIIA
        BlueIIIB -> BlueIIIA
        RedIIIB -> RedIIIA
        GreenIIIB -> GreenIIIA

        else -> null
    }
}
