/*
    Write a Kotlin program that analyzes employee data using Arrays and Kotlin predefined packages.

    Your program should:

    Take names and salaries of 5 employees as input.
    Store:
    Names in a String Array
    Salaries in a Double Array
    Display:
    All Employee Details
    Highest Salary
    Lowest Salary
    Average Salary
    Total Salary Expense
    Search:
    Ask the user for an employee name
    Display whether the employee exists or not
    Display:
    Employee names in Uppercase
    Employee names in Lowercase
    Print a professional report. 
*/

fun main()
{
    //Array Creation
    val employee = arrayOfNulls<String?>(5)
    val salaries = DoubleArray(5) { 0.0 }

    //Input Employee Names and Salaries
    for(i in employee.indices)
    {
        while(true)
        {
            //Input Employee Name and Validation
            print("Enter Name of Employee ${i + 1}   : ")
            val name = readln().trim()
            if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()})
            {
                println("Invalid Name! Try Again")
                continue
            }

            //Input Employee Salary and Validation
            print("Enter Salary of Employee ${i + 1} : ")
            val salary = readln().trim().toDoubleOrNull()
            if(salary == null || salary <= 0)
            {
                println("Invalid Salary! Try Again")
                continue
            }

            employee[i] = name
            salaries[i] = salary
            break
        }

        println()
    }

    //Calulation
    var highestSalary = salaries[0]
    var lowestSalary = salaries[0]
    var totalSalary = 0.0

    for(salary in salaries)
    {
        totalSalary += salary
        if(salary > highestSalary) highestSalary = salary
        if(salary < lowestSalary) lowestSalary = salary
    }

    val averageSalary = totalSalary / salaries.size

    //Output
    println("\n-------- Employee Salary Report --------\n")

    println("Employee Details: ")
    for(i in employee.indices)
        println("${employee[i]} -> %.2f".format(salaries[i]))
    
    println("\nHighest Salary       : %.2f".format(highestSalary))
    println("Lowest Salary        : %.2f".format(lowestSalary))
    println("Average Salary       : %.2f".format(averageSalary))
    println("Total Salary Expense : %.2f".format(totalSalary))

    println("\nUppercase Names : ")
    for(value in employee)
    {
        if(value != null)
        println(value.uppercase())
    }

    println("\nLowercase Names : ")
    for(value in employee)
    {
        if(value != null)
        println(value.lowercase())
    }
    println()

    var searchEmployee: String? = null
    while(true)
    {
        print("Enter Search Employee : ")
        searchEmployee = readln().trim()
        if(searchEmployee.isBlank())
        {
            println("Invalid Input!")
            continue
        }
        break
    }

    var isFound = false
    for(value in employee)
    {
        if(value != null)
        {
            if(value.lowercase() == searchEmployee.lowercase())
            {
                println("Employee Found")
                isFound = true
                break
            }
        }
    }
    if(!isFound) println("Employee Not Found")
}