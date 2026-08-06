//Create a Kotlin program to generate a bank account summary using the `with` scope function.
class BankAccount(val accountHolderName: String, var balance: Double)
fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun main()
{
    val accountHolderName = inputString("Account Holder Name")
    val currentBalance = inputDouble("Current Balance")
    val depositAmount = inputDouble("Deposit Amount")

    val bankAccount = BankAccount(accountHolderName, currentBalance)
    val result = with(bankAccount) {
        if(depositAmount <= 0) "Invalid Deposit Amount"
        else {
            val beforeBalance = balance
            balance += depositAmount
            """
            Account Holder Name : $accountHolderName
            Previous Balance    : ${"%.2f".format(beforeBalance)}
            Deposit Amount      : ${"%.2f".format(depositAmount)}
            Updated Balance     : ${"%.2f".format(balance)}
            """.trimIndent()
        }
    }

    println(result)
}