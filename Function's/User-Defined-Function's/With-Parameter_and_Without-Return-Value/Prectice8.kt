fun printPattern(num: Int)
{
    for(i in 1..num)
    {
        for(j in 1..i)
        {
            print("$j ")
        }
        println()
    }
}
fun main()
{
    //Q8th
    /*
    Write a Kotlin program that defines a function printPattern(n: Int) which prints the following pattern up to n.
    Example for n = 4:
    1
    12
    123
    1234
    */

    print("Enter a Number : ")
    var number = readln().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    printPattern(number)
}