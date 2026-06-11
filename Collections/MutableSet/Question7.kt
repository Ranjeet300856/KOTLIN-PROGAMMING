/*
    Question 7 — Coding Club vs Sports Club Analyzer

    Problem Statement:
    Create a Kotlin program that manages Coding Club and Sports Club
    memberships using MutableSet<String>. The program should validate
    student names, remove duplicates automatically, and perform
    union, intersection, and difference operations.
*/

fun inputName(set: MutableSet<String>, size: Int)
{
    for(i in 0 until size)
    {
        while(true)
        {
            print("Enter Student Name : ")
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

fun output(set: MutableSet<String>)
{
    for(value in set) 
    println(value)
}

fun sizeValidation(size: Int?): Boolean = size == null || size <= 0

fun main()
{
    print("How many students are in the Coding Club? : ")
    val codingCount = readln().trim().toIntOrNull()
    if(sizeValidation(codingCount))
    {
        println("Invalid Input")
        return
    }

    val codingClub = mutableSetOf<String>()
    inputName(codingClub, codingCount!!)

    print("How many students are in the Sports Club? : ")
    val sportsCount = readln().trim().toIntOrNull()
    if(sizeValidation(sportsCount))
    {
        println("Invalid Input")
        return
    }

    val sportsClub = mutableSetOf<String>()
    inputName(sportsClub, sportsCount!!)

    println("\nCoding Club Students:")
    output(codingClub)

    println("\nSports Club Students:")
    output(sportsClub)

    val uniqueStudents = codingClub.union(sportsClub).toMutableSet()
    println("\nAll Students (Union):")
    output(uniqueStudents)

    val commonStudents = codingClub.intersect(sportsClub).toMutableSet()
    println("\nStudents in Both Clubs:")
    output(commonStudents)

    val onlyCodingClubStudents = codingClub.subtract(sportsClub).toMutableSet()
    println("\nOnly Coding Club Students:")
    output(onlyCodingClubStudents)

    val onlySportClubStudents = sportsClub.subtract(codingClub).toMutableSet()
    println("\nOnly Sport Club Students:")
    output(onlySportClubStudents)

    println("\nTotal Coding Club Students : ${codingClub.size}")
    println("\nTotal Sports Club Students : ${sportsClub.size}")
    println("\nTotal Unique Students      : ${uniqueStudents.size}")
}