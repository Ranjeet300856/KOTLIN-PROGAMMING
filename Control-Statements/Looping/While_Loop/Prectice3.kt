//Q3rd
//Write a Kotlin program using a while loop to count how many digits are present in a given number.
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
        println("Digits = ${1}")
        return
    }

    number = kotlin.math.abs(number)
    var count = 0
    while(number != 0)
    {
        number /= 10
        count++
    }

    println("Digits = $count")
}