package com.xtannas.clock.base

import processing.core.PApplet

fun PApplet.fill(color: Color) {
    fill(color.r.toFloat(), color.g.toFloat(), color.b.toFloat(), color.a.toFloat())
}

fun PApplet.background(color: Color) {
    background(color.r.toFloat(), color.g.toFloat(), color.b.toFloat(), color.a.toFloat())
}

fun PApplet.text(text: String, x: Number, y: Number) {
    text(text, x.toFloat(), y.toFloat())
}