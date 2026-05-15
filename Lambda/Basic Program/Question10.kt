/*
    Question 10 — Complete Lambda Fundamentals Demonstration
    Problem Statement - Write a Kotlin program that demonstrates all major basic Lambda concepts learned so far.

    Your program should include:
    A normal function for comparison.
    A lambda without parameters.
    A lambda with parameters.
    A lambda with return value.
    A lambda with explicit function type.
    A lambda using type inference.
    A lambda using the it keyword.
    A multi-line lambda.

    Printing a lambda variable itself.
    Calling lambdas using variable references.

    Proper output formatting and professional structure. 
*/

//Normal Function
fun printStudentData(name: String, age: Int, course: String)
{
    println("\nStudent Data: ")
    println("Student Name   : $name")
    println("Student Age    : $age")
    println("Student Course : $course")
}

//Lambda without parameter
fun lambdaWithoutPara()
{
    val lambdaFun = {
        val collegeName = "S.P.U. College, Falna"
        val universityName = "J.N.V. Jodhpur"

        println("\nStudent College Name  : $collegeName")
        println("University Name       : $universityName")
    }

    println("Lambda Variable: $lambdaFun")

    lambdaFun()
}

//Lambda with parameter and with return value + multiline lambda
var percentage: Double? = null
fun lambdaWithParaAndReturnValue()
{
    val lambdaFunWithPara = {
        marks: Int, totalMarks: Int ->

        println("Student Obtained Marks       : $marks")
        println("Total Marks                  : $totalMarks")
    }

    val lambdaWithReturnValue = {
        marks: Int, totalMarks: Int ->
        marks.toDouble() * 100 / totalMarks.toDouble()
    }

    while(true)
    {
        print("\nEnter Student Obtained Marks : ")
        val marks = readln().trim().toIntOrNull()
        print("Enter Total Marks            : ")
        val totalMarks = readln().trim().toIntOrNull()
        if(totalMarks == null || marks == null || totalMarks < 0 || marks < 0)
        {
            println("Invalid Marks")
            continue
        }

        lambdaFunWithPara(marks, totalMarks)

        percentage = lambdaWithReturnValue(marks, totalMarks)
        println("Percentages                  : %.2f".format(percentage))
        break
    }
}

//Lambda with explicit function and type inference
fun lambdaWithExplicitFunctionAndTypeInference()
{
    val lambdaWithExplicit: (Double) -> String = {
        per ->

        val grade = when
        {
            per >= 90 -> "A"
            per >= 75 -> "B"
            per >= 60 -> "C"
            per >= 40 -> "D"
            else -> "Fail"
        }

        grade
    }

    val grade = lambdaWithExplicit(percentage!!)
    println("Grade                        : $grade")

    val lambdaWithTypeInference = {
        per: Double ->

        if(per >= 40) "Eligible for next semester"
        else "Not eligible for next semester"
    }

    println("Result                       : ${lambdaWithTypeInference(percentage!!)}")
}

//Lambda with it keyword
fun lambdaWithItKeyword()
{
    val lambdaWithIt: (Int) -> Int = { 
        if(it == 8) 8
        else it + 1
    }

    while(true)
    {
        print("Enter Current Semester       : ")
        val sem = readln().trim().toIntOrNull()
        if(sem == null || sem <= 0 || sem > 8)
        {
            println("Invalid Input")
            continue
        }

        val nextSem = lambdaWithIt(sem)
        if(nextSem == 8) println("All Semester Completed")
        else println("Next Semester                : $nextSem")
        break
    }
}

//Main Fuction
fun main()
{
    //__Student_Datamanagement__

    print("Enter Student Name   : ")
    val studentName = readln().trim()
    print("Enter Student Age    : ")
    val studentAge = readln().trim().toIntOrNull()
    print("Enter Student Course : ")
    val studentCouse = readln().trim()

    if(studentName.isBlank() || studentAge == null || studentCouse.isBlank() || studentAge <= 0 || !studentName.all { it.isLetter() || it.isWhitespace() })
    {
        println("Invalid Input")
        return
    }

    printStudentData(studentName, studentAge, studentCouse)
    lambdaWithoutPara()
    lambdaWithParaAndReturnValue()
    lambdaWithExplicitFunctionAndTypeInference()
    lambdaWithItKeyword()
}