/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the total number of visitors of a website.
    The Singleton Object should keep track of the total visitors and provide functions to update and display the visitor count. 
*/

object VisitorCounter
{
    private var totalVisitors = 0
    fun addVisitor(count: Int)
    {
        if(count <= 0)
        {
            println("Visitor count must be greater than zero.")
            return
        }

        totalVisitors += count
    }

    fun resetCounter()
    {
        totalVisitors = 0
        println("Visitor counter has been reset successfully.")
    }

    fun displayVisitorCount()
    {
        println("\n========== Visitor Counter ==========")
        println("Total Visitors : $totalVisitors")
        println("=====================================")
    }
}

fun main()
{
    print("Enter total visit counter you want to add : ")
    val count = readln().trim().toIntOrNull()
    if(count == null)
    {
        println("Invalid Input!")
        return
    }

    VisitorCounter.addVisitor(count)
    VisitorCounter.displayVisitorCount()

    println("\nTry To Add Invalid Counter Value - 0")
    VisitorCounter.addVisitor(0)

    println("\nCalled Reset Function")
    VisitorCounter.resetCounter()

    println("\nOutput After Reset:")
    VisitorCounter.displayVisitorCount()
}