// Question 10: Build a Task Management System using Kotlin Interfaces

// 1. Generic Repository Interface
interface Repository<T> {
    fun add(item: T)
    fun getAll(): List<T>
    fun findById(id: Int): T?
}

// 2. Task Data Class
data class Task(
    val id: Int,
    val title: String,
    var isCompleted: Boolean = false
)

// 3. Logger Interface
interface Logger {
    fun logInfo(message: String)
    fun logError(message: String)
    fun logSuccess(message: String) {
        println("SUCCESS: $message")
    }
}

// 4. ConsoleLogger Implementation
class ConsoleLogger : Logger {
    override fun logInfo(message: String) {
        println("INFO: $message")
    }

    override fun logError(message: String) {
        println("ERROR: $message")
    }
}

// 5. InMemoryTaskRepository
class InMemoryTaskRepository : Repository<Task> {
    private val tasks = mutableListOf<Task>()
    override fun add(item: Task) {
        tasks.add(item)
    }

    override fun getAll(): List<Task> {
        return tasks.toList()
    }

    override fun findById(id: Int): Task? {
        return tasks.find { it.id == id }
    }
}

// 6. TaskOperations Interface
interface TaskOperations {
    fun createTask(title: String): Task
    fun completeTask(id: Int): Boolean
    fun displayTasks()
}

// 7. TaskService Implementation
class TaskService(
    private val repository: Repository<Task>,
    logger: Logger
) : TaskOperations, Logger by logger {

    private var taskId = 1
    override fun createTask(title: String): Task {
        val task = Task(
            id = taskId++,
            title = title
        )

        repository.add(task)
        logSuccess("Task created: ${task.title}")
        return task
    }

    override fun completeTask(id: Int): Boolean {
        val task = repository.findById(id)
        if (task == null) {
            logError("Task with ID $id not found")
            return false
        }

        if (task.isCompleted) {
            logError("Task with ID $id is already completed")
            return false
        }

        task.isCompleted = true
        logSuccess("Task completed: ${task.title}")
        return true
    }

    override fun displayTasks() {
        val tasks = repository.getAll()
        if (tasks.isEmpty()) {
            println("No tasks available")
            return
        }

        for (task in tasks) {
            val status = if (task.isCompleted) {
                "Completed"
            } else {
                "Pending"
            }

            println(
                "ID: ${task.id} | " +
                "Title: ${task.title} | " +
                "Status: $status"
            )
        }
    }
}

// 8. Main Function
fun main() {

    val repository = InMemoryTaskRepository()
    val logger = ConsoleLogger()

    val taskService = TaskService(repository, logger)

    println("Creating Tasks")
    taskService.createTask("Learn Kotlin")
    taskService.createTask("Learn Interfaces")

    println("\nAll Tasks")
    taskService.displayTasks()

    println("\nCompleting Task 1")
    println("Result: ${taskService.completeTask(1)}")

    println("\nCompleting Task 1 Again")
    println("Result: ${taskService.completeTask(1)}")

    println("\nCompleting Nonexistent Task 99")
    println("Result: ${taskService.completeTask(99)}")

    println("\nUpdated Tasks")
    taskService.displayTasks()

    println("\nTesting Logger Delegation")
    taskService.logInfo("Task management system is running")
    taskService.logSuccess("Logger delegation is working")
}