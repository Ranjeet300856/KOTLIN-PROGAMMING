/*
    Question 5: Inline Task Scheduler with noinline Action Storage
    Problem Statement:
    Create a Kotlin program to develop an Inline Task Scheduler System using Inline Lambda and noinline parameter.
    Requirements:
    1. Create an inline function named scheduleTask().
    2. The function should accept two lambda parameters:
       - startMessage (Normal Inline Lambda that returns Unit)
       - taskAction (noinline Lambda that returns Unit)

    3. Inside the scheduleTask() function:
       - Execute the startMessage lambda immediately.
       - Store the taskAction lambda into a variable.
       - Execute the stored taskAction lambda after storing it.

    4. In the main() function:
       - Call scheduleTask() multiple times with different tasks.
*/

inline fun scheduleTask(startMessage: () -> Unit, noinline taskAction: () -> Unit)
{
    startMessage()
    val task = taskAction
    task()
}

fun main()
{
    scheduleTask(
        {
            println("Morning Task Stared Successfully")
        }
    ) {
        println("2 Hour Learning Kotlin Progamming")
        println("2 Hour Learning Jatpack Compose")
    }

    scheduleTask(
        {
            println("\nAfterNoon Task Stared Successfully")
        }
    ) {
        println("2 Hour Learning Web Development")
        println("2 Hour Learning App Development")
    }
}