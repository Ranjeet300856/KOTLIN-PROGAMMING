/*
    Question 3: Unique Character Analyzer Using HashSet
    Problem Statement:
    Create a Kotlin program to develop a Unique Character Analyzer using the HashSet Collection.
    The program should take a string from the user and perform the following operations:

    Store all unique characters of the given string in a HashSet.
    Display all unique characters present in the string.
    Display the total number of unique characters.
    Check whether a specific character exists in the string or not.
    Count and display the total number of duplicate characters removed.
    Allow the user to analyze multiple strings using a Menu Driven Program.
    Exit the program. 
*/

fun main()
{
    while(true)
    {
        print("\nEnter a text : ")
        val text = readln().trim()
        if(text.isBlank())
        {
            println("Invalid Input")
            continue
        }

        val uniqueChar = HashSet<Char>()

        var countDuplicateChar = 0
        for(ch in text)
        {
            if(ch == ' ') continue
            if(!uniqueChar.add(ch)) countDuplicateChar++
        }

        print("Unique Charachters             : ")
        for(ch in uniqueChar) print("$ch, ")
        println("\nTotal Unique Characters        : ${uniqueChar.size}")

        print("Enter a character to search    : ")
        val searchCh = readln().trim()
        if(searchCh.isBlank() || searchCh.length != 1)
        {
            println("Invalid Search Character")
            continue
        }
        else
        {
            if(searchCh in text) println("Character $searchCh Found")
            else println("Character $searchCh Not Found")
        }

        println("Total Duplicate Characters     : $countDuplicateChar")

        print("\nYou want to enter a new string ? (yes/no) : ")
        val inputResponse = readln().trim().lowercase()
        if(inputResponse.isBlank())
        {
            println("Invalid Input")
            continue
        }
        else
        {
            if(inputResponse == "yes") continue
            else if(inputResponse == "no")
            {
                println("Thanks!")
                break
            }
            else
            {
                println("Invalid Input Response")
                break
            }
        }
    }
}