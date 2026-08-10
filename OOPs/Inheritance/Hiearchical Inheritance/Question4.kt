//Create a Kotlin program to demonstrate Hierarchical Inheritance for a vehicle management system.
open class Vehicle(val vehicleNumber: String, val brand: String, val price: Double)
{
    fun displayVehicleInfo()
    {
        println("Vehicle Number   : $vehicleNumber")
        println("Vehicle Brand    : $brand")
        println("Vehicle Price    : %.2f".format(price))
    }
}

class Car(val numberOfDoors: Int, vehicleNumber: String, brand: String, price: Double) : Vehicle(vehicleNumber, brand, price)
{
    fun displayCarInfo()
    {
        println("\nCar Info:")
        displayVehicleInfo()
        println("Total Doors      : $numberOfDoors")
    }
}

class Bike(val hasGear: Boolean, vehicleNumber: String, brand: String, price: Double) : Vehicle(vehicleNumber, brand, price)
{
    fun displayBikeInfo()
    {
        println("\nBike Info:")
        displayVehicleInfo()
        println("Has Gear         : ${if(hasGear) "YES" else "NO"}")
    }
}

class ElectricCar(val batteryCapacity: Double, vehicleNumber: String, brand: String, price: Double) : Vehicle(vehicleNumber, brand, price)
{
    fun displayElectricCarInfo()
    {
        println("\nElectric Car Info:")
        displayVehicleInfo()
        println("Battery Capacity : %.2f".format(batteryCapacity))
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}

fun main()
{
    //Car
    val carNumber = inputString("Car Number")
    val carBrand = inputString("Car Brand")
    val carPrice = inputDouble("Car Price")
    val totalDoors = inputInteger("Total Doors of Car")
    val car = Car(totalDoors, carNumber, carBrand, carPrice)

    //Bike
    println()
    val bikeNumber = inputString("Bike Number")
    val bikeBrand = inputString("Bike Brand")
    val bikePrice = inputDouble("Bike Price")
    val hasGear = inputBoolean("Yes or No for bike has gear ?")
    val bike = Bike(hasGear, bikeNumber, bikeBrand, bikePrice)

    //Electric Car
    println()
    val electricCarNumber = inputString("Electric Car Number")
    val electricCarBrand = inputString("Electric Car Brand")
    val electricCarPrice = inputDouble("Electric Car Price")
    val electricCarBattary = inputDouble("Electric Car Battary Capacity")
    val electricCar = ElectricCar(electricCarBattary, electricCarNumber, electricCarBrand, electricCarPrice)

    //Output
    println()
    car.displayCarInfo()
    bike.displayBikeInfo()
    electricCar.displayElectricCarInfo()
}