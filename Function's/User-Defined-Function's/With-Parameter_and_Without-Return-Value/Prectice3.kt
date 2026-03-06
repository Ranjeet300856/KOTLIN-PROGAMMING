fun printTable(num: Int)
{
    for(i in 1..10)
    {
        println("$num x $i = ${num*i}")
    }
}
fun main()
{
    //Q3rd
    /*
    Write a Kotlin program that defines a function printTable(num: Int)
    which prints the multiplication table of the given number from 1 to 10.
     */

     print("Enter a Number from 1 to 10 : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     if(number in 1..10) printTable(number)
     else println("Invalid Number!")
}