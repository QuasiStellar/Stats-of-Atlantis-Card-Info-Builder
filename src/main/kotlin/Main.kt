import heroes.arien
import heroes.bain
import heroes.brogan
import heroes.brynn
import heroes.cutter
import heroes.dodger
import heroes.emmitt
import heroes.garrus
import heroes.gydion
import heroes.hanu
import heroes.ignatia
import heroes.min
import heroes.misa
import heroes.mortimer
import heroes.mrak
import heroes.nebkher
import heroes.razzle
import heroes.rowenna
import heroes.sabina
import heroes.silverarrow
import heroes.snorri
import heroes.spells
import heroes.swift
import heroes.takahide
import heroes.tali
import heroes.tigerclaw
import heroes.trinkets
import heroes.ursafar
import heroes.wasp
import heroes.whisper
import heroes.widget
import heroes.wuk
import heroes.xargatha
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun main() {
    println(Json.encodeToString(
        mapOf(
            "arien" to arien,
            "bain" to bain,
            "brogan" to brogan,
            "brynn" to brynn,
            "cutter" to cutter,
            "dodger" to dodger,
            "emmitt" to emmitt,
            "garrus" to garrus,
            "gydion" to gydion,
            "hanu" to hanu,
            "ignatia" to ignatia,
            "min" to min,
            "misa" to misa,
            "mortimer" to mortimer,
            "mark" to mrak,
            "nebkher" to nebkher,
            "razzle" to razzle,
            "rowenna" to rowenna,
            "sabina" to sabina,
            "silverarrow" to silverarrow,
            "snorri" to snorri,
            "swift" to swift,
            "takahide" to takahide,
            "tali" to tali,
            "tigerclaw" to tigerclaw,
            "trinkets" to trinkets,
            "ursafar" to ursafar,
            "wasp" to wasp,
            "whisper" to whisper,
            "widget" to widget,
            "wuk" to wuk,
            "xargatha" to xargatha,
        )
    ))

    println()

    println(Json.encodeToString(
        spells
    ))
}
