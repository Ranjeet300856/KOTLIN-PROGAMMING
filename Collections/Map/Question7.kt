/*
    Question 7 — User Role Validation System
    Problem Statement
    Create a Kotlin program that works as a User Role Validation System using an Immutable Map.
*/

fun displayUserData(userRoles: Map<String, String>, username: String)
{
    if(userRoles.containsKey(username))
    {
        println("Username : $username")
        println("Roles    : ${userRoles[username]}")

        val role = userRoles[username]
        when(role)
        {
            "Admin" -> println("Access   : Full Access\n")
            "Editor" -> println("Access   : Can Edit Content\n")
            "Viewer" -> println("Access   : Read Only Access\n")
        }
    }
    else
    {
        println("Username : $username")
        println("User Not Found\n")
    }
}

fun main()
{
    val userRoles = mapOf(
        "Ranjeet" to "Admin",
        "Mohit"   to "Editor",
        "Ravi"    to "Viewer",
        "Amit"    to "Editor",
        "Neha"    to "Viewer"
    )

    val username = "Mohit"
    displayUserData(userRoles, username)

    val user1 = "Ranjeet"
    displayUserData(userRoles, user1)

    val user2 = "Neha"
    displayUserData(userRoles, user2)

    val user3 = "Suresh"
    displayUserData(userRoles, user3)
}