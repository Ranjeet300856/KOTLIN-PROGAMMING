/*
    Question 9 — Website Visitor Statistics Analyzer
    Problem Statement

    Create a Kotlin program that analyzes daily website visitors using a MutableMap.
    The program should store:
    Key = Day (String)
    Value = Number of Visitors (Int) 
*/

fun main()
{
    val websiteVisitor = mutableMapOf<String, Int>()
    websiteVisitor.put("Monday", 1200)
    websiteVisitor.put("Tuesday", 1500)
    websiteVisitor.put("Wednesday", 900)
    websiteVisitor.put("Thursday", 1800)
    websiteVisitor.put("Friday", 1600)

    var sum = 0
    for((key, value) in websiteVisitor)
        sum += value

    println("Total Visitors : $sum")

    val average = if(websiteVisitor.size > 0) sum.toDouble() / websiteVisitor.size else 0.0
    println("Average Visitors : %.2f".format(average))

    println("Visitors more than average:")
    for((key, value) in websiteVisitor)
        if(value > average)
        println("$key         : $value")
    
    println("\nAll Record:")
    for(entry in websiteVisitor.entries)
    {
        val day = entry.key
        val visitor = entry.value
        println("Day     : $day")
        println("Visitor : $visitor")
    }
}