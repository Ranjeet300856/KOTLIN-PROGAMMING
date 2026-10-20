//Question 2: Employee Salary Calculation System
abstract class Employee(val name: String) {
    abstract fun calculateSalary(): Double
}

class FullTimeEmployee(val monthlySalary: Double, name: String) : Employee(name) {
    override fun calculateSalary() = monthlySalary
}

class PartTimeEmployee(val hourlyRate: Double, val totalHours: Double, name: String) : Employee(name) {
    override fun calculateSalary() = hourlyRate * totalHours
}

class ContractEmployee(val amount: Double, name: String) : Employee(name) {
    override fun calculateSalary() = amount
}

fun main()
{
    val fullTimeEmployee = FullTimeEmployee(50000.0, "Rahul")
    val partTimeEmployee = PartTimeEmployee(500.0, 40.0, "Amit")
    val contractEmployee = ContractEmployee(75000.0, "Priya")

    val employees = listOf(fullTimeEmployee, partTimeEmployee, contractEmployee)
    for(employee in employees) {
        val salary = employee.calculateSalary()
        println("Employee : ${employee.name}, Salary : ${salary}")
    }
}