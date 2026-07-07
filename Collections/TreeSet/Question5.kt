/*
    Problem Statement:
    Create a Kotlin program to develop a Unique Student Grade Manager using TreeSet Collection.
    The program should allow users to manage unique student grades through a Menu Driven Program.

    Features:
    1. Add a new grade.
    - Grade must be a single English alphabet character.
    - Both uppercase and lowercase letters are allowed.
    - Duplicate grades should not be added.

    2. Remove an existing grade.
    3. Search for a grade.
    4. Display all grades in sorted order.
    5. Display the first and last grade.
    6. Display the previous and next grade of a given grade.
    - Use TreeSet navigation methods.

    7. Display the total number of stored grades.
    8. Clear all grades.
    9. Exit the program.
*/
import java.util.TreeSet
fun input(): Char
{
    while(true)
    {
        print("Enter a grade : ")
        val inputGrade = readln().trim()
        if(inputGrade.isBlank() || inputGrade.length != 1 || !inputGrade[0].isLetter())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputGrade[0]
    }
}

fun checkEmpty(grades: TreeSet<Char>): Boolean
{
    if(grades.isEmpty())
    {
        println("No grade available")
        return true
    }
    else return false
}

fun addNewGrade(grades: TreeSet<Char>)
{
    val inputGrade = input()
    if(!grades.add(inputGrade)) println("Duplicate grade not allowed")
    else println("Grade $inputGrade added successfully")
}

fun removeAGrade(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    val inputGrade = input()
    if(grades.remove(inputGrade)) println("Grade $inputGrade removed succesfully")
    else println("This grade is not available") 
}

fun searchAGrade(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    val inputGrade = input()
    if(grades.contains(inputGrade)) println("Grade $inputGrade Found")
    else println("This grade is not found")
}

fun displayGrades(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    println("All Grades:")
    for(ch in grades) println(ch)
}

fun displayFirstAndLastGrade(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    val firstGrade = grades.first()
    val lastGrade = grades.last()
    println("First Grade : $firstGrade")
    println("Last Grade  : $lastGrade")
}

fun displayPreviousAndNextGrade(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    val inputGrade = input()
    println("Previous grade of $inputGrade : ${grades.lower(inputGrade) ?: "No previous grade available"}")
    println("Next grade of $inputGrade     : ${grades.higher(inputGrade) ?: "No next grade available"}")
}

fun displayTotalNumberOfGrades(grades: TreeSet<Char>) = println("Total Number Of Grades : ${grades.size}")

fun removeAllGrade(grades: TreeSet<Char>)
{
    if(checkEmpty(grades)) return
    grades.clear()
    println("All grade removed successfully")
}

fun main()
{
    val grades = TreeSet<Char>()
    println("\n===== Student Grade Management System =====\n")
    while(true)
    {
        println("\n1. Add a new grade.")
        println("2. Remove an existing grade.")
        println("3. Search for a grade.")
        println("4. Display all grades in sorted order.")
        println("5. Display the first and last grade.")
        println("6. Display the previous and next grade of a given grade.")
        println("7. Display the total number of stored grades.")
        println("8. Clear all grades.")
        println("9. Exit the program.")
        println()

        print("\nEnter your choice (1-9) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice) {
            1 -> addNewGrade(grades)
            2 -> removeAGrade(grades)
            3 -> searchAGrade(grades)
            4 -> displayGrades(grades)
            5 -> displayFirstAndLastGrade(grades)
            6 -> displayPreviousAndNextGrade(grades)
            7 -> displayTotalNumberOfGrades(grades)
            8 -> removeAllGrade(grades)
            9 -> {
                println("Program Exited Successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter (1-9)")
        }
    }
}