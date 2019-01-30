package com.xtannas.clock.view.time

import com.xtannas.clock.view.grid.Cell
import com.xtannas.clock.view.grid.Grid
import com.xtannas.clock.view.word.Word

class Time(private val words: List<Word>) {
    constructor(vararg words: Word): this(words.toList())

    operator fun get(grid: Grid): List<Cell> {
        return this.words.flatMap { it[grid] }
    }

}