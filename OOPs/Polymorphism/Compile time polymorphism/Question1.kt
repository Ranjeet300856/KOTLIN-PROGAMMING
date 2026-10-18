//Question 1: Smart Calculator Using Function Overloading
class SmartCalculator {
    //Add Operation
    fun add(value1: Int, value2: Int) {
        println("Add two integer : ${value1 + value2}")
    }

    fun add(value1: Int, value2: Int, value3: Int) {
        println("Add three integer : ${value1 + value2 + value3}")
    }

    fun add(value1: Double, value2: Double) {
        println("Add two double : ${value1 + value2}")
    }

    //Subtract Operation
    fun subtract(value1: Int, value2: Int) {
        println("Subtract one integer from another integer : ${value1 - value2}")
    }

    fun subtract(value1: Double, value2: Double) {
        println("Subtract one double from another double : ${value1 - value2}")
    }

    //Multiplication
    fun multiply(value1: Int, value2: Int) {
        println("Multiply two integer : ${value1 * value2}")
    }

    fun multiply(value1: Int, value2: Int, value3: Int) {
        println("Multiply three integer : ${value1 * value2 * value3}")
    }

    //Division
    fun divide(value1: Int, value2: Int): Double? {
        if(value2 == 0) {
            return null
        }
        else return value1.toDouble() / value2.toDouble()
    }

    fun divide(value1: Double, value2: Double) {
        if(value2 == 0.0) {
            println("Divide by zero not allowed")
        } else {
            println("Division of two double : ${value1 / value2}")
        }
    }
}

fun main()
{
    val smartCalculator = SmartCalculator()
    smartCalculator.add(10, 20)
    smartCalculator.add(10, 20, 30)
    smartCalculator.add(-10, -20, 30)

    smartCalculator.subtract(10, 10)
    smartCalculator.subtract(5.0, 8.5)

    smartCalculator.multiply(5, 0)
    smartCalculator.multiply(2, 3, 4)

    smartCalculator.divide(10.0, 0.0)
    println(smartCalculator.divide(10, 5))
}