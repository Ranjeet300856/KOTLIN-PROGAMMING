//Create a Kotlin program using Abstraction to generate different types of reports.
abstract class Report(val title: String) {
    abstract fun generateReport(): String
}

class SalesReport(title: String, val totalSales: Double) : Report(title) {
    override fun generateReport(): String {
        if(title.isBlank() || !totalSales.isFinite() || totalSales < 0) return "Invalid Report Data"
        else {
            println("Title       : $title")
            println("Total Sales : %.2f".format(totalSales))
            return "Report Generated Successfully\n"
        }
    }
}

class AttendanceReport(title: String, val totalStudents: Int, val presentStudents: Int) : Report(title) {
    override fun generateReport(): String {
        if(title.isBlank() || totalStudents <= 0 || presentStudents !in 0..totalStudents) return "Invalid Report Data"
        else {
            println("Title : $title")
            println("Total Student          : $totalStudents")
            println("Total Presented        : $presentStudents")
            println("Attendance Percentage  : %.2f%%".format((presentStudents.toDouble() / totalStudents.toDouble()) * 100))
            return "Report Generated Successfully"
        }
    }
}

fun main()
{
    val sales = SalesReport("Sales Report", 50000.0)
    val attendance = AttendanceReport("Attendance Report", 200, 150)

    val salesResult = sales.generateReport()
    println(salesResult)

    val attendanceResult = attendance.generateReport()
    println(attendanceResult)
}