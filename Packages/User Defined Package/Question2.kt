/*
    Question 2 — Multiple Files in Same Package

    Problem Statement
    Create a Kotlin program that demonstrates how multiple Kotlin files can belong to the same User Defined Package.

    Requirements
    1. Create a package named: employee
    2. Inside this package, create TWO different Kotlin files
    File 1
    Create a function: getEmployeeName()
    This function should:
    take employee name as parameter
    return the employee name

    File 2
    Create a function:
    getEmployeeSalary()
    This function should:
    take employee salary as parameter
    return the employee salary

    3. Create another Kotlin file for main() function
    4. Import both functions from the package
    5. Take input from the user
    Take:
    employee name
    employee salary
    6. Display Output
    Employee Name     : value
    Employee Salary   : value 
*/

import employee.getEmployeeName
import employee.getEmployeeSalary

fun main()
{
    print("Enter Employee Name   : ")
    val employeeName = readln().trim()

    print("Enter Employee Salary : ")
    val salary = readln().trim().toDoubleOrNull()

    if(employeeName.isBlank() || salary == null || salary < 0)
    {
        println("Invalid Input")
        return
    }

    val name = getEmployeeName(employeeName)
    val employeeSalary = getEmployeeSalary(salary)

    println("Employee Name   : $name")
    println("Employee Salary : %.2f".format(employeeSalary))
}