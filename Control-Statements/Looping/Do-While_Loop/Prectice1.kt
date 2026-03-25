//Q1st
//Write a Kotlin program to print numbers from 1 to N using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    var i = 1
    do
    {
        print("$i ")
        i++
    }while(i <= number)
}