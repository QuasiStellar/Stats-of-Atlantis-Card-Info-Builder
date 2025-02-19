package old

import heroes.arien
import heroes.bain
import heroes.brogan
import heroes.cutter
import heroes.dodger
import heroes.garrus
import heroes.hanu
import heroes.ignatia
import heroes.min
import heroes.misa
import heroes.nebkher
import heroes.sabina
import heroes.silverarrow
import heroes.swift
import heroes.tigerclaw
import heroes.trinkets
import heroes.ursafar
import heroes.wasp
import heroes.whisper
import heroes.wuk
import heroes.xargatha
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import old.heroes.tali

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
            "heroes.getTali" to tali,
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
