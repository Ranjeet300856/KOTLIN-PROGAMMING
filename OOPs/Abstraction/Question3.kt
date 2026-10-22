//Create a Kotlin program using Abstraction to calculate the salaries of different types of employees.
abstract class Employee(val name: String) {
    abstract fun calculateSalary(): Double
}

class FullTimeEmployee(val monthlySalary: Double, name: String) : Employee(name) {
    override fun calculateSalary(): Double {
        if(monthlySalary < 0 || !monthlySalary.isFinite()) {
            return -1.0
        } else {
            return monthlySalary
        }
    }
}

class PartTimeEmployee(val hoursWorked: Double, val hourlyRate: Double, name: String) : Employee(name) {
    override fun calculateSalary(): Double {
        if(hoursWorked < 0 || hourlyRate < 0 || !hoursWorked.isFinite() || !hourlyRate.isFinite()) {
            return -1.0
        } else {
            return hoursWorked * hourlyRate
        }
    }
}

fun main()
{
    val fullTimeEMP = FullTimeEmployee(40000.0, "Rahul")
    val partTimeEMP = PartTimeEmployee(8.0, 500.0, "Priya")

    val result1 = fullTimeEMP.calculateSalary()
    val result2 = partTimeEMP.calculateSalary()

    if(result1 == -1.0) {
        println("Invalid Monthly Salary")
    } else {
        println("Full Time Employee : ${fullTimeEMP.name}")
        println("Monthly Salary     : %.2f\n".format(result1))
    }

    if(result2 == -1.0) {
        println("Invalid HourWorked or HourlyRate")
    } else {
        println("Part Time Employee : ${partTimeEMP.name}")
        println("Calculated Salary  : %.2f".format(result2))
    }
}