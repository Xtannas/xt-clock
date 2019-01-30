@file:Suppress("MemberVisibilityCanBePrivate")

package com.xtannas.clock.view.time

import com.xtannas.clock.view.word.WordBank.A
import com.xtannas.clock.view.word.WordBank.EIGHT
import com.xtannas.clock.view.word.WordBank.ELEVEN
import com.xtannas.clock.view.word.WordBank.FIVE_1
import com.xtannas.clock.view.word.WordBank.FOUR
import com.xtannas.clock.view.word.WordBank.HALF
import com.xtannas.clock.view.word.WordBank.IS
import com.xtannas.clock.view.word.WordBank.IT
import com.xtannas.clock.view.word.WordBank.NINE
import com.xtannas.clock.view.word.WordBank.OCLOCK
import com.xtannas.clock.view.word.WordBank.ONE
import com.xtannas.clock.view.word.WordBank.PAST
import com.xtannas.clock.view.word.WordBank.QUARTER
import com.xtannas.clock.view.word.WordBank.SEVEN
import com.xtannas.clock.view.word.WordBank.SIX
import com.xtannas.clock.view.word.WordBank.TEN_1
import com.xtannas.clock.view.word.WordBank.THREE
import com.xtannas.clock.view.word.WordBank.TO
import com.xtannas.clock.view.word.WordBank.TWELVE
import com.xtannas.clock.view.word.WordBank.TWO
import java.time.LocalDateTime

object TimeBank {

    // 01:00
    val IT_IS_01_OCLOCK = Time(IT, IS, ONE, OCLOCK)
    // 02:00
    val IT_IS_02_OCLOCK = Time(IT, IS, TWO, OCLOCK)
    // 03:00
    val IT_IS_03_OCLOCK = Time(IT, IS, THREE, OCLOCK)
    // 04:00
    val IT_IS_04_OCLOCK = Time(IT, IS, FOUR, OCLOCK)
    // 05:00
    val IT_IS_05_OCLOCK = Time(IT, IS, FIVE_1, OCLOCK)
    // 06:00
    val IT_IS_06_OCLOCK = Time(IT, IS, SIX, OCLOCK)
    // 07:00
    val IT_IS_07_OCLOCK = Time(IT, IS, SEVEN, OCLOCK)
    // 08:00
    val IT_IS_08_OCLOCK = Time(IT, IS, EIGHT, OCLOCK)
    // 09:00
    val IT_IS_09_OCLOCK = Time(IT, IS, NINE, OCLOCK)
    // 10:00
    val IT_IS_10_OCLOCK = Time(IT, IS, TEN_1, OCLOCK)
    // 11:00
    val IT_IS_11_OCLOCK = Time(IT, IS, ELEVEN, OCLOCK)
    // 12:00
    val IT_IS_12_OCLOCK = Time(IT, IS, TWELVE, OCLOCK)


    // 01:15
    val IT_IS_A_QUARTER_PAST_01 = Time(IT, IS, A, QUARTER, PAST, ONE)
    // 02:15
    val IT_IS_A_QUARTER_PAST_02 = Time(IT, IS, A, QUARTER, PAST, TWO)
    // 03:15
    val IT_IS_A_QUARTER_PAST_03 = Time(IT, IS, A, QUARTER, PAST, THREE)
    // 04:15
    val IT_IS_A_QUARTER_PAST_04 = Time(IT, IS, A, QUARTER, PAST, FOUR)
    // 05:15
    val IT_IS_A_QUARTER_PAST_05 = Time(IT, IS, A, QUARTER, PAST, FIVE_1)
    // 06:15
    val IT_IS_A_QUARTER_PAST_06 = Time(IT, IS, A, QUARTER, PAST, SIX)
    // 07:15
    val IT_IS_A_QUARTER_PAST_07 = Time(IT, IS, A, QUARTER, PAST, SEVEN)
    // 08:15
    val IT_IS_A_QUARTER_PAST_08 = Time(IT, IS, A, QUARTER, PAST, EIGHT)
    // 09:15
    val IT_IS_A_QUARTER_PAST_09 = Time(IT, IS, A, QUARTER, PAST, NINE)
    // 10:15
    val IT_IS_A_QUARTER_PAST_10 = Time(IT, IS, A, QUARTER, PAST, TEN_1)
    // 11:15
    val IT_IS_A_QUARTER_PAST_11 = Time(IT, IS, A, QUARTER, PAST, ELEVEN)
    // 12:15
    val IT_IS_A_QUARTER_PAST_12 = Time(IT, IS, A, QUARTER, PAST, TWELVE)


    // 01:30
    val IT_IS_HALF_PAST_01 = Time(IT, IS, HALF, PAST, ONE)
    // 02:30
    val IT_IS_HALF_PAST_02 = Time(IT, IS, HALF, PAST, TWO)
    // 03:30
    val IT_IS_HALF_PAST_03 = Time(IT, IS, HALF, PAST, THREE)
    // 04:30
    val IT_IS_HALF_PAST_04 = Time(IT, IS, HALF, PAST, FOUR)
    // 04:30
    val IT_IS_HALF_PAST_05 = Time(IT, IS, HALF, PAST, FIVE_1)
    // 06:30
    val IT_IS_HALF_PAST_06 = Time(IT, IS, HALF, PAST, SIX)
    // 07:30
    val IT_IS_HALF_PAST_07 = Time(IT, IS, HALF, PAST, SEVEN)
    // 08:30
    val IT_IS_HALF_PAST_08 = Time(IT, IS, HALF, PAST, EIGHT)
    // 09:30
    val IT_IS_HALF_PAST_09 = Time(IT, IS, HALF, PAST, NINE)
    // 10:30
    val IT_IS_HALF_PAST_10 = Time(IT, IS, HALF, PAST, TEN_1)
    // 11:30
    val IT_IS_HALF_PAST_11 = Time(IT, IS, HALF, PAST, ELEVEN)
    // 12:30
    val IT_IS_HALF_PAST_12 = Time(IT, IS, HALF, PAST, TWELVE)


    // 12:45
    val IT_IS_A_QUARTER_TO_01 = Time(IT, IS, A, QUARTER, TO, ONE)
    // 01:45
    val IT_IS_A_QUARTER_TO_02 = Time(IT, IS, A, QUARTER, TO, TWO)
    // 02:45
    val IT_IS_A_QUARTER_TO_03 = Time(IT, IS, A, QUARTER, TO, THREE)
    // 03:45
    val IT_IS_A_QUARTER_TO_04 = Time(IT, IS, A, QUARTER, TO, FOUR)
    // 04:45
    val IT_IS_A_QUARTER_TO_05 = Time(IT, IS, A, QUARTER, TO, FIVE_1)
    // 05:45
    val IT_IS_A_QUARTER_TO_06 = Time(IT, IS, A, QUARTER, TO, SIX)
    // 06:45
    val IT_IS_A_QUARTER_TO_07 = Time(IT, IS, A, QUARTER, TO, SEVEN)
    // 07:45
    val IT_IS_A_QUARTER_TO_08 = Time(IT, IS, A, QUARTER, TO, EIGHT)
    // 08:45
    val IT_IS_A_QUARTER_TO_09 = Time(IT, IS, A, QUARTER, TO, NINE)
    // 09:45
    val IT_IS_A_QUARTER_TO_10 = Time(IT, IS, A, QUARTER, TO, TEN_1)
    // 10:45
    val IT_IS_A_QUARTER_TO_11 = Time(IT, IS, A, QUARTER, TO, ELEVEN)
    // 11:45
    val IT_IS_A_QUARTER_TO_12 = Time(IT, IS, A, QUARTER, TO, TWELVE)


    private val t_o = listOf(IT_IS_01_OCLOCK, IT_IS_02_OCLOCK, IT_IS_03_OCLOCK, IT_IS_04_OCLOCK, IT_IS_05_OCLOCK, IT_IS_06_OCLOCK, IT_IS_07_OCLOCK, IT_IS_08_OCLOCK, IT_IS_09_OCLOCK, IT_IS_10_OCLOCK, IT_IS_11_OCLOCK, IT_IS_12_OCLOCK)
    private val q_p = listOf(IT_IS_A_QUARTER_PAST_01, IT_IS_A_QUARTER_PAST_02, IT_IS_A_QUARTER_PAST_03, IT_IS_A_QUARTER_PAST_04, IT_IS_A_QUARTER_PAST_05, IT_IS_A_QUARTER_PAST_06, IT_IS_A_QUARTER_PAST_07, IT_IS_A_QUARTER_PAST_08, IT_IS_A_QUARTER_PAST_09, IT_IS_A_QUARTER_PAST_10, IT_IS_A_QUARTER_PAST_11, IT_IS_A_QUARTER_PAST_12)
    private val h_p = listOf(IT_IS_HALF_PAST_01, IT_IS_HALF_PAST_02, IT_IS_HALF_PAST_03, IT_IS_HALF_PAST_04, IT_IS_HALF_PAST_05, IT_IS_HALF_PAST_06, IT_IS_HALF_PAST_07, IT_IS_HALF_PAST_08, IT_IS_HALF_PAST_09, IT_IS_HALF_PAST_10, IT_IS_HALF_PAST_11, IT_IS_HALF_PAST_12)
    private val q_t = listOf(IT_IS_A_QUARTER_TO_01, IT_IS_A_QUARTER_TO_02, IT_IS_A_QUARTER_TO_03, IT_IS_A_QUARTER_TO_04, IT_IS_A_QUARTER_TO_05, IT_IS_A_QUARTER_TO_06, IT_IS_A_QUARTER_TO_07, IT_IS_A_QUARTER_TO_08, IT_IS_A_QUARTER_TO_09, IT_IS_A_QUARTER_TO_10, IT_IS_A_QUARTER_TO_11, IT_IS_A_QUARTER_TO_12)


    val values = listOf(*t_o.toTypedArray(), *q_p.toTypedArray(), *h_p.toTypedArray(), *q_t.toTypedArray())


    fun search(): Time {
        val time = LocalDateTime.now()

        val m = time.minute
        var h = time.hour

        when {
            h == 0 -> h = 12
            h > 12 -> h -= 12
        }

        val l = when {
            m < 15 -> t_o
            m < 30 -> q_p
            m < 45 -> h_p
            else   -> q_t
        }

        val index = if (l != q_t) {
            h - 1
        } else {
            if (h == 12) 0 else h
        }

        return l[index]
    }

}