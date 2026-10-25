/*
    Write a Kotlin program to calculate an employee's salary using an Object Expression that extends an abstract class named Employee.
    The abstract class must contain:
    An abstract property employeeName: String.
    An abstract function calculateSalary(): Double.
    A concrete function displayDetails() that displays the employee's name and calculated salary.

    Create an Object Expression that extends Employee and provides implementations for all abstract members.
*/

abstract class Employee {
    abstract val employeeName: String
    abstract fun calculateSalary(): Double
    fun displayDetails() {
        println("Employee Name     : $employeeName")
        println("Calculated Salary : %.2f".format(calculateSalary()))
    }
}

fun main()
{
    val employee = object : Employee() {
        override val employeeName = "Rahul"
        override fun calculateSalary(): Double {
            val basicSalary = 25000.0
            val bonus = 5000.0
            val finalSalary = basicSalary + bonus
            return finalSalary
        }
    }

    employee.displayDetails()
}