/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Check if number is Even
    Check if number is Odd
    Check if number is Positive
    Check if number is Negative
    Create a Higher Order Function

    Create a function named: getValidator()
    that:
    takes a String parameter
    returns a function 
*/

//Validator Function
fun checkEven(number: Int): Boolean = number % 2 == 0
fun checkOdd(number: Int): Boolean = number % 2 != 0
fun checkPositive(number: Int): Boolean = number > 0
fun checkNegative(number: Int): Boolean = number < 0
fun invalidInput(number: Int): Boolean = false

//Higher Order
fun getValidator(input: String): (Int) -> Boolean
{
    val check = when
    {
        input == "even" -> ::checkEven
        input == "odd" -> ::checkOdd
        input == "positive" -> ::checkPositive
        input == "negative" -> ::checkNegative
        else -> ::invalidInput
    }

    return check
}

//Main Function
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    print("What do you want to check? : ")
    val input = readln().trim().lowercase()
    if(input.isBlank())
    {
        println("Invalid Input")
        return
    }

    val validator = getValidator(input)
    println(validator(number))
}