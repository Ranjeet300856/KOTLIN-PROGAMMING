//Q6th
/*
    Write a Kotlin program that continuously takes user input.
    Stop the loop when the user enters 0 using break.
*/

fun main()
{
    do 
    {
        print("Enter a Number : ")
        val number = readln().trim().toIntOrNull()
        if(number == null)
        {
            println("Invalid Input")
            continue
        }

        if(number == 0)
        {
            println("Loop Exit Successfully")
            break
        }
    }while(true)
}