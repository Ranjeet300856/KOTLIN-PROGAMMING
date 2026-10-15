/* 
    Create a bank account type system using Kotlin's Enum Class. 
    Each account type must have a predefined minimum balance requirement and an associated annual interest rate. 
*/

enum class AccountType(
    private val minimumBalance: Double,
    private val interestRate: Double
) {
    SAVINGs(1000.0, 4.0),
    CURRENT(5000.0, 0.0),
    FIXED_DEPOSIT(10000.0, 7.0);

    init {
        if(minimumBalance < 0 || interestRate < 0) {
            throw IllegalArgumentException("Invalid Argument!")
        }
    }

    private fun isEligible(balance: Double): Boolean {
        if(balance >= minimumBalance) return true
        else return false
    }

    private fun calculateAnnualInterest(balance: Double): Double {
        return balance * interestRate / 100
    }

    fun displayAccountDetails(balance: Double) {
        println("Account Type    : ${this.name}")
        println("Minimum Balance : %.2f".format(minimumBalance))
        println("Interest Rate   : %.2f".format(interestRate))
        println("Balance         : %.2f".format(balance))

        if(isEligible(balance)) {
            println("Eligible        : YES")
            println("Annual Interest : %.2f\n".format(calculateAnnualInterest(balance)))
        } else {
            println("Not Eligible")
        }    
    }
}

fun main()
{
    for(account in AccountType.entries) {
        account.displayAccountDetails(12000.0)
    }
}