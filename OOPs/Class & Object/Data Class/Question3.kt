/*
    Question 3 — Employee Information

    Create a Kotlin data class named Employee with the following properties:
    - id: Int
    - name: String
    - department: String
    - salary: Double

    Create an Employee object.

    Use destructuring declaration to extract all four properties
    into separate variables.

    Print each extracted value with an appropriate label.

    Requirements:
    - Use destructuring declaration.
    - Do not access the Employee object's properties directly
      while printing the extracted values.
    - Do not manually implement componentN() functions.
*/

data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    var salary: Double
)

fun main()
{
    val employee = Employee(101, "Rahul Suthar", "Software Development", 60000.0)
    val (id, name, department, salary) = employee
    println("Employee ID         : $id")
    println("Employee Name       : $name")
    println("Employee Department : $department")
    println("Employee Salary     : %.2f".format(salary))
}