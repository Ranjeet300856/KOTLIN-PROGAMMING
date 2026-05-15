/*
    Question 9 — Real-World Style Banking Utility Package System
    Problem Statement - Create a Kotlin mini project that demonstrates a real-world style package-based utility system for a banking application. 
*/

import Bank.validation.validateAccountHolderName
import Bank.validation.validateDepositAmount
import Bank.calculation.calculateSimpleInterest
import Bank.calculation.calculateFinalAmount
import Bank.formatter.formatAccountHolderName

fun main()
{
    //Input user data
    print("Enter Account Holder Name : ")
    val name = readln().trim()

    print("Enter Deposite Amount (Principal) : ")
    val depositeAmount = readln().trim().toDoubleOrNull()

    print("Enter Interest Rate : ")
    val rate = readln().trim().toDoubleOrNull()

    print("Enter Time : ")
    val time = readln().trim().toDoubleOrNull()

    var isValid = true
    if(!validateAccountHolderName(name)) isValid = false
    if(!validateDepositAmount(depositeAmount)) isValid = false
    if(!(isValid) || rate == null || rate <= 0 || time == null || time <= 0)
    {
        println("Invalid Banking Details")
        return
    }

    //Output
    println("\nAccount Holder Name : ${formatAccountHolderName(name)}")
    println("Simple Interest     : ${calculateSimpleInterest(depositeAmount!!, rate, time)}")
    println("Final Amount        : ${calculateFinalAmount(depositeAmount, rate, time)}")
}