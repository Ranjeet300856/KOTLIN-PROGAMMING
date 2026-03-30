//Q20th
/*
    Write a Kotlin program to simulate an ATM transaction system using labeled loops.

    Problem Description:
    There are 3 users (User 1 to 3)
    Each user can perform 5 transactions (Transaction 1 to 5) 
*/

fun main()
{
    outer@ for(user in 1..3)
    {
        for(transaction in 1..5)
        {
            print("User $user - Transaction $transaction (withdraw/deposit/skip/block): ")
            var input = readln().trim().lowercase()
            if(user == 2 && transaction == 4)
            {
                println("Fraud Detected - ATM Locked")
                break@outer
            }

            if(input == "block") break@outer
            if(input == "skip") continue@outer
            if(input == "withdraw")  println("Withdrawal Successful")
            else if(input == "deposit") println("Deposit Successful")
            else
            {
                println("Invalid Transaction")
                continue
            }
        }
    }
}