/*
    Problem Statement:
    Create a Kotlin program to develop an Employee Information System using a Primary Constructor.

    Requirements:
    1. Create a class named Employee.
    2. Use a Primary Constructor to initialize the following properties:
       - Employee ID (Int)
       - Employee Name (String)
       - Employee Salary (Double)

    3. Use appropriate val or var according to the nature of each property.
    4. Create a member function named displayEmployeeDetails() that displays
       all employee information in a clean format.

    5. Create at least 3 Employee objects with different data.
    6. Call displayEmployeeDetails() for each object.
*/

class Employee(val employeeId: Int, val employeeName: String, var employeeSalary: Double)
{
    fun displayEmployeeDetails()
    {
        println("\nEmployee Name   : $employeeName")
        println("Employee ID     : $employeeId")
        println("Employee Salary : %.2f".format(employeeSalary))
    }
}

fun main()
{
    var employee1 = Employee(1001, "Ranjeet Suthar", 200000.0)
    var employee2 = Employee(1002, "Saloni Suthar", 200000.0)
    var employee3 = Employee(1003, "Rahul Suthar", 100000.0)

    employee1.displayEmployeeDetails()
    employee2.displayEmployeeDetails()
    employee3.displayEmployeeDetails()
}