/*
Question 3: Employee Salary Calculator using Default Parameters

This program calculates an employee's total salary.
The function uses a default parameter for bonus and is
called using named arguments to demonstrate Kotlin features.
*/

fun calculateSalary(employeeName: String, salary: Double, bonus: Double = 0.0)
{
    println("Employee Name: $employeeName")
    println("Total Salary: %.2f".format(salary + bonus))
}

fun main()
{
    print("Enter Employee Name : ")
    val employeeName = readln().trim()
    print("Enter Base Salary   : ")
    val salary = readln().trim().toDoubleOrNull()
    if(employeeName.isBlank() || !employeeName.all { it.isLetter() || it.isWhitespace() } || salary == null || salary <= 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    calculateSalary(employeeName = employeeName, salary = salary)
}