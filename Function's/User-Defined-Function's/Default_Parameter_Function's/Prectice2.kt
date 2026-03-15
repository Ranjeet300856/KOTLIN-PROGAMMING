/*
Question 2: Simple Interest Calculator with Default Parameters

Write a Kotlin function calculateSimpleInterest(principal: Double,
rate: Double = 5.0, time: Double = 1.0) that calculates and prints
the Simple Interest using the formula:

SI = (principal * rate * time) / 100
*/

fun calculateSimpleInterest(principal: Double, rate: Double = 5.0, time: Double = 1.0)
{
    val simpleInterest = (principal * rate * time) / 100
    println("Simple Interest: %.2f".format(simpleInterest))
}
fun main()
{
    print("Enter Principal : ")
    val principal = readln().trim().toDoubleOrNull()
    print("Enter Rate : ")
    val rate = readln().trim().toDoubleOrNull()
    print("Enter Time : ")
    val time = readln().trim().toDoubleOrNull()
    if(principal == null || rate == null || time == null || principal < 0 || rate < 0 || time < 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }


    calculateSimpleInterest(principal,rate,time)
    print("Using Default Rate and Time: ")
    calculateSimpleInterest(principal)
}