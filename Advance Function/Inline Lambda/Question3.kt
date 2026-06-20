/*
    Question 3: Inline User Search System with Early Exit
    Problem Statement:
    Create a Kotlin program to develop an Inline User Search System using Inline Lambda.
    Requirements:
    1. Create an inline function named searchUsers().
    2. The function should accept:
       - users (List<String>)
       - action (Lambda parameter that accepts a String user and returns Unit)

    3. Inside the inline function:
       - Traverse all users using a loop.
       - Pass each user to the lambda action.

    4. Create a function named findUser().
    5. Inside findUser():
       - Create a list of multiple users.
       - Call searchUsers() and pass a lambda.

    6. Inside the lambda:
       - Check if the current user matches a target user.
       - If the target user is found:
           - Display a "User Found" message.
           - Use return to immediately exit from findUser().

    7. If the loop completes and no user is found:
       - Display "User Not Found".
*/

inline fun searchUsers(users: List<String>, action: (String) -> Unit)
{
    for(value in users)
    action(value)
}

fun findUser()
{
    val multipleUsers = listOf("Ranjeet", "Saloni", "Rahul", "Sonu", "Suthar")
    
    print("Enter Serach User : ")
    val searchName = readln().trim()

    searchUsers(multipleUsers) {
        currentUser: String ->
        if(currentUser == searchName)
        {
            println("User Found")
            return
        }
    }

    println("User Not Found")
}

fun main()
{
    findUser()
}