//Create a Kotlin program using Abstraction to calculate delivery charges for different delivery methods.
abstract class Delivery(val distanceInKm: Double) {
    abstract fun calculateCharge(): Double
}

class StandardDelivery(distanceInKm: Double) : Delivery(distanceInKm) {
    override fun calculateCharge(): Double {
        if(distanceInKm <= 0 || !distanceInKm.isFinite()) return -1.0
        else return distanceInKm * 10
    }
}

class ExpressDelivery(distanceInKm: Double) : Delivery(distanceInKm) {
    override fun calculateCharge(): Double {
        if(distanceInKm <= 0 || !distanceInKm.isFinite()) return -1.0
        else return distanceInKm * 20
    }
}

fun main()
{
    val standardDelivery = StandardDelivery(50.0)
    val expressDelivery = ExpressDelivery(100.0)

    val standardDeliveryCharge = standardDelivery.calculateCharge()
    val expressDeliveryCharge = expressDelivery.calculateCharge()

    if(standardDeliveryCharge != -1.0) {
        println("Standard Delivery Charge : %.2f".format(standardDeliveryCharge))
    } else {
        println("Invalid Distance")
    }

    if(expressDeliveryCharge != -1.0) {
        println("Express Delivery Charge : %.2f".format(expressDeliveryCharge))
    } else {
        println("Invalid Distance")
    }
}