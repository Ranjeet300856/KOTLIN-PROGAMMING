/*
    Problem Statement:
    Create a Kotlin program to develop a Unique Book ISBN Manager using TreeSet Collection.
    The program should allow users to manage unique book ISBN numbers through a Menu Driven Program.

    Features:
    1. Add a new ISBN number.
    - ISBN number must not be blank.
    - Leading and trailing spaces should be removed.
    - Duplicate ISBN numbers should not be added.

    2. Remove an ISBN number.
    3. Search for an ISBN number.
    4. Display all ISBN numbers in ascending (alphabetical) order.
    5. Display the first and last ISBN number.
    6. Display the total number of stored ISBN numbers.
    7. Clear all ISBN numbers.
    8. Exit the program. 
*/
import java.util.TreeSet
fun input(): String
{
    while(true)
    {
        print("Enter ISBN Number : ")
        val number = readln().trim()
        if(number.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return number
    }
}

fun checkEmpty(numbers: TreeSet<String>): Boolean
{
    if(numbers.isEmpty())
    {
        println("No ISBN Number Available")
        return true
    }
    else return false
}

fun addNewNumber(numbers: TreeSet<String>)
{
    val inputNumber = input()
    if(!numbers.add(inputNumber)) println("Duplicate number is not allowed")
    else println("ISBN number $inputNumber added successfully")
}

fun removeANumber(numbers: TreeSet<String>)
{
    if(checkEmpty(numbers)) return
    val inputNumber = input()
    if(numbers.contains(inputNumber))
    {
       numbers.remove(inputNumber)
       println("ISBN number $inputNumber removed successfully") 
    }
    else println("This number is not available")
}

fun searchANumber(numbers: TreeSet<String>)
{
    if(checkEmpty(numbers)) return
    val inputNumber = input()
    if(numbers.contains(inputNumber)) println("ISBN number $inputNumber is found")
    else println("This number is not found")
}

fun displayAllNumbers(numbers: TreeSet<String>)
{
    if(checkEmpty(numbers)) return
    for(value in numbers) println(value)
}

fun displayFirstAndLastNumber(numbers: TreeSet<String>)
{
    if(checkEmpty(numbers)) return
    val firstNumber = numbers.first()
    val lastNumber = numbers.last()
    println("First ISBN Number : $firstNumber")
    println("Last ISBN Number  : $lastNumber")
}

fun displayTotalNumber(numbers: TreeSet<String>) = println("Total ISBN Numbers : ${numbers.size}")

fun clearAllNumbers(numbers: TreeSet<String>)
{
    if(checkEmpty(numbers)) return
    numbers.clear()
    println("All numbers are removed successfully")
}

fun main()
{
    val numbers = TreeSet<String>()
    println("\n===== Unique Book ISBN Management System =====\n")
    while(true)
    {
        println("\n1. Add a new ISBN number.")
        println("2. Remove an ISBN number.")
        println("3. Search for an ISBN number.")
        println("4. Display all ISBN numbers in ascending (alphabetical) order.")
        println("5. Display the first and last ISBN number.")
        println("6. Display the total number of stored ISBN numbers.")
        println("7. Clear all ISBN numbers.")
        println("8. Exit the program. ")
        println()

        print("\nEnter your choice (1-8) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice) {
            1 -> addNewNumber(numbers)
            2 -> removeANumber(numbers)
            3 -> searchANumber(numbers)
            4 -> displayAllNumbers(numbers)
            5 -> displayFirstAndLastNumber(numbers)
            6 -> displayTotalNumber(numbers)
            7 -> clearAllNumbers(numbers)
            8 -> {
                println("Program Exit Successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter 1-8")
        }
    }
}