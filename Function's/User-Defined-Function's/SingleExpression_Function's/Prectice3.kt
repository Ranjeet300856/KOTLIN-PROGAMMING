fun maxOfTwo(a: Int, b: Int): Int = if(a > b) a else b
fun main()
{
    //Q3rd
    /*
    Write a Kotlin program that defines a Single Expression Function named maxOfTwo.
    The function should:
    Take two integer parameters a and b
    Return the larger number
    After defining the function:
    Read two integers from the user
    Call the function
    Print the maximum number
    */

    print("Enter First Number  : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter Second Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    println("Maximum Number = ${maxOfTwo(number1, number2)}")
}