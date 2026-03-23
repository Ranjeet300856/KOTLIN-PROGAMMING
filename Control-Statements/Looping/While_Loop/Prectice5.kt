//Q5th
//Write a Kotlin program using a while loop to check whether a given number is a Palindrome or not.
fun main()
{
    print("Enter a Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number == 0)
    {
        println("Palindrome")
        return
    }

    if(number < 0)
    {
        println("Not Palindrome")
        return
    }

    val originalNumber = number
    var reverse = 0
    while(number != 0)
    {
        reverse = (reverse * 10) + (number % 10)
        number /= 10
    }

    if(originalNumber == reverse) println("Palindrome")
    else println("Not Pelindrome")
}