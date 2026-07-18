//Create a Kotlin program to manage employee salary information using Single Inheritance.
open class Employee(val employeeName: String, val employeeId: Int, protected var basicSalary: Double)
{
    fun displayEmployeeDetails()
    {
        println("Employee Name   : $employeeName")
        println("Employee Id     : $employeeId")
        println("Employee Salary : %.2f".format(basicSalary))
    }
}

class SalaryDetails(
    val hRA: Double, 
    val dA: Double, 
    employeeName: String, 
    employeeId: Int, 
    basicSalary: Double
) : Employee(employeeName, employeeId, basicSalary)
{
    private fun calculateGrossSalary(): Double = basicSalary + hRA + dA
    fun displaySalaryDetails()
    {
        println("\nHRA          : %.2f".format(hRA))
        println("DA           : %.2f".format(dA))
        println("Gross Salary : %.2f".format(calculateGrossSalary()))
    }
}

fun inputEmployeeName(): String
{
    while(true)
    {
        print("Enter Employee Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun inputEmployeeId(): Int
{
    while(true)
    {
        print("Enter Employee ID : ")
        val inputId = readln().trim().toIntOrNull()
        if(inputId == null || inputId <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputId
    }
}

fun inputSalary(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val employeeName = inputEmployeeName()
    val employeeId = inputEmployeeId()
    val basicSalary = inputSalary("Basic Salary")
    val hRA = inputSalary("HRA")
    val dA = inputSalary("DA")

    val employee = SalaryDetails(hRA, dA, employeeName, employeeId, basicSalary)
    employee.displayEmployeeDetails()
    employee.displaySalaryDetails()
}