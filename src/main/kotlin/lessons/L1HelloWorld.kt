package com.joaocsoliveira.lessons

const val aImmutable = 0
var bVariable = 0

class L01HelloWorld {
    private val cImmutable = 0
    private var dVariable = 0

    fun run() {
        print("Hello, ")
        println("World!")

        incrementVariables()
        printValues()

        incrementVariables()
        printValues()

        val eImmutable = 0
        var fVariable = 0
        println("e + (++f) + 1 = ${eImmutable + ++fVariable + 1}")
    }

    private fun incrementVariables() {
        bVariable += 1
        dVariable += 1
    }

    private fun printValues() {
        print("a = $aImmutable, ")
        print("b = $bVariable, ")
        print("c = $cImmutable, ")
        println("d = $dVariable")

        println("a + b = ${aImmutable + bVariable}")
    }

    fun practice() {
        val name = "Mary"
        val age = 20
        println("$name is $age years old")
    }
}
