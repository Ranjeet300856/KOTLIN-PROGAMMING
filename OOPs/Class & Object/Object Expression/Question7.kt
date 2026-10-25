/*
    Write a Kotlin program to represent a smart electric vehicle using an Object Expression.

    Create an open class named Vehicle with:

    An open property brand: String.
    An open function start() that prints a general vehicle starting message.

    Create an interface named ElectricVehicle with:

    A function chargeBattery().

    Create another interface named VehicleInfo with:

    A function getVehicleInfo(): String.

    Use a single Object Expression to extend Vehicle and implement both interfaces. 
*/

open class Vehicle {
    open val brand: String = ""
    open fun start() {
        println("Starting Vehicle")
    }
}

interface ElectricVehicle {
    fun chargeBattery()
}

interface VehicleInfo {
    fun getVehicleInfo(): String
}

fun main() 
{
    val vehicleObject = object : Vehicle(), ElectricVehicle, VehicleInfo {
        override val brand: String = "Tesla"
        override fun start() {
            println("Tesla electric vehicle started.")
        }

        override fun chargeBattery() {
            println("Battery charging started.")
        }

        override fun getVehicleInfo(): String = "Brand: Tesla | Type: Electric Vehicle"
    }

    println("Vehicle Information:")
    println(vehicleObject.getVehicleInfo())
    vehicleObject.start()
    vehicleObject.chargeBattery()
}