//Create a Kotlin program that simulates withdrawing money from a bank account using Custom Exception Handling.
class InsufficientBalanceException(message: String) : Exception(message)
class BankAccount(val accountNumber: Int, private var balance: Double = 10000.0)
{
    fun withdraw(amount: Double)
    {
        if(amount > balance) 
        throw InsufficientBalanceException("Insufficient balance")

        else 
        {
            balance -= amount
            println("Withdraw Successfully")
            println("Final Balance : %.2f".format(balance))
        }
    }
}

fun main()
{
    print("Enter Withdraw Amount : ")
    val amount = readln().trim().toDoubleOrNull()
    if(amount == null || amount <= 0)
    {
        println("Invalid withdrawal")
        return
    }

    print("Enter Account Number : ")
    val accountNumber = readln().trim().toIntOrNull()
    if(accountNumber == null || accountNumber <= 0)
    {
        println("Invalid Account Number")
        return
    }

    val bankAccount = BankAccount(accountNumber)
    try {
        bankAccount.withdraw(amount)
    } catch(e: InsufficientBalanceException) {
        println(e.message)
    }
}