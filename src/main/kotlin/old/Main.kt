package old

import kotlinx.serialization.json.Json
import old.heroes.arien
import old.heroes.bain
import old.heroes.brogan
import old.heroes.cutter
import old.heroes.dodger
import old.heroes.garrus
import old.heroes.hanu
import old.heroes.ignatia
import old.heroes.min
import old.heroes.misa
import old.heroes.nebkher
import old.heroes.sabina
import old.heroes.silverarrow
import old.heroes.swift
import old.heroes.tali
import old.heroes.tigerclaw
import old.heroes.trinkets
import old.heroes.ursafar
import old.heroes.wasp
import old.heroes.whisper
import old.heroes.wuk
import old.heroes.xargatha

fun main() {
    print(Json.encodeToString(
        mapOf(
            "arien" to arien,
            "bain" to bain,
            "brogan" to brogan,
            "cutter" to cutter,
            "dodger" to dodger,
            "garrus" to garrus,
            "hanu" to hanu,
            "ignatia" to ignatia,
            "min" to min,
            "misa" to misa,
            "nebkher" to nebkher,
            "sabina" to sabina,
            "silverarrow" to silverarrow,
            "swift" to swift,
            "tali" to tali,
            "tigerclaw" to tigerclaw,
            "trinkets" to trinkets,
            "ursafar" to ursafar,
            "wasp" to wasp,
            "whisper" to whisper,
            "wuk" to wuk,
            "xargatha" to xargatha,
        )
    ))
}
