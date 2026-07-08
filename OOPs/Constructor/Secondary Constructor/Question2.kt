//Create a Kotlin program to develop an Employee Information System using a Primary Constructor and Multiple Secondary Constructors.
class Employee(val employeeId: Int, val employeeName: String, var employeeSalary: Double, var employeeDepartment: String)
{
    constructor(employeeSalary: Double, employeeName: String) : this(0, employeeName, employeeSalary, "General")
    {
        println("1st Secondary Constructor Executed")
    }

    constructor(employeeName: String) : this(0, employeeName, 0.0, "General")
    {
        println("2nd Secondary Constructor Executed")
    }

    fun displayEmployeeDetails(count: Int)
    {
        println("\nEmployee $count Name        : $employeeName")
        println("Employee $count ID          : $employeeId")
        println("Employee $count Salary      : %.2f".format(employeeSalary))
        println("Employee $count Department  : $employeeDepartment")
    }
}

fun main()
{
    val employee1 = Employee(1001, "Ranjeet Suthar", 200000.00, "Software Development")
    val employee2 = Employee(150000.00, "Saloni Suthar")
    val employee3 = Employee("Rahul Suthar")

    employee1.displayEmployeeDetails(1)
    employee2.displayEmployeeDetails(2)
    employee3.displayEmployeeDetails(3)
}