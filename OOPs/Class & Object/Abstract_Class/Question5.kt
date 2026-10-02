//Question 5 — Abstract Class with Constructor & Common + Specific Behavior
abstract class Employee(
    val name: String,
    val employeeId: String,
    val baseSalary: Double
) {
    fun displayBasicInfo() {
        println("Employee Name : $name")
        println("Employee ID   : $employeeId")
        println("Base Salary   : %.2f".format(baseSalary))
    }

    fun login() {
        println("Employee logged in")
    }

    abstract fun calculateSalary(): Double
}

class Developer(
    val bonus: Double,
    name: String,
    employeeId: String,
    baseSalary: Double
) : Employee(name, employeeId, baseSalary) {
    override fun calculateSalary(): Double = bonus + baseSalary
}

class Manager(
    val allowance: Double,
    name: String,
    employeeId: String,
    baseSalary: Double
) : Employee(name, employeeId, baseSalary) {
    override fun calculateSalary(): Double = allowance + baseSalary
}

fun main()
{
    val developer = Developer(20000.0, "Rahul", "EM1001", 50000.0)
    val manager = Manager(250000.0, "Ranjeet", "EM1002", 80000.0)

    developer.login()
    developer.displayBasicInfo()
    println("Final Salary  : %.2f".format(developer.calculateSalary()))

    println()
    manager.login()
    manager.displayBasicInfo()
    println("Final Salary  : %.2f".format(manager.calculateSalary()))
}