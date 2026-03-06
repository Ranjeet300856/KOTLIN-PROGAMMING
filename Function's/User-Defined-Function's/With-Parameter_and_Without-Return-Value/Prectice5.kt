fun printStudentInfo(name: String, course: String)
{
    println("Student Name   : $name")
    println("Student Course : $course")
}
fun main()
{
    //Q5th
    /*
    Write a Kotlin program that defines a function printStudentInfo(name: String, course: String) which prints the student's name and course.
    Example:
    Student Name : Ranjeet
    Course       : BCA
    */

    print("Enter Student Name : ")
    var name = readln().trim()
    print("Enter Course Name : ")
    var course = readln().trim()
    if(name.isEmpty() || course.isEmpty() || !name.all { it.isLetter() || it == ' ' } || !course.all { it.isLetter() || it == ' ' })
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    printStudentInfo(name,course)
}