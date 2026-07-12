//Question 5: Task Priority Manager Using TreeMap
import java.util.TreeMap
fun inputTaskPrioriry(): Int
{
    while(true)
    {
        print("\nEnter Task Prioriry : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputTaskName(): String
{
    while(true)
    {
        print("Enter Task Name : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun addTask(tasks: TreeMap<Int, String>)
{
    while(true)
    {
        val taskPrioriry = inputTaskPrioriry()
        if(tasks.containsKey(taskPrioriry))
        {
            println("Priority already exists.")
            continue
        }

        val taskName = inputTaskName()
        tasks.putIfAbsent(taskPrioriry, taskName)
        println("Task Added Successfully")
        break
    }
}

fun completeHighestPriority(tasks: TreeMap<Int, String>)
{
    if(tasks.isNotEmpty())
    {
        val highestPrioriryTask = tasks.pollFirstEntry()
        if(highestPrioriryTask != null)
        {
            println("Completed Task")
            println("Priority : ${highestPrioriryTask.key}")
            println("Task     : ${highestPrioriryTask.value}")
        }
        else println("No Task Found")
    }
    else println("No Task Available")
}

fun completeLowestPriority(tasks: TreeMap<Int, String>)
{
    if(tasks.isNotEmpty())
    {
        val lowestPriorityTask = tasks.pollLastEntry()
        if(lowestPriorityTask != null)
        {
            println("Completed Task")
            println("Prioriry : ${lowestPriorityTask.key}")
            println("Task     : ${lowestPriorityTask.value}")
        }
        else println("No Task Found")
    }
    else println("No Task Available")
}

fun displayTasksInDescendingOrder(tasks: TreeMap<Int, String>)
{
    if(tasks.isNotEmpty())
    {
        val descendingMap = tasks.descendingMap()
        println("Priority\t\tTask")
        for((key, value) in descendingMap)
        println("$key\t\t$value")
    }
    else println("No tasks available.")
}

fun main()
{
    val tasks = TreeMap<Int, String>()
    println("\n===== Task Priority Manager =====\n")
    while(true)
    {
        println("\n1. Add Task")
        println("2. Complete Highest Priority Task")
        println("3. Complete Lowest Priority Task")
        println("4. Display Tasks (Highest to Lowest Priority)")
        println("5. Exit")

        print("\nEnter your choice (1..5) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addTask(tasks)
            2 -> completeHighestPriority(tasks)
            3 -> completeLowestPriority(tasks)
            4 -> displayTasksInDescendingOrder(tasks)
            5 -> {
                println("Program Exited")
                break
            }
            
            else -> println("Invalid Choice! Enter 1..5")
        }
    }
}