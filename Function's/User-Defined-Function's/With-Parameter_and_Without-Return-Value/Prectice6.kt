fun printMax(num1: Int, num2: Int)
{
    if(num1 > num2) println("$num1 is Greater than $num2")
    else if(num2 > num1) println("$num2 is Greater than $num1")
    else println("Numbers are Equal")
}
fun main()
{
    //Q6th
    /*
    Write a Kotlin program that defines a function printMax(a: Int, b: Int) which prints the greater number between the two.
    */
    
    print("Enter 1st Number : ")
    var number1 = readln().toIntOrNull()
    print("Enter 2nd Number : ")
    var number2 = readln().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    printMax(number1,number2)
}