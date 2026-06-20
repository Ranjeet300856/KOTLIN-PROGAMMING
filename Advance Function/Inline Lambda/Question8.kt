/*
    Question 8: Inline Background Task Manager with crossinline Callback
    Problem Statement:
    Create a Kotlin program to develop a Background Task Manager System using Inline Lambda and crossinline parameter.
    Requirements:
    1. Create an inline function named startBackgroundTask().
    2. The function should accept two lambda parameters:
       - beforeTask (Normal Inline Lambda)
       - taskExecution (crossinline Lambda)

    3. Inside startBackgroundTask():
       - Execute the beforeTask lambda.
       - Execute the taskExecution lambda.

    4. Create a function named runTask().
    5. Inside runTask():
       - Call startBackgroundTask() and pass both lambdas.

    6. Inside taskExecution lambda:
       - Display task processing messages.
       - Try to use return and observe the compiler error.
       - After understanding the error, remove return and complete the program.

    7. After task execution, display:
       "Background Task Completed"
*/

inline fun startBackgroundTask(beforeTask: () -> Unit, crossinline taskExecution: () -> Unit)
{
    beforeTask()
    taskExecution()
}

fun runTask()
{
    startBackgroundTask(
        {
            println("Before Task Called")
        }
    ) {
        println("Task under processing...")
    }

    println("Bakcground Task Completed")
}

fun main()
{
    runTask()
}