/*
    Question 7: Inline User Authentication System with crossinline Security Check
    Problem Statement:
    Create a Kotlin program to develop an Inline User Authentication System using Inline Lambda and crossinline parameter.
    Requirements:
    1. Create an inline function named authenticateUser().
    2. The function should accept two lambda parameters:
       - startAuthentication (Normal Inline Lambda)
       - securityCheck (crossinline Lambda)

    3. Inside authenticateUser():
       - Execute the startAuthentication lambda.
       - Execute the securityCheck lambda.

    4. Create a function named loginUser().
    5. Inside loginUser():
       - Call authenticateUser() and pass both lambdas.

    6. Inside securityCheck lambda:
       - Display a security verification message.
       - Try to use return to exit from loginUser() and observe the compiler error.

    7. After observing the error:
       - Remove the return statement.
       - Complete the program successfully.
*/

inline fun authenticateUser(startAuthentication: () -> Unit, crossinline securityCheck: () -> Unit)
{
    startAuthentication()
    securityCheck()
}

fun loginUser()
{
    authenticateUser(
        {
            println("Authentication Started")
        }
    ) {
        println("Security Verification Completeds")
    }
}

fun main()
{
    loginUser()
}