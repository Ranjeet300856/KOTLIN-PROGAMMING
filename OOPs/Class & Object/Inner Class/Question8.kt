//Question 8 — Inner Class with Multiple Inner Objects & Shared Outer State
class Game(
    private val gameName: String,
    private var maxScore: Int
) {
    inner class Player(
        val playerName: String,
        var score: Int 
    ) {
        fun addScore(points: Int) {
            if(points > 0) {
                if((score + points) <= maxScore) {
                    score += points
                    println("Points Added Successfully")
                } else {
                    score = maxScore
                }
            } else {
                println("Invalid Points!")
            }
        }

        fun showPlayerDetails() {
            println("Game Name   : $gameName")
            println("Player Name : $playerName")
            println("Current Score : $score")
            println("Maximum allowed score : $maxScore")
            println("Score percentage : %.2f%%\n".format((score.toDouble() / maxScore.toDouble()) * 100.0))
        }
    }
}

fun main()
{
    val game = Game("Kotlin Challenge", 100)
    val player1 = game.Player("Rahul", 60)
    val player2 = game.Player("Ranjeet", 100)
    val player3 = game.Player("Amit", 40)

    val players = listOf(player1, player2, player3)

    players.forEach {
        it.showPlayerDetails()
    }

    player1.addScore(30)
    player2.addScore(20)
    player3.addScore(60)

    players.forEach {
        it.showPlayerDetails()
    }
}