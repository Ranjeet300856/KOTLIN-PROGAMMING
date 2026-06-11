/*
    Problem Statement
    Create a Kotlin Higher Order Function named createAdder.

    The function should:
    1. Return a Lambda.
    2. The returned Lambda should take two Int parameters.
    3. The Lambda should return the sum of both numbers.

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take two integers from the user.
    - Call the returned Lambda and print the result.
    - Handle negative numbers correctly.
*/

fun createAdder(): (Int, Int) -> Int
{
    return {
        number1: Int, number2: Int ->
        number1 + number2
    }
}

fun main()
{
   print("Enter First Number  : ")
   val number1 = readln().trim().toIntOrNull()
   print("Enter Second Number : ")
   val number2 = readln().trim().toIntOrNull()
   if(number1 == null || number2 == null)
   {
        println("Invalid Number")
        return
   }

   val result = createAdder()
   println("Sum = ${result(number1, number2)}")
}