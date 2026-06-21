/*
    Question 4: Online Event Registration Analyzer Using Two HashSets
    Problem Statement:
    Create a Kotlin program to develop an Online Event Registration Analyzer using two HashSet collections.

    An event has registrations from two different platforms:
    Platform A
    Platform B
    Each platform stores unique participant IDs. 
*/

fun inputID(): Int?
{
    print("Enter Participant ID: ")
    val id = readln().trim().toIntOrNull()

    if(id == null || id <= 0)
    {
        println("Invalid Participant ID")
        return null
    }

    return id
}

fun addParticipant(set: HashSet<Int>, platform: String)
{
    println("\n$platform Registration")

    val id = inputID() ?: return

    if(set.add(id))
        println("Participant ID $id Registered Successfully")
    else
        println("Participant ID Already Exists")
}

fun display(set: Set<Int>)
{
    if(set.isEmpty())
    {
        println("No Data Available")
        return
    }

    for(id in set)
    {
        print("$id ")
    }
    println()
}

fun displayCommon(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    val common = HashSet(platformA)
    common.retainAll(platformB)

    print("Common Participants: ")
    display(common)
}

fun displayOnlyA(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    val onlyA = HashSet(platformA)
    onlyA.removeAll(platformB)

    print("Only Platform A Participants: ")
    display(onlyA)
}

fun displayOnlyB(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    val onlyB = HashSet(platformB)
    onlyB.removeAll(platformA)

    print("Only Platform B Participants: ")
    display(onlyB)
}

fun displayTotalUnique(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    val unique = HashSet<Int>()

    unique.addAll(platformA)
    unique.addAll(platformB)

    println("Total Unique Participants: ${unique.size}")
}

fun displayAll(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    println("\nPlatform A Participants:")
    display(platformA)

    println("Platform B Participants:")
    display(platformB)
}

fun clearData(platformA: HashSet<Int>, platformB: HashSet<Int>)
{
    if(platformA.isEmpty() && platformB.isEmpty())
    {
        println("No Data Available")
        return
    }

    platformA.clear()
    platformB.clear()

    println("All Registration Data Cleared Successfully")
}

fun main()
{
    val platformA = HashSet<Int>()
    val platformB = HashSet<Int>()

    while(true)
    {
        println("\n===== Online Event Registration Analyzer =====")
        println("1. Add Participant to Platform A")
        println("2. Add Participant to Platform B")
        println("3. Display Common Participants")
        println("4. Display Only Platform A Participants")
        println("5. Display Only Platform B Participants")
        println("6. Display Total Unique Participants")
        println("7. Display All Participants")
        println("8. Clear All Registration Data")
        println("9. Exit")

        print("Enter Your Choice: ")
        val choice = readln().trim().toIntOrNull()

        if(choice == null)
        {
            println("Invalid Input")
            continue
        }

        when(choice)
        {
            1 -> addParticipant(platformA, "Platform A")
            2 -> addParticipant(platformB, "Platform B")
            3 -> displayCommon(platformA, platformB)
            4 -> displayOnlyA(platformA, platformB)
            5 -> displayOnlyB(platformA, platformB)
            6 -> displayTotalUnique(platformA, platformB)
            7 -> displayAll(platformA, platformB)
            8 -> clearData(platformA, platformB)
            9 ->
            {
                println("Thanks!")
                break
            }

            else -> println("Invalid Choice")
        }
    }
}