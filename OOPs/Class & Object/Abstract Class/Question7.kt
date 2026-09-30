//Question 7 — Abstract Class + super + Method Overriding
abstract class BankAccount(
    val accountHolderName: String,
    var balance: Double
) {
    fun displayBalance() {
        println("Current Balance : %.2f".format(balance))
    }

    fun deposit(amount: Double) {
        if(amount > 0) {
            balance += amount
            println("Amount Deposited : %.2f".format(amount))
        } else {
            println("Invalid Deposite Amount")
        }
    }

    abstract fun withdraw(amount: Double)
}

class SavingAccount(
    accountHolderName: String,
    balance: Double
) : BankAccount(accountHolderName, balance) {
    override fun withdraw(amount: Double) {
        if(amount <= balance && amount > 0) {
            super.displayBalance()
            balance -= amount
            println("Amount withdrawn from Savings Account")
        } else {
            println("Insufficient balance")
        }
    }
}

class CurrentAccount(
    accountHolderName: String,
    balance: Double
) : BankAccount(accountHolderName, balance) {
    override fun withdraw(amount: Double) {
        val overdraftLimit = 10000.0
        if(amount > 0 && amount <= balance + overdraftLimit) {
            super.displayBalance()
            balance -= amount
            println("Amount withdrawn from Current Account")
        } else {
            println("Withdrawal limit exceeded")
        }
    }
}

fun main()
{
    val savingAccount = SavingAccount("Rahul", 50000.0)
    val currentAccount = CurrentAccount("Ranjeet", 50000.0)
    
    savingAccount.deposit(10000.0)
    currentAccount.deposit(20000.0)
    println()

    savingAccount.withdraw(60000.0)
    currentAccount.withdraw(50000.0)
    println()

    savingAccount.displayBalance()
    currentAccount.displayBalance()
}