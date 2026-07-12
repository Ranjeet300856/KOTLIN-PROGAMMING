//Create a Kotlin program to manage a mobile recharge account using appropriate Visibility Modifiers.
class MobileRecharge(val mobileNumber: Long, val customerName: String, private var balance: Double)
{
    private fun isValidAmount(amount: Double): Boolean
    {
        if(amount > 0) return true
        else return false
    }

    fun recharge(amount: Double)
    {
        if(isValidAmount(amount))
        {
            balance += amount
            println("Recharge is successfull")
        }
        else println("Invalid Amount!")
    }

    fun useBalance(amount: Double)
    {
        if(isValidAmount(amount))
        {
            if(amount <= balance)
            {
                balance -= amount
                println("Amount used successfully")
            }
            else println("Insufficient balance.")
        }
        else println("Invalid Amount!")
    }

    fun displayDetails()
    {
        println("Mobile Number : $mobileNumber")
        println("Customer Name : $customerName")
        println("Balance       : %.2f".format(balance))
    }
}

fun main()
{
    print("Enter Mobile Number : ")
    val mobileNumber = readln().trim().toLongOrNull()
    print("Enter Customer Name : ")
    val customerName = readln().trim()
    print("Enter Init. Balance : ")
    val balance = readln().trim().toDoubleOrNull()
    if(mobileNumber == null || mobileNumber.toString().length != 10 || customerName.isBlank() || balance == null)
    {
        println("Invalid Input")
        return
    }

    val recharge1 = MobileRecharge(mobileNumber, customerName, balance)
    recharge1.displayDetails()

    print("\nEnter Recharge Amount : ")
    val amount = readln().trim().toDoubleOrNull()
    if(amount == null)
    {
        println("Invalid Amount!")
        return
    }
    recharge1.recharge(amount)

    print("Enter Usege Amount : ")
    val useAmount = readln().trim().toDoubleOrNull()
    if(useAmount == null)
    {
        println("Invalid Amount!")
        return
    }

    recharge1.useBalance(useAmount)
    recharge1.displayDetails()
}