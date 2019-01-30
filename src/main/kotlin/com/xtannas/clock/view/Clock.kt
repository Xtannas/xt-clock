package com.xtannas.clock.view

import com.xtannas.clock.base.Color
import com.xtannas.clock.base.SIZE
import com.xtannas.clock.base.fill
import com.xtannas.clock.base.text
import com.xtannas.clock.proc.ProcDraw
import com.xtannas.clock.view.grid.Grid
import com.xtannas.clock.view.time.Time
import com.xtannas.clock.view.time.TimeBank
import com.xtannas.clock.view.word.Word
import processing.core.PApplet
import java.time.LocalDateTime
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Clock : ProcDraw {

    override fun draw(app: PApplet) {
        app.textSize(pointAmPmS)

        app.fill(colorAmPm)
        app.text(if (timeIsAm()) "A" else "P", pointAmPmX, pointAmPmY)

        grid.draw(app)
    }


    private val grid = Grid()
    private val task = exec.scheduleAtFixedRate(this::refresh, 0L, 1L, TimeUnit.SECONDS)

    private var time = TimeBank.search()

    private val colorAmPm = Color.WHITE.mix(Color.CLEAR, 3)

    private val pointAmPmS = SIZE.toFloat()
    private val pointAmPmX = SIZE * 0.1623
    private val pointAmPmY = SIZE * 0.858


    private fun refresh() {
        val search = TimeBank.search()

        if (time != search) {
            state(time)
            time = search
        }
    }

    private fun timeIsAm(): Boolean {
        return LocalDateTime.now().hour <= 12
    }


    init {
        state(time)
    }


    fun clear() {
        grid.cells.forEach { it.lit = false }
    }

    fun state(time: Time) {
        clear()
        time[grid].forEach { it.lit = true }
    }

    fun getLitState(word: Word): Boolean {
        return word[grid].any { it.lit }
    }

    fun setLitState(word: Word, state: Boolean) {
        word[grid].forEach { it.lit = state }
    }


    private companion object {

        private val exec = Executors.newSingleThreadScheduledExecutor()

    }

}