enum class HeroBoard(
    val complexity: Int,
    val attack: Pair<Int, Int>,
    val defense: Pair<Int, Int>,
    val initiative: Pair<Int, Int>,
    val movement: Pair<Int, Int>,
    val tags: List<Tag>,
) {
    Arien(1, 8 to 8, 5 to 6, 4 to 4, 5 to 6, listOf(Tag.Tactician, Tag.Disabler, Tag.Durable, Tag.Pusher)),
    Brogan(1, 7 to 7, 8 to 8, 1 to 1, 2 to 4, listOf(Tag.Durable, Tag.Disabler, Tag.Pusher, Tag.Farming)),
    Dodger(1, 3 to 3, 2 to 5, 7 to 7, 5 to 5, listOf(Tag.Damager, Tag.Sniper, Tag.Pusher, Tag.Farming, Tag.Disabler)),
    Sabina(1, 1 to 7, 3 to 3, 5 to 5, 5 to 6, listOf(Tag.Tactician, Tag.Pusher)),
    Tigerclaw(1, 4 to 8, 1 to 4, 8 to 8, 7 to 8, listOf(Tag.Melee, Tag.Disabler, Tag.Farming)),
    Wasp(1, 5 to 5, 4 to 5, 6 to 6, 5 to 5, listOf(Tag.Disabler, Tag.Tactician, Tag.Sniper)),
    Xargatha(1, 5 to 8, 6 to 6, 3 to 3, 6 to 6, listOf(Tag.Tactician, Tag.Pusher, Tag.Disabler, Tag.Durable, Tag.Sniper)),
    Bain(2, 5 to 5, 4 to 6, 4 to 4, 5 to 6, listOf(Tag.Tactician, Tag.Sniper, Tag.Healer, Tag.Farming, Tag.Durable)),
    Garrus(2, 8 to 8, 7 to 7, 3 to 3, 5 to 6, listOf(Tag.Disabler, Tag.Durable, Tag.Tactician)),
    Min(2, 4 to 8, 3 to 8, 8 to 8, 6 to 6, listOf(Tag.Tokens, Tag.Disabler, Tag.Damager, Tag.Melee)),
    Misa(2, 6 to 6, 5 to 5, 7 to 7, 1 to 8, listOf(Tag.Tactician, Tag.Durable, Tag.Damager)),
    Rowenna(2, 8 to 8, 7 to 7, 4 to 4, 3 to 5, listOf(Tag.Melee, Tag.Durable, Tag.Healer, Tag.Farming, Tag.Pusher, Tag.Tactician)),
    Silverarrow(2, 2 to 2, 1 to 1, 7 to 7, 6 to 7, listOf(Tag.Sniper, Tag.Damager, Tag.Disabler, Tag.Healer, Tag.Farming)),
    Ursafar(2, 6 to 6, 6 to 6, 5 to 5, 1 to 5, listOf(Tag.Durable, Tag.Pusher, Tag.Farming, Tag.Melee)),
    Whisper(2, 7 to 7, 4 to 4, 7 to 7, 3 to 5, listOf(Tag.Damager, Tag.Durable, Tag.Tactician, Tag.Pusher)),
    Brynn(3, 4 to 8, 4 to 4, 7 to 7, 5 to 6, listOf(Tag.Tactician, Tag.Damager, Tag.Durable)),
    Cutter(3, 4 to 8, 4 to 4, 6 to 6, 4 to 8, listOf(Tag.Tactician, Tag.Damager, Tag.Farming)),
    Hanu(3, 4 to 4, 1 to 1, 8 to 8, 8 to 8, listOf(Tag.Tactician, Tag.Sniper, Tag.Pusher)),
    Mortimer(3, 8 to 8, 7 to 7, 2 to 2, 4 to 4, listOf(Tag.Melee, Tag.Tokens, Tag.Farming, Tag.Durable, Tag.Pusher)),
    Mrak(3, 8 to 8, 8 to 8, 1 to 1, 2 to 4, listOf(Tag.Melee, Tag.Tokens, Tag.Durable, Tag.Disabler, Tag.Tactician)),
    Swift(3, 5 to 5, 2 to 2, 4 to 4, 3 to 7, listOf(Tag.Sniper, Tag.Farming, Tag.Tactician)),
    Tali(3, 4 to 6, 4 to 4, 5 to 8, 5 to 5, listOf(Tag.Damager, Tag.Pusher, Tag.Healer, Tag.Durable, Tag.Tokens)),
    Trinkets(3, 3 to 5, 2 to 4, 6 to 6, 7 to 8, listOf(Tag.Sniper, Tag.Damager, Tag.Pusher, Tag.Tokens)),
    Widget(3, 5 to 5, 4 to 4, 4 to 4, 5 to 6, listOf(Tag.Tactician, Tag.Pusher, Tag.Damager)),
    Wuk(3, 5 to 5, 8 to 8, 1 to 1, 3 to 4, listOf(Tag.Tokens, Tag.Pusher, Tag.Durable, Tag.Sniper, Tag.Tactician, Tag.Healer)),
    Emmitt(4, 5 to 8, 6 to 6, 1 to 1, 2 to 4, listOf(Tag.Melee, Tag.Tactician, Tag.Durable, Tag.Disabler, Tag.Tokens)),
    Gydion(4, 5 to 6, 3 to 5, 3 to 3, 1 to 4, listOf(Tag.Sniper, Tag.Tactician, Tag.Farming, Tag.Damager, Tag.Pusher, Tag.Tokens)),
    Ignatia(4, 5 to 5, 6 to 6, 2 to 2, 4 to 5, listOf(Tag.Sniper, Tag.Damager, Tag.Tokens, Tag.Tactician, Tag.Pusher)),
    NebKher(4, 2 to 3, 5 to 6, 1 to 1, 2 to 5, listOf(Tag.Disabler, Tag.Tokens, Tag.Sniper)),
    Razzle(4, 3 to 3, 1 to 4, 8 to 8, 5 to 6, listOf(Tag.Tactician, Tag.Melee)),
    Snorri(4, 5 to 6, 5 to 6, 2 to 2, 4 to 5, listOf(Tag.Sniper, Tag.Farming, Tag.Durable, Tag.Damager, Tag.Pusher, Tag.Healer)),
    Takahide(4, 5 to 7, 4 to 7, 3 to 5, 1 to 4, listOf(Tag.Durable, Tag.Sniper, Tag.Tactician, Tag.Damager, Tag.Farming)),
}
