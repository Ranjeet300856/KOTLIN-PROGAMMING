class Employee(val employeeName: String, var employeeSalary: Double, var performanceRating: Int)
fun main()
{
    print("Enter Employee Name : ")
    val name = readln().trim()
    print("Enter Monthly Salary : ")
    val salary = readln().trim().toDoubleOrNull()
    print("Enter Performance Rating (1-5) : ")
    val rating = readln().trim().toIntOrNull()
    if(name.isBlank() || salary == null || salary <= 0 || rating == null || rating.toString() !in "12345")
    {
        println("Invalid Input!")
        return
    }

    val employee = Employee(name, salary, rating)
    val bonusPct: Double? = when(rating)
    {
        5 -> 20.0
        4 -> 10.0
        3 -> 5.0
        else -> null
    }

    val result = bonusPct?.let {
        val bonusAmount = employee.employeeSalary * it / 100
        val finalSalary = employee.employeeSalary + bonusAmount
        """
        Bonus Percentage          : ${"%.2f".format(bonusPct)}
        Bonus Amount              : ${"%.2f".format(bonusAmount)}
        Final Salary              : ${"%.2f".format(finalSalary)}
        """.trimIndent()
    }

    if(bonusPct == null) println("The employee is not eligible for a bonus")
    else
    {
        println("\nEmployee Name   : ${employee.employeeName}")
        println(result)
    }
}