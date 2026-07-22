//Create a Kotlin program to manage an employee payroll system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("Name           : $personName")
        println("Age            : $personAge")
    }
}

open class Employee(
    protected val employeeId: Int,
    val employeeDepartment: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayEmployeeDetails()
    {
        displayPersonDetails()
        println("Employee ID    : $employeeId")
        println("Department     : $employeeDepartment")
    }
}

class PayrollEmployee(
    private val monthlySalary: Double,
    var bonus: Double,
    var isPermanent: Boolean,
    employeeId: Int,
    employeeDepartment: String,
    personName: String,
    personAge: Int
) : Employee(employeeId, employeeDepartment, personName, personAge)
{
    fun displayPayrollDetails()
    {
        displayEmployeeDetails()
        println("Monthly Salary : %.2f".format(monthlySalary))
        println("Bonus          : %.2f".format(bonus))
        println("Employee Type  : ${if(isPermanent) "Permanent" else "Temporary"}")
    }
}

fun main()
{
    val payrollEmployee = PayrollEmployee(2000000.0, 50000.0, true, 1001, "Software Development", "Rahul", 18)
    payrollEmployee.displayPayrollDetails()
}