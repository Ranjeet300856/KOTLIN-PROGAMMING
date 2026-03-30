//Q12th
/*
    Write a Kotlin program to simulate an online exam system using labeled loops.

    Problem Description:
    There are 3 subjects (Subject 1 to 3)
    Each subject has 5 questions
    For every question, user must enter answer (A/B/C/D) 
*/

fun main()
{
    outer@ for(subject in 1..3)
    {
        for(question in 1..5)
        {
            print("Enter answer of $question : ")
            var answer = readln().trim().uppercase()

            if(answer == "QUIT") break@outer
            if(answer == "SKIP") continue@outer

            if(answer == "A" || answer == "B" || answer == "C" || answer == "D") 
                println("Subject $subject - Question $question Answer Recorded")
            else
            {
                println("Invalid Answer")
                continue
            }
        }
    }
}