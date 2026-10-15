//Create a mathematical operation system using Kotlin's Enum Class. Each operation must perform a different calculation on two numbers.
enum class Operation {
    ADD {
            override fun calculate(a: Double, b: Double): Double {
            return a + b
        }
    },

    SUBTRACT {
            override fun calculate(a: Double, b: Double): Double {
            return a - b
        }
    },

    MULTIPLY {
            override fun calculate(a: Double, b: Double): Double {
            return a * b
        }
    },

    DIVIDE {
        override fun calculate(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw ArithmeticException("Division by zero is not allowed")
        }

        return a / b
        }
    };

    abstract fun calculate(a: Double, b: Double): Double

    fun displayResult(a: Double, b: Double) {
        println("Operation     : ${this.name}")
        println("First Number  : $a")
        println("Second Number : $b")
        println("Result        : ${this.calculate(a, b)}\n")
    }
}

fun main()
{
    for(operation in Operation.entries) {
           try {
        operation.displayResult(20.0, 5.0)
    } catch (e: ArithmeticException) {
        println("${operation.name}: ${e.message}")
    }
    }
}