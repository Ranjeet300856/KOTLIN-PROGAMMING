/*
    Question 3 — Lambda Without Parameters but With Return Value
    Problem Statement - Write a Kotlin program that demonstrates a Lambda Function:
    Without Parameters
    With Return Value

    Your program should:
    Create a lambda that returns a welcome message.
    Store the lambda inside a variable.
    Call the lambda and store the returned value in another variable.
    Print the returned value properly.

    Also create the same functionality using a normal function for comparison. 
*/

fun functionMessage(): String
{
    val message = "Welcome to Kotlin"
    return message
}

fun main()
{
    //Create Lambda Function
    val lambdaMessage = { "Welcome to Kotlin" }

    val messageFromLambda = lambdaMessage()     //Call Lambda Function
    val messageFromNormalFun = functionMessage() //Call Normal Function

    println("Message from Lambda Function : $messageFromLambda")
    println("Message from Normal Function : $messageFromNormalFun")
}