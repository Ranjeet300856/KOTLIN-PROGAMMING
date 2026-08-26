//Create a Kotlin program that validates a user's account operation using a Custom Exception Hierarchy.
open class AccountException(message: String) : Exception(message)
class InvalidAccountException(message: String) : AccountException(message)
class InsufficientBalanceException(message: String) : AccountException(message)
fun withdraw(accountNumber: String, balance: Double, amount: Double)
{
    if(accountNumber.isBlank() || accountNumber.length < 6)
    throw InvalidAccountException("Invalid Account!")

    if(amount <= 0)
    throw AccountException("Invalid Withdraw Amount!")

    if(amount > balance)
    throw InsufficientBalanceException("Insufficient Balance!")

    println("Withdrawal successful.")
}

fun main()
{
    print("Enter Account Number  : ")
    val accountNumber = readln().trim()
    print("Enter Current Balance : ")
    val balance = readln().trim().toDoubleOrNull()
    print("Enter Withdraw Amount : ")
    val amount = readln().trim().toDoubleOrNull()
    if(balance == null || amount == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        withdraw(accountNumber, balance, amount)
    } catch(e: InvalidAccountException) {
        println(e.message)
    } catch(e: InsufficientBalanceException) {
        println(e.message)
    } catch(e: AccountException) {
        println(e.message)
    }
}