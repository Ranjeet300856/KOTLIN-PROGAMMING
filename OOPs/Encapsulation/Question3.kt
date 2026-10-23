//Question 3: Employee Salary Management
class Employee() {
    var salary: Double = 25000.0
        set(value) {
        if(value <= 0) {
            println("Invalid New Salary: $value")
        } else {
            field = value
            println("Salary Updated Successfully: $value")
        }
    }
}

fun displaySalary(employee: Employee) {
    println("Current Salary : %.2f\n".format(employee.salary))
}

fun main()
{
    val employee = Employee()
    displaySalary(employee)

    employee.salary = 30000.0
    displaySalary(employee)

    employee.salary = -10000.0
    displaySalary(employee)
}