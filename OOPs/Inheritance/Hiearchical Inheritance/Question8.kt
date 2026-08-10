//Create a Kotlin program to demonstrate Hierarchical Inheritance for an online payment system.
open class Payment(val transactionId: String, val amount: Double)
{
    fun displayPaymentInfo()
    {
        println("\nTransaction ID   : $transactionId")
        println("Amount           : %.2f".format(amount))
    }
}

class UPIPayment(val upiId: String, transactionId: String, amount: Double) : Payment(transactionId, amount)
{
    fun upiPaymentInfo()
    {
        val transactionFee = amount * 2 / 100
        val finalAmount = amount + transactionFee

        displayPaymentInfo()
        println("UPI ID           : $upiId")
        println("Transaction Fee  : %.2f".format(transactionFee))
        println("Final Amount     : %.2f".format(finalAmount))
    }
}

class CardPayment(val cardHolderName: String, val cardLastFourDigit: Int, transactionId: String, amount: Double) : Payment(transactionId, amount)
{
    fun cardPaymentInfo()
    {
        val transactionFee = amount * 1.5 / 100
        val finalAmount = amount + transactionFee

        displayPaymentInfo()
        println("Card Holder Name : $cardHolderName")
        println("Last Four Digit  : $cardLastFourDigit")
        println("Transaction Fee  : %.2f".format(transactionFee))
        println("Final Amount     : %.2f".format(finalAmount))
    }
}

class CashPayment(val cashReceived: Double, transactionId: String, amount: Double) : Payment(transactionId, amount)
{
    fun cashPaymentInfo()
    {
        displayPaymentInfo()
        println("Cash Received    : %.2f".format(cashReceived))
        println("Change           : %.2f".format(cashReceived - amount))
    }
}

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
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.length != 4 || input.toIntOrNull() == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input.toInt()
    }
}

fun main()
{
    //UPI Payment
    val upiId = inputString("UPI ID")
    val transactionId = inputString("UPI Transaction ID")
    val amount = inputDouble("UPI Amount")
    val upiPayment = UPIPayment(upiId, transactionId, amount)

    //Card Payment
    println()
    val cardHolderName = inputString("Card Holder Name")
    val cardLastFourDigit = inputInteger("Card Last Four Digit")
    val cardTransactionId = inputString("Card Transaction ID")
    val cardAmount = inputDouble("Card Amount")
    val cardPayment = CardPayment(cardHolderName, cardLastFourDigit, cardTransactionId, cardAmount)

    //Cash Payment
    println()
    var cashReceived: Double = 0.0
    val cashTransationId = inputString("Cash Transaction ID")
    val cashAmount = inputDouble("Cash Amount")
    while(true)
    {
        cashReceived = inputDouble("Cash Received Amount")
        if(cashReceived < cashAmount)
        {
            println("Insufficient Amount! Try Again")
            continue
        }
        break
    }
    val cashPayment = CashPayment(cashReceived, cashTransationId, cashAmount)

    //Output
    upiPayment.upiPaymentInfo()
    cardPayment.cardPaymentInfo()
    cashPayment.cashPaymentInfo()
}