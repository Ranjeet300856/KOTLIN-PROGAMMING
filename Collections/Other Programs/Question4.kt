//Create a Kotlin program to process employee salaries using Lambda with Collections / Collection Higher-Order Functions.
fun inputInteger(text: String): Int 
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
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

fun newSalary(salary: Double, percentage: Int): Double = salary + salary * percentage / 100
fun getPercentage(salary: Double): Int
{
    if(salary >= 50000.0) return 5
    else if(salary >= 20000.0) return 10
    else return 15
}

fun main()
{
    var totalEmployees = inputInteger("The Number of Employees")
    val salaries = mutableListOf<Double>()
    for(i in 1..totalEmployees)
    {
        val salary = inputDouble("Employee $i Salary")
        salaries.add(salary)
    }

    var x = 0
    var totalOriginalSalary = 0.0
    var totalUpdatedSalary = 0.0
    val updatedSalaries = salaries.map { 
        val percentage = getPercentage(it)
        newSalary(it, percentage)
     }

     println("\n----- Updated Salaries -----")
     
     for(salary in salaries)
     {
        println("\nEmployee ${x+1}")
        println("Original Salary : %.2f".format(salary))
        println("Increment       : ${getPercentage(salary)}%")
        println("Updated Salary  : %.2f".format(updatedSalaries[x]))

        totalOriginalSalary += salary
        totalUpdatedSalary += updatedSalaries[x]
        x++
     }

     var totalIncreasedSalary = totalUpdatedSalary - totalOriginalSalary

     println("\n----- Salary Summary -----")
     println("Total Employees       : $totalEmployees")
     println("Total Original Salary : %.2f".format(totalOriginalSalary))
     println("Total Updated Salary  : %.2f".format(totalUpdatedSalary))
     println("Total Increase        : %.2f".format(totalIncreasedSalary))
}