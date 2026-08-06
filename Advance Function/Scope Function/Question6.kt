//Create a Kotlin program to generate an employee salary summary using the `with` scope function.
class Employee(val employeeName: String, var employeeSalary: Double)
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
    val employeeName = inputString("Employee Name")
    val salary = inputDouble("Monthly Salary")
    val employee = Employee(employeeName, salary)

    val summary = with(employee) {
        val hRA = (employeeSalary * 20) / 100
        val dA = (employeeSalary * 10) / 100
        val pF = (employeeSalary * 12) / 100
        val grossSalary = employeeSalary + hRA + dA
        val netSalary = grossSalary - pF

        """
        Employee Name : $employeeName
        Basic Salary  : ${"%.2f".format(employeeSalary)}
        HRA           : ${"%.2f".format(hRA)}
        DA            : ${"%.2f".format(dA)}
        PF            : ${"%.2f".format(pF)}
        Gross Salary  : ${"%.2f".format(grossSalary)}
        Net Salary    : ${"%.2f".format(netSalary)}
        """.trimIndent()
    }

    println(summary)
}