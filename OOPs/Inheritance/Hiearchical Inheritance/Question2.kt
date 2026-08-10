//Create a Kotlin program to demonstrate Hierarchical Inheritance for an employee management system.
open class Employee(private val employeeId: Int, val employeeName: String, protected val baseSalary: Double)
{
    fun displayEmployeeInfo()
    {
        println("Employee ID   : $employeeId")
        println("Employee Name : $employeeName")
        println("Base Salary   : %.2f".format(baseSalary))
    }
}

class Developer(val programmingLanguage: String, employeeId: Int, employeeName: String, baseSalary: Double) : Employee(employeeId, employeeName, baseSalary)
{
    fun displayDeveloperInfo()
    {
        println("\nDeveloper Info:")
        displayEmployeeInfo()
        println("Programming Language : $programmingLanguage")
    }
}

class Manager(val teamSize: Int, employeeId: Int, employeeName: String, baseSalary: Double) : Employee(employeeId, employeeName, baseSalary)
{
    fun displayManagerInfo()
    {
        println("\nManager Info:")
        displayEmployeeInfo()
        println("Team Size : $teamSize")
    }
}

class Intern(val isPaid: Boolean, employeeId: Int, employeeName: String, baseSalary: Double) : Employee(employeeId, employeeName, baseSalary)
{
    fun displayInternInfo()
    {
        println("\nIntern Info:")
        displayEmployeeInfo()
        println("Is Paid Internship : ${if(isPaid) "YES" else "NO"}")
    }
}

fun main()
{
    val developer = Developer("Kotlin", 1001, "Rahul", 200000.0)
    val manager = Manager(50, 1002, "Aman", 500000.0)
    val intern = Intern(true, 1003, "Ravi", 10000.0)
    developer.displayDeveloperInfo()
    manager.displayManagerInfo()
    intern.displayInternInfo()
}