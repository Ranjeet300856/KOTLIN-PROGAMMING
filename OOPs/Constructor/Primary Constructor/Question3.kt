/*
    Problem Statement:
    Create a Kotlin program to develop a Bank Account Initialization System
    using a Primary Constructor and init Block.

    Requirements:
    1. Create a class named BankAccount.
    2. Use a Primary Constructor to initialize the following properties:
       - Account Number (Long)
       - Account Holder Name (String)
       - Account Balance (Double)

    3. Use an init Block to display the following message immediately after
       an object is created:
       "Bank Account Created Successfully!"

    4. Inside the init Block, also display:
       - Account Number
       - Account Holder Name

    5. Create a member function named displayAccountDetails() that displays:
       - Account Number
       - Account Holder Name
       - Account Balance

    6. Create at least 3 BankAccount objects with different data.
    7. Call displayAccountDetails() for each object.
*/

class BankAccount(val accountNumber: Long, val accountHolderName: String, var balance: Double)
{
    init {
        println("\nBank Account Created Successfully!")
        println("Account Number      : $accountNumber")
        println("Account Holder Name : $accountHolderName")
    }

    fun displayAccountDetails()
    {
        println("\nAccount Number      : $accountNumber")
        println("Account Holder Name : $accountHolderName")
        println("Balance             : %.2f".format(balance))
    }
}

fun main()
{
    val account1 = BankAccount(1234567890L, "Ranjeet Suthar", 10000.0)
    val account2 = BankAccount(2123456789L, "Saloni Suthar", 20000.0)
    val account3 = BankAccount(1234876506L, "Rahul Suthar", 30000.0)

    account1.displayAccountDetails()
    account2.displayAccountDetails()
    account3.displayAccountDetails()
}