//Create a Kotlin program to manage a library membership system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName              : $personName")
        println("Age               : $personAge")
    }
}

open class Member(
    protected val memberId: Int,
    val membershipType: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayMemberDetails()
    {
        displayPersonDetails()
        println("Member ID         : $memberId")
        println("Membership Type   : $membershipType")
    }
}

class LibraryMember(
    var borrowedBooks: Int,
    private var fineAmount: Double,
    var isMembershipActive: Boolean,
    memberId: Int,
    membershipType: String,
    personName: String,
    personAge: Int
) : Member(memberId, membershipType, personName, personAge)
{
    fun displayLibraryDetails()
    {
        displayMemberDetails()
        println("Borrowed Book     : $borrowedBooks")
        println("Fine Amount       : %.2f".format(fineAmount))
        println("Membership Status : ${if(isMembershipActive) "Active" else "Inactive"}")
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for $text")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}


fun main()
{
    val personName = inputString("Person Name")
    val personAge = inputInteger("Person Age")
    val memberId = inputInteger("Member ID")
    val membershipType = inputString("Membership Type")
    val borrowedBooks = inputInteger("Borrowd Books")
    val fineAmount = inputDouble("Fine Amount")
    val isMembershipActive = inputBoolean("Membership Active")

    val libraryMember = LibraryMember(borrowedBooks, fineAmount, isMembershipActive, memberId, membershipType, personName, personAge)
    libraryMember.displayLibraryDetails()
}