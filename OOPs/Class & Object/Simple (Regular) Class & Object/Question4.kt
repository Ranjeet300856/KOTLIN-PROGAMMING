/*
    Question 4: Bank Account Management System (User Input Based)
    Problem Statement
    Create a Kotlin program to develop a Bank Account Management System using Class, Regular Object, and User Input. 
*/

class BankAccount
{
    var accountNumber = 0L
    var accountHolderName = ""
    var accountType = ""
    var balance = 0.0
    var isActive = false

    fun displayAccountInfo()
    {
        println("\n----------- Bank Account Information -----------\n")
        println("Account Number      : $accountNumber")
        println("Account Holder Name : $accountHolderName")
        println("Account Type        : $accountType")
        println("Balance             : %.2f".format(balance))
        println("Account Active      : $isActive")
        println("-----------------------------------------------")
    }
}

fun main()
{
    print("Enter Account Number      : ")
    val inputAccoutNumber = readln().trim().toLongOrNull()
    if(inputAccoutNumber == null || inputAccoutNumber <= 0)
    {
        println("Invalid Accout Number")
        return
    }

    print("Enter Account Holder Name : ")
    val inputAccoutHolderName = readln().trim()
    if(inputAccoutHolderName.isBlank())
    {
        println("Invalid Account Holder Name")
        return
    }

    print("Enter Account Type        : ")
    val inputAccoutType = readln().trim()
    if(inputAccoutType.isBlank())
    {
        println("Invalid Account Type")
        return
    }

    print("Enter Balance            : ")
    val balance = readln().trim().toDoubleOrNull()
    if(balance == null || balance <= 0.0)
    {
        println("Invalid Balance")
        return
    }

    print("Enter Account Status (true/false) : ")
    val status = readln().trim().lowercase()
    if(status.isBlank() || (status != "true" && status != "false"))
    {
        println("Invalid Status")
        return
    }
    
    val isActiveStatus = status.toBoolean()

    val account1 = BankAccount()
    account1.accountNumber = inputAccoutNumber
    account1.accountHolderName = inputAccoutHolderName
    account1.accountType = inputAccoutType
    account1.balance = balance
    account1.isActive = isActiveStatus

    account1.displayAccountInfo()
}