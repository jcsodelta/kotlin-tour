package com.joaocsoliveira.lessons

class L2BasicTypes {

    private var iB: Byte = 1
    private var iS: Short = 1
    private var i = 1
    private var iL: Long = 1
    private var iUB: UByte = 1u
    private var iUS: UShort = 1u
    private var iU: UInt = 1u
    private var iUL: ULong = 1u

    private var f = 1F
    private var d = 1.0

    private var b = false

    private var c = 'a'
    private var s = "No"

    fun run() {
        printVariables()
        changeVariables()

        printVariables()
        changeVariables()

        printVariables()
        changeVariables()
    }

    private fun changeVariables() {
        iB = (iB + 100).toByte()
        iS = (iS + 100).toShort()
        i += 30000
        iL += 2_000_000_000
        iUB = (iUB + 100u).toUByte()
        iUS = (iUS + 100u).toUShort()
        iU += 30000u
        iUL += 2_000_000_000u
        f += 1.1F
        d += 1.1
        b = !b
        c += 1
        s = if (s == "No") "Yes" else "No"
    }

    private fun printVariables() {
        print("iB($iB)")
        print("iS($iS)")
        print("i($i)")
        print("iL($iL)")
        print("iUB($iUB)")
        print("iUS($iUS)")
        print("iU($iU)")
        print("iUL($iUL)")
        print("f($f)")
        print("d($d)")
        print("b($b)")
        print("c($c)")
        print("s($s)")
    }

    fun practice() {
        val a: Int = 1000
        val b: String = "log message"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000
        val e: Boolean = false
        val f: Char = '\n'
        println("'$a' '$b' '$c' '$d' '$e' '$f'")
    }
}
