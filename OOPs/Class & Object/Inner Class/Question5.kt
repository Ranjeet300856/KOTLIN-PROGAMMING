//Question 5 — Inner Class with Encapsulation & State Management
class BankAccount(
    private val accountHolder: String,
    private val accountNumber: Int,
    private var balance: Double
) {
    inner class TransactionManager {
        fun deposit(amount: Double) {
            if(amount <= 0) {
                println("Invalid Deposit Amount")
                return
            }

            balance += amount
            println("Deposit Successful")
        } 

        fun withdraw(amount: Double) {
            if(amount > 0) {
                if(amount <= balance) {
                    balance -= amount
                    println("Withraw Successful")
                } else {
                    println("Insufficient Balance")
                }
            } else {
                println("Invalid Amount")
            }
        }

        fun showBalance() {
            println("\nCurrent Balance : %.2f".format(balance))
        }
    }
}

fun main()
{
    val bankAccount = BankAccount("Rahul", 1001, 10000.00)
    val transaction = bankAccount.TransactionManager()

    transaction.showBalance()
    transaction.deposit(5000.0)
    transaction.withdraw(3000.0)
    transaction.withdraw(20000.0)
    transaction.deposit(-500.00)

    transaction.showBalance()
}