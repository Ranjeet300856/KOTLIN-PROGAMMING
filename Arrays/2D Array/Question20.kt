/*
    Write a Kotlin program to create an Employee Attendance Dashboard for 5 employees over 7 days.
    Use the following 2D Arrays:
    Array<String> → Store employee names (1D)
    Array<Array<Boolean>> → Attendance matrix
    true = Present
    false = Absent
    Array<Double> → Store salary per day for each employee (1D)

    Tasks:
    Store names of 5 employees.
    Store attendance for 7 days.
    Store per-day salary for each employee.
    Display attendance table using:
    P = Present
    A = Absent
    For each employee print:
    Total Present Days
    Total Absent Days
    Total Salary Earned
    Print the employee with highest attendance. 
*/

fun main()
{
    //-----1D Array (Store Employee Names)-----//

    val name = Array<String>(5) { "" }     //Array Creation

    //Input Names
    for(i in name.indices)
    {
        while(true)
        {
            print("Enter Employee ${i+1} Name : ")
            val input = readln().trim()

            if(!input.isEmpty() && input.all { it.isLetter() || it.isWhitespace() })  
            {
                name[i] = input
                break
            }

            else println("Invalid Input! Try Again")
        }
    }
    println()


    //-----2D Array (Store Employee Attendance)-----//

    val attendance = Array(5) { BooleanArray(7) }       //Array Creation
    
    //Input Attendance
    for(row in attendance.indices)
    {
        for(col in attendance[row].indices)
        {
            while(true)
            {
                print("Enter Day ${col + 1} Attendance of Employee ${row + 1} : ")
                val input = readln().trim().lowercase()

                if(input == "present")
                {
                    attendance[row][col] = true
                    break
                }

                else if(input == "absent")
                {
                    attendance[row][col] = false
                    break
                }

                else println("Invalid Input! Try Again")
            }
        }
        println()
    }
    println()


    //-----1D Array (Store Employee Salary)-----//

    val salary = DoubleArray(5)     //Array Creation

    //Input
    for(i in salary.indices)
    {
        while(true)
        {
            print("Enter Employee ${i + 1} Salary : ")
            val inputSalary = readln().trim().toDoubleOrNull()
            if(inputSalary == null || inputSalary <= 0)
            {
                println("Invalid Salary! Try Again")
                continue
            }

            salary[i] = inputSalary
            break
        }
    }
    println()


    //-----Output-----//

    var highestAttendance = -1
    var highestAttendanceEmployee: String = ""

    println("Employee Dashboard: \n")

    for(i in name.indices)
    {
        print("${name[i]} : ")
        for(j in attendance[i].indices)
        {
            if(attendance[i][j]) print("P ")
            else print("A ")
        }

        println()
        val p = countPresent(attendance[i])
        val a = countAbsent(attendance[i])

        print("Present = $p | ")
        print("Absent  = $a | ")
        print("Salary  = ${salary[i] * p }")

        if(p > highestAttendance)
        {
            highestAttendance = p 
            highestAttendanceEmployee = name[i]
        }

        println("\n")
    }

    println("Highest Attendance = ${highestAttendanceEmployee} ($highestAttendance Days)")
}

fun countPresent(arr: BooleanArray): Int
{
    var countP = 0
    for(i in arr.indices)
    {
        if(arr[i]) countP++
    }

    return countP
}

fun countAbsent(arr: BooleanArray): Int
{
    var countA = 0
    for(i in arr.indices)
    {
        
        if(!arr[i]) countA++    
    }

    return countA
}