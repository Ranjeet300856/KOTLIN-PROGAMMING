//Create a Kotlin program to automatically generate unique employee IDs using a Companion Object.
class Employee(val employeeName: String, private var employeeDepartment: String)
{
    var employeeId = 0
    init {
        employeeId = generateEmployeeId()
    }
    companion object
    {
        private var nextEmployeeId = 1001
        fun generateEmployeeId(): Int = nextEmployeeId++
    }

    fun displayEmployee()
    {
        println("\nEmployee ID         : $employeeId")
        println("Employee Name       : $employeeName")
        println("Employee Department : $employeeDepartment")
    }
}

fun main()
{
    val employee1 = Employee("Rahul", "Computer Science")
    val employee2 = Employee("Shyam", "Software Development")
    val employee3 = Employee("Aman", "Web Development")
    val employee4 = Employee("Neha", "AI Development")
    val employee5 = Employee("Ravi", "Cyber Security")

    employee1.displayEmployee()
    employee2.displayEmployee()
    employee3.displayEmployee()
    employee4.displayEmployee()
    employee5.displayEmployee()
}