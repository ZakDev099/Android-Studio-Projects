package com.example.eggscount

object EggCalc {
    const val GROSS = 144
    const val DOZEN = 12
    const val UNIT = 1

    fun breakdownEggs(eggTotal: Int): EggBreakdown {
        val grossAmount = eggTotal / GROSS
        val dozenAmount = (eggTotal % GROSS) / DOZEN
        val unitAmount = (eggTotal % DOZEN) / UNIT

        return EggBreakdown(eggTotal, grossAmount, dozenAmount, unitAmount)
    }
}