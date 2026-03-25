//Q6th
//Write a Kotlin program to calculate the factorial of a number using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number < 0)
    {
        println("Invalid Input")
        return
    }

    if (number > 20) 
    {
        println("Result too large (overflow risk)")
        return
    }

    var factorial = 1L
    var i = 1
    do
    {
        factorial *= i
        i++
    }while(i <= number)
    
    println("Factorial of $number = $factorial")
}