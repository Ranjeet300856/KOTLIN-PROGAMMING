fun countdown(num: Int)
{
    for(i in num downTo 1)
    {
        println(i)
    }
}
fun main()
{
    //Q10th
    /*
    Write a Kotlin program that defines a function countdown(num: Int) which prints numbers from the given number down to 1.
    Example for 5:
    5
    4
    3
    2
    1
    */

    print("Enter a Number : ")
    var number = readln().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    countdown(number)
}