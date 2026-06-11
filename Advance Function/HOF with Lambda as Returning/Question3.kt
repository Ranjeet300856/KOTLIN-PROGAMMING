/*
    Problem Statement
    Create a Kotlin Higher Order Function named createBonusCalculator.

    The function should:
    1. Return a Lambda.
    2. The returned Lambda should take one Double parameter (employee salary).
    3. The Lambda should calculate and return a 10% bonus.

    Formula:
    Bonus = Salary * 0.10

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take salary input from the user.
    - Salary must be a positive number.
    - Print the calculated bonus.
    - Handle decimal values correctly.
*/

fun createBonusCalculator(): (Double) -> Double
{
    return {
        salary: Double -> 
        salary * 0.10
    }
}

fun main()
{
    print("Enter Employee Salary : ")
    val salary = readln().trim().toDoubleOrNull()
    if(salary == null || salary <= 0)
    {
        println("Invalid Input")
        return
    }

    val bonus = createBonusCalculator()
    println("Bonus : %.2f".format(bonus(salary)))
}