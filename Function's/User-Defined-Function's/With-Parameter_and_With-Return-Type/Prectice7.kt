fun isEven(number: Int): Boolean
{
    return number % 2 == 0
}
fun main()
{
    //Q7th
    /*
    Write a Kotlin program that defines a function isEven(number: Int) 
    which takes an integer as a parameter and returns true if the number is even, otherwise false.
    The program should call this function from main() and print whether the number is Even or Odd.
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    if(isEven(number)) println("Number is Even")
    else println("Number is Odd")
}