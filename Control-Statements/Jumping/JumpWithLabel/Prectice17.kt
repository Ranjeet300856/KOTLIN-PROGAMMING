//Q17th
/*
    Write a Kotlin program to simulate a multiplayer game tournament using labeled loops.

    Problem Description:
    There are 3 rounds (Round 1 to 3)
    Each round has 5 players (Player 1 to 5) 
*/

fun main()
{
   outer@ for(round in 1..3)
    {
        for(player in 1..5)
        {
            print("Round $round - Player $player (play/foul/injury/skip/end): ")
            var input = readln().trim().lowercase()
            
            if(round == 2 && player == 3)
            {
                println("Emergency Stop - Tournament Ended")
                break@outer
            }

            if(input == "end") break@outer
            if(input == "skip") continue@outer

            if(input == "injury")
            {
                println("Player Injured - Round Cancelled")
                continue@outer
            }

            if(input == "foul")
            {
                println("Player $player Committed Foul")
                continue
            }

            if(input == "play") println("Player $player in Round $round Played")
            else
            {
                println("Invalid Input")
                continue
            }

        }
    }
}