package com.joaocsoliveira

import com.joaocsoliveira.lessons.L01HelloWorld
import com.joaocsoliveira.lessons.L2BasicTypes
import com.joaocsoliveira.lessons.L3Collections
import com.joaocsoliveira.lessons.L4ControllFlow

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
}