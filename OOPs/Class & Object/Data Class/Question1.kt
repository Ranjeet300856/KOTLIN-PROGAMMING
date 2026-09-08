/*
    Question 1 — Student Data Model

    Create a Kotlin data class named Student that represents a student
    with the following properties:
    - id: Int
    - name: String
    - age: Int
    - course: String

    Create at least two Student objects with different data.

    Your program should:
    1. Print each Student object.
    2. Demonstrate that two Student objects containing the same data
    are considered equal.
    3. Print the hashCode() of the Student objects.

    Use only the functionality provided by the data class.
    Do not manually override toString(), equals(), or hashCode().
*/

data class Student(
    val id: Int,
    val name: String,
    val age: Int,
    val course: String
)

fun main()
{
    val student1 = Student(101, "Ranjeet Suthar", 19, "BCA")
    val student2 = Student(101, "Ranjeet Suthar", 19, "BCA")

    println("Student 1 : $student1")
    println("Student 2 : $student2")
    println("Student have same data : ${student1 == student2}")
    println("Hash Code of Student 1 : ${student1.hashCode()}")
    println("Hash Code of Student 2 : ${student2.hashCode()}")
}