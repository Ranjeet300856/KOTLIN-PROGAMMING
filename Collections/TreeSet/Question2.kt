/*
    Problem Statement:
    Create a Kotlin program to develop a Unique City Name Management System using TreeSet Collection.
    The program should allow users to manage city names through a Menu Driven Program.

    Features:
    1. Add a new city name.
    - City name should not be blank.
    - Duplicate city names should not be added.
    - Leading and trailing spaces should be removed before storing.

    2. Remove an existing city name.
    3. Search for a city name.
    4. Display all city names in alphabetical order.
    5. Display the first and last city name alphabetically.
    6. Display the total number of stored city names.
    7. Clear all city names.
    8. Exit the program. 
*/
import java.util.TreeSet

fun input(): String
{
    while(true)
    {
        print("Enter city name : ")
        val city = readln().trim()
        if(city.isBlank())
        {
            println("Invalid input! try again")
            continue
        }

        return city
    }
}

fun checkEmpty(treeSet: TreeSet<String>): Boolean
{
    if(treeSet.isEmpty())
    {
        println("No city names available")
        return true
    }
    else return false
}

fun addNewCity(treeSet: TreeSet<String>) 
{
    val city = input()
    if(!treeSet.add(city)) println("Duplicate city name not allowed")
    else println("City $city added successfully")
}

fun removeCity(treeSet: TreeSet<String>) 
{
    if(checkEmpty(treeSet)) return
    val city = input()
    if(treeSet.remove(city)) println("City $city removed successfully")
    else println("City name not found")
}

fun searchCity(treeSet: TreeSet<String>) 
{
    if(checkEmpty(treeSet)) return
    val city = input()
    if(treeSet.contains(city)) println("City $city found")
    else println("City name not found")
}

fun displayAllCity(treeSet: TreeSet<String>) 
{
    if(checkEmpty(treeSet)) return
    print("City Names : ")
    for(value in treeSet) print("$value ")
    println()
}

fun displayFirstAndLastCity(treeSet: TreeSet<String>) 
{
    if(checkEmpty(treeSet)) return
    println("First city name : ${treeSet.first()}")
    println("Last city name : ${treeSet.last()}")
}

fun displaySize(treeSet: TreeSet<String>) = println("Total number of stored city names : ${treeSet.size}")
fun clearCityData(treeSet: TreeSet<String>)
{
    if(checkEmpty(treeSet)) return
    treeSet.clear()
    println("City name cleared")
}

fun main()
{
    println("\n===== City Name Management System =====\n")
    val cityNames = TreeSet<String>()
    while(true)
    {
        println("\n1. Add a new city name.")
        println("2. Remove a city name.")
        println("3. Search a city name.")
        println("4. Display all city names in alphabetical order.")
        println("5. Display the first and last city name alphabetically.")
        println("6. Display the total number of stored city names.")
        println("7. Clear all city names.")
        println("8. Exit the program.")

        print("\nEnter your choice (1-8) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Choice! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewCity(cityNames)
            2 -> removeCity(cityNames)
            3 -> searchCity(cityNames)
            4 -> displayAllCity(cityNames)
            5 -> displayFirstAndLastCity(cityNames)
            6 -> displaySize(cityNames)
            7 -> clearCityData(cityNames)
            8 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Enter 1..8")
        }
    }
}