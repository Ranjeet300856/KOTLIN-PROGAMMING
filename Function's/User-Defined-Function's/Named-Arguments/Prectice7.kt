/*
Question 7: Bank Account Transaction System using Named Arguments

This program simulates a simple bank transaction system.
It processes deposit and withdrawal operations and demonstrates
the use of named arguments, default parameters, validation,
and conditional logic.
*/

fun processTransaction(accountHolder: String, balance: Double, amount: Double, transactionType: String, currency: String = "INR")
{
    var newBalance = balance
    if(transactionType == "deposit")
    {
        newBalance += amount
    }
    else if(transactionType == "withdraw")
    {
        if(amount > balance)
        {
            println("Insufficient Balance!")
            return
        }
        newBalance -= amount
    }

    println("Account Holder   : $accountHolder")
    println("Transaction Type : $transactionType")
    println("Amount: %.2f $currency".format(amount))
    println("Updated Balance: %.2f $currency".format(newBalance))
}

fun main()
{
    print("Enter Account Holder Name : ")
    val name = readln().trim()   
    print("Enter Current Balance : ")
    val balance = readln().trim().toDoubleOrNull()
    print("Enter Transaction Type (Withdraw or Deposit) : ")
    val type = readln().trim().lowercase()
    print("Enter Amount : ")
    val amount = readln().trim().toDoubleOrNull()

    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() })
    {
        println("Invalid Account Holder Name!")
        return
    }

    if(balance == null || amount == null || balance < 0.0 || amount < 0.0)
    {
        println("Invalid Balance or Amount!")
        return
    }

    if(type != "deposit" && type != "withdraw")
    {
        println("Invalid Transaction Type!")
        return
    }

    processTransaction(accountHolder = name, balance = balance, amount = amount, transactionType = type)
}