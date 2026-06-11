/*
    Question 3: Contact List Cleanup System
    Problem Statement - Create a Kotlin program that manages a mobile contact list using a MutableList<String>.
    You are given the following contacts: Ravi, Mohan, Sita, Ravi, Aman, "", Mohan, Neha, "   ", Ranjeet

    Business Rules
    A contact is considered invalid if:
    It is an empty string ("")
    It contains only spaces (" ")

    A contact is considered valid if:
    After trimming spaces, its length is greater than 0.

    Requirements
    1. Store all contacts in a MutableList<String>.
    2. Print the original contact list.
    3. Create a new MutableList named:
    validContacts - Store only valid contacts in it.

    4. Create another MutableList named:
    invalidContacts - Store only invalid contacts in it.

    5. Print:
    Total Contacts Entered
    Total Valid Contacts
    Total Invalid Contacts

    6. Find and print:
    First Contact
    Last Contact
    (From the original list)

    7. Check whether:
    Ranjeet exists in the original list.
    Print an appropriate message.

    8. Count how many times: Ravi
    appears in the original list.

    9. Remove all invalid contacts from the original MutableList.
    After removal, print the updated list.

    10. Create a new MutableList named: uniqueContacts
    Store only unique contacts.
    Example:
    Input: Ravi, Mohan, Sita, Ravi, Mohan
    Output: Ravi, Mohan, Sita
    (Keep only the first occurrence.)

    11. Print the index position of:
    Neha in the cleaned contact list.
*/

fun main()
{
    val mobileContactList = mutableListOf("Ravi", "Mohan", "Sita", "Ravi", "Aman", "", "Mohan", "Neha", "   ", "Ranjeet")

    println("Original Contact List : $mobileContactList")

    //Create valid and invalid contacts list and Counting
    val validContacts = mutableListOf<String>()
    val invalidContacts = mutableListOf<String>()
    val uniqueContacts = mutableListOf<String>()

    var totalContacts = mobileContactList.size
    var totalValidContacts = 0
    var totalInvalidContacts = 0
    val firstContact = mobileContactList[0]
    val lastContact = mobileContactList[mobileContactList.size - 1]
    var countRavi = 0

    for(value in mobileContactList)
    {
        if(value == "Ravi") countRavi++

        if(value.trim().isEmpty())
        {
            if(!value.isEmpty()) invalidContacts.add(value)
            totalInvalidContacts++
        }
        
        else if(value.trim().length > 0)
        {
            validContacts.add(value.trim())
            totalValidContacts++
        }
    }

    for(i in mobileContactList.size - 1 downTo 0)
    {
        if(mobileContactList[i].trim().isEmpty())
        {
            mobileContactList.removeAt(i)
        }
    }

    println()
    println("Valid Contacts List    : $validContacts")
    println("Invalid Contacts List  : $invalidContacts")
    println("Total Contacts         : $totalContacts")
    println("Total Valid Contacts   : $totalValidContacts")
    println("Total Invalid Contacts : $totalInvalidContacts")
    println("First Contact          : $firstContact")
    println("Last Contact           : $lastContact")

    if(mobileContactList.contains("Ranjeet"))
        println("\nRanjeet exists in the original list")
    else println("\nRanjeet not exists in the original list")

    println("\nRavi in $countRavi times appears in the original list")

    println("\nAfter remove invalid contact list : $mobileContactList")

    var indexOfNeha = -1
    for(i in mobileContactList.indices)
    {
        if(!uniqueContacts.contains(mobileContactList[i].trim()))
        {
            uniqueContacts.add(mobileContactList[i].trim())
        }
    }

    for(i in mobileContactList.indices)
        if(mobileContactList[i] == "Neha") indexOfNeha = i

    println("\nUnique Contacts List : $uniqueContacts")
    println("Index of Neha          : $indexOfNeha")
}