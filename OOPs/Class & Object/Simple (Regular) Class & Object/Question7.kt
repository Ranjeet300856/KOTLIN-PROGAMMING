//Create a Kotlin program to develop a Bank Balance Management System using Class and Regular Object.
class BankAccount
{
    var accountHolderName = ""
    var balance = 0.0

    fun deposit(amount: Double)
    {
        balance += amount
        println("Amount Deposit Successfully")
    }

    fun withdraw(amount: Double)
    {
        if(balance >= amount)
        {
            balance -= amount
            println("Withdraw Successfully")
        }
        else println("Insufficient Balance!")
    }

    fun displayBalance()
    {
        println("\n----------- Account Details -----------\n")
        println("Account Holder : $accountHolderName")
        println("Current Balance: %.2f".format(balance))
        println("\n---------------------------------------\n")
    }
}

fun main()
{
    print("Enter Account Holder Name : ")
    val name = readln().trim()
    if(name.isBlank())
    {
        println("Invalid Account Holder Name")
        return
    }

    print("Enter Initial Balance     : ")
    val initBalance = readln().trim().toDoubleOrNull()
    print("Enter Deposit Amount      : ")
    val depositAmount = readln().trim().toDoubleOrNull()
    print("Enter Withdraw Amount     : ")
    val withdrawAmount = readln().trim().toDoubleOrNull()
    if(initBalance == null || depositAmount == null || withdrawAmount == null || initBalance < 0 || depositAmount <= 0 || withdrawAmount <= 0)
    {
        println("Invalid Balance Input")
        return
    }

    val account1 = BankAccount()
    account1.accountHolderName = name
    account1.balance = initBalance
    account1.deposit(depositAmount)
    account1.withdraw(withdrawAmount)
    account1.displayBalance()
}