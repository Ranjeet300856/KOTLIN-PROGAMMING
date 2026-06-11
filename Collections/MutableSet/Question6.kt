/*
    Question 6 — Unique Employee ID Management System

    Problem Statement:
    Create a Kotlin program for a company employee management system
    using MutableSet<Int>. The program should store unique employee IDs,
    validate inputs, support searching and removing IDs, merge new IDs
    using addAll(), and display updated employee records.
*/

fun main()
{
    print("How many employee IDs do you want to enter? : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    val employeeIds = mutableSetOf<Int>()

    for(i in 0 until n)
    {
        while(true)
        {
            print("Enter Employee ID : ")
            val id = readln().trim().toIntOrNull()
            if(id == null || id < 1000 || id > 9999)
            {
                println("Invalid Employee ID! Try Again")
                continue
            }

            employeeIds.add(id)
            break
        }
    }

    println("\nUnique Employee Ids : ")
    for(value in employeeIds) println("$value")

    println("\nTotal Unique Employee IDs : ${employeeIds.size}")

    print("\nEnter an Employee ID to search : ")
    val searchId = readln().trim().toIntOrNull()
    if(searchId == null || searchId < 1000 || searchId > 9999)
    {
        println("Invalid Input")
        return
    }

    if(searchId in employeeIds) println("Employee ID Found")
    else println("Employee ID not found")

    print("\nEnter an Employee ID to remove : ")
    val removeId = readln().trim().toIntOrNull()
    if(removeId == null || removeId < 1000 || removeId > 9999)
    {
        println("Invalid Input")
        return
    }

    if(employeeIds.remove(removeId)) println("Employee ID removed successfully.")
    else println("Employee ID does not exist.")

    print("\nHow many new Employee IDs do you want to add? : ")
    val m = readln().trim().toIntOrNull()
    if(m == null || m <= 0)
    {
        println("Invalid Input")
        return
    }

    val newEmployeeIds = mutableSetOf<Int>()

    for(i in 0 until m)
    {
        while(true)
        {
            print("Enter Employee ID ${i + 1} : ")
            val id = readln().trim().toIntOrNull()
            if(id == null || id < 1000 || id > 9999)
            {
                println("Invalid Input! Try Again")
                continue
            }

            newEmployeeIds.add(id)
            break
        }
    }

    employeeIds.addAll(newEmployeeIds)

    println("\nUpdated Employee IDs: ")
    for(value in employeeIds) println("$value")

    println("\nFinal Total Unique Employee IDs : ${employeeIds.size}")
}