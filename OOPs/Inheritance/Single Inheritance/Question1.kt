//Create a Kotlin program to manage employee information using Single Inheritance.
open class Person(val name: String, var age: Int, val gender: String)
{
    init {
        println("Parant Class Executed")
    }
    fun displayPerson()
    {
        println("Name   : $name")
        println("Age    : $age")
        println("Gender : $gender")
    }
}

class Employee(
    val employeeId: Int, 
    var department: String, 
    private var salary: Double, 
    name: String, age: Int, 
    gender: String
) : Person(name, age, gender)
{
    fun displayEmployee()
    {
        println("Employee ID : $employeeId")
        println("Department  : $department")
        println("Salary      : %.2f".format(salary))
    }
}

fun main()
{
    val employee = Employee(
        1001,
        "Computer Science",
        200000.0,
        "Rahul",
        20,
        "Male",
    )

    employee.displayPerson()
    employee.displayEmployee()
}