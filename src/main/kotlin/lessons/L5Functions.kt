package com.joaocsoliveira.lessons

import kotlin.math.PI

class L5Functions {

    fun run() {
        val a = 1
        val b = 2
        println(numbersToString(a, b))
        println(numbersToString(b = b, a = a))
        println(numbersToString(a, b, 3))
        println(numbersToString(a, b, c = 3))

        println(numbersToString2(a, b))

        val f = { c: Int, d: Int -> numbersToString(c, d) }
        println(f(a, b))

        val f2 = { c: Int, d: Int -> numbersToString(c, d, 2) }
        println(f2(a, b))

        processAndPrint(a, b, f) { text: String -> print(text) }
    }

    private fun numbersToString(a: Int, b: Int, c: Int = 0): String {
        return "a ($a) + b ($b) + c ($c) = ${a + b + c}"
    }

    private fun numbersToString2(a: Int, b: Int, c: Int = 0) = "a ($a) + b ($b) + c ($c) = ${a + b + c}"

    private fun processAndPrint(a: Int, b: Int, fProcess: (a: Int, b: Int) -> String, fPrint: (String) -> Unit ) {
        fPrint(fProcess(a, b))
    }

    fun practice() {
        practice1()
        practice2()
        practice3()
        practice4()
        practice5()
    }

    private fun practice1() {
        fun circleArea(r: Int): Double {
            return PI * r * r
        }
        println(circleArea(2))
    }

    private fun practice2() {
        fun circleArea(r: Int) = PI * r * r
        println(circleArea(2))
    }

    private fun practice3() {
        fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
            ((hours * 60) + minutes) * 60 + seconds

        println(intervalInSeconds(1, 20, 15))
        println(intervalInSeconds(minutes = 1, seconds = 25))
        println(intervalInSeconds(2))
        println(intervalInSeconds(minutes = 10))
        println(intervalInSeconds(1, seconds = 1))
    }

    private fun practice4() {
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5
        val urls = actions.map{action -> "$prefix/$id/$action/"}
        println(urls)
    }

    private fun practice5() {
        fun repeatN(n: Int, action: () -> Unit) {
            for (i in 1..n) {
                action()
            }
        }

        repeatN(5) { println("Hello") }
    }
}