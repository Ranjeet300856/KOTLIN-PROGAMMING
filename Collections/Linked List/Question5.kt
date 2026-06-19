/*
    Question 5: Smart Task Manager System Using LinkedList
    Problem Statement:
    Create a Kotlin program to develop a Smart Task Manager System using LinkedList Collection.
    The program should allow users to manage their daily tasks dynamically using a Menu Driven Program. 
*/
import java.util.LinkedList

fun inputTaskName(): String
{
    print("Enter Task Name : ")
    val input = readln().trim()
    return input
}

fun validateTaskName(name: String): Boolean
{
    if(name.isBlank()) 
    {
        println("Invalid Taks Name")
        return true
    }
    else return false
}

fun addNewTask(list: LinkedList<String>)
{
    val task = inputTaskName()
    if(validateTaskName(task)) return
    else list.add(task)
}

fun display(list: LinkedList<String>)
{
    var i = 1
    for(value in list)
    {
        println("$i. $value")
        i++
    }
}

fun addHighPriorityTask(list: LinkedList<String>)
{
    val name = inputTaskName()
    if(validateTaskName(name)) return
    else list.addFirst(name)
}

fun removeCompletedTask(list: LinkedList<String>)
{
    val name = inputTaskName()
    if(validateTaskName(name)) return
    else
    {
        if(name in list)
        {
            list.remove(name)
            println("$name Removed Successfully")
        }
        else println("$name Not Found")
    }
}

fun removeLatestTask(list: LinkedList<String>) 
{
    if(list.isNotEmpty())
    {
        val removeTop = list.pop()
        println("Removed recently added task : $removeTop")
    }
    else println("Task list is empty")
}

fun searchTask(list: LinkedList<String>) 
{
    val name = inputTaskName()
    if(validateTaskName(name)) return
    else
    {
        if(name in list)
        {
            val index = list.indexOf(name)
            println("Task Found At ${index + 1} Position")
        }
        else println("Task Not Found")
    }
}

fun showTaksInfo(list: LinkedList<String>) 
{
    if(list.isNotEmpty())
    {
        println("\nFirst Task : ${list.getFirst()}")
        println("Last Task  : ${list.getLast()}")
        println("Total Task : ${list.size}")
    }
    else println("\nTask List Is Empty")
}

fun clearAllTask(list: LinkedList<String>) 
{
    list.clear()
    println("\nTask List Cleared Successfully")
}

fun main()
{
    val taskName = LinkedList<String>()

    println("\n===== Smart Task Manager =====\n")
    println("1. Add New Task")
    println("2. Add High Priority Task")
    println("3. Remove Completed Task")
    println("4. Remove Latest Added Task")
    println("5. Search Task")
    println("6. Display All Tasks")
    println("7. Show Task Information")
    println("8. Clear All Tasks")
    println("9. Exit")

    while(true)
    {
        print("\nEnter Choice (1,2,3,4,5,6,7,8,9) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Choice! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewTask(taskName)
            2 -> addHighPriorityTask(taskName)
            3 -> removeCompletedTask(taskName)
            4 -> removeLatestTask(taskName)
            5 -> searchTask(taskName)
            6 -> display(taskName)
            7 -> showTaksInfo(taskName)
            8 -> clearAllTask(taskName)
            9 -> break
            
            else -> println("Invalid Choice")
        }
    }
}