//Q10th
/*
    Write a Kotlin program for a number guessing game:

    System chooses a number (e.g., 1–100)
    User keeps guessing
    Program gives hints (Too High / Too Low)
    Loop continues until correct guess
*/
fun main()
{
    val secret = (1..100).random()
    var attempts = 0

    do
    {
        print("Guess a Number : ")
        val guess = readln().trim().toIntOrNull()
        if(guess == null)
        {
            println("Invalid Input")
            continue
        }

        attempts++

        if(guess < secret) println("Too Low")
        else if(guess > secret) println("Too High")
        else
        {
            println("Correct! You guessed in $attempts attempts")
            break
        }
    }while(true)
}