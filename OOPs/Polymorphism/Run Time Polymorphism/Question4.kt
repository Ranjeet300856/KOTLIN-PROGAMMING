//Question 4: Vehicle Management System
open class Vehicle(val brand: String) {
    open fun startEngine() {
        println("Engine Started")
    }
}

class Car(brand: String) : Vehicle(brand) {
    override fun startEngine() {
        super.startEngine()
        println("Car Started, Brand : $brand")
    }

    fun openTrunk() {
        println("Trunk opened")
    }
}

class Motorcycle(brand: String) : Vehicle(brand) {
    override fun startEngine() {
        super.startEngine()
        println("Motorcycle Started, Brand : $brand")
    }

    fun doWheelie() {
        println("Wheelie performed")
    }
}

class Truck(brand: String) : Vehicle(brand) {
    override fun startEngine() {
        super.startEngine()
        println("Truck Started, Brand : $brand")
    }

    fun loadCargo() {
        println("Cargo loaded")
    }
}

fun main()
{
    val car: Vehicle = Car("Toyota")
    val bike: Vehicle = Motorcycle("Yamaha")
    val truck: Vehicle = Truck("Volvo")

    val vehicles = listOf(car, bike, truck)
    for(vehicle in vehicles) {
        vehicle.startEngine() 
        println()
    } 

    val carObject = car as? Car
    carObject?.openTrunk()

    val bikeObject = bike as? Motorcycle
    bikeObject?.doWheelie()

    val truckObject = truck as? Truck
    truckObject?.loadCargo()
} 