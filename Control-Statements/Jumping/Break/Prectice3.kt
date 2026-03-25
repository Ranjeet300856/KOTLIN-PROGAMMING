//Q3rd
/*
    Write a Kotlin program that takes a number as input and checks if it appears in the range 1 to 100.
    Stop the loop immediately once the number is found using break. 
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    var found = false
    for(i in 1..100)
    {
        if(i == number)
        {
            println("Number is available in range 1 to 100")
            found = true
            break
        }
    }

    if(!found) println("Number is not available in range")
}