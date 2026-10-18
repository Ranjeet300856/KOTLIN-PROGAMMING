//Question 8: Money Subtraction Using Operator Overloading
class Money(val rupees: Double) {
    operator fun minus(otherMoney: Money): Money {
        return Money(this.rupees - otherMoney.rupees)
    }
}

fun main()
{
    println("Test Case 1:")
    val money1 = Money(500.0)
    val money2 = Money(150.0)
    val result1 = money1 - money2
    println("Money1 : ${money1.rupees}")
    println("Money2 : ${money2.rupees}")
    println("Remaining Amount : ${result1.rupees}")

    println("\nTest Case 2:")
    val money3 = Money(100.0)
    val money4 = Money(100.0)
    val result2 = money3 - money4
    println("Money3 : ${money3.rupees}")
    println("Money4 : ${money4.rupees}")
    println("Remaining Amount : ${result2.rupees}")

    println("\nTest Case 3:")
    val money5 = Money(50.0)
    val money6 = Money(80.0)
    val result3 = money5 - money6
    println("Money5 : ${money5.rupees}")
    println("Money6 : ${money6.rupees}")
    println("Remaining Amount : ${result3.rupees}")
}