/*
    Create a Kotlin program where:

    You have separate normal functions for:
    Calculate Annual Salary
    Calculate Monthly Salary
    Generate Employee ID
    Generate Employee Report

    Create a Higher Order Function
    Create a function named: getEmployeeProcessor()
    that:
    takes a String parameter
    returns a function 
*/

fun calculateAnnualSalary(name: String, salary: Double, experience: Int): String = "Annual Salary : ${"%.2f".format(salary * 12)}"
fun calculateMonthlySalary(name: String, salary: Double, experience: Int): String = "Monthly Salary : ${"%.2f".format(salary)}"
fun generateEmployeeID(name: String, salary: Double, experience: Int): String
{
    var employeeID = StringBuilder()
    if(name.length < 3) employeeID.append(name.uppercase() + experience.toString())

    else
    {
        for(i in 0..2)
        employeeID.append(name[i])
    
        employeeID.append(experience.toString())
    }

    return employeeID.toString().uppercase()
}

fun employeeReport(name: String, salary: Double, experience: Int): String
{
    return """
    Employee Report
    ----------------

    Name          : $name
    Salary        : ${"%.2f".format(salary)}
    Experience    : $experience Years
    ${calculateAnnualSalary(name, salary, experience)}
    """.trimIndent()
}

fun invalidChoice(name: String, salary: Double, experience: Int): String = "Invalid Operation"

fun getEmployeeProcessor(operation: String): (String, Double, Int) -> String
{
    return when(operation.lowercase())
    {
        "annual" -> ::calculateAnnualSalary
        "monthly" -> ::calculateMonthlySalary
        "id" -> ::generateEmployeeID
        "report" -> ::employeeReport
        else -> ::invalidChoice
    }
}

fun main()
{
    print("Enter Employee Name  : ")
    val employeeName = readln().trim()
    print("Enter Monthly Salary : ")
    val monthlySalary = readln().trim().toDoubleOrNull()
    print("Enter Emoloyee Experience (Years) : ")
    val experience = readln().trim().toIntOrNull()
    if(employeeName.isBlank() || monthlySalary == null || monthlySalary < 0 || experience == null || experience < 0)
    {
        println("Invalid Input")
        return
    }

    println("\n1. Calculate Annual Salary (annual)")
    println("2. Calculate Monthly Salary (monthly)")
    println("3. Generate Employee ID (id)")
    println("4. Employee Report (report)")

    print("\nEnter your choice (annual, monthly, id, report) : ")
    val choice = readln().trim()
    if(choice.isBlank())
    {
        println("Invalid Choice")
        return
    }

    val employeeProcessor = getEmployeeProcessor(choice)
    val output = employeeProcessor(employeeName, monthlySalary, experience)
    println(output)
}