//Q9th
/*
    Write a Kotlin program that simulates an ATM withdrawal system using an else-if ladder.
    Inputs:
    Account Balance (integer)
    Withdrawal Amount (integer)

    Rules:
    If withdrawal amount ≤ 0 →
    "Invalid Withdrawal Amount"
    Else if withdrawal amount > balance →
    "Insufficient Balance"
    Else if withdrawal amount is not a multiple of 100 →
    "Enter amount in multiples of 100"
    Else →
    Deduct amount and print:
    "Transaction Successful"
    "Remaining Balance: X"
*/

fun main()
{
    print("Enter Account Balance : ")
    val balance = readln().trim().toIntOrNull()
    print("Enter Withdrawal Amount : ")
    val withdrawAmount = readln().trim().toIntOrNull()
   if(balance == null || balance < 0)
    {
        println("Invalid Balance")
        return
    }
    
    if(withdrawAmount == null) 
    {
        println("Invalid Withdrawal Amount")
        return
    }

    if(withdrawAmount <= 0) println("Invalid Withdrawal Amount")
    else if(withdrawAmount > balance) println("Insufficient Balance")
    else if(withdrawAmount % 100 != 0) println("Enter amount in multiples of 100")
    else
    {
        println("Transaction Successful")
        println("Remaining Balance: ${balance - withdrawAmount}")
    }
}