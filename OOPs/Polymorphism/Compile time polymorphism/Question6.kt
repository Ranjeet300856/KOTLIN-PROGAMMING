//Question 6: Distance Addition Using Operator Overloading
class Distance(val meters: Int) {
    operator fun plus(otherDistance: Distance): Distance {
        return Distance(this.meters + otherDistance.meters)
    }
}

fun main()
{
    val distance1 = Distance(100)
    val distance2 = Distance(250)
    val total1 = distance1.plus(distance2)

    println("Test Case 1:")
    println("Distance 1st   : ${distance1.meters}")
    println("Distance 2nd   : ${distance2.meters}")
    println("Total Distance : ${total1.meters}")

    val distance3 = Distance(0)
    val distance4 = Distance(20)
    val total2 = distance3.plus(distance4)
    println("\nTest Case 2:")
    println("Distance 1st   : ${distance3.meters}")
    println("Distance 2nd   : ${distance4.meters}")
    println("Total Distance : ${total2.meters}")

    val distance5 = Distance(-20)
    val distance6 = Distance(30)
    val total3 = distance5.plus(distance6)
    println("\nTest Case 3:")
    println("Distance 1st   : ${distance5.meters}")
    println("Distance 2nd   : ${distance6.meters}")
    println("Total Distance : ${total3.meters}")
}