//Question 3 — Abstract Class with Multiple Child Classes
abstract class Vehicle {
    fun start() {
        println("Vehicle is starting")
    }

    abstract fun drive()
}

class Car : Vehicle() {
    override fun drive() {
        println("Car is driving")
    }
}
class Bike : Vehicle() {
    override fun drive() {
        println("Bike is driving")
    }
}
class Truck : Vehicle() {
    override fun drive() {
        println("Truck is driving")
    }
}

fun main()
{
    val car = Car()
    val bike = Bike()
    val truck = Truck()

    car.start()
    car.drive()

    println()
    bike.start()
    bike.drive()

    println()
    truck.start()
    truck.drive()
}