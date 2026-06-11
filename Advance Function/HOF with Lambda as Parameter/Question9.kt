/*
    Question 9 — Employee Salary Processor using Higher Order Function and Lambda
    Problem Statement

    Create a Kotlin program where:

    You create a Higher Order Function named processSalary.
    The function should:
    take one employee salary (Double)
    take one Lambda parameter for processing
    The Lambda should perform different salary-related operations. 
*/

fun processSalary(salary: Double, processing: (Double) -> Double): Double = processing(salary)
fun processSalaryCategory(salary: Double, processing: (Double) -> String): String = processing(salary)

fun main()
{
    print("Enter Monthly Salary : ")
    val salary = readln().trim().toDoubleOrNull()
    if(salary == null || salary <= 0)
    {
        println("Invalid Salary")
        return
    }

    val annualSalary = { monthlySalary: Double -> monthlySalary * 12 }
    val bonus10Pct = { monthlySalary: Double -> monthlySalary * 10 / 100 }
    val fullSalary = { monthlySalary: Double -> processSalary(monthlySalary, bonus10Pct) + monthlySalary }
    val salaryCategory = { 
        monthlySalary: Double ->
        when
        {
            monthlySalary >= 100000 -> "High Income"
            monthlySalary >= 50000 -> "Medium Income"
            else -> "Low Income"
        }
    }

    println("\nAnnual Salary      : %.2f".format(processSalary(salary, annualSalary)))
    println("Bonus Amount       : %.2f".format(processSalary(salary, bonus10Pct)))
    println("Salary After Bonus : %.2f".format(processSalary(salary, fullSalary)))
    println("Salary Category    : ${processSalaryCategory(salary, salaryCategory)}")
}