/*
    Create an interface named Employee with the following properties and functions:

    1. Properties

    Declare an abstract read-only property name of type String.
    Declare an abstract read-only property salary of type Double.
    Declare a read-only property employeeType of type String with a custom getter that returns "Full-Time Employee".

    2. Function

    Declare an abstract function displayDetails().

    3. Developer Class

    Create a class named Developer that implements the Employee interface. 
*/

interface Employee {
    val name: String
    val salary: Double
    val employeeType: String
        get() = "Full Time Employee"

    fun displayDetails()
}

class Developer(employeeName: String, employeeSalary: Double) : Employee {
    override val name = employeeName
    override val salary = employeeSalary

    override fun displayDetails() {
        println("Employee Name   : $name")
        println("Employee Salary : %.2f".format(salary))
        println("Employee Type   : $employeeType\n")
    }
}

fun main()
{
    val develpoer1 = Developer("Ranjeet Suthar", 50000.0)
    val develpoer2 = Developer("Rahul Suthar", 40000.0)

    develpoer1.displayDetails()
    develpoer2.displayDetails()
}