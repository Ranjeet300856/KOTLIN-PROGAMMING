/*
    Question 4: Student Voting System Using HashMap
    Problem Statement:
    Create a Kotlin program to count votes for class monitor candidates using HashMap.

    Requirements:
    1. Ask the user to enter the total number of votes.
    2. Read each vote (Candidate Name).
    3. Count the number of votes received by each candidate.
    4. After all votes are entered, display:
       - All candidates with their total votes.
       - The winner (Candidate with the highest number of votes).

    5. If two or more candidates have the same highest votes,
       display:
       "Tie between candidates."
*/

fun main()
{
    print("Enter the total number of votes : ")
    val totalVotes = readln().trim().toIntOrNull()
    if(totalVotes == null || totalVotes <= 0)
    {
        println("Invalid Input!")
        return
    }

    val votes = HashMap<String, Int>()
    for(i in 1..totalVotes)
    {
        while(true)
        {
            print("Enter Candidate Name To Vote : ")
            val name = readln().trim()
            if(name.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            if(votes.containsKey(name))
            {
                votes[name] = votes[name]!! + 1
                break
            }
            
            votes.put(name, 1)
            break
        }
    }

    for((key, value) in votes.entries)
    println("$key : $value")

    var max = 0
    var winner = ""
    for((key, value) in votes.entries)
    {
        if(value > max)
        {
            max = value
            winner = key
        }
    }

    for((key, value) in votes.entries)
    {
        if(value == max && key != winner)
        {
            println("Tie between candidates.")
            return
        }
    }

    println("Winner : $winner")
}