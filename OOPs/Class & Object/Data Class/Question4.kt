/*
    Question 4 — Student Profile Comparison

    Create a Kotlin data class named Student with the following properties
    in the primary constructor:
    - id: Int
    - name: String
    - course: String

    Inside the class body, create an additional property:
    - college: String

    Create two Student objects with:
    - The same id
    - The same name
    - The same course
    - Different college values

    Your program should:

    1. Print both Student objects.
    2. Compare both objects using the == operator.
    3. Demonstrate whether the college property affects equality.
    4. Print the hashCode() of both objects.
    5. Clearly show the result of the comparison in the output.

    Do not manually override equals(), hashCode(), or toString().
*/

data class Student(
    val id: Int,
    val name: String,
    val course: String
) {
    var college: String? = null
}

fun main()
{
    val student1 = Student(101, "Rahul", "BCA")
    val student2 = student1.copy()
    student1.college = "SPU College"
    student2.college = "AD College"

    println("Student 1 : $student1")
    println("Student 2 : $student2")

    println("Student 1 College : ${student1.college}")
    println("Student 2 College : ${student2.college}")
    println("Are Students Equal? : ${student1 == student2}")
    println("\nHash Code of Student 1 : ${student1.hashCode()}")
    println("Hash Code of Student 2 : ${student2.hashCode()}")
}