//Question 2 — Inner Class with Private Members & this@Outer
class BankAccount(
    val accountHolderName: String,
    val accountNumber: Int,
    private var balance: Double
) {
    inner class AccountDetails(val accountHolderName: String) {
        fun showDetails() {
            println("Account Holder Name : $accountHolderName")
            println("Account Hodler Name : " + this@BankAccount.accountHolderName)
            println("Account Number      : $accountNumber")
            println("Balance             : %.2f".format(balance))
        }
    }
}

fun main()
{
    val bankAccount = BankAccount("Temporary User", 12345, 10000.0)
    val accountDetail = bankAccount.AccountDetails("Ranjeet")
    accountDetail.showDetails()
}