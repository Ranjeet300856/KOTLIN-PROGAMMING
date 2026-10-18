//Question 2: Employee Salary Calculator
class SalaryCalculator {
    fun calculateSalary(basicSalary: Int): Int = basicSalary
    fun calculateSalary(basicSalary: Int, bonus: Int): Int = basicSalary + bonus
    fun calculateSalary(basicSalary: Double, bonusPercentage: Double): Double {
        return basicSalary + (basicSalary * bonusPercentage) / 100
    }
}

fun main()
{
    val salaryCalculator = SalaryCalculator()
    
    val basicSalary = salaryCalculator.calculateSalary(20000)
    val basicSalaryWithBonus = salaryCalculator.calculateSalary(20000, 5000)
    val basicSalaryWithBonusPercentages = salaryCalculator.calculateSalary(20000.0, 10.0)

    println("Basic Salary                       : $basicSalary")
    println("Basic Salary with Bonus            : $basicSalaryWithBonus")
    println("Basic Salary with Bonus Percentage : %.2f".format(basicSalaryWithBonusPercentages))
}