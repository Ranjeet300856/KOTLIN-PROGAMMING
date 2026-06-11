/*
    Question 4 — Dynamic Student Grade Evaluator Using Function as Parameter
    Problem Statement - Create a Kotlin program that evaluates student marks using different grading strategies passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different grading logics. 
*/

fun isPass(marks: Int): Boolean = marks >= 33
fun isDistinction(marks: Int): Boolean = marks >= 75
fun isFail(marks: Int): Boolean = marks < 33

fun evaluateStudent(marks: Int, evaluateMarks: (Int) -> Boolean): Boolean = evaluateMarks(marks)

fun main()
{
    print("Enter Student Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Input")
        return
    }

    println("Pass Status        : ${evaluateStudent(marks, ::isPass)}")
    println("Distinction Status : ${evaluateStudent(marks, ::isDistinction)}")
    println("Fail Status        : ${evaluateStudent(marks, ::isFail)}")
}