/*
    Question 2: Employee Information Management System
    Problem Statement
    Create a Kotlin program to develop an Employee Information Management System using Class and Regular Objects. 
*/

class Employee
{
    var employeeId = 0
    var employeeName = ""
    var departmentName = ""
    var employeeSalary = 0.0
    var isPermanent = false

    fun displayEmployeeInfo()
    {
        println("\n----------- Employee Information -----------\n")
        println("Employee ID     : $employeeId")
        println("Employee Name   : $employeeName")
        println("Department      : $departmentName")
        println("Salary          : %.2f".format(employeeSalary))
        println("Permanent       : $isPermanent")
    }
}

fun main()
{
    val employee1 = Employee()
    val employee2 = Employee()

    employee1.employeeId = 101
    employee1.employeeName = "Ranjeet Suthar"
    employee1.departmentName = "Software Development"
    employee1.employeeSalary = 200000.00
    employee1.isPermanent = true

    employee2.employeeId = 102
    employee2.employeeName = "Saloni Suthar"
    employee2.departmentName = "Web Development"
    employee2.employeeSalary = 100000.00
    employee2.isPermanent = true

    employee1.displayEmployeeInfo()
    employee2.displayEmployeeInfo()
}