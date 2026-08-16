//Write a Kotlin program that stores a list of student names and allows the user to search for a student by name.
fun main() 
{
    val students = listOf("Ravi", "Amit", "Neha", "Priya", "Rahul")
    students.forEach { print("$it, ") }

    print("Enter a student name to search : ")
    val searchName = readln().trim()
    if(searchName.isBlank())
    {
        println("Invalid Input!")
        return
    }

    try {
        val foundStudent = students.first { it.equals(searchName, ignoreCase = true) }
        println("Student Found : $foundStudent")
    } catch(e: NoSuchElementException) {
        println("Error: Student not found.")
    }

    println("Student search process completed.")
}