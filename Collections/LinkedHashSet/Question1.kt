/*
    Question 1: Unique Username Management System Using LinkedHashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Username Management System using LinkedHashSet Collection.

    The program should allow users to manage usernames through a Menu Driven Program.
    Features:
    1. Add a new username.
       - Username should not be blank.
       - Duplicate usernames should not be added.

    2. Remove an existing username.
       - Display an appropriate message if the username does not exist.

    3. Search a username.
       - Display whether the username exists or not.

    4. Display all usernames.
       - Display usernames in the same order in which they were registered.
       - Display a message if no usernames are available.

    5. Display total number of registered usernames.
    6. Exit the program.
*/

fun inputUserName(): String
{
    while(true)
    {
        print("Enter username : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Username! Try Again")
            continue
        }

        return name
    }
}

fun addNewUser(set: LinkedHashSet<String>)
{
    val username = inputUserName()
    if(!set.add(username)) println("User already registered")
    else println("User add successfully")
}

fun display(set: LinkedHashSet<String>)
{
    if(set.isEmpty())
    {
        println("No usernames available")
        return
    }

    print("\nCurrent Set : ")
    for(name in set) print("$name\t")
    println()
}

fun searchUser(set: LinkedHashSet<String>) 
{
    if(set.isEmpty())
    {
        println("No usernames available")
        return
    }

    val username = inputUserName()
    if(username in set) println("User $username Found")
    else println("User $username Not Found")
}

fun removeUser(set: LinkedHashSet<String>) 
{
    if(set.isEmpty())
    {
        println("No usernames available")
        return
    }

    val username = inputUserName()
    if(set.remove(username)) println("User $username Removed Successfully")
    else println("User $username Not Found")
}

fun displaySize(set: LinkedHashSet<String>) = println("Registered usernames : ${set.size}")

fun main()
{
    println("\n===== Username Management System =====\n")
    val usernames = LinkedHashSet<String>()
    while(true)
    {
        println("\n1. Add a new username")
        println("2. Remove a username")
        println("3. Search a username")
        println("4. Display all username")
        println("5. See total registered usernames")
        println("6. Exit this program")

        print("\nEnter your choice (1-6) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewUser(usernames)
            2 -> removeUser(usernames)
            3 -> searchUser(usernames)
            4 -> display(usernames)
            5 -> displaySize(usernames)
            6 -> {
                println("Program Exit Successfully! Thanks")
                break
            }

            else -> println("Invalid Choice! Please Enter A Valid Choice in 1-6")
        }
    }
}