/*
    Problem Statement:
    Create a Kotlin program to develop an Employee Bonus Eligibility System using a Primary Constructor.

    Requirements:
    1. Create a class named Employee.
    2. Use a Primary Constructor to initialize the following properties:
       - Employee ID (Int)
       - Employee Name (String)
       - Employee Salary (Double)

    3. Inside the init Block:
       - Salary must not be negative.
       - If salary is negative, display an appropriate message and
         automatically store 0.0 as the salary.

    4. Create a member function named displayEmployeeDetails() that displays:
       - Employee ID
       - Employee Name
       - Employee Salary

    5. Create another member function named checkBonusEligibility().
       Rules:
       - If salary is greater than or equal to 50000,
         display "Bonus Eligible".
       - Otherwise,
         display "Not Eligible for Bonus".

    6. In the main() function:
       - Take input from the user.
       - Create only ONE Employee object using the entered values.
       - Call both member functions.
*/

class Employee(val employeeId: Int, val employeeName: String, var employeeSalary: Double)
{
    init {
        if(employeeSalary < 0)
        {
            println("Invalid Employee Salary!")
            employeeSalary = 0.0
        }
    }

    fun displayEmployeeDetails()
    {
        println("\nEmployee ID     : $employeeId")
        println("Employee Name   : $employeeName")
        println("Employee Salary : %.2f".format(employeeSalary))
    }

    fun checkBonusEligibility()
    {
        if(employeeSalary >= 50000) println("Bonus Eligible")
        else println("Not Eligible for Bonus")
    }
}

fun main()
{
    print("Enter Employee ID   : ")
    val id = readln().trim().toIntOrNull()
    print("Enter Employee Name : ")
    val name = readln().trim()
    print("Enter Salary        : ")
    val salary = readln().trim().toDoubleOrNull()
    if(id == null || id < 0 || name.isBlank() || salary == null)
    {
        println("Invalid Input")
        return
    }

    val employee = Employee(id, name, salary)
    employee.displayEmployeeDetails()
    employee.checkBonusEligibility()
}