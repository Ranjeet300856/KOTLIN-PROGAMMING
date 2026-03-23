//Q8th
//Write a Kotlin program using a while loop to check whether a given number is a Prime number or not.
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    if(number <= 1)
    {
        println("Not Prime")
        return
    }

    var i = 2
    while(i * i <= number)
    {
        if(number % i == 0)
        {
            println("Not Prime")
            return
        }
        i++
    }

    println("Prime")
}