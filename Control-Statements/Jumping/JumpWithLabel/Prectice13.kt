//Q13th
/*
    Write a Kotlin program to simulate a vending machine system using labeled loops.

    Problem Description:
    A vending machine has 3 categories of items:
    Category 1 → Snacks
    Category 2 → Drinks
    Category 3 → Desserts

    Each category contains 5 items (1 to 5)

    User Input:
    For each item, user enters:
    "buy" → to purchase item
    "skip" → to skip entire category
    "exit" → to stop using machine 
*/

fun main()
{
    outer@ for(i in 1..3)
    {
        val categoryName = when(i)
        {
            1 -> "Snacks"
            2 -> "Drinks"
            else -> "Desserts"
        }

        for(item in 1..5)
        {
            print("Category $i ($categoryName) - Item $item (buy/skip/exit): ")
            var input = readln().trim().lowercase()

            if(input == "exit") break@outer
            if(input == "skip") continue@outer
            if(input == "buy") println("Item $item from Category $categoryName Purchased")
            else
            {
                println("Invalid Command")
                continue
            }
         }
    }
}