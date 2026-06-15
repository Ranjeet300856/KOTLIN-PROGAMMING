/*
    Question 7 — Online Voting Result Analyzer
    Problem Statement
    Create a Kotlin program that analyzes the result of an online voting system using a MutableMap.

    The program should store:
    Key = Candidate Name (String)
    Value = Votes (Int)
*/

fun main()
{
    val votingRecord = mutableMapOf<String, Int>()

    votingRecord.put("Aman", 120)
    votingRecord.put("Rohit", 95)
    votingRecord.put("Mohit", 150)
    votingRecord.put("Rahul", 110)

    var winnerName: String? = null
    var winnerScore: Int? = null
    for(entry in votingRecord.entries)
    {
        val name = entry.key
        val score = entry.value

        if(winnerName == null || winnerScore == null || score > winnerScore)
        {
            winnerName = name
            winnerScore = score
        }
    }

    println("Winner : $winnerName")
    println("Votes  : $winnerScore")

    val currentVotes = votingRecord.get("Rahul")
    if(currentVotes != null)
        votingRecord.replace("Rahul", currentVotes + 20)

    if(votingRecord.containsKey("Aman")) println("Candidate Found")
    else println("Candidate Not Found")

    println("\nDisplay Data Using Entries")
    for(entrie in votingRecord.entries)
    {
        val name = entrie.key
        val score = entrie.value

        println("Candidate Name   : $name")
        println("Candidate Score  : $score")
    }
}