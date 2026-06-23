/*
    Question 2: Unique Student Roll Number Management System Using LinkedHashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Student Roll Number Management System using LinkedHashSet Collection.
    The program should allow users to manage student roll numbers through a Menu Driven Program.

    Features:
    1. Add a new student roll number.
       - Roll number must be a positive number.
       - Duplicate roll numbers should not be added.

    2. Remove an existing student roll number.
       - Display an appropriate message if the roll number does not exist.

    3. Search a student roll number.
       - Display whether the roll number exists or not.

    4. Display all student roll numbers.
       - Display roll numbers in the same order in which they were registered.
       - Display a message if no roll numbers are available.

    5. Display the total number of registered students.
    6. Exit the program.
*/

fun inputRollNumber(): Int
{
    while(true)
    {
        print("Enter roll number : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun addNewRollNumber(set: LinkedHashSet<Int>)
{
    val rollNumber = inputRollNumber()
    if(!set.add(rollNumber)) println("Student already registered")
    else println("Student added successfully")
}

fun removeRollNumber(set: LinkedHashSet<Int>)
{
    if(set.isEmpty())
    {
        println("No roll numbers available")
        return
    }

    val rollNumber = inputRollNumber()
    if(set.remove(rollNumber)) println("Student roll number $rollNumber removed successfully")
    else println("Roll number $rollNumber not found")
}

fun searchRollNumber(set: LinkedHashSet<Int>)
{
    if(set.isEmpty())
    {
        println("No roll numbers available")
        return
    }

    val rollNumber = inputRollNumber()
    if(set.contains(rollNumber)) println("Roll Number $rollNumber Found")
    else println("Roll number $rollNumber not found")
}

fun display(set: LinkedHashSet<Int>)
{
    if(set.isEmpty())
    {
        println("No roll numbers available")
        return
    }

    print("\nRegistered Roll Numbers : ")
    for(number in set) print("$number  ")
    println()
}

fun displaySize(set: LinkedHashSet<Int>) = println("Total Registered Students : ${set.size}")

fun main()
{
    println("\n===== Student Roll Number Management System =====\n")
    val rollNumbers = LinkedHashSet<Int>()

    while(true)
    {
        println("\n1. Add a new roll number")
        println("2. Remove a roll number")
        println("3. Search a roll number")
        println("4. Display all roll number")
        println("5. See total registered students")
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
            1 -> addNewRollNumber(rollNumbers)
            2 -> removeRollNumber(rollNumbers)
            3 -> searchRollNumber(rollNumbers)
            4 -> display(rollNumbers)
            5 -> displaySize(rollNumbers)
            6 -> {
                println("Program Exit Successfully! Thanks")
                break
            }

            else -> println("Invalid Choice! Please Enter A Valid Choice in 1-6") 
        }
    }
}