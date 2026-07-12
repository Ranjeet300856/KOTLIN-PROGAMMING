/*
    Question 2: Employee Salary Management Using Visibility Modifiers
    Problem Statement:
    Create a Kotlin program to manage employee salary information
    using appropriate Visibility Modifiers.
*/

class Employee(val employeeId: Int, val employeeName: String, val employeeDepartment: String, private var employeeSalary: Double)
{
    fun displayEmployeeDetails()
    {
        println("Employee ID         : $employeeId")
        println("Employee Name       : $employeeName")
        println("Employee Department : $employeeDepartment")
        println("Employee Salary     : %.2f\n".format(employeeSalary))
    }

    fun updateSalary(newSalary: Double)
    {
        if(newSalary > 0)
        {
            employeeSalary = newSalary
            println("Salary updated successfully")
        }
        else println("Invalid salary! Salary must be greater than 0.")
    }

    fun increaseSalary(percent: Double)
    {
        if(percent > 0)
        {
            employeeSalary += employeeSalary * percent / 100
            println("Employee salary incresed successfully")
        }
        else println("Invalid percentage.")
    }
}

fun main()
{
    val employee = Employee(1001, "Ranjeet Suthar", "Software Development", 200000.00)
    employee.displayEmployeeDetails()
    employee.increaseSalary(10.0)
    employee.displayEmployeeDetails()
    employee.updateSalary(250000.0)
    employee.displayEmployeeDetails()
    employee.updateSalary(-20000.0)
    employee.increaseSalary(0.0)
    employee.displayEmployeeDetails()
}