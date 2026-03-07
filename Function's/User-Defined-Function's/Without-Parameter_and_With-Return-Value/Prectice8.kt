fun getTotalSalary(): Int
{
    val basicSalary = 25000
    val bonusPercent = 20
    val bonusAmount = basicSalary * bonusPercent / 100
    val totalSalary = basicSalary + bonusAmount
    return totalSalary
}
fun main()
{
    //Q8th
    /*
    Write a Kotlin program that defines a function getTotalSalary() which takes no parameters but returns the total salary of an employee after adding a bonus.
    Inside the function define:
    basicSalary = 25000
    bonusPercent = 20
    First calculate the bonus amount, then calculate the total salary.
    */

    val totalSalary = getTotalSalary()
    println("Total Salary = $totalSalary")
}