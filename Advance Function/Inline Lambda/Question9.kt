/*
    Question 9: Smart Task Processing System Using All Inline Lambda Types
    Problem Statement:
    Create a Kotlin program to develop a Smart Task Processing System using Normal Inline Lambda, noinline Lambda, and crossinline Lambda.
    Requirements:
    1. Create a normal function named saveTaskHistory().
    2. The function should accept one lambda parameter:
       - historyTask (Lambda parameter that returns Unit)

    3. Inside saveTaskHistory():
       - Display a message that task history is being saved.
       - Execute the historyTask lambda.

    4. Create an inline function named processTask().
    5. The function should accept three lambda parameters:
       - startTask (Normal Inline Lambda)
       - storeTask (noinline Lambda)
       - executeTask (crossinline Lambda)

    6. Inside processTask():
       - Execute startTask immediately.
       - Pass storeTask to saveTaskHistory().
       - Execute executeTask directly.

    7. Create a function named runTaskManager().
    8. Inside runTaskManager():
       - Call processTask() and pass all three lambdas.

    9. In startTask lambda:
       - Display a starting message.

    10. In storeTask lambda:
        - Display a task history message.

    11. In executeTask lambda:
        - Display task execution message.
        - Try using return and observe the compiler error.
        - Remove return and complete the program.
*/

fun saveTaskHistory(historyTask: () -> Unit)
{
    println("History Saved Successfully")
    historyTask()
}

inline fun processTask(startTask: () -> Unit, noinline storeTask: () -> Unit, crossinline executeTask: () -> Unit)
{
    startTask()
    saveTaskHistory(storeTask)
    executeTask()
}

fun runTaskManager()
{
    processTask(
        {
            println("Task Started Successfully")
        },

        {
            println("History Stored Successfully")
        }
    ) {
        println("Task Executed")
    }
}

fun main()
{
    runTaskManager()
}