//Create a Kotlin program to manage an employee salary system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName                    : $personName")
        println("Age                     : $personAge")
    }        
}

open class Employee(
    protected val employeeId: Int,
    var department: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayEmployeeDetails()
    {
        displayPersonDetails()
        println("Employee ID             : $employeeId")
        println("Department              : $department")
    }
}

class SalaryEmployee(
    private var basicSalary: Double,
    var yearOfExperience: Int,
    employeeId: Int,
    department: String,
    personName: String,
    personAge: Int
) : Employee(employeeId, department, personName, personAge)
{
    fun displaySalaryDetails()
    {
        displayEmployeeDetails()
        println("Basic Salary            : %.2f".format(basicSalary))
        println("Year of Experience      : $yearOfExperience")

        val bonus = calculateBonus()
        val tex = calculateTax()
        val netSalary = basicSalary + ((basicSalary * bonus) / 100) - ((basicSalary * tex) / 100)

        println("Bonus                   : %.2f%%".format(bonus))
        println("Tex                     : %.2f%%".format(tex))
        println("Net Salary              : %.2f".format(netSalary))
    }

    private fun calculateBonus(): Double = if(yearOfExperience >= 5) 20.0 else 10.0
    private fun calculateTax(): Double = if(basicSalary >= 50000) 8.0 else 3.0
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val personName = inputString("Employee Name")
    val personAge = inputInteger("Employee Age")
    val employeeId = inputInteger("Employee ID")
    val department = inputString("Employee Department")
    val basicSalary = inputDouble("Basic Salary")
    val yearOfExperience = inputInteger("Year Of Experience")

    val salaryEmployee = SalaryEmployee(basicSalary, yearOfExperience, employeeId, department, personName, personAge)
    salaryEmployee.displaySalaryDetails()
}