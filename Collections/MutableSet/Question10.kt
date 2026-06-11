/*
    Question 10 — National Coding Olympiad Registration System

    Problem Statement:
    Create a Kotlin program for a National Coding Olympiad using
    MutableSet<String>. The program should manage registrations
    across Junior, Senior, and Open categories, support searching,
    removing, merging registrations, perform set operations,
    and generate participation reports.
*/

//Size Validation
fun sizeValidation(size: Int?): Boolean
{
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return true
    }
    else return false
}

//Name Validation
fun nameValidation(name: String): Boolean
{
    if(name.isBlank() || !name.all {it.isLetter() || it.isWhitespace()}) return true
    else return false
}

//Input Function
fun input(set: MutableSet<String>, size: Int)
{
    for(i in 0 until size)
    {
        while(true)
        {
            print("Enter Student Name ${i + 1} : ")
            val name = readln().trim()
            if(nameValidation(name))
            {
                println("Invalid Student Name! Try Again")
                continue
            }

            set.add(name)
            break
        }
    }

    println()
}

//Output Function
fun output(set: Set<String>)
{
    for(value in set)
        println("$value")
}

//Main Function
fun main()
{
    //Input
    print("How many students registered in Junior Category? : ")
    val juniorCount = readln().trim().toIntOrNull()
    if(sizeValidation(juniorCount)) return
    val juniorStudents = mutableSetOf<String>()

    print("How many students registered in Senior Category? : ")
    val seniorCount = readln().trim().toIntOrNull()
    if(sizeValidation(seniorCount)) return
    val seniorStudents = mutableSetOf<String>()

    print("How many students registered in Open Category?   : ")
    val openCount = readln().trim().toIntOrNull()
    if(sizeValidation(openCount)) return
    val openStudents = mutableSetOf<String>()

    println("Enter Junior Students:") 
        input(juniorStudents, juniorCount!!)

    println("Enter Senior Students:") 
        input(seniorStudents, seniorCount!!)

    println("Enter Open Students:") 
        input(openStudents, openCount!!)

    //Output
    println("\n\nJunior Category Students:")
    output(juniorStudents)

    println("\nSenior Category Students:")
    output(seniorStudents)

    println("\nOpen Category Students:")
    output(openStudents)

    //Search
    print("\nEnter a student name to search : ")
    val searchName = readln().trim()
    if(nameValidation(searchName))
    {
        println("Invalid Student Name")
        return
    }

    val result = when{
        searchName in juniorStudents && searchName in seniorStudents && searchName in openStudents -> "Student Found in In All Three Categories"
        searchName in juniorStudents && searchName in seniorStudents   -> "Student Found in Junior and Senior Students"
        searchName in juniorStudents && searchName in openStudents     -> "Student Found in Junior and Open Students"
        searchName in seniorStudents && searchName in openStudents     -> "Student Found in Senior and Open Students"

        searchName in juniorStudents -> "Student Found in Junior Students"
        searchName in seniorStudents -> "Student Found in Senior Students"
        searchName in openStudents   -> "Student Found in Open Students"
        
        else -> "Student Not Registered"
    }

    println(result)

    //Remove
    print("\nEnter a student name to remove from Open Category : ")
    val removeStudent = readln().trim()
    if(nameValidation(removeStudent))
    {
        println("Invalid Student Name")
        return
    }

    if(openStudents.remove(removeStudent))
        println("Student removed successfully.")
    else println("Student does not exist.")

    //Input New Open Students
    print("\nHow many new Open Category students do you want to add? : ")
    val newOpenCount = readln().trim().toIntOrNull()
    if(sizeValidation(newOpenCount)) return

    val newOpenStudents = mutableSetOf<String>()
    println("Enter New Open Students:")
    input(newOpenStudents, newOpenCount!!)
    openStudents.addAll(newOpenStudents)

    //Set Operation
    val unionSet = juniorStudents.union(seniorStudents).union(openStudents)
    println("\nAll Olympiad Participants:")
    output(unionSet)

    val intersectSet = juniorStudents.intersect(seniorStudents).intersect(openStudents)
    println("\nStudents in All Three Categories:")
    output(intersectSet)
    
    val onlyJunior = juniorStudents.subtract(seniorStudents).subtract(openStudents)
    println("\nOnly Junior Students:")
    output(onlyJunior)

    val onlySenior = seniorStudents.subtract(juniorStudents).subtract(openStudents)
    println("\nOnly Senior Students:")
    output(onlySenior)

    val onlyOpen = openStudents.subtract(juniorStudents).subtract(seniorStudents)
    println("\nOnly Open Students:")
    output(onlyOpen)

    //Final Analysis
    println("\nTotal Junior Students           : ${juniorStudents.size}")
    println("Total Senior Students           : ${seniorStudents.size}")
    println("Total Open Students             : ${openStudents.size}")
    println("Total Unique Participants       : ${unionSet.size}")
    println("Students In All Three Categories: ${intersectSet.size}")
    println("Only Junior Students            : ${onlyJunior.size}")
    println("Only Senior Students            : ${onlySenior.size}")
    println("Only Open Students              : ${onlyOpen.size}")

    //Determine the Largest Category
    if(juniorStudents.size > seniorStudents.size && juniorStudents.size > openStudents.size)
        println("\\nJunior Category has the most students.")
    
    else if(seniorStudents.size > juniorStudents.size && seniorStudents.size > openStudents.size)
        println("\nSenior Category has the most students.")
    
    else if(openStudents.size > juniorStudents.size && openStudents.size > seniorStudents.size)
        println("\nOpen Category has the most students.")
    
    else println("\nTwo or more categories are tied for the highest count.")
}