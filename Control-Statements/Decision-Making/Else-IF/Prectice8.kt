//Q8th
/*
    Write a Kotlin program that calculates the bonus of an employee based on their salary and years of experience using an else-if ladder.
    Inputs:
    Salary (integer)
    Years of Experience (integer)

    Bonus Rules:
    If salary ≥ 50000 and experience ≥ 5 →
    "Bonus: 20%"
    Else if salary ≥ 30000 and experience ≥ 3 →
    "Bonus: 10%"
    Else if salary ≥ 20000 and experience ≥ 1 →
    "Bonus: 5%"
    Else →
    "No Bonus"
*/

fun main()
{
    print("Enter Salary : ")
    val salary = readln().trim().toIntOrNull()
    print("Enter Experience : ")
    val experience = readln().trim().toIntOrNull()
    if(salary == null || experience == null || salary < 0 || experience < 0)
    {
        println("Invalid Input")
        return
    }

    if(salary >= 50000 && experience >= 5) println("Bonus: 20%")
    else if(salary >= 30000 && experience >= 3) println("Bonus: 10%")
    else if(salary >= 20000 && experience >= 1) println("Bonus: 5%")
    else println("No Bonus")
}