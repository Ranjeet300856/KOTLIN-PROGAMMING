/*
    Question 2: Unique Username Management System Using HashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Username Management System using the HashSet Collection.
    The program should perform the following operations using a Menu Driven Program:

    Register a new username.
    Username should be unique.
    If the username already exists, display an appropriate message.
    Check whether a username is available or already registered.
    Remove an existing username.
    If the username does not exist, display an appropriate message.
    Display all registered usernames.
    Display the total number of registered usernames.
    Remove all usernames from the system.
    Exit the program. 
*/

fun inputUsername(): String
{
    print("\nEnter username : ")
    val username = readln().trim()
    return username
}

fun validateUsername(username: String): Boolean
{
    if(username.contains(" ") || username.length < 3)
    {
        println("Invalid Username")
        return true
    }
    else return false
}

fun display(set: HashSet<String>) 
{
    if(set.isEmpty())
    {
        println("Set Is Empty")
        return
    }

    var i = 1
    println("Current Set:")
    for(value in set)
    {
        println("$i. $value")
        i++
    }
}

fun addUsername(set: HashSet<String>) 
{
    val uname = inputUsername()
    if(uname.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(validateUsername(uname)) return
    else
    {
        if(uname in set) println("This Username Already Exists")
        else
        {
            set.add(uname)
            println("Username $uname Add Successfully")
        }
    }
}

fun removeUsername(set: HashSet<String>) 
{
    val uname = inputUsername()
    if(uname.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(validateUsername(uname)) return
    else 
    {
        if(set.remove(uname)) println("Username $uname Removed Successfully")
        else println("Username $uname Not Found")
    }
}

fun searchUsername(set: HashSet<String>) 
{
    val uname = inputUsername()
    if(uname.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(validateUsername(uname)) return
    else
    {
        if(uname in set) println("Username $uname Found")
        else println("Username $uname Not Found")
    }
}

fun removeAllUsername(set: HashSet<String>) 
{
    if(set.isNotEmpty())
    {
        set.clear()
        println("All Usernames Removed Successfully")
    }
    else println("Set Is Empty")
}

fun displaySize(set: HashSet<String>) 
{
    if(set.isNotEmpty()) println("\nTotal Usernames : ${set.size}")
    else println("Set Is Empty")
}

fun main()
{
    val username = HashSet<String>()

    println("\n=====Username Management System=====\n")
    println("1. Register a new username")
    println("2. Remove a username")
    println("3. Search a username")
    println("4. Display all username")
    println("5. Display total numbers of username (Size)")
    println("6. Remove all username")
    println("7. Exit")
    while(true)
    {
        print("\nEnter your choice (1-7) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addUsername(username)
            2 -> removeUsername(username)
            3 -> searchUsername(username)
            4 -> display(username)
            5 -> displaySize(username)
            6 -> removeAllUsername(username)
            7 -> break
            else -> println("Invalid Choice! Try Again")
        }
    }
}