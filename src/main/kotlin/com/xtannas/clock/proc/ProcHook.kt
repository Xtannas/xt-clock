package com.xtannas.clock.proc

import com.xtannas.clock.base.Color
import com.xtannas.clock.base.SIZE
import com.xtannas.clock.base.background
import com.xtannas.clock.view.Clock
import processing.core.PApplet

class ProcHook : PApplet() {

    private val clock = Clock()


    override fun settings() {
        size(SIZE, SIZE)
    }

    override fun setup() {
        frameRate(1F)
        surface.setTitle("Word Clock")
    }

    override fun draw() {
        background(Color.BLACK)
        clock.draw(this)
    }

}