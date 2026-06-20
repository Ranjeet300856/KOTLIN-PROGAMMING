/*
    Question 1: Inline Greeting and Action Executor
    Problem Statement:
    Create a Kotlin program to develop an Inline Greeting and Action Executor System.

    Requirements:
    1. Create an inline function named executeAction().
    2. The function should accept two parameters:
       - userName (String)
       - action (Lambda parameter that returns Unit)

    3. Inside the inline function:
       - Display a welcome message using the user's name.
       - Execute the lambda action.
       - Display a completion message after the action execution.

    4. In the main() function:
       - Call executeAction() multiple times with different users.
       - Pass different lambda actions for each user.
*/

fun inputName(): String
{
    while(true)
    {
        print("\nEnter Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Name! Try Again")
            continue
        }
        else return name
    }
}

inline fun executeAction(username: String, action: () -> Unit)
{
    println("Good Morning $username")
    action()
    println("Good Nigth $username")
}

fun main()
{
    val name1 = inputName()
    executeAction(name1) {
        println("Hello Everyone, I Am User 1")
    }

    val name2 = inputName()
    executeAction(name2) {
        println("Hello Everyone, I Am User 2")
    }

    val name3 = inputName()
    executeAction(name3) {
        println("Hello Everyone, I Am User 3")
    }
}