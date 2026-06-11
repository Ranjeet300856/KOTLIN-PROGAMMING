/*
    Question 2 — Subject Marks Directory
    Problem Statement

    Create a Kotlin program to manage subject marks using an Immutable Map.

    Requirements
    Create an immutable map named subjectMarks.
    Store the following data:
    "Mathematics" -> 95
    "Physics"     -> 88
    "Chemistry"   -> 91
    "English"     -> 85
    "Computer"    -> 99

    Print the complete map.
    Print the total number of subjects.
    Print all subject names.
    Print all marks.
    Print the marks obtained in "Computer".
    Check whether the subject "Biology" exists or not.
    Check whether the mark 100 exists or not.
    Print appropriate messages for all checks.

    Additional Requirement
    Create the following variables:
    val subjectName = "Physics"
    val mark = 91

    Then:
    Check whether subjectName exists in the map.
    Check whether mark exists in the map.
    Print appropriate messages. 
*/

fun main()
{
    val subjectMarks = mapOf(
        "Mathematics" to 95,
        "Physics"     to 88,
        "Chemistry"   to 91,
        "English"     to 85,
        "Computer"    to 99
    )

    println("Subjects & Marks : $subjectMarks")
    println("Total Subjects   : ${subjectMarks.size}")
    println("All Subjects     : ${subjectMarks.keys}")
    println("All Marks        : ${subjectMarks.values}")
    println("Computer Marks   : ${subjectMarks["Computer"]}")

    if(subjectMarks.containsKey("Biology")) println("\nBiology subject is exists")
    else println("\nBiology subject is dose not exists")

    if(subjectMarks.containsValue(100)) println("100 marks is exists")
    else println("100 marks dose not exists")

    val subjectName = "Physics"
    val mark = 91
    if(subjectMarks.containsKey(subjectName)) println("$subjectName subject is exists in map")
    else println("$subjectName subject dose not exists in map")

    if(subjectMarks.containsValue(mark)) println("Marks $mark is exists in map")
    else println("Marks $mark dose not exists in map")
}