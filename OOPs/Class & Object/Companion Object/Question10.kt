//Library Membership Management System Using Companion Object
class LibraryMember private constructor(
    private val memberId: Int,
    val memberName: String,
    val membershipType: String
)
{
    companion object {
        private var nextMemberId = 1001
        private var maximumMembers = 100
        private var totalMember = 0

        fun createMember(memberName: String, membershipType:  String): LibraryMember?
        {
            if(totalMember >= maximumMembers)
            {
                println("Library Membership Full!")
                return null
            }

            val libraryMember = LibraryMember(nextMemberId, memberName, membershipType)
            totalMember++
            nextMemberId++
            return libraryMember
        }

        fun updateMaximumMembers(newLimit: Int)
        {
            if(newLimit < 1 || newLimit > 500) println("Invalid Limit!")
            else
            {
                maximumMembers = newLimit
                println("Maximum Limit Updated Successfully")
            }
        }

        fun displayLibraryStatus()
        {
            println("\nMaximum Members : $maximumMembers")
            println("Current Members : $totalMember")
            println("Available Seats : ${maximumMembers - totalMember}")
        }
    }

    fun displayMemberDetails()
    {
        println("\nMember ID       : $memberId")
        println("Member Name     : $memberName")
        println("Membership Type : $membershipType")
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
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

fun display(list: MutableList<LibraryMember>)
{
    if(list.isEmpty()) println("No Members Found.")
    for(value in list)
    value.displayMemberDetails()
}


fun main()
{
    println("\n========= Library Menu =========\n")
    val members = mutableListOf<LibraryMember>()
    while(true)
    {
        println("\n1. Add Member")
        println("2. Display All Members")
        println("3. Update Maximum Members")
        println("4. Display Library Status")
        println("5. Exit")

        println()
        val choice = inputInteger("your choice (1..5)")
        when(choice)
        {
            1 -> {
                val memberName = inputString("Member Name")
                var membershipType: String? = null
                while(true)
                {
                    val input = inputString("Membership Type").uppercase()
                    if(input != "REGULAR" && input != "PREMIUM" && input != "VIP")
                    {
                        println("Invalid Membership Type! Try Again")
                        continue
                    }

                    membershipType = input
                    break
                }

                val member = LibraryMember.createMember(memberName, membershipType!!)
                if(member != null)
                {
                    members.add(member)
                    println("Member Added Successfully")
                }
            }

            2 -> display(members)
            3 -> {
                val newLimit = inputInteger("new maximum limits")
                LibraryMember.updateMaximumMembers(newLimit)
            }

            4 -> LibraryMember.displayLibraryStatus()
            5 -> {
                println("Program Exited")
                return
            }

            else -> println("Invalid Choice! Please Enter 1..5")
        }
    }
}