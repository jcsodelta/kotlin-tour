package com.joaocsoliveira.lessons

class L4ControllFlow {

    fun run() {
        val numbers = (1..5).toList()
        for (i in 0 ..< numbers.size) {
            processNumber(numbers[i])
        }

        for (number in numbers) {
            processNumber(number)
        }

        var i = 0
        while (i < numbers.size) {
            processNumber(numbers[i])
            i++
        }

        i = 0
        do {
            processNumber(numbers[i])
            i++
        } while (i < numbers.size)

    }

    private fun processNumber(number: Int) {
        if (number % 2 == 0) {
            println("number $number is even")
        } else {
            println("number $number is odd")
        }

        val mod3 = when (number % 3) {
            0 -> "zero"
            1 -> "one"
            else -> "something else (... is two)"
        }
        println("number mod 3 = $mod3")
    }

    fun practice() {
        practice1()
        practice2()
        practice3()
        practice4()
    }

    private fun practice1() {
        val button = "A"

        println(
            when (button) {
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )
    }

    private fun practice2() {
        run {
            var pizzaSlices = 0
            while (pizzaSlices < 8) {
                println("There's only $pizzaSlices slice/s of pizza :(")
                pizzaSlices++
            }
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        }

        run {
            var pizzaSlices = 0
            do {
                println("There's only $pizzaSlices slice/s of pizza :(")
                pizzaSlices++
            } while (pizzaSlices < 8)
            println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
        }
    }

    private fun practice3() {
        for (n in 1..100) {
            val mod3 = n % 3 == 0
            val mod5 = n % 5 == 0
            val text = when {
                mod3 && mod5 -> "fizzbuzz"
                mod3 -> "fizz"
                mod5 -> "buzz"
                else -> "$n"
            }
            print("$text ")
        }
        println()
    }

    private fun practice4() {
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        for (word in words) {
            if (word[0] == 'l') {
                println(word)
            }
        }
    }
}