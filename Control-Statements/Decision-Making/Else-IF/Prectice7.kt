//Q7th
/*
    Problem Statement (English format for GitHub):
    Write a Kotlin program that determines whether a person is eligible to drive based on age and whether they have a valid driving license, using an else-if ladder.
    Inputs:
    Age (integer)
    Has License (String: "yes" or "no")

    Rules:
    If age < 18 →
    "Not eligible to drive"
    Else if age ≥ 18 and license = "no" →
    "Eligible for learner license"
    Else if age ≥ 18 and license = "yes" →
    "Eligible to drive"
*/

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    print("Has License ? Enter Yes or No : ")
    val license = readln().trim().lowercase()
    if(age == null || age < 0)
    {
        println("Invalid Age")
        return
    }

    if (license != "yes" && license != "no") {
        println("Invalid License Input")
        return
    }

     if (age < 18) println("Not eligible to drive")
    else if (license == "no") println("Eligible for learner license")
    else println("Eligible to drive")
}