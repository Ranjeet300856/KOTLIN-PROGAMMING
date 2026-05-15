/*
    Question 4 — Lambda With Parameters but Without Meaningful Return Value
    Problem Statement - Write a Kotlin program that demonstrates a Lambda Function:
    With Parameters
    Without Meaningful Return Value (Unit)

    Your program should:
    Create a lambda that takes a student's name and age as parameters.
    The lambda should print the student's details properly.
    Store the lambda inside a variable.
    Call the lambda using multiple test values.

    Also create the same functionality using a normal function for comparison. 
*/

fun studentInfoUsingNormalFun(name: String, age: Int)
{
    println("Student Name : $name")
    println("Student Age  : $age")
    println()
}

fun main()
{
    //Create Lambda Function
    val studentInfo = {
        name: String, age: Int ->
        println("Student Name : $name")
        println("Student Age  : $age")
        println()
    }

    studentInfo("Ranjeet Suthar", 19)
    studentInfo("Rahul Suthar", 18)

    studentInfoUsingNormalFun("Jagdish Suthar", 20)
    studentInfoUsingNormalFun("Bhavesh", 20)
}