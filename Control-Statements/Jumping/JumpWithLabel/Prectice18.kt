//Q18th
/*
    Write a Kotlin program to simulate an online shopping order processing system using labeled loops.

    Problem Description:
    There are 3 customers (Customer 1 to 3)
    Each customer places 5 orders (Order 1 to 5) 
*/

fun main()
{
    outer@ for(customer in 1..3)
    {
        for(order in 1..5)
        {
            print("Customer $customer - Order $order (process/cancel/stop/fraud/skip): ")
            var input = readln().trim().lowercase()

            if(customer == 2 && order == 3)
            {
                println("Critical Fraud Detected - System Halted")
                break@outer
            }

            if(input == "stop") break@outer
            if(input == "cancel") continue@outer
            if(input == "fraud")
            {
                println("Order Flagged as Fraud")
                continue
            }
            if(input == "skip") continue
            if(input == "process") println("Order $order for Customer $customer Processed")
            else println("Invalid Input")
        }
    }
}