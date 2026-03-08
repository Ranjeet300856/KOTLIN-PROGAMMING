fun calculateAverage(a: Double, b: Double, c: Double): Double
{
    val total = a + b + c 
    val average = total / 3.0
    return average
}
fun main()
{
    //Q2nd
    /*
    Write a Kotlin program that defines a function calculateAverage(a: Int, b: Int, c: Int)
    which takes three parameters and returns the average of the three numbers.
    The program should call this function from main() and print the returned result.
    */

    print("Enter 1st Number : ")
    val number1 = readln().trim().toDoubleOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toDoubleOrNull()
    print("Enter 3rd Number : ")
    val number3 = readln().trim().toDoubleOrNull()
    if(number1 == null || number2 == null || number3 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    val average = calculateAverage(number1, number2, number3)
    println("Average = %.2f".format(average))
}