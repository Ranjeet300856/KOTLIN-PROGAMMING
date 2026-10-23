//Question 6: Digital Wallet
class DigitalWallet(
    val ownerName: String,
    private var initialBalance: Double
) {
    init {
        require(initialBalance >= 0) {
            "Initial balance cannot be negative"
        }
    }

    fun addMoney(amount: Double) {
        if(amount > 0) {
            initialBalance += amount
            println("Money $amount Added Successfully")
        } else {
            println("Invalid Money: $amount")
        }
    }

    fun spendMoney(amount: Double) {
        if(amount > 0) {
            if(amount <= initialBalance) {
                initialBalance -= amount
                println("Money $amount Spend Successfully")
            } else println("Insufficient Balance")
        } else println("Invalid Amount")
    }

    fun getBalance(): Double = initialBalance
}

fun displayWalletInfo(wallet: DigitalWallet) {
    println("Current Balance : %.2f\n".format(wallet.getBalance()))
}

fun main()
{
    val wallet = DigitalWallet("Rahul", 1000.0)
    println("Owner Name : ${wallet.ownerName}")
    displayWalletInfo(wallet)

    wallet.addMoney(500.0)
    displayWalletInfo(wallet)

    wallet.spendMoney(300.0)
    displayWalletInfo(wallet)

    wallet.addMoney(-100.0)
    displayWalletInfo(wallet)

    wallet.spendMoney(1400.0)
    displayWalletInfo(wallet)
}