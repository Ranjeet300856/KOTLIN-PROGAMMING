//Create a Kotlin program to manage the interest rate of a bank using a Companion Object.
class BankAccount(val accountHolderName: String, private var balance: Double)
{
    companion object
    {
        private var interestRate = 6.5
        fun updateInterestRate(newRate: Double)
        {
            if(newRate < 0)
            {
                println("Invalid Interest Rate!")
                return
            }
            interestRate = newRate
            println("Interest Rate Updated Successfully")
        }
        fun displayInterestRate() = println("Current Interest Rate : %.2f".format(interestRate))
    }

    fun displayAccount()
    {
        println("\nAccount Holder Name : $accountHolderName")
        println("Balance             : %.2f".format(balance))
        println("Interest Rate       : %.2f".format(interestRate))
    }
}

fun main()
{
    val account1 = BankAccount("Rahul", 10000.0)
    val account2 = BankAccount("Aman", 20000.0)
    val account3 = BankAccount("Neha", 25000.0)

    account1.displayAccount()
    account2.displayAccount()
    account3.displayAccount()

    BankAccount.updateInterestRate(8.0)
    println("\nAll Accounts After Updated Interest Rate:")
    account1.displayAccount()
    account2.displayAccount()
    account3.displayAccount()
}