/*
    Question 5: Employee Salary Management Using HashMap
    Problem Statement:
    Create a Kotlin program to manage employee salaries using HashMap.

    Requirements:
    1. Ask the user to enter the total number of employees.
    2. Read employee details:
       - Employee ID (Int)
       - Salary (Double)

    3. Employee ID must be unique.
       - If a duplicate ID is entered, display an appropriate message
         and ask for that employee's details again.

    4. Salary must be greater than 0.
    5. After all employee details are entered, display:
       - All Employee IDs with their Salaries.
       - Highest Salary.
       - Lowest Salary.
       - Average Salary.
*/

fun main()
{
    print("Enter the total number of employees : ")
    val totalEmployees = readln().trim().toIntOrNull()
    if(totalEmployees == null || totalEmployees <= 0)
    {
        println("Invalid Input!")
        return
    }

    val employees = HashMap<Int, Double>()
    for(i in 1..totalEmployees)
    {
        while(true)
        {
            print("Enter Employee ID     : ")
            val employeeId = readln().trim().toIntOrNull()
            print("Enter Employee Salary : ")
            val employeeSalary = readln().trim().toDoubleOrNull()
            if(employeeId == null || employeeSalary == null || employeeId <= 0 || employeeSalary <= 0)
            {
                println("Invalid Input! Try Again")
                continue
            }

            if(employees.containsKey(employeeId))
            {
                println("This employee already registered! Please enter a new employee id")
                continue
            }

            employees.put(employeeId, employeeSalary)
            break
        }
    }

    for((key, value) in employees.entries)
    println("$key :\t%.2f".format(value))

    var highestSalary = 0.0
    var lowestSalary: Double? = null
    var totalSalary = 0.0
    for((key, value) in  employees.entries)
    {
        totalSalary += value
        if(value > highestSalary) highestSalary = value
        if(lowestSalary == null || value < lowestSalary) lowestSalary = value
    }

    val averageSalary = if(employees.size > 0) totalSalary / employees.size else 0.0
    println("Highest Salary : %.2f".format(highestSalary))
    println("Lowest Salary  : %.2f".format(lowestSalary))
    println("Average Salary : %.2f".format(averageSalary))
}