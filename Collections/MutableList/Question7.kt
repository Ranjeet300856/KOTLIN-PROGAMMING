/*
    Question 7: Student Attendance Report
    Problem Statement
    Create a Kotlin program that manages student attendance using a MutableList<Boolean>.

    Requirements
    1. Ask the user to enter attendance for 5 students.
    Rules:
    Enter true for Present.
    Enter false for Absent.
    Invalid input should be rejected and asked again.
    Store all attendance records in a:
    MutableList<Boolean>

    2. Print the complete attendance list.
    Exampe:
    [true, false, true, true, false]

    3. Count and print:
    Total Present Students
    Total Absent Students

    4. Calculate and print:
    Attendance Percentage
    Formula: (Total Present / Total Students) × 100

    5. Ask the user:
    Enter student index:
    Then print: Present or Absent
    for that student. 
*/

fun main()
{
    val studentAttendances = mutableListOf<Boolean>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Student Attendance (Present or Absent) : ")
            val attendance = readln().trim().lowercase()
            if(attendance.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            if(attendance == "present") studentAttendances.add(true)
            else if(attendance == "absent") studentAttendances.add(false)
            else
            {
                println("Invalid Attendance Input! Try Again")
                continue
            }
            break
        }
    }

    println("\nAttendance List : $studentAttendances")

    var countPresent = 0
    var countAbsent = 0
    for(value in studentAttendances)
    {
        if(value) countPresent++
        else countAbsent++
    }

    println("\nTotal Present         : $countPresent")
    println("Total Absent          : $countAbsent")

    val attendancePercentage = if(studentAttendances.isNotEmpty()) countPresent / studentAttendances.size.toDouble() * 100 else 0.0
    println("Attendance Percentage : %.2f".format(attendancePercentage))

    print("\nEnter Student Index : ")
    val index = readln().trim().toIntOrNull()
    if(index == null || index < 0 || index >= studentAttendances.size)
    {
        println("Invalid Input")
        return
    }

    val result = studentAttendances[index]
    if(result) println("Student Present")
    else println("Studnet Absent")
}