package com.joaocsoliveira

import com.joaocsoliveira.lessons.*

fun main() {
    println("Hello World!")

    val lesson1 = L01HelloWorld()
    lesson1.run()
    lesson1.practice()

    val lesson2 = L2BasicTypes()
    lesson2.run()
    lesson2.practice()

    val lesson3 = L3Collections()
    lesson3.run()
    lesson3.practice()

    val lesson4 = L4ControllFlow()
    lesson4.run()
    lesson4.practice()

    val lesson5 = L5Functions()
    lesson5.run()
    lesson5.practice()

    val lesson6 = L6Classes()
    lesson6.run()
    lesson6.practice()
}