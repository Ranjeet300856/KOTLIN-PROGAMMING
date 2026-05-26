/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Calculate Bonus Salary
    Calculate Tax Deduction
    Calculate Double Salary
    Calculate Half Salary

    Create a Higher Order Function
    Create a function named: getSalaryOperation()
    that:
    takes a Char parameter
    returns a function 
*/

//Calculation Function
fun calculateBonus(salary: Double): Double = salary + (salary * 20) / 100
fun calculateTexDeducation(salary: Double): Double =  salary - (salary * 10) / 100
fun calculateDoubleSalary(salary: Double): Double = salary * 2
fun calculateHalfSalary(salary: Double): Double = salary / 2
fun invalidChoice(salary: Double): Double = -1.0

//Higher Order Function
fun getSalaryOperation(ch: Char): (Double) -> Double
{
    when
    {
        ch == 'b' -> return ::calculateBonus
        ch == 't' -> return ::calculateTexDeducation
        ch == 'd' -> return ::calculateDoubleSalary
        ch == 'h' -> return ::calculateHalfSalary
        else -> return ::invalidChoice
    }
}

//Main Function
fun main()
{
    print("Enter Salary : ")
    val salary = readln().trim().toDoubleOrNull()
    if(salary == null || salary < 0)
    {
        println("Invalid Salary")
        return
    }

    println("B. -> Calculate Bonus")
    println("T. -> Calculate Tex Deducation")
    println("D. -> Calculate Double Salary")
    println("H. -> Calculate Half Salary")

    print("\nEnter your choice (B, T, D, H) : ")
    val input = readln().trim().lowercase()
    if(input.isBlank() || input.length != 1)
    {
        println("Invalid Input")
        return
    }

    val ch: Char = input[0]
    val salaryOperation = getSalaryOperation(ch)
    val updatedSalary = salaryOperation(salary)

    if(updatedSalary == -1.0) println("Invalid Choice")
    else println("Updated Salary : $updatedSalary")
}