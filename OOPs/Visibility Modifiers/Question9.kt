//Create a Kotlin program to manage a digital wallet using appropriate Visibility Modifiers.
class DigitalWallet(val ownerName: String, private var walletBalance: Double)
{
    fun addMoney(amount: Double)
    {
        if(amount > 0)
        {
            walletBalance += amount
            println("Amount added successfully")
        }
        else println("Invalid amount")
    }

    fun spendMoney(amount: Double)
    {
        if(amount > 0)
        {
            if(amount <= walletBalance)
            {
                walletBalance -= amount
                println("Payment successful")
            }
            else println("Insufficient balance.")
        }
        else println("Invalid amount")
    }

    fun displayWalletDetails()
    {
        println("Owner Name     : $ownerName")
        println("Wallet Balance : %.2f".format(walletBalance))
    }
}

fun inputOwnerName(): String
{
    while(true)
    {
        print("Enter Owner Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun inputBalance(): Double
{
    while(true)
    {
        print("Enter Amount : ")
        val inputAmount = readln().trim().toDoubleOrNull()
        if(inputAmount == null || inputAmount <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputAmount
    }
}

fun main()
{
    val ownerName = inputOwnerName()
    val initBalance = inputBalance()
    val wallet = DigitalWallet(ownerName, initBalance)

    while(true)
    {
        println("\n1. Add Money")
        println("2. Spend Money")
        println("3. Display Wallet Details")
        println("4. Exit")

        print("\nEnter your choice (1..4) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> {
                val amount = inputBalance()
                wallet.addMoney(amount)
            }
            2 -> {
                val amount = inputBalance()
                wallet.spendMoney(amount)
            }
            3 -> wallet.displayWalletDetails()
            4 -> {
                println("Program Exited")
                return
            }

            else -> println("Invalid Choice! Please Enter 1..4")
        }
    }
}