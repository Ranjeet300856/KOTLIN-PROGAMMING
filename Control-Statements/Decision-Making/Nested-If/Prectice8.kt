//Q8th
/*
    Write a Kotlin program that evaluates a student’s result.
    Inputs:
    marks (Int)
    attendance (Int in %)
    hasMedical (String: "yes"/"no")

    Rules
    Step 1: Validation
    If marks < 0 OR marks > 100 OR attendance < 0 OR attendance > 100
    → print "Invalid Input"
    Step 2: Eligibility Check

    If attendance ≥ 75: Student is eligible for result
    Else:
    If hasMedical = "yes": Eligible
    Else:
    print "Not Eligible due to Low Attendance"

    Step 3: Result Logic
    If eligible:
    If marks ≥ 90 → "Excellent"
    Else:
    If marks ≥ 75 → "Good"
    Else:
    If marks ≥ 50 → "Average"
    Else:
    If marks ≥ 33 → "Pass"
    Else → "Fail"

    Output: Print result grade OR eligibility message
*/

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    print("Enter Attendance in % : ")
    val attendance = readln().trim().toIntOrNull()
    print("hasMedical ? (yes/no) : ")
    val hasMedical = readln().trim().lowercase()

    //Validation
    if(marks == null || attendance == null || marks < 0 || marks > 100 || attendance < 0 || attendance > 100)
    {
        println("Invalid Input")
        return
    }
    if(hasMedical != "yes" && hasMedical != "no")
    {
        println("Invalid Input")
        return
    }

    //Eligibility Check
    var eligible = false
    if(attendance >= 75)
    {
        eligible = true
    }
    else
    {
        if(hasMedical == "yes")
        {
            eligible = true
        }
        else
        {
            println("Not Eligible due to Low Attendance")
            return
        }
    }

    //Result
    if(eligible)
    {
        if(marks >= 90)
        {
            println("Excellent")
        }
        else if(marks >= 75)
        {
            println("Good")
        }
        else if(marks >= 50)
        {
            println("Average")
        }
        else if(marks >= 33)
        {
            println("Pass")
        }
        else
        {
            println("Fail")
        }
    }
}