package com.xtannas.clock.view.grid

import com.xtannas.clock.base.*
import com.xtannas.clock.proc.ProcDraw
import processing.core.PApplet

class Cell(val x: Int, val y: Int) : ProcDraw {

    override fun draw(app: PApplet) {
        val tS = (GRID_CELL_S_X / 2F).toFloat()
        app.textSize(tS + (GRID_CELL_S_X / 2F).toFloat() / 4)

        app.fill(if (lit) colorIsLit else colorNotLit)
        app.text(txt, cellX() + textX(app.textWidth(txt)), cellY() + textY(tS))
    }


    private fun cellX(): Double {
        return GRID_INSETS + (x * GRID_CELL_S_X)
    }

    private fun cellY(): Double {
        return GRID_INSETS + (y * GRID_CELL_S_Y)
    }

    private fun textX(textW: Float): Double {
        return (GRID_CELL_S_X / 2) - (textW / 2)
    }

    private fun textY(textS: Float): Double {
        return ((GRID_CELL_S_Y / 2) + textS / 2) - (textS / 7)
    }


    var txt = ""
    var lit = false


    private companion object {

        val colorIsLit = Color.WHITE
        val colorNotLit = Color.WHITE.mix(Color.BLACK, 3)

    }

}