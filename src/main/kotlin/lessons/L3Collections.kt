package com.joaocsoliveira.lessons

const val ALL_ENTRIES_LABEL = "all entries"
const val PROCESSED_ENTRIES_LABEL = "processed entries"

const val ODD_GROUP_NAME = "odd"
const val EVEN_GROUP_NAME = "even"


class L3Collections {

    private val allEntries: List<Int> = listOf(1, 0, 30, 20, 1, 3, 5, 8, 7, 2, 4, 12, 9)
    private val processedEntries: MutableList<Int> = mutableListOf()
    private val processedEntriesSet = mutableSetOf<Int>()
    private val groupedEntries: Map<String, MutableList<Int>> = mutableMapOf(
        ODD_GROUP_NAME to mutableListOf<Int>(),
        EVEN_GROUP_NAME to mutableListOf<Int>()
    )

    fun run() {
        printList(ALL_ENTRIES_LABEL, allEntries)
        //allEntries.addLast(2) -> java.lang.UnsupportedOperationException

        printState()

        processEntry(0u)
        printState()

        processEntry(1u)
        printState()

        processEntry(2u)
        printState()

        processEntry(3u)
        printState()

        processEntry(4u)
        printState()
    }

    private fun printList(description: String, list: List<Int>) {
        println("$description: $list")
    }

    private fun processEntry(index: UInt) {
        val entry = allEntries[index.toInt()]
        processedEntries.add(entry)
        processedEntriesSet.add(entry)
        if (entry % 2 == 0) {
            groupedEntries[EVEN_GROUP_NAME]?.add(entry)
        } else {
            groupedEntries[ODD_GROUP_NAME]?.add(entry)
        }
    }

    private fun printState() {
        printList(PROCESSED_ENTRIES_LABEL, processedEntries)
        println("processed entries set: $processedEntriesSet")
        println("grouped entries: $groupedEntries")
    }

    private fun practice1() {
        val greenNumbers = listOf(1, 4, 23)
        val redNumbers = listOf(17, 2)
        println(greenNumbers.size + redNumbers.size)
        println(greenNumbers.count() + redNumbers.count())
    }

    fun practice() {
        practice1()
        practice2()
        practice3()
    }

    private fun practice2() {
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = requested in SUPPORTED || requested.uppercase() in SUPPORTED
            println("Support for $requested: $isSupported")
    }

    private fun practice3() {
        val number2word = mapOf(
            1 to "One",
            2 to "two",
            3 to "three"
        )
        val n = 2
        println("$n is spelt as '$number2word[n]'")
    }
}