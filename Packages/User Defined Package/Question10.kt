/*
    Question 10 — Advanced Package-Based Utility Management System (Final Project)
    Problem Statement -  Create a Kotlin utility-based mini management system using multiple Nested Packages and reusable utility functions. 
*/

import course.discount.calculateDiscount
import course.finalamount.calculateFinalFee
import course.formatter.formatStudentName
import course.formatter.formatCourseName
import course.validation.validateStudentName
import course.validation.validateCourseName
import course.validation.validateCourseFee

fun main()
{
    //Input
    print("Enter Student Name : ")
    val studentName = readln().trim()

    print("Enter Course Name  : ")
    val courseName = readln().trim()

    print("Enter Course Fees  : ")
    val courseFee = readln().trim().toDoubleOrNull()

    //Validation
    var isValid = true
    if(!validateStudentName(studentName)) isValid = false
    if(!validateCourseName(courseName)) isValid = false
    if(!validateCourseFee(courseFee)) isValid = false

    if(!isValid)
    {
        println("Invalid Course Details")
        return
    }

    //Output
    println("Student Name     : ${formatStudentName(studentName)}")
    println("Course Name      : ${formatCourseName(courseName)}")
    println("Original Fee     : %.2f".format(courseFee))
    println("Discount Amount  : %.2f".format(calculateDiscount(courseFee!!)))
    println("Final Fee        : %.2f".format(calculateFinalFee(courseFee, calculateDiscount(courseFee))))
}