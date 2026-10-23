//Question 1: Bank Account Balance
class BankAccount(private var balance: Double = 1000.0) {
    fun deposit(amount: Double) {
        if(amount <= 0) println("Invalid Deposit Amount $amount")
        else {
            balance += amount
            println("Amount $amount Deposit Successfully")
        }
    }

    fun getBalance(): Double = balance
}

fun displayBalance(bankAccount: BankAccount) {
    println("Current Balance : %.2f".format(bankAccount.getBalance()))
}

fun main()
{
    val bankAccount = BankAccount()

    displayBalance(bankAccount)
    bankAccount.deposit(500.0)
    displayBalance(bankAccount)

    bankAccount.deposit(-200.0)
    displayBalance(bankAccount)
}