//Create a Kotlin program to manage a bank account system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName          : $personName")
        println("Age             : $personAge")
    }
}

open class Account(
    val accountNumber: Long,
    val accountType: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayAccountDetails()
    {
        displayPersonDetails()
        println("Account Number  : $accountNumber")
        println("Account Type    : $accountType")
    }
}

class BankAccount(
    private var accountBalance: Double,
    var isActive: Boolean,
    accountNumber: Long,
    accountType: String,
    personName: String,
    personAge: Int
) : Account(accountNumber, accountType, personName, personAge)
{
    fun displayBankDetails()
    {
        println("\nWelcome $personName!\n")
        displayAccountDetails()
        println("Account Balance : %.2f".format(accountBalance))
        println("Active Status   : ${if(isActive) "Active" else "Not Active"}")
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
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
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for $text")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}

fun inputLong(text: String): Long
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toLongOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val accountBalance = inputDouble("Balance")
    val isActive = inputBoolean("Account is activate or not activate")
    val accountNumber = inputLong("Account Number")
    val accountType = inputString("Account Type")
    val personName = inputString("Account Holder Name")
    val personAge = inputInteger("Account Holder Age")

    val bankAccount = BankAccount(accountBalance, isActive, accountNumber, accountType, personName, personAge)
    bankAccount.displayBankDetails()
}