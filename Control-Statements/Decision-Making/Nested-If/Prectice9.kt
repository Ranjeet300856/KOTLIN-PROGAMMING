//Q9th
/*
    Write a Kotlin program that simulates an ATM withdrawal system.
    Inputs:
    balance (Int)
    withdrawAmount (Int)
    pin (Int)

    Rules
    Step 1: Validation
    If any input is invalid (null) → print "Invalid Input"
    Step 2: PIN Check
    Correct PIN = 1234
    If pin is incorrect → print "Incorrect PIN"

    Step 3: Withdrawal Rules
    If withdrawAmount ≤ 0 → "Invalid Amount"
    Else:
    If withdrawAmount > balance → "Insufficient Balance"
    Else:
    If withdrawAmount % 100 == 0:
    If balance - withdrawAmount ≥ 500:
    → print "Transaction Successful"
    Else:
    → print "Minimum Balance Violation"
    Else:
    → print "Enter amount in multiples of 100"

    Output:
    Print appropriate message
*/

fun main()
{
    print("Enter Balance : ")
    val balance = readln().trim().toIntOrNull()
    print("Enter Withdrawal Amount : ")
    val withdrawAmount = readln().trim().toIntOrNull()
    print("Enter Pin Number : ")
    val pin = readln().trim().toIntOrNull()
    if(balance == null || withdrawAmount == null || pin == null)
    {
        print("Invalid Input")
        return
    }

    //Pin Check
    if(pin != 1234)
    {
        println("Incorrect PIN")
        return
    }

    //Withdrawal Chack
    if(withdrawAmount <= 0)
    {
        println("Invalid Amount")
        return
    }


    if(withdrawAmount > balance)
    {
        println("Insufficient Balance")
    }
    else
    {
        if(withdrawAmount % 100 == 0)
        {
            if(balance - withdrawAmount >= 500)
            {
                println("Transaction Successful")
            }
            else
            {
                println("Minimum Balance Violation")
            }
        }
        else
        {
            println("Enter amount in multiples of 100")
        }
    }
}