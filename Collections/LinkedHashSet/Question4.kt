/*
    Question 4: Unique Product Price Management System Using LinkedHashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Product Price Management System using LinkedHashSet Collection.

    The program should allow users to manage unique product prices through a Menu Driven Program.
    Features:

    1. Add a new product price.
       - Price must be greater than 0.
       - Duplicate prices should not be added.

    2. Remove an existing product price.
       - Display an appropriate message if the price does not exist.

    3. Search a product price.
       - Display whether the price exists or not.

    4. Display all product prices.
       - Display prices in the same order in which they were added.
       - Display a message if no prices are available.

    5. Display the total number of stored prices.
    6. Display the highest product price.
    7. Display the lowest product price.
    8. Exit the program.
*/

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null || price <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun is_Empty(set: LinkedHashSet<Double>): Boolean
{
    if(set.isEmpty())
    {
        println("Prices Not Available")
        return true
    }
    else return false
}

fun addNewPrice(set: LinkedHashSet<Double>) 
{
    val price = inputPrice()
    if(!set.add(price)) println("Duplicate price not interted")
    else println("Price $price added successfully")
}

fun removePrice(set: LinkedHashSet<Double>) 
{
    if(is_Empty(set)) return
    val price = inputPrice()
    if(set.remove(price)) println("Price $price removed successfully")
    else println("Price not found")
}

fun searchPrice(set: LinkedHashSet<Double>) 
{
    if(is_Empty(set)) return
    val price = inputPrice()
    if(set.contains(price)) println("Price $price is available")
    else println("Price not available")
}

fun display(set: LinkedHashSet<Double>) 
{
    if(is_Empty(set)) return
    print("\nUnique Prices : ")
    for(value in set) print("%.2f  ".format(value))
    println()
}

fun displaySize(set: LinkedHashSet<Double>) = println("Total number of unique prices : ${set.size}")

fun displayHighestPrice(set: LinkedHashSet<Double>) 
{
    if(is_Empty(set)) return
    
    var max = set.elementAt(0)
    for(value in set)
    if(value > max) max = value

    println("Highest product price : $max")
}

fun displayLowestPrice(set: LinkedHashSet<Double>) 
{
    if(is_Empty(set)) return

    var min = set.elementAt(0)
    for(value in set)
    if(value < min) min = value

    println("Lowest product price : $min")
}

fun main()
{
    println("\n===== Product Price Management System =====\n")
    val prices = LinkedHashSet<Double>()
    while(true)
    {
        println("\n1. Add new product price")
        println("2. Remove a product price")
        println("3. Search a product price")
        println("4. Display all product prices")
        println("5. Display total number of stored prices")
        println("6. Display highest product price")
        println("7. Display lowest product price")
        println("8. Exit the program")

        print("\nEnter your choice : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewPrice(prices)
            2 -> removePrice(prices)
            3 -> searchPrice(prices)
            4 -> display(prices)
            5 -> displaySize(prices)
            6 -> displayHighestPrice(prices)
            7 -> displayLowestPrice(prices)
            8 -> {
                println("Program exit successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter 1-8")
        }
    }
}