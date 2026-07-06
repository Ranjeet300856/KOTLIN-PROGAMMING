/*
    Create a Kotlin Extension Function for the MutableList<Int> class named removeNegativeNumbers().
    The function should:
    1. Remove all negative numbers from the list.
    2. Keep zero and positive numbers unchanged.
    3. Modify the original list.
    4. Return the total number of removed elements. 
*/

fun MutableList<Int>.removeNegativeNumbers(): Int
{
    if(this.isEmpty()) return 0

    var count = 0
    for(i in this.lastIndex downTo 0)
    {
        if(this[i] < 0)
        {
            this.removeAt(i)
            count++
        }
    }
    
    println("Modified List : $this")
    return count
}

fun main()
{
    print("How many wants to enter numbers ? : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Input")
        return
    }

    val numbers = mutableListOf<Int>()
    for(i in 1..size)
    {
        while(true)
        {
            print("Enter Number $i : ")
            val input = readln().trim().toIntOrNull()
            if(input == null)
            {
                println("Invalid Input! Try Again")
                continue
            }

            numbers.add(input)
            break
        }
    }

    print("Remove negative numbers : ")
    println(numbers.removeNegativeNumbers())
}