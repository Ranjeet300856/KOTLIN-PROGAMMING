// Question 8: Create an Employee Attendance and Leave Management System using Kotlin's Enum Class.
enum class EmployeeAttendance(val description: String, val workingDays: Double) {
    PRESENT("Employee is present", 1.0),
    ABSENT("Employee is absent", 0.0),
    HALF_LEAVE("Employee worked half a day", 0.5),
    ON_LEAVE("Employee is on leave", 0.0);

    init {
        if(workingDays !in 0.0..1.0) {
            throw IllegalArgumentException("Invalid Working Days")
        }
    }

    fun getAttendanceStatus(): String {
        return when(this) {
            PRESENT -> "Full Day"
            ABSENT -> "Absent"
            HALF_LEAVE -> "Half Day"
            ON_LEAVE -> "On Leave"
        }
    }

    fun displayAttendanceDetails() {
        println("Attendance Status : ${this.name}")
        println("Description       : $description")
        println("Working Days      : $workingDays")
        println("Attendance Result : " + getAttendanceStatus() + "\n")
    }
}

fun main()
{
    for(employeeAttendance in EmployeeAttendance.entries) {
        employeeAttendance.displayAttendanceDetails()
    }
}