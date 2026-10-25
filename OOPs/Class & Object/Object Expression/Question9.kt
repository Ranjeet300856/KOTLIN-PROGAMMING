/*
    Write a Kotlin program to validate a bank account using an Object Expression.

    Create an Object Expression that contains the following properties:

    accountHolder: String
    initialBalance: Double

    The object must also contain:

    An init block that validates the account holder's name and initial balance.
    A function isValidAccount(): Boolean that checks whether the account details are valid.
    A function displayAccountDetails() that displays the account information if it is valid. 
*/

fun main()
{
    val bankAccount = object {
        var accountHolder: String = "Rahul"
        var initialBalance: Double = 5000.0

        fun isValidAccount(): Boolean {
            if(accountHolder.isNotBlank() && initialBalance >= 0) return true
            else return false
        }

        fun displayAccountDetails() {
            if(isValidAccount()) {
                println("Account Status     : Valid")
                println("Account Hoder Name : $accountHolder")
                println("Initial Balance    : %.2f\n".format(initialBalance))
            } else println("Account Status  : Invalid\n")
        }
    }

    bankAccount.displayAccountDetails()
    bankAccount.accountHolder = "  "
    bankAccount.initialBalance = -500.0
    bankAccount.displayAccountDetails()
}