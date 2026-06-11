/*
    Question 9 — University Event Registration System

    Problem Statement:
    Create a Kotlin program for a university technical event using
    MutableSet<String>. The program should manage Coding Competition
    and Hackathon registrations, support searching and removing
    participants, merge new registrations using addAll(), and
    analyze participation using set operations.
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
            if(name.isBlank() || !name.all {it.isLetter() || it.isWhitespace()})
            {
                println("Invalid Student Name! Try Again")
                continue
            }

            set.add(name)
            break
        }
    }
}

//Output Function
fun output(set: Set<String>)
{
    for(value in set)
        println("$value ")
}

//Main Function
fun main()
{
    //Input
    print("How many students registered for the Coding Competition? : ")
    val codingCount = readln().trim().toIntOrNull()
    if(sizeValidation(codingCount)) return

    val codingParticipants = mutableSetOf<String>()
    input(codingParticipants, codingCount!!)

    print("\nHow many students registered for the Hackathon? : ")
    val hackathonCount = readln().trim().toIntOrNull()
    if(sizeValidation(hackathonCount)) return

    val hackathonParticipants = mutableSetOf<String>()
    input(hackathonParticipants, hackathonCount!!)

    //Output
    println("\nCoding Competition Participants:")
    output(codingParticipants)

    println("\nHackathon Participants:")
    output(hackathonParticipants)

    //Search
    print("\nEnter a student name to search : ")
    val searchStudentName = readln().trim()
    if(nameValidation(searchStudentName)) return

    if(searchStudentName in codingParticipants && searchStudentName !in hackathonParticipants)
        println("\nStudent Found in Coding Participants")
    
    else if(searchStudentName !in codingParticipants && searchStudentName in hackathonParticipants)
        println("\nStudent Found in Hackatho Participants")
    
    else if(searchStudentName in codingParticipants && searchStudentName in hackathonParticipants)
        println("\nStudent Found in Both Events")
    
    else println("\nStudent Not Registered")

    //Remove
    print("\nEnter a student name to remove from Coding Competition : ")
    val removeName = readln().trim()
    if(nameValidation(removeName)) return

    if(codingParticipants.remove(removeName))
        println("Student removed successfully.")
    else println("Student does not exist.")

    //Add New Students
    print("\nHow many new Coding Competition participants do you want to add? : ")
    val newCount = readln().trim().toIntOrNull()
    if(sizeValidation(newCount)) return

    val newParticipants = mutableSetOf<String>()
    input(newParticipants, newCount!!)

    codingParticipants.addAll(newParticipants)

    //Set Operations
    val unionSet = codingParticipants.union(hackathonParticipants)
    println("\nAll Event Participants:")
    output(unionSet)

    val intersectionSet = codingParticipants.intersect(hackathonParticipants)
    println("\nParticipants in Both Events:")
    output(intersectionSet)

    val onlyCodingParticipants = codingParticipants.subtract(hackathonParticipants)
    println("\nOnly Coding Competition Participants:")
    output(onlyCodingParticipants)

    val onlyHackathonParticipants = hackathonParticipants.subtract(codingParticipants)
    println("\nOnly Hackathon Participants:")
    output(onlyHackathonParticipants)

    //Analysis Report
    println("Total Coding Competition Participants : ${codingParticipants.size}")
    println("Total Hackathon Participants          : ${hackathonParticipants.size}")
    println("Total Unique Participants             : ${unionSet.size}")
    println("Participants in Both Events           : ${intersectionSet.size}")
    println("Only Coding Participants              : ${onlyCodingParticipants.size}")
    println("Only Hackathon Participants           : ${onlyHackathonParticipants.size}")

    //Determine Participation Status
    if(codingParticipants.size > hackathonParticipants.size)
        println("\nCoding Competition has more participants.")
    
    else if(hackathonParticipants.size > codingParticipants.size)
        println("Hackathon has more participants.")
    
    else println("Both events have the same number of participants.")
}