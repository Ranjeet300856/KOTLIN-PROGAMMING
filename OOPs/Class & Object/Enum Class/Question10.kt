// Question 10: Create a Task Management System using Kotlin's Enum Class.
enum class TaskStatus(
    val description: String,
    val priority: Int
) {

    TODO("Task is waiting to be started", 1) {
        override fun canTransitionTo(otherTaskStatus: TaskStatus): Boolean {
            return when (otherTaskStatus) {
                IN_PROGRESS, CANCELLED -> true
                TODO, COMPLETED -> false
            }
        }
    },

    IN_PROGRESS("Task is currently in progress", 2) {
        override fun canTransitionTo(otherTaskStatus: TaskStatus): Boolean {
            return when (otherTaskStatus) {
                COMPLETED, CANCELLED -> true
                TODO, IN_PROGRESS -> false
            }
        }
    },

    COMPLETED("Task has been completed", 3) {
        override fun canTransitionTo(otherTaskStatus: TaskStatus): Boolean {
            return false
        }
    },

    CANCELLED("Task has been cancelled", 4) {
        override fun canTransitionTo(otherTaskStatus: TaskStatus): Boolean {
            return false
        }
    };

    abstract fun canTransitionTo(
        otherTaskStatus: TaskStatus
    ): Boolean

    fun displayTaskDetails() {
        println("Task Status : ${this.name}")
        println("Description : $description")
        println("Priority    : $priority")

        val allowedStatuses = TaskStatus.entries.filter {
            canTransitionTo(it)
        }

        val result = if (allowedStatuses.isEmpty()) {
            "None"
        } else {
            allowedStatuses.joinToString(", ") { it.name }
        }

        println("Allowed Next Statuses : $result")
    }
}

fun main() {

    for (taskStatus in TaskStatus.entries) {
        taskStatus.displayTaskDetails()
        println()
    }

    println("Transition Tests:\n") 
    val transitions = listOf( 
        TaskStatus.TODO to TaskStatus.IN_PROGRESS, 
        TaskStatus.TODO to TaskStatus.COMPLETED, 
        TaskStatus.IN_PROGRESS to TaskStatus.CANCELLED, 
        TaskStatus.COMPLETED to TaskStatus.TODO 
    ) 
    
    for((currentStatus, nextStatus) in transitions) { 
        val result = if (currentStatus.canTransitionTo(nextStatus)) { 
            "Allowed" 
        } else { 
            "Not Allowed" 
        } 
        
        println("$currentStatus -> $nextStatus : $result") 
    }
}