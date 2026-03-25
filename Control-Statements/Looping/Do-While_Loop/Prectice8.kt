//Q8th
//Write a Kotlin program that keeps asking the user to enter a number between 1 and 100 until a valid number is entered using a do-while loop.
fun main()
{
    do
    {
        print("Enter a Number Between 1 - 100 : ")
        val number = readln().trim().toIntOrNull()
        if(number == null)
        {
            println("Invalid Input")
            continue
        }

        if(number >= 1 && number <= 100)
        {
            println("Valid input received: $number")
            break
        }
        else println("Invalid Number")
        
    }while(true)
}