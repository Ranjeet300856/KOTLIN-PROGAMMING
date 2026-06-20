/*
        Question 4: Inline Number Validator with Early Exit
        Problem Statement:
        Create a Kotlin program to develop an Inline Number Validation System using Inline Lambda.
        Requirements:
        1. Create an inline function named validateNumbers().

        2. The function should accept:
        - numbers (List<Int>)
        - validator (Lambda parameter that accepts an Int number and returns Unit)

        3. Inside the inline function:
        - Traverse all numbers using a loop.
        - Pass each number to the lambda validator.

        4. Create a function named checkNumbers().

        5. Inside checkNumbers():
        - Create a list containing multiple numbers.

        6. Call validateNumbers() and pass a lambda.

        7. Inside the lambda:
        - Check each number.
        - If a negative number is found:
            - Display "Invalid Number Found".
            - Use return to immediately exit from checkNumbers().

        8. If all numbers are valid:
        - Display "All Numbers Are Valid".
*/

inline fun validateNumbers(numbers: List<Int>, validator: (Int) -> Unit)
{
    for(value in numbers)
    validator(value)
}

fun checkNumbers()
{
    val numbers = listOf(10, 20, 30, -40, 50)
    validateNumbers(numbers) {
        value: Int ->
        if(value < 0)
        {
            println("Invalid Number Found")
            return
        }
    }

    println("All Numbers Are Valid")
}

fun main()
{
    checkNumbers()
}