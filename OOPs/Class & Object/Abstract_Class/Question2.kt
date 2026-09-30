/*
    Question 2 — Abstract Class with Properties and Constructor

    Task:

    Create a Kotlin program using an abstract class named Employee.
    Your program should:

    Create an abstract class Employee with a constructor parameter name and salary.
    Store both values as properties.
    Add a normal function displayInfo() that prints the employee's name and salary.
    Add an abstract function work().
    Create a Developer class that inherits from Employee.
    Override work() in Developer and print "Developer is writing code".
    Create a Developer object in main() with a name and salary.
    Call both displayInfo() and work(). 
*/

abstract class Employee(val name: String, val salary: Double) {
    fun displayInfo() {
        println("Employee Name   : $name")
        println("Employee Salary : %.2f".format(salary))
    }

    abstract fun work()
}

class Developer(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Developer is writing code")
    }
}

fun main()
{
    val developer = Developer("Rahul Suthar", 200000.00)
    developer.displayInfo()
    developer.work()
}