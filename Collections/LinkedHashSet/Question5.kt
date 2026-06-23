/*
    Question 5: Unique City Name Management System Using LinkedHashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique City Name Management System using LinkedHashSet Collection.
    The program should allow users to manage city names through a Menu Driven Program.

    Features:
    1. Add a new city name.
       - City name should not be blank.
       - Duplicate city names should not be added.

    2. Remove an existing city name.
       - Display an appropriate message if the city name does not exist.

    3. Search a city name.
       - Display whether the city name exists or not.

    4. Display all city names.
       - Display city names in the same order in which they were added.
       - Display a message if no city names are available.

    5. Display the total number of stored city names.
    6. Display the first added city.
    7. Display the last added city.
    8. Clear all city names from the collection.
    9. Exit the program.
*/

fun inputCityName(): String
{
    while(true)
    {
        print("Enter city name : ")
        val cityName = readln().trim()
        if(cityName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return cityName
    }
}

fun checkEmpty(set: LinkedHashSet<String>): Boolean
{
    if(set.isEmpty())
    {
        println("No data available")
        return true
    }
    else return false
}

fun addNewCity(set: LinkedHashSet<String>) 
{
    val city = inputCityName()
    if(!set.add(city)) println("This city already available in collection")
    else println("City $city added successfully")
}

fun removeCity(set: LinkedHashSet<String>) 
{
    if(checkEmpty(set)) return
    val city = inputCityName()
    if(set.remove(city)) println("$city removed successfully")
    else println("City $city not found")
}

fun searchCity(set: LinkedHashSet<String>) 
{
    if(checkEmpty(set)) return
    val city = inputCityName()
    if(set.contains(city)) println("City $city found")
    else println("City $city not found")
}

fun display(set: LinkedHashSet<String>) 
{
    if(checkEmpty(set)) return
    print("Unique City Names : ")
    for(value in set) print("$value ")
    println()
}

fun displaySize(set: LinkedHashSet<String>) = println("Total unique city in collection : ${set.size}")
fun displayFirstCity(set: LinkedHashSet<String>)
{
    if(checkEmpty(set)) return
    println("First city in collection : ${set.first()}")
}

fun displayLastCity(set: LinkedHashSet<String>)
{
    if(checkEmpty(set)) return
    println("Last city in collection : ${set.last()}")
}

fun clearData(set: LinkedHashSet<String>)
{
    if(checkEmpty(set)) return
    set.clear()
    println("All data cleared successfully")
}

fun main()
{
    println("\n===== City Name Management System =====\n")
    val cityNames = LinkedHashSet<String>()
    while(true)
    {
        println("\n1. Add new city name")
        println("2. Remove a city name")
        println("3. Search a city name")
        println("4. Display city names")
        println("5. Display total number of stored city names")
        println("6. Display first city name")
        println("7. Display last city name")
        println("8. Clear all city names")
        println("9. Exit the program")

        print("\nEnter your choice (1-9) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewCity(cityNames)
            2 -> removeCity(cityNames)
            3 -> searchCity(cityNames)
            4 -> display(cityNames)
            5 -> displaySize(cityNames)
            6 -> displayFirstCity(cityNames)
            7 -> displayLastCity(cityNames)
            8 -> clearData(cityNames)
            9 -> {
                println("Program exit successfully")
                break
            }

            else -> println("Invalid Choice! Enter 1-9")
        }
    }
}