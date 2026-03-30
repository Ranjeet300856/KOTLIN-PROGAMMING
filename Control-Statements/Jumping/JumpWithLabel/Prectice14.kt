//Q14th
/*
    Write a Kotlin program to simulate a bus ticket booking system using labeled loops.

    Problem Description:
    There are 3 buses (Bus 1 to 3)
    Each bus has 5 seats (Seat 1 to 5) 
*/

fun main()
{
    outer@ for(bus in 1..3)
    {
        for(seat in 1..5)
        {
            print("Bus $bus - Seat $seat (book/skip/cancel): ")
            var input = readln().trim().lowercase()
            
            if(input == "cancel") break@outer
            if(input == "skip") continue@outer

            if(bus == 2 && seat == 4)
            {
                println("Seat Already Reserved")
                continue
            }

            if(input == "book") println("Seat $seat in Bus $bus Booked")
            else
            {
                println("Invalid Input")
                continue
            }
        }
    }
}