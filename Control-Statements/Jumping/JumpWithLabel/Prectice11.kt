//Q11th
/*
    Write a Kotlin program that simulates a login system with multiple attempts using labeled loops.

    Problem Description:
    A system allows a user to try logging in maximum 3 times.
    For each attempt, the user has 3 chances to enter the correct PIN. 
*/

fun main()
{
    var isLogin = false
    outer@ for(attempt in 1..3)
    {
        for(_try in 1..3)
        {
            print("Enter PIN : ")
            var pin = readln().trim()

            if(pin == "skip") continue@outer

            if(pin == "1234")
            {
                println("Login Successful")
                isLogin = true
                break@outer
            }
            else  println("Wrong PIN")
                
        }
    }

    if(!isLogin) println("Account Locked")
}