//Create a Kotlin program to develop an ATM Account System using Primary Constructor.
class BankAccount(val accountNumber: Long, val accountHolderName: String, var balance: Double)
{
    init {
        if(balance < 0)
        {
            println("Invalid Balance or Negative Balance")
            balance = 0.0
        }
    }

    fun deposit(amount: Double)
    {
        if(amount > 0)
        {
            balance += amount
            println("Amount Deposit Successfully")
        }
        else println("Invalid Amount or Negative Amount")
    }

    fun withdraw(amount: Double)
    {
        if(amount > 0)
        {
            if(amount <= balance)
            {
                balance -= amount
                println("Amount Withdraw Successfully")
            }
            else println("Insufficient Balance!")
        }
        else println("Invalid Amount or Negative Amount")
    }

    fun displayAccountDetails()
    {
        println("Account Holder Name : $accountHolderName")
        println("Account Number      : $accountNumber")
        println("Current Balance     : %.2f".format(balance))
    }
}

fun main()
{
    print("Enter Account Holder Name : ")
    val accountHolderName = readln().trim()
    print("Enter Account Number      : ")
    val accountNumber = readln().trim().toLongOrNull()
    print("Enter Balance             : ")
    val balance = readln().trim().toDoubleOrNull()
    if(accountHolderName.isBlank() || accountNumber == null || accountNumber <= 0 || balance == null)
    {
        println("Invalid Input")
        return
    }

    val account = BankAccount(accountNumber, accountHolderName, balance)

    print("Enter Deposit Amount : ")
    val depositAmount = readln().trim().toDoubleOrNull()
    if(depositAmount == null)
    {
        println("Invalid Deposit Amount")
        return
    }
    else account.deposit(depositAmount)

    print("Enter Withdraw Amount : ")
    val withdrawAmount = readln().trim().toDoubleOrNull()
    if(withdrawAmount == null)
    {
        println("Invalid Withdraw Amount")
        return
    }
    else account.withdraw(withdrawAmount)

    account.displayAccountDetails()
}