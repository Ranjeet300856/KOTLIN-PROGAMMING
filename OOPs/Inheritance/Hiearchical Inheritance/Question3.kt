//Create a Kotlin program to demonstrate Hierarchical Inheritance for a banking account management system.
open class BankAccount(val accountNumber: Long, val accountHolderName: String, val balance: Double)
{
    fun displayAccountInfo()
    {
        println("Account Number      : $accountNumber")
        println("Account Holder Name : $accountHolderName")
        println("Balance             : %.2f".format(balance))
    }
}

class SavingAccount(
    val interestRate: Double,
    accountNumber: Long,
    accountHolderName: String,
    balance: Double
) : BankAccount(accountNumber, accountHolderName, balance)
{
    fun displaySavingAccountInfo()
    {
        println("\nSaving Account:")
        displayAccountInfo()
        println("Interest Rate       : %.2f%%".format(interestRate))
    }
}

class CurrentAccount(
    val overdraftLimit: Double,
    accountNumber: Long,
    accountHolderName: String,
    balance: Double
) : BankAccount(accountNumber, accountHolderName, balance)
{
    fun displayCurrentAccountInfo()
    {
        println("\nCurrent Account:")
        displayAccountInfo()
        println("Overdraft Limit     : %.2f".format(overdraftLimit))
    }
}

class SalaryAccount(
    val companyName: String,
    accountNumber: Long,
    accountHolderName: String,
    balance: Double
) : BankAccount(accountNumber, accountHolderName, balance)
{
    fun displaySalaryAccountInfo()
    {
        println("\nSalary Account:")
        displayAccountInfo()
        println("Company Name        : $companyName")
    }
}

fun main()
{
    val savingAccount = SavingAccount(8.6, 123456789L, "Aman", 800000.0)
    val currentAccount = CurrentAccount(10000.0, 987654321L, "Rahul", 50000000.0)
    val salaryAccount = SalaryAccount("Google", 5467327812L, "Ravi", 400000.0)
    savingAccount.displaySavingAccountInfo()
    currentAccount.displayCurrentAccountInfo()
    salaryAccount.displaySalaryAccountInfo()
}