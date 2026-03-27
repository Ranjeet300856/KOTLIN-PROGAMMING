//Q7th
/*
    Write a Kotlin function that simulates a simple ATM withdrawal system.
    Function takes two inputs:
    balance: Int
    amount: Int

    Rules:
    If balance or amount is less than or equal to 0 → return "Invalid Input"
    If amount is greater than balance → return "Insufficient Balance"
    If amount is not a multiple of 100 → return "Invalid Amount"
    If all conditions are satisfied → return "Transaction Successful" 
*/

fun transactionStatus(balance: Int, amount: Int): String
{
    if(balance <= 0 || amount <= 0) return "Invalid Input"
    if(amount > balance) return "Insufficient Balance"
    if(amount % 100 != 0) return "Invalid Amount"
    return "Transaction Successful"
}


fun main()
{
    print("Enter Balance : ")
    val balance = readln().trim().toIntOrNull()
    print("Enter Withdraw Amount : ")
    val amount = readln().trim().toIntOrNull()
    if(balance == null || amount == null)
    {
        println("Invalid Input")
        return
    }

    println(transactionStatus(balance, amount))
}