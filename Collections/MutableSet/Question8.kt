/*
    Question 8 — Online Course Enrollment Analyzer

    Problem Statement:
    Create a Kotlin program for an online learning platform using
    MutableSet<String>. The program should analyze enrollments in
    Kotlin Development and Android Development courses, remove
    duplicate entries automatically, and perform set operations
    to generate enrollment insights.
*/

fun sizeValidation(size: Int?): Boolean
{
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return true
    }
    else return false
}

fun inputName(set: MutableSet<String>, size: Int)
{
    for(i in 0 until size)
    {
        while(true)
        {
            print("Enter Student Name ${i + 1} : ")
            val name = readln().trim()
            if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()})
            {
                println("Invalid Student Name! Try Again")
                continue
            }

            set.add(name)
            break
        }
    }
}

fun output(set: Set<String>)
{
    for(value in set)
        println(value)
}

fun main()
{
    //Kotlin Development
    print("How many students enrolled in Kotlin Development? : ")
    val kotlinCount = readln().trim().toIntOrNull()
    if(sizeValidation(kotlinCount)) return

    val kotlinStudents = mutableSetOf<String>()
    inputName(kotlinStudents, kotlinCount!!)

    //Android Development
    print("\nHow many students enrolled in Android Development? : ")
    val androidCount = readln().trim().toIntOrNull()
    if(sizeValidation(androidCount)) return

    val androidStudents = mutableSetOf<String>()
    inputName(androidStudents, androidCount!!)

    //Output unique students both development side
    println("\nKotlin Development Students:")
        output(kotlinStudents)

    println("\nAndroid Development Students:")
        output(androidStudents)
    
    //Union
    val unionSet = kotlinStudents.union(androidStudents)
    println("\nAll Enrolled Students:")
        output(unionSet)
    
    //Intersection
    val intersectionSet = kotlinStudents.intersect(androidStudents)
    println("\nStudents Enrolled in Both Courses:")
        output(intersectionSet)
    
    //Subtract for Kotlin Development
    val subtractSet = kotlinStudents.subtract(androidStudents)
    println("\nStudents Enrolled Only in Kotlin Development:")
        output(subtractSet)
    
    //Subtract for Android Development
    val subtractSet2 = androidStudents.subtract(kotlinStudents)
    println("\nStudents Enrolled Only in Android Development:")
        output(subtractSet2)
    
    //Analysis
    println("\nTotal Kotlin Students    : ${kotlinStudents.size}")
    println("Total Android Students   : ${androidStudents.size}")
    println("Total Unique Students    : ${unionSet.size}")
    println("Students in Both Courses : ${intersectionSet.size}")
    println("Students Only in Kotlin  : ${subtractSet.size}")
    println("Students Only in Android : ${subtractSet2.size}")

    //Has more unique students.
    if(kotlinStudents.size > androidStudents.size)
        println("\nKotlin Development has more students.")

    else if(androidStudents.size > kotlinStudents.size)
        println("\nAndroid Development has more students.")
    
    else println("\nBoth courses have the same number of students.")
}