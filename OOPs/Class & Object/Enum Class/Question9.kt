// Question 9: Create a Traffic Fine Management System using Kotlin's Enum Class.
enum class TrafficViolation(val fineAmount: Double) {
    NO_HELMET(500.0) {
        override fun getViolationDescription(): String = "iding without wearing a helmet"
    },

    SIGNAL_JUMPING(1000.0) {
        override fun getViolationDescription(): String = "Jumping a red traffic signal"
    },

    OVERSPEEDING(2000.0) {
        override fun getViolationDescription(): String = "Driving above the speed limit"
    },

    WRONG_PARKING(300.0) {
        override fun getViolationDescription(): String = "Parking in a restricted area"
    };

    abstract fun getViolationDescription(): String
    fun calculateTotalFine(numberOfViolations: Int): Double {
        if(numberOfViolations <= 0) {
            throw IllegalArgumentException("Invalid Number of Violation")
        } else {
            return fineAmount * numberOfViolations
        }
    }

    fun displayFineDetails(numberOfViolations: Int) {
        println("Violation Type        : ${this.name}")
        println("Violation Description : " + getViolationDescription())
        println("Fine Per Violation    : %.2f".format(fineAmount))
        println("Number of Violations  : $numberOfViolations")
        println("Total Fine            : %.2f\n".format(calculateTotalFine(numberOfViolations)))
    }
}

fun main() 
{
    for(trafficViolation in TrafficViolation.entries) {
        trafficViolation.displayFineDetails(2)
    }
}