/*
    Create a Kotlin Extension Function for the Map<String, Int> class named getHighestValue().
    The function should:
    1. Find the highest value stored in the map.
    2. Return the highest value as an Int.
    3. Handle an empty map safely by returning 0.
*/

fun Map<String, Int>.getHighestValue(): Int
{
    if(this.isEmpty()) return 0
    var max = this.values.first()
    for(value in this.values)
    if(value > max) max = value
    return max
}

fun main()
{
    val marks = mapOf<String, Int>(
        "Internet Technology" to 68,
        "Operating System" to 54,
        "Python Programming" to 80,
        "Client Server Computing" to 60
    )

    val highestMarks = marks.getHighestValue()
    println("Highest Marks : $highestMarks")
}