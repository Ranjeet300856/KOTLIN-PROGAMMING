/*
    Question 5: Election Vote Counter Using LinkedHashMap
    Problem Statement
    Create a Kotlin program to count votes for election candidates using LinkedHashMap<String, Int>.
*/

fun checkEmpty(candidates: LinkedHashMap<String, Int>): Boolean
{
    if(candidates.isEmpty())
    {
        println("No candidates are available")
        return true
    }
    else return false
}

fun isValidInteger(x: Int?): Boolean
{
    if(x == null || x <= 0)
    {
        println("Invalid Input!")
        return false
    }
    else return true
}

fun inputName(candidates: LinkedHashMap<String, Int>): String
{
    while(true)
    {
        print("Enter candidate name : ")
        val name = readln().trim().uppercase()
        if(name.isBlank() || name.length < 3)
        {
            println("Invalid Input! Try Again")
            continue
        }

        if(candidates.containsKey(name))
        {
            println("Candidate already exists!")
            continue
        }

        return name
    }
}

fun display(candidates: LinkedHashMap<String, Int>)
{
    println("\nElection Result:")
    for((key, value) in candidates.entries)
    println("$key -> $value")
}

fun voteAnalysis(candidates: LinkedHashMap<String, Int>)
{
    var highestVote = candidates.values.first()
    var highestVoteCandidate = candidates.keys.first()
    for((key, value) in candidates.entries)
    {
        if(value > highestVote)
        {
            highestVote = value
            highestVoteCandidate = key
        }
    }

    var isTie = false
    for((key, value) in candidates.entries)
    if(value == highestVote && key != highestVoteCandidate) isTie = true

    if(!isTie)
    {
        println("\nElection Winner : $highestVoteCandidate")
        println("Total Votes       : $highestVote")
    }
    else
    {
        println("\nElection Result : Tie")
        for((key, value) in candidates.entries)
        if(value == highestVote) println("$key -> $value")
    }
}

fun main()
{
    val candidates = LinkedHashMap<String, Int>()
    print("Enter total number of candidates : ")
    val totalCandidates = readln().trim().toIntOrNull()
    if(!isValidInteger(totalCandidates)) return
    for(i in 1..totalCandidates!!)
    {
        val candidateName = inputName(candidates)
        candidates[candidateName] = 0
    }

    var invalidVotes = 0
    var validVotes = 0
    print("\nEnter total number of votes : ")
    val totalVotes = readln().trim().toIntOrNull()
    if(!isValidInteger(totalVotes)) return
    for(i in 1..totalVotes!!)
    {
        while(true)
        {
            print("Enter candidate name : ")
            val name = readln().trim().uppercase()
            if(name.isBlank() || name.length < 3)
            {
                println("Invalid Input! Try Again")
                continue
            }

            if(candidates.containsKey(name))
            {
                candidates[name] = candidates[name]!! + 1
                println("Your vote added successfully")
                validVotes++
            }
            else
            {
                println("Candidate not found. Vote rejected.")
                invalidVotes++
            }
            break
        }
    }

    if(checkEmpty(candidates)) return
    display(candidates)
    voteAnalysis(candidates)

    println("\nTotal Candidates  : ${candidates.size}")
    println("Total Valid Votes   : $validVotes")
    println("Total Invalid Votes : $invalidVotes")
}