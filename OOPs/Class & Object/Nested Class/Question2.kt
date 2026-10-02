/*
    Question 2 — Nested Class with Validation
    Bank Account Information

    Create a Kotlin program using a Nested Class. 
*/

class BankAccount {
    class AccountDetails(
        val accountHolderName: String,
        val accountNumber: Int,
        private val balance: Double
    ) {
        fun displayDetails() {
            println("Account Holder Name : $accountHolderName")
            println("Account Number      : $accountNumber")
            println("Current Balance     : %.2f".format(balance))
        }

        fun isValidBalance(): Boolean {
            if(balance >= 0) return true
            else return false
        }
    }
}

fun main()
{
    val accountDetails = BankAccount.AccountDetails("Rahul", 1002, -500.00)
    accountDetails.displayDetails()

    val isValidBalance = accountDetails.isValidBalance()
    if(isValidBalance) println("Account balance is valid")
    else println("Account balance is invalid")
}