//Create a Kotlin program to develop an ATM Machine Simulation using Class and Regular Object.
class ATM
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
            println("Amount Withdraw Successfully")
        }
        else println("Insufficient Balance!")
    }

    fun checkBalance() = println("Current Balance : %.2f".format(balance))
    fun displayAccountInfo()
    {
        println("\n----------- Account Information -----------\n")
        println("Account Holder : $accountHolderName")
        println("Balance        : %.2f".format(balance))
        println("-------------------------------------------")
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

    val account = ATM()
    account.accountHolderName = name
    account.balance = initBalance
    account.deposit(depositAmount)
    account.withdraw(withdrawAmount)
    account.checkBalance()
    account.displayAccountInfo()
}