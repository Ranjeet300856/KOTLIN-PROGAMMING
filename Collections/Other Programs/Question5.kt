//Create a Kotlin program to process candidate scores using Collection Higher-Order Functions.
fun inputInteger(text: String): Int 
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    var totalCandidate: Int? = null
    while(true)
    {
        totalCandidate = inputInteger("The Number of Candidate")
        if(totalCandidate <= 0)
        {
            println("Please Enter Positive Value")
            continue
        }
        break
    }

    val scores = mutableListOf<Int>()
    for(i in 1..totalCandidate)
    {
        while(true)
        {
            val score = inputInteger("Score of Candidate $i")
            if(score < 0 || score > 100)
            {
                println("Invalid Score!")
                continue
            }
            scores.add(score)
            break
        }
    }

    val newScores = scores
                        .filter { it >= 50 }
                        .map { if((it + it * 10.0 / 100) <= 100) it + it * 10.0 / 100 else 100.0 }
    
    val eligible = scores.filter { it >= 50}
    println("\n----- Original Scores -----")
    scores.forEach { println(it) }
    println("\n----- Eligible Scores -----")
    eligible.forEach{ println(it) }
    println("\n----- Updated Bonus Scores -----")
    newScores.forEach { println("%.2f".format(it)) }

    println("\n----- Summary -----")
    println("Total Candidates : ${scores.size}")
    println("Eligible         : ${eligible.size}")
    println("Rejected         : ${scores.size - eligible.size}")
}