/*
    Question 4: Student Grade Analyzer Using LinkedHashMap
    Problem Statement
    Create a Kotlin program to analyze student grades using LinkedHashMap<Int, Char>. 
*/

fun isValidInteger(x: Int?): Boolean
{
    if(x == null || x <= 0)
    {
        println("Invalid Input!")
        return false
    }
    else return true
}

fun inputRollNumber(studentGrades: LinkedHashMap<Int, Char>): Int
{
    while(true)
    {
        print("\nEnter Roll Number : ")
        val rollNumber = readln().trim().toIntOrNull()
        if(!isValidInteger(rollNumber)) continue
        if(studentGrades.containsKey(rollNumber))
        {
            println("This roll number already exists! please enter new roll number")
            continue
        }

        return rollNumber!!
    }
}

fun inputGrade(): Char
{
    while(true)
    {
        print("Enter Grade : ")
        val grade = readln().trim().uppercase()
        if(grade.isBlank() || grade.length != 1)
        {
            println("Invalid Input! Try Again")
            continue
        }

        if(grade in "ABCDF")
        return grade[0]
        else println("Invalid Grade! Try Again")
    }
}

fun checkEmpty(studentGrades: LinkedHashMap<Int, Char>): Boolean
{
    if(studentGrades.isEmpty())
    {
        println("No Student Records!")
        return true
    }
    else return false
}

fun display(studentGrades: LinkedHashMap<Int, Char>)
{
    if(checkEmpty(studentGrades)) return
    println("\nStudent Records:")
    for((key, value) in studentGrades.entries)
    println("$key -> $value")
}

fun gradeAnalysis(studentGrades: LinkedHashMap<Int, Char>)
{
    if(checkEmpty(studentGrades)) return
    var totalAGrade = 0
    var totalBGrade = 0
    var totalCGrade = 0
    var totalDGrade = 0
    var totalFGrade = 0
    for(value in studentGrades.values)
    {
        when(value)
        {
            'A' -> totalAGrade++
            'B' -> totalBGrade++
            'C' -> totalCGrade++
            'D' -> totalDGrade++
            'F' -> totalFGrade++
        }
    }

    println("Total Students : ${studentGrades.size}")
    println("Total students with Grade A : $totalAGrade")
    println("Total students with Grade B : $totalBGrade")
    println("Total students with Grade C : $totalCGrade")
    println("Total students with Grade D : $totalDGrade")
    println("Total students with Grade F : $totalFGrade")
}

fun highestGradeStudents(studentGrades: LinkedHashMap<Int, Char>)
{
    if(checkEmpty(studentGrades)) return
    println("\nStudents with Grade A")
    for((key, value) in studentGrades.entries)
    if(value == 'A') println("$key -> $value")
}

fun lowestGradeStudents(studentGrades: LinkedHashMap<Int, Char>)
{
    if(checkEmpty(studentGrades)) return
    println("\nStudents with Grade F")
    for((key, value) in studentGrades.entries)
    if(value == 'F') println("$key -> $value")
}

fun main()
{
    val studentGrades = LinkedHashMap<Int, Char>()
    print("Enter total number of students : ")
    val totalStudent = readln().trim().toIntOrNull()
    if(!isValidInteger(totalStudent)) return

    var i = 1
    while(i <= totalStudent!!)
    {
        val rollNumber = inputRollNumber(studentGrades)
        val grade = inputGrade()
        studentGrades[rollNumber] = grade
        println("Student Grade Added Successfully")
        i++
    }
    display(studentGrades)

    gradeAnalysis(studentGrades)
    highestGradeStudents(studentGrades)
    lowestGradeStudents(studentGrades)
}