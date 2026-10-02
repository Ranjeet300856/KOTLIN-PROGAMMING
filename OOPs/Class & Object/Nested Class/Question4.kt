/*
    Question 4 — Nested Class with Encapsulation
    Employee Department System

    Create a Kotlin program using a Nested Class. 
*/

class Employee {
    class Department(
        val departmentName: String,
        private val departmentCode: Int,
        val location: String
    ) {
        fun displayDepartment() {
            println("Department Name : $departmentName")
            println("Department Code : $departmentCode")
            println("Location        : $location")
        }

        fun isValidDepartmentCode(): Boolean {
            if(departmentCode in 100..999) return true
            else return false
        }
    }
}

fun main()
{
    val department1 = Employee.Department("Engineering", 101, "Jaipur")
    val department2 = Employee.Department("Human Resources", 205, "Delhi")
    val department3 = Employee.Department("Finance", 99, "Mumbai")

    val department1IsValidCode = if(department1.isValidDepartmentCode()) "Yes" else "No"
    val department2IsValidCode = if(department2.isValidDepartmentCode()) "Yes" else "No"
    val department3IsValidCode = if(department3.isValidDepartmentCode()) "Yes" else "No"

    department1.displayDepartment()
    println("Valid Code : $department1IsValidCode")
    println()

    department2.displayDepartment()
    println("Valid Code : $department2IsValidCode")
    println()

    department3.displayDepartment()
    println("Valid Code : $department3IsValidCode")

    //val departmentCode = department1.deparmentCode <- Error
}