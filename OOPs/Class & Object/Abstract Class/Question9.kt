//Question 9 — Abstract Class + Multiple Levels of Inheritance
abstract class Employee(
    val employeeName: String,
    val employeeId: String
) {
    fun displayEmployeeInfo() {
        println("Employee Name : $employeeName")
        println("Employee ID   : $employeeId")
    }

    abstract fun work()
}

abstract class TechnicalEmployee(
    val technology: String,
    employeeName: String,
    employeeId: String
) : Employee(employeeName, employeeId) {
    fun displayTechnology() {
        println("Technology : $technology")
    }

    abstract fun develop()
}

class AndroidDeveloper(
    technology: String,
    employeeName: String,
    employeeId: String
) : TechnicalEmployee(technology, employeeName, employeeId) {
    override fun work() {
        println("Android Developer is working")
    }

    override fun develop() {
        println("Developing Android applications")
    }
}

fun main() 
{
    val androidDeveloper = AndroidDeveloper("Kotlin + Jetpack Compose", "Ranjeet", "AND101")
    androidDeveloper.displayEmployeeInfo()
    androidDeveloper.displayTechnology()
    androidDeveloper.work()
    androidDeveloper.develop()
}