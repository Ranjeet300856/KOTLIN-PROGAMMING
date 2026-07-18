//Create a Kotlin program to manage bank account information using Single Inheritance.
open class BankAccount(val accountHolderName: String, val accountNumber: Long, var balance: Double)
{
    fun deposit(amount: Double)
    {
        if(amount <= 0)
        {
            println("Negative amount is not allowed!")
            return
        }

        balance += amount
        println("Amount deposit successfully")
    }

    fun withdraw(amount: Double)
    {
        if(amount > 0)
        {
            if(amount <= balance)
            {
                balance -= amount
                println("Amount withdraw successfully")
            }
            else println("Insufficient balance.")
        }
        else println("Negative amount is not allowed!")
    }

    fun displayAccountDetails()
    {
        println("Account Holder Name : $accountHolderName")
        println("Account Number      : $accountNumber")
        println("Current Balance     : $balance")
    }
}

class SavingAccount(
    private var interestRate: Double,
    private var minimumBalance: Double,
    accountHolderName: String,
    accountNumber: Long,
    balance: Double
) : BankAccount(accountHolderName, accountNumber, balance)
{
    fun simpleInterestRate(): Double = (balance * 1 * interestRate) / 100
    fun displaySavingAccountDetails()
    {
        println("\nInterest Rate   : %.2f%%".format(interestRate))
        println("Minimum Balance : %.2f".format(minimumBalance))
    }
}

fun main()
{
    val savingAccount = SavingAccount(10.0, 1000.0, "Rahul", 123456789L, 800000000.0)
    savingAccount.deposit(200000000.0)
    savingAccount.withdraw(990000000.0)
    savingAccount.displayAccountDetails()
    savingAccount.displaySavingAccountDetails()

    val interestRate = savingAccount.simpleInterestRate()
    println("\nOne year simple interest rate : %.2f".format(interestRate))
}