//Q7th
/*
  Write a Kotlin program that displays a menu (Add, Subtract, Multiply, Divide, Exit) 
  and performs operations based on user input using a do-while loop.
*/

fun main()
{
    do
    {
        println("-----Basic Calculator-----")
        println("1. Add.")
        println("2. Sub.")
        println("3. Multi.")
        println("4. Div.")
        println("5. Exit")

        print("Enter your choice (1 - 5) : ")
        var choice = readln().trim().toIntOrNull()
        if(choice == null || choice < 1 || choice > 5)
        {
            println("Invalid Choice Input")
            continue
        }

        
         if (choice == 5) 
         {
            println("Exit Successfully")
            return
        }

        print("Enter 1st Number : ")
        var number1 = readln().trim().toIntOrNull()
        print("Enter 2nd Number : ")
        var number2 = readln().trim().toIntOrNull()
        if(number1 == null || number2 == null)
        {
            println("Invalid Input")
            continue
        }

        var num1 = number1
        var num2 = number2
        when(choice)
        {
            1 -> println("Add. = ${num1 + num2}")
            2 -> println("Sub. = ${num1 - num2}")
            3 -> println("Multi. = ${num1 * num2}")
            4 -> {
                if (num2 == 0) println("Cannot divide by zero")
                else println("Div. = ${num1 / num2}")
            }
        }

        println()
    }while(true)
}