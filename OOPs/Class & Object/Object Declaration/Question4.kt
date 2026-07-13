/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the balance of a mobile wallet.
    The Singleton Object should maintain the current wallet balance and allow users to deposit money, withdraw money, and check the available balance. 
*/

object MobileWallet
{
    private var walletBalance = 0.0
    val currency = "INR"
    fun deposit(amount: Double)
    {
        if(amount > 0)
        {
            walletBalance += amount
            println("Amount deposit successfully")
        }
        else println("Nagetive amount not allowed! please enter positive amount")
    }

    fun withdraw(amount: Double)
    {
        if(amount > 0)
        {
            if(amount <= walletBalance)
            {
                walletBalance -= amount
                println("Amount withdraw successfully")
            }
            else println("Insufficient Balance!")
        }
        else println("Nagetive amount not allowed! please enter positive amount")
    }

    fun displayWalletDetails()
    {
        println("========== Mobile Wallet ==========")
        println("Currency       : $currency")
        println("Wallet Balance : %.2f".format(walletBalance))
        println("===================================")
    }
}

fun main()
{
    println("\nDefault wallet details:")
    MobileWallet.displayWalletDetails()

    println("\nCalled deposit():")
    MobileWallet.deposit(2500.50)
    MobileWallet.displayWalletDetails()

    println("\nDeposit invalid amount:")
    MobileWallet.deposit(0.0)
    MobileWallet.displayWalletDetails()

    println("\nCalled withdraw():")
    MobileWallet.withdraw(1000.25)
    MobileWallet.displayWalletDetails()

    println("\nWithraw amount grater than available balance:")
    MobileWallet.withdraw(3000.0)
    MobileWallet.displayWalletDetails()
}