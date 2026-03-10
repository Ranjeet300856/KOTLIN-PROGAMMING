fun simpleInterest(principal: Double, rate: Double, time: Double): Double = (principal * rate * time) / 100
fun main()
{
    //Q7th
    /*
    Write a Kotlin program that defines a Single Expression Function named simpleInterest.
    The function should:
    Take three parameters
    principal (Double)
    rate (Double)
    time (Double)
    Return the Simple Interest
    */

    print("Enter Principal : ")
    val principal = readln().trim().toDoubleOrNull()
    print("Enter Rate      : ")
    val rate = readln().trim().toDoubleOrNull()
    print("Enter Time      : ")
    val time = readln().trim().toDoubleOrNull()
    if(principal == null || rate == null || time == null || principal < 0 || rate < 0 || time < 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    println("Simple Interest = %.2f".format(simpleInterest(principal, rate, time)))
}