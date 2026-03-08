fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double
{
    return (principal * rate * time) / 100
}
fun main()
{
    //Q9th
    /*
    Write a Kotlin program that defines a function calculateSimpleInterest(principal: Double, rate: Double, time: Double)
    which takes three parameters and returns the Simple Interest.
    Use the formula:
    Simple Interest = (principal × rate × time) / 100
    The program should call this function from main() and print the returned result.
    */

    print("Enter Principal : ")
    val principal = readln().trim().toDoubleOrNull()
    print("Enter Rate      : ")
    val rate = readln().trim().toDoubleOrNull()
    print("Enter Time      : ")
    val time = readln().trim().toDoubleOrNull()
    if(principal == null || rate == null || time == null)
    {
        println("Input is Empty or Invalid Input")
        return
    }

    val simpleInterest = calculateSimpleInterest(principal, rate, time)
    println("Simple Interest = $simpleInterest")
}