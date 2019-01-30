package com.xtannas.clock.view.grid

import com.xtannas.clock.base.*
import com.xtannas.clock.proc.ProcDraw
import processing.core.PApplet
import java.util.*

class Grid : ProcDraw {

    override fun draw(app: PApplet) {
        cellsMap.flatMap { it.value.values }.forEach { it.draw(app) }
    }


    private val cellsMap = generateCells()

    private fun generateCells() = (0 until GRID_SIZE_X).associateWith { x ->
        (0 until GRID_SIZE_Y).associateWith { y -> Cell(x, y) }
    }


    init {
        val lets = ArrayDeque(LETTERS)

        var x = 0
        var y = 0

        while (lets.isNotEmpty()) {
            val cell = this[X(x), Y(y)]

            cell.txt = lets.poll()

            if (x++ == maxCol) {
                x = 0

                if (y++ == maxRow) {
                    break
                }
            }
        }
    }


    val maxCol: Int // x
        get() = cellsMap.size - 1

    val maxRow: Int // y
        get() = cellsMap.getValue(0).size - 1

    val cells: List<Cell>
        get() = cellsMap.values.flatMap { it.values }


    operator fun get(x: X): List<Cell> {
        return cellsMap[x.x]?.values?.toList() ?: emptyList()
    }

    operator fun get(y: Y): List<Cell> {
        return cellsMap.mapNotNull { it.value[y.y] }
    }

    operator fun get(x: X, y: Y): Cell {
        return this[x][y.y]
    }

}