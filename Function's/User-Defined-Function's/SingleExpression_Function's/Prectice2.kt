fun isEven(n: Int): Boolean = n % 2 == 0
fun main()
{
    //Q2nd
    /*
    Write a Kotlin program that defines a Single Expression Function named isEven.
    The function should:
    Take one integer parameter n
    Return true if the number is even
    Return false if the number is odd
    After defining the function:
    Read an integer from the user
    Call the function
    Print whether the number is Even or Odd
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(isEven(number)) println("$number is Even")
    else println("$number is Odd")
}