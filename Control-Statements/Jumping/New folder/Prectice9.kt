// Q9: Find the smallest divisor greater than 1 using break

fun main() 
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if (number == null || number <= 1) 
    {
        println("Invalid Input")
        return
    }

    for (i in 2..number) 
    {
        if (number % i == 0) {
            println("Smallest divisor is: $i")
            break
        }
    }
}