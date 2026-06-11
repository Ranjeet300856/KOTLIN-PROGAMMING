/*
    Question 9: Daily Task Manager
    Problem Statement
    Create a Kotlin program that manages daily tasks using a MutableList<String>.

    Requirements
    1. Ask the user to enter 5 tasks and store them in a MutableList<String>.
    Rules:
    Task name cannot be blank.
    Invalid input should be rejected and asked again.
    2. Print all tasks.

    3. Ask the user:
    Do you want to clear all tasks? (yes/no)
    If the user enters: yes
    then clear the entire list using: clear()
    and print: All tasks cleared successfully.

    4. Check whether the task list is empty using: isEmpty()
    Print an appropriate message.

    5. Print:
    Final Task List
    Total Tasks
    using: size 
*/

fun main()
{
    val task = mutableListOf<String>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Task ${i + 1} : ")
            val taskName = readln().trim()
            if(taskName.isBlank())
            {
                println("Invalid Input")
                continue
            }

            task.add(taskName)
            break
        }
    }

    println("\nAll Task : $task")

    print("Do you want to clear all tasks? (yes/no) : ")
    val input = readln().trim().lowercase()
    if(input.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(input == "yes")
    {
        task.clear()
        println("All tasks cleared successfully.")
    }
    else if(input == "no") println("Ohk, Task Not Cleared")
    else println("Invalid Input")

    if(task.isEmpty()) println("\nTask List is Empty")
    else println("\nTask List is Not Empty")

    println("\nFinal Task List : $task")
    println("List Size       : ${task.size}")
}