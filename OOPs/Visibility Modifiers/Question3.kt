//Create a Kotlin program to manage a bank account using appropriate Visibility Modifiers.
class BankAccount(val accountNumber: Long, val accountHolderName: String, var accountType: String, private var balance: Double)
{
    fun displayAccountDetails()
    {
        println("\nAccount Number      : $accountNumber")
        println("Account Holder Name : $accountHolderName")
        println("Account Type        : $accountType")
        println("Current Balance     : %.2f".format(balance))
    }

    private fun validateAmount(amount: Double): Boolean
    {
        if(amount > 0) return true
        else
        {
            println("Invalid Amount!")
            return false
        }
    }

    fun deposit(amount: Double)
    {
        if(validateAmount(amount))
        {
            balance += amount
            println("Amount Deposit Successfully")
        }
    }

    fun withdraw(amount: Double)
    {
        if(validateAmount(amount))
        {
            if(amount <= balance)
            {
                balance -= amount
                println("Amount Withdraw Successfully")
            }
            else println("Insufficient balance.")
        }
    }
}

fun main()
{
    val account = BankAccount(123456789L, "Rahul", "Saving", 50000.0)
    account.displayAccountDetails()
    account.deposit(10000.0)
    account.withdraw(60000.0)
    account.withdraw(10000.0)
    account.deposit(-5000.0)
    account.withdraw(-50000.0)
    account.displayAccountDetails()
}