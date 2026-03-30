//Q16th
/*
    Write a Kotlin program to simulate a classroom test monitoring system using labeled loops.

    Problem Description:
    There are 3 classrooms (Class 1 to 3)
    Each classroom has 5 students (Student 1 to 5) 
*/

fun main()
{
    outer@ for(classroom in 1..3)
    {
        for(student in 1..5)
        {
            print("Class $classroom - Student $student (present/absent/cheat/skip/end): ")
            var input = readln().trim().lowercase()

            if(input == "end") break@outer
            if(input == "skip") continue@outer
            if(input == "absent")
            {
                println("Student $student in Class $classroom is Absent")
                continue
            }
            if(input == "cheat")
            {
                println("Cheating Detected - Classroom Terminated")
                continue@outer
            }
            if(input == "present") println("Student $student in Class $classroom is Present")
            else
            {
                println("Invalid Input")
                continue
            }
        }
    }
}