/*
    Question 1: Student Roll Number Management System Using HashSet
    Problem Statement:
    Create a Kotlin program to develop a Student Roll Number Management System using the HashSet Collection.
    The program should perform the following operations using a Menu Driven Program:

    Add a new student roll number.
    If the roll number already exists, display an appropriate message.
    Remove a student roll number.
    If the roll number does not exist, display an appropriate message.
    Check whether a specific roll number exists or not.
    Display all unique student roll numbers.
    Display the total number of student roll numbers.
    Clear all student roll numbers.
    Exit the program. 
*/

fun inputRollNumber(): Int?
{
    print("\nEnter Roll Number : ")
    val rollNumber = readln().trim().toIntOrNull()
    return rollNumber
}

fun validateRollNumber(rollNumber: Int): Boolean
{
    if(rollNumber <= 0)
    {
        println("Invalid Roll Number")
        return true
    }
    else return false
}

fun display(set: HashSet<Int>) 
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

fun addRollNumber(set: HashSet<Int>) 
{
    val rollNumber = inputRollNumber()
    if(rollNumber == null)
    {
        println("Invalid Input")
        return
    }

    if(validateRollNumber(rollNumber)) return
    else
    {
        if(rollNumber in set) println("This Roll Number Already Exists")
        else
        {
            set.add(rollNumber)
            println("Roll Number $rollNumber Add Successfully")
        }
    }
}

fun removeRollNumber(set: HashSet<Int>) 
{
    val rollNumber = inputRollNumber()
    if(rollNumber == null)
    {
        println("Invalid Input")
        return
    }
    if(validateRollNumber(rollNumber)) return
    else
    {
        if(set.remove(rollNumber)) println("Roll Number $rollNumber Removed Successfully")
        else println("Roll Number Not Found")
    }
}

fun searchRollNumber(set: HashSet<Int>) 
{
    val rollNumber = inputRollNumber()
    if(rollNumber == null)
    {
        println("Invalid Input")
        return
    }
    if(validateRollNumber(rollNumber)) return
    else
    {
        if(rollNumber in set) println("Roll Number $rollNumber Found")
        else println("Roll Number $rollNumber Not Found")
    }
}

fun displaySize(set: HashSet<Int>)
{
    if(set.isNotEmpty()) println("\nTotal Roll Numbers : ${set.size}")
    else println("Set Is Empty")
}

fun clearAll(set: HashSet<Int>) 
{
    if(set.isNotEmpty())
    {
        set.clear()
        println("\nSet Cleared Successfully")
    }
    else println("\nSet Is Empty")
} 

fun main()
{
    val studentRollNumbers = HashSet<Int>()

    println("\n=====Student Roll Number Management System=====\n")
    println("1. Add New Roll Number")
    println("2. Remove Roll Number")
    println("3. Search Roll Number")
    println("4. Display All Roll Numbers")
    println("5. Display Total Roll Numbers (Size)")
    println("6. Clear All Roll Numbers")
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
            1 -> addRollNumber(studentRollNumbers)
            2 -> removeRollNumber(studentRollNumbers)
            3 -> searchRollNumber(studentRollNumbers)
            4 -> display(studentRollNumbers)
            5 -> displaySize(studentRollNumbers)
            6 -> clearAll(studentRollNumbers)
            7 -> break
            else -> println("Invalid Choice! Try Again")
        }
    }
}