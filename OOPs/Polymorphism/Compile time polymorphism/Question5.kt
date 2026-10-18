//Question 5: Student Information Using Constructor Overloading
class Student {
    var name: String = ""
    var age: Int = 0

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String,  age: Int) {
        this.name = name
        this.age = age
    }
}

fun main()
{
    val student1 = Student("Ranjeet")
    val student2 = Student("Amit", 20)

    println("Student 1st Name : ${student1.name}")
    println("Student 1st Age  : ${student1.age}")

    println("\nStudent 2nd Name : ${student2.name}")
    println("Student 2nd Age  : ${student2.age}")
}