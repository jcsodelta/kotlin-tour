package com.joaocsoliveira.lessons

class L6Classes {

    fun run() {
        data class Person(val id: Int, val name: String)
        class Location(val address: String)
        class Group(val id: Int, val name: String, var persons: MutableList<Person>, val location: Location ) {
            fun print() {
                println("Group $name , persons = $persons , location = $location")
            }
        }

        val pA = Person(0, "P A")
        val gA = Group(0, "G A", persons = mutableListOf(pA), Location("somewhere"))

        gA.print()
        gA.persons.add(Person(1, "P A2"))
        gA.print()
    }

    fun practice() {
        practice1()
        practice2()
    }

    private fun practice1() {
        data class Employee(val name: String, var salary: Long)

        val emp = Employee("Mary", 20)
        println(emp)
        emp.salary += 10
        println(emp)
    }

    private fun practice2() {
        data class Employee(val name: String, var salary: Int)

        class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
            val potentialNames = listOf("A", "B", "C")

            fun generateEmployee(): Employee {
                return Employee(potentialNames[0], maxSalary)
            }
        }

        val empGen = RandomEmployeeGenerator(10, 30)
        println(empGen.generateEmployee())
        println(empGen.generateEmployee())
        println(empGen.generateEmployee())
        empGen.minSalary = 50
        empGen.maxSalary = 100
        println(empGen.generateEmployee())
    }
}