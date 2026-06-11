/*
    Question 2: Employee Salary Management System
    Problem Statement - Create a Kotlin program that manages employee salaries using a MutableList<Double>.

    You are given the following salaries:
    25000.0, 32000.0, 18000.0, 45000.0, 15000.0, 50000.0

    Business Rules
    Any salary below 20000.0 should be increased to 20000.0.
    All other salaries should remain unchanged.

    Requirements
    1. Store all salaries in a MutableList<Double>.
    2. Print the original salary list.
    3. Update salaries according to the business rule.
    Example:
    18000.0 -> 20000.0
    15000.0 -> 20000.0
    4. Print the updated salary list.

    5. Count:
    Total Employees
    Number of Salaries Updated
    Number of Salaries Not Updated

    6. Calculate:
    Total Salary Before Update
    Total Salary After Update

    7. Find and print:
    Highest Salary After Update
    Lowest Salary After Update

    8. Print the index positions of all employees whose salary became 20000.0 after the update.
    9. Check whether any employee has salary 50000.0.
    Print an appropriate message.

    10. Create a new MutableList<Double> named:
    highSalaryEmployees
    Store all salaries greater than 30000.0 in this list and print it. 
*/

fun main()
{
    val employeeSalary = mutableListOf(25000.0, 32000.0, 18000.0, 45000.0, 15000.0, 50000.0)

    println("Salary List    : $employeeSalary")

    //Update and Counting
    var countTotalEmployees = employeeSalary.size
    var countUpdatedSalary = 0
    var countNotUpdatedSalary = 0
    var totalSalaryBeforeUpdate = 0.0
    var totalSalaryAfterUpdatate = 0.0
    var highestSalary: Double? = null
    var lowestSalary: Double? = null

    for(value in employeeSalary) totalSalaryBeforeUpdate += value

    for(i in employeeSalary.indices)
    {
        if(employeeSalary[i] < 20000.0)
        {
            employeeSalary[i] = 20000.0
            countUpdatedSalary++
        }
        else countNotUpdatedSalary++

        totalSalaryAfterUpdatate += employeeSalary[i]

        if(highestSalary == null || employeeSalary[i] > highestSalary)
            highestSalary = employeeSalary[i]
        
        if(lowestSalary == null || employeeSalary[i] < lowestSalary)
            lowestSalary = employeeSalary[i]
    }
    
    println("Updated Salary : $employeeSalary")

    println("\nTotal Employees             : $countTotalEmployees")
    println("Total Updated Salary        : $countUpdatedSalary")
    println("Total Not Updated Salary    : $countNotUpdatedSalary")
    println("Total Salary Before Updated : %.2f".format(totalSalaryBeforeUpdate))
    println("Total Salary After Updated  : %.2f".format(totalSalaryAfterUpdatate))
    println("Highest Salary              : %.2f".format(highestSalary))
    println("Lowest Salary               : %.2f".format(lowestSalary))

    print("\nIndex position of whose salary 20000.0 : ")
    for(i in employeeSalary.indices)
        if(employeeSalary[i] == 20000.0) print("$i ")
    
    if(employeeSalary.contains(50000.0)) println("\nSalary 50000.0 exists in the employee salary list.")
    else println("\nSalary 50000.0 does not exist in the employee salary list.")

    val newEmployeeSalaryList = mutableListOf<Double>()
    for(salary in employeeSalary)
        if(salary > 30000.0) newEmployeeSalaryList.add(salary)
    
    println("\nNew List : $newEmployeeSalaryList")
}