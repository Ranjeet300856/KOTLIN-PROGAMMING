//Q5th
//Write a Kotlin program to check whether a number is a palindrome or not using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    var input = readln().trim().toIntOrNull()
    if(input == null)
    {
        println("Invalid Input")
        return
    }

    if(input < 0)
    {
        println("Not Palindrome")
        return
    }

    val originalNumber = input
    var number = input
    var reverse = 0
    do
    {
        reverse = (reverse * 10) + (number % 10)
        number /= 10
    }while(number != 0)

    if(originalNumber == reverse) println("Palindrome")
    else println("Not Palindrome")
}