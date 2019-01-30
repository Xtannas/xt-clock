package com.xtannas.clock.base

const val SIZE = 2000

const val GRID_SIZE_X = 11
const val GRID_SIZE_Y = 10

const val GRID_INSETS = 200

const val GRID_CELL_S_X = (SIZE - (GRID_INSETS * 2.0)) / GRID_SIZE_X.toDouble()
const val GRID_CELL_S_Y = (SIZE - (GRID_INSETS * 2.0)) / GRID_SIZE_Y.toDouble()


inline class X(val x: Int)

inline class Y(val y: Int)


val LETTERS = listOf("I", "T", "L", "I", "S", "A", "S", "T", "I", "M", "E",
                     "A", "C", "Q", "U", "A", "R", "T", "E", "R", "D", "C",
                     "T", "W", "E", "N", "T", "Y", "F", "I", "V", "E", "X",
                     "H", "A", "L", "F", "B", "T", "E", "N", "F", "T", "O",
                     "P", "A", "S", "T", "E", "R", "U", "N", "I", "N", "E",
                     "O", "N", "E", "S", "I", "X", "T", "H", "R", "E", "E",
                     "F", "O", "U", "R", "F", "I", "V", "E", "T", "W", "O",
                     "E", "I", "G", "H", "T", "E", "L", "E", "V", "E", "N",
                     "S", "E", "V", "E", "N", "T", "W", "E", "L", "V", "E",
                     "T", "E", "N", "S", "E", "O", "C", "L", "O", "C", "K")