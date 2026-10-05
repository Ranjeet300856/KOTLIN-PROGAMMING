//Question 10 — Advanced Inner Class with Inheritance, Polymorphism & Business Logic
class BankSystem(
    private val bankName: String,
    private val accountHolderName: String,
    private val accountNumber: Int,
    private var balance: Double
) {
    inner class AccountManager {
        fun deposit(amount: Double) {
            if(amount > 0) {
                balance += amount
                println("Amount Deposit Successfully")
            } else {
                println("Invalid Amount!")
            }
        }

        fun withdraw(amount: Double) {
            if(amount > 0) {
                if(amount <= balance) {
                    balance -= amount
                    println("Amount Withdraw Successfully")
                } else {
                    println("Insufficient Balance!")
                }
            } else {
                println("Invalid Amount")
            }
        }

        fun transfer(amount: Double) {
            if(amount > 0) {
                if(amount <= balance) {
                    balance -= amount
                    println("Amount Transfer Successfully")
                } else {
                    println("Insufficient Balance!")
                }
            } else {
                println("Invalid Amount")
            }
        }

        fun showAccountDetails() {
            println("\nBank Name : $bankName")
            println("Account Holder Name : $accountHolderName")
            println("Account Number      : $accountNumber")
            println("Current Balance     : %.2f".format(balance))
        }
    }

    open inner class TransactionManager {
        open fun transactionInfo() {
            println("\nThis is Transaction Manager Class.")
        }
    }

    inner class AdvancedTransactionManager : TransactionManager() {
        override fun transactionInfo() {
            super.transactionInfo()
            println("This is Advance Transaction Manager Class")
        }
    }
}

fun main()
{
    val bankSystem1 = BankSystem("SBI", "Rahul", 123456789, 10000.00)
    val bankSystem2 = BankSystem("HDFC", "Ranjeet", 987654321, 20000.00)

    val accountManager1 = bankSystem1.AccountManager()
    val accountManager2 = bankSystem2.AccountManager()

    println("Account Manager 1.")
    accountManager1.showAccountDetails()
    accountManager1.deposit(10000.0)
    accountManager1.withdraw(20000.0)
    accountManager1.transfer(5000.0)
    accountManager1.showAccountDetails()

    println("\nAccount Manager 2.")
    accountManager2.showAccountDetails()
    accountManager2.deposit(30000.0)
    accountManager2.withdraw(40000.0)
    accountManager2.transfer(5000.0)
    accountManager2.showAccountDetails()

    val transaction: BankSystem.TransactionManager = bankSystem1.AdvancedTransactionManager()
    transaction.transactionInfo()
}