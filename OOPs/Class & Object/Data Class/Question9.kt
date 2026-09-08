/*
    Question 9 — Data Class with Collection

    Create a Kotlin data class named Student with the following properties:
    - id: Int
    - name: String
    - subjects: List<String>

    Create at least three Student objects.

    At least two Student objects must have the same id, name,
    and subjects data.

    Your program should:

    1. Print all Student objects.
    2. Demonstrate that two Student objects with exactly the same
       data are equal using ==.
    3. Demonstrate that equal Student objects have the same hashCode().
    4. Create a copy of one Student using copy().
    5. In the copied Student, add one new subject without modifying
       the original Student's subjects.
    6. Print the original and copied Student after the update.
    7. Verify that the original Student's subjects remain unchanged.
    8. Verify whether the original Student and copied Student are
       different objects.
*/

data class Student(
    val id: Int,
    val name: String,
    val subjects: List<String>
)

fun main()
{
    val student1 = Student(101, "Ranjeet", listOf("C++", "DSA", "SAD"))
    val student2 = Student(102, "Rahul", listOf("Java", "Kotlin", "AI/ML"))
    val student3 = Student(101, "Ranjeet", listOf("C++", "DSA", "SAD"))

    println("All Students:")
    println(student1)
    println(student2)
    println(student3)

    println("\nStudent 1 and Student 3 have same data ?   : ${student1 == student3}")
    println("Student 1 and Student 3 have same hashcode ? : ${student1.hashCode() == student3.hashCode()}")

    val newSubjects = student2.subjects + "Data Science"
    val student4 = student2.copy(subjects =  newSubjects)
    println("\nOrginal Student After Update : $student2")
    println("Copied Student                 : $student4")

    println("\nOriginal and Copied Student have different subjects : ${student4.subjects != student2.subjects}")
    println("Original Student and Copied Student Are different Object : ${student4 !== student2}")
}