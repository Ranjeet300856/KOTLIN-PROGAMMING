//Create a Kotlin program to manage the minimum username length policy using a Companion Object.
class Account(val username: String)
{
    companion object
    {
        private var minimumUsernameLength = 5
        fun updateMinimumLength(newLength: Int)
        {
            if(newLength < 3 || newLength > 20)
            {
                println("Invalid Length!")
                return
            }

            minimumUsernameLength = newLength
        }

        fun displayMinimumLength() = println("Current minimum length : $minimumUsernameLength")
    }

    fun displayAccountStatus()
    {
        println("\nUsername : $username")
        println("Status   : ${if(username.length >= minimumUsernameLength) "Valid Username" else "Invalid Username"}")
    }
}

fun displayDetails(accounts: MutableList<Account>)
{
    for(account in accounts)
    account.displayAccountStatus()
}

fun main()
{
    print("How many accounts do you want to create? : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input <= 0)
    {
        println("Invalid Input!")
        return
    }

    val accounts = mutableListOf<Account>()
    for(i in 1..input)
    {
        while(true)
        {
            print("Enter Username : ")
            val inputName = readln().trim()
            if(inputName.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            val userAccount = Account(inputName)
            accounts.add(userAccount)
            break
        }
    }
    Account.displayMinimumLength()
    displayDetails(accounts)

    print("\nEnter new minimum length : ")
    val inputNewLength = readln().trim().toIntOrNull()
    if(inputNewLength == null)
    {
        println("Invalid Input")
        return
    }

    Account.updateMinimumLength(inputNewLength)
    Account.displayMinimumLength()

    println("\nAfter update minimum length:")
    displayDetails(accounts)
}