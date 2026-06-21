/*
    Question 5: Smart Password Security Analyzer Using HashSet
    Problem Statement:
    Create a Kotlin program to develop a Smart Password Security Analyzer using the HashSet Collection. 
*/

fun inputPassword(uniqueCharacters: HashSet<Char>, duplicateCharacters: HashSet<Char>)
{
    print("\nEnter Password: ")
    val password = readln().trim()

    if (password.isBlank() || password.contains(" "))
    {
        println("Invalid Password")
        return
    }

    // Remove old analysis data
    uniqueCharacters.clear()
    duplicateCharacters.clear()

    for (ch in password)
    {
        if (!uniqueCharacters.add(ch))
        {
            duplicateCharacters.add(ch)
        }
    }

    println("Password Analyzed Successfully")
}

fun displayCharacters(title: String, set: HashSet<Char>)
{
    print("$title: ")

    if (set.isEmpty())
    {
        println("No Data Available")
        return
    }

    for (ch in set)
    {
        print("$ch ")
    }

    println()
}

fun searchCharacter(uniqueCharacters: HashSet<Char>)
{
    if (uniqueCharacters.isEmpty())
    {
        println("Please analyze a password first")
        return
    }

    print("Enter Character To Search: ")
    val input = readln().trim()

    if (input.length != 1)
    {
        println("Invalid Character")
        return
    }

    if (input[0] in uniqueCharacters)
    {
        println("Character '${input[0]}' Found")
    }
    else
    {
        println("Character '${input[0]}' Not Found")
    }
}

fun displayPasswordStrength(uniqueCharacters: HashSet<Char>)
{
    if (uniqueCharacters.isEmpty())
    {
        println("Please analyze a password first")
        return
    }

    val count = uniqueCharacters.size

    when
    {
        count < 5 ->
            println("Password Strength: Weak")

        count in 5..9 ->
            println("Password Strength: Medium")

        else ->
            println("Password Strength: Strong")
    }
}

fun clearData(
    uniqueCharacters: HashSet<Char>,
    duplicateCharacters: HashSet<Char>
)
{
    if (uniqueCharacters.isEmpty() && duplicateCharacters.isEmpty())
    {
        println("No Data Available")
        return
    }

    uniqueCharacters.clear()
    duplicateCharacters.clear()

    println("Password Analysis Data Cleared Successfully")
}

fun main()
{
    val uniqueCharacters = HashSet<Char>()
    val duplicateCharacters = HashSet<Char>()

    while (true)
    {
        println("\n===== Smart Password Security Analyzer =====")
        println("1. Enter Password")
        println("2. Display Unique Characters")
        println("3. Display Total Unique Characters")
        println("4. Display Duplicate Characters")
        println("5. Search Character")
        println("6. Display Password Strength")
        println("7. Clear All Data")
        println("8. Exit")

        print("\nEnter Your Choice: ")

        val choice = readln().trim().toIntOrNull()

        if (choice == null)
        {
            println("Invalid Input")
            continue
        }

        when (choice)
        {
            1 ->
                inputPassword(
                    uniqueCharacters,
                    duplicateCharacters
                )

            2 ->
                displayCharacters(
                    "Unique Characters",
                    uniqueCharacters
                )

            3 ->
                println(
                    "Total Unique Characters: ${uniqueCharacters.size}"
                )

            4 ->
                displayCharacters(
                    "Duplicate Characters",
                    duplicateCharacters
                )

            5 ->
                searchCharacter(uniqueCharacters)

            6 ->
                displayPasswordStrength(uniqueCharacters)

            7 ->
                clearData(
                    uniqueCharacters,
                    duplicateCharacters
                )

            8 ->
            {
                println("Thanks For Using Password Analyzer!")
                break
            }

            else ->
                println("Invalid Choice")
        }
    }
}