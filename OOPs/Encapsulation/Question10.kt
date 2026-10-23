//Question 10: Employee Performance Management
class Employee(
    val name: String,
    private var salary: Double,
    private var rating: Int = 0
) {
    val performanceLevel: String
        get() = when(rating) {
            0 -> "Not Rated"
            1,2 -> "Need Improvement"
            3 -> "Good"
            4 -> "Very Good"
            else -> "Excellent"
        }

    init {
        require(salary >= 0) {
            "Initial Salary is Cannot Negative"
        }
    }

    fun udpateSalary(newSalary: Double) {
        if(newSalary <= 0) println("Invalid New Salary")
        else {
            salary = newSalary
            println("Salary Updated Successfully")
        }
    }

    fun updateRating(newRating: Int) {
        if(newRating !in 1..5) println("Invalid New Rating")
        else {
            rating = newRating
            println("Rating Updated Successfully")
        }
    }

    fun displayDetails() {
        println("Employee Name : $name")
        println("Salary        : %.2f".format(salary))
        println("Performance   : $performanceLevel\n")
    }
}

fun main()
{
    val employee = Employee("Rahul", 30000.0)
    employee.displayDetails()

    employee.udpateSalary(35000.0)
    employee.updateRating(5)
    employee.displayDetails()

    employee.udpateSalary(-50000.0)
    employee.updateRating(6)
    employee.displayDetails()
}