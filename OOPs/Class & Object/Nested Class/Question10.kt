//Question 10 — Advanced Nested Class with Encapsulation & Business Logic
class Bank {
    class Account(
        val accountNumber: Int,
        val accountHolderName: String,
        private var balance: Double
    ) {
        fun deposit(amount: Double) {
            if(amount > 0) {
                balance += amount
            } else {
                println("Invalid Amount")
            }
        }

        fun withdraw(amount: Double) {
            if(amount > 0) {
                if(amount <= balance) {
                    balance -= amount
                } else {
                    println("Insufficiant Balance")
                }
            } else {
                println("Invalid Amount")
            }
        }

        fun displayAccount() {
            println("Account Number      : $accountNumber")
            println("Account Holder Name : $accountHolderName")
            println("Current Balance     : %.2f\n".format(balance))
        }
    }

    class Transaction(
        val transactionId: Int,
        val transactionType: String,
        private val amount: Double
    ) {
        fun displayTransaction() {
            println("Transaction ID   : $transactionId")
            println("Transaction Type : $transactionType")
            println("Amount           : %.2f".format(amount))
        }

        fun processTransaction(account: Account) {
            if(transactionType.uppercase() == "DEPOSIT") {
                account.deposit(amount)
            } else if(transactionType.uppercase() == "WITHDRAW") {
                account.withdraw(amount)
            } else {
                println("Invalid Transaction Type")
            }
        }
    }
}

fun main()
{
    val account = Bank.Account(12345, "Rahul", 50000.0)
    account.displayAccount()

    val transaction1 = Bank.Transaction(1001, "Deposit", 20000.0)
    val transaction2 = Bank.Transaction(1002, "Withdraw", 80000.0)

    transaction1.processTransaction(account)
    transaction1.displayTransaction()
    account.displayAccount()

    transaction2.processTransaction(account)
    transaction2.displayTransaction()
    account.displayAccount()
}