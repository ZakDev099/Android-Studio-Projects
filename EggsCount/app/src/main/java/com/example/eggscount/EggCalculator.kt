package com.example.eggscount

object EggCalc {
    const val GROSS = 144
    const val DOZEN = 12
    const val UNIT = 1

    fun breakdownEggs(eggTotal: Int): Map<String, Int> {
        val grossAmount = eggTotal / GROSS
        val dozenAmount = (eggTotal % GROSS) / DOZEN
        val unitAmount = (eggTotal % DOZEN) / UNIT

        val eggBreakdown = mapOf(
            "total" to eggTotal,
            "gross" to grossAmount,
            "dozen" to dozenAmount,
            "unit" to unitAmount
        )

        return eggBreakdown
    }
}