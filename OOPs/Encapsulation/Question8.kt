//Question 8: Bank Account PIN Management
class BankAccount(private var pin: String = "1234") {
    fun changePin(newPin: String) {
        if(newPin.isBlank() || newPin.length != 4 || !newPin.all { it.isDigit()}) println("Invalid PIN. It must contain exactly four digits")
        else {
            pin = newPin
            println("Pin Changed Successfully")
        }
    }

    fun verifyPin(inputPin: String): Boolean = inputPin == pin
}

fun main()
{
    val bankAccount = BankAccount()
    bankAccount.changePin("5678")
    val result1 = bankAccount.verifyPin("5678")
    println("Correct PIN : ${result1}")

    val result2 = bankAccount.verifyPin("1234")
    println("Correct PIN : ${result2}")

    bankAccount.changePin("12ab")
    bankAccount.changePin("12345")
    bankAccount.changePin("123")
}