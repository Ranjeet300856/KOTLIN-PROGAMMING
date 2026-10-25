/*
    Write a Kotlin program that executes a task using an Object Expression implementing a TaskHandler interface.

    The TaskHandler interface must contain:

    executeTask(taskName: String): Executes a task.
    getHandlerName(): String: Returns the handler's name.

    Create a function named runTask() that accepts a TaskHandler object and a task name, then executes the task using the provided handler.

    Create an Object Expression that implements TaskHandler and pass it directly to runTask(). 
*/

interface TaskHandler {
    fun executeTask(taskName: String)
    fun getHandlerName(): String
}

fun runTask(taskHandler: TaskHandler, taskName: String) {
    println("Handler Name : ${taskHandler.getHandlerName()}")
    taskHandler.executeTask(taskName)
}

fun main()
{
    runTask(
        object : TaskHandler {
            override fun executeTask(taskName: String) {
                println("Task Name : $taskName")
            }

            override fun getHandlerName(): String = "Default Task Handler"
        },
        "Generate Report"
    )

    runTask(
        object : TaskHandler {
            override fun executeTask(taskName: String) {
                println("Task Name : $taskName")
            }

            override fun getHandlerName(): String = "Default Task Handler"
        },
        "Send Email"
    )
}