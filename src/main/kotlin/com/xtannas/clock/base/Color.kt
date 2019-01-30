package com.xtannas.clock.base


data class Color(val r: Int, val g: Int, val b: Int, val a: Int) {

    fun mix(color: Color): Color {
        val newA = (this.a + color.a) / 2
        val newR = (this.r + color.r) / 2
        val newG = (this.g + color.g) / 2
        val newB = (this.b + color.b) / 2

        return Color(newR, newG, newB, newA)
    }

    fun mix(vararg colors: Color): Color {
        var output = this

        colors.forEach {
            output = output.mix(it)
        }

        return output
    }


    fun mix(color: Color, count: Int): Color {
        var output = this

        repeat(count) {
            output = output.mix(color)
        }

        return output
    }


    companion object {

        val RED = Color(255, 0, 0, 255)
        val GREEN = Color(0, 255, 0, 255)
        val BLUE = Color(0, 0, 255, 255)

        val BLACK = Color(0, 0, 0, 255)
        val WHITE = Color(255, 255, 255, 255)

        val CLEAR = Color(0, 0, 0, 0)

    }

}