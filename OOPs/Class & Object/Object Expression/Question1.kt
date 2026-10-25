/*
    Write a Kotlin program using an Object Expression to represent an employee without creating a separate named class.
    Your anonymous object must contain the following properties:
    name: Employee's name.
    employeeId: Employee's unique ID.
    salary: Employee's monthly salary.

    It must also contain a function named displayDetails() that displays all employee information in a readable format. 
*/

fun main()
{
    val employee = object {
        val name: String = "Rahul"
        val id: Int = 1001
        val salary: Double = 20000.0

        fun displayDetails() {
            println("Employee Details:")
            println("Employee Name   : $name")
            println("Employee ID     : $id")
            println("Employee Salary : %.2f\n".format(salary))
        }
    }

    employee.displayDetails()

    println("Accessing Individual Properties:")
    println("Employee Name   : ${employee.name}")
    println("Employee ID     : ${employee.id}")
    println("Employee Salary : %.2f\n".format(employee.salary))
}