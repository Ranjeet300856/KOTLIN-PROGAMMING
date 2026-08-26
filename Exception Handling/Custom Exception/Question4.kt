// Create a Kotlin program that simulates an ATM withdrawal system using multiple Custom Exceptions.

class InvalidPinException(message: String) : Exception(message)

class AccountLockedException(message: String) : Exception(message)

class InvalidWithdrawalAmountException(message: String) : Exception(message)

class InsufficientBalanceException(message: String) : Exception(message)


class ATM(
    val accountNumber: Long,
    private val correctPin: Int = 1234,
    private var balance: Double = 10000.0,
    private val maxAttempts: Int = 3
) {

    private var failedAttempts = 0
    private var isLocked = false


    private fun verifyPin() {

        if (isLocked) {
            throw AccountLockedException("Account is already locked.")
        }

        while (failedAttempts < maxAttempts) {

            print("Enter PIN: ")
            val enteredPin = readln().trim().toIntOrNull()

            try {

                if (enteredPin != correctPin) {
                    failedAttempts++

                    if (failedAttempts == maxAttempts) {
                        isLocked = true
                        throw AccountLockedException(
                            "Account locked due to 3 incorrect PIN attempts."
                        )
                    }

                    throw InvalidPinException(
                        "Invalid PIN! ${maxAttempts - failedAttempts} attempt(s) remaining."
                    )
                }

                return

            } catch (e: InvalidPinException) {
                println(e.message)
            }
        }
    }


    fun withdraw(amount: Double) {

        // Verify PIN before processing the withdrawal.
        verifyPin()

        // Validate withdrawal amount.
        if (amount <= 0) {
            throw InvalidWithdrawalAmountException(
                "Withdrawal amount must be greater than 0."
            )
        }

        // Check whether sufficient balance is available.
        if (amount > balance) {
            throw InsufficientBalanceException(
                "Insufficient balance. Available balance: %.2f".format(balance)
            )
        }

        // Complete the withdrawal.
        balance -= amount

        println("Withdrawal successful.")
        println("Remaining Balance: %.2f".format(balance))
    }
}


fun main() {

    val atm = ATM(123456789L)

    print("Enter Withdrawal Amount: ")
    val amount = readln().trim().toDoubleOrNull()

    if (amount == null) {
        println("Invalid input.")
        return
    }

    try {

        atm.withdraw(amount)

    } catch (e: InvalidPinException) {

        println(e.message)

    } catch (e: AccountLockedException) {

        println(e.message)

    } catch (e: InvalidWithdrawalAmountException) {

        println(e.message)

    } catch (e: InsufficientBalanceException) {

        println(e.message)
    }
}