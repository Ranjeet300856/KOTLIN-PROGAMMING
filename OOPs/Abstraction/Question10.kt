//Create a Kotlin program using Abstraction to manage a vehicle rental system.
abstract class Vehicle(
    val vehicleName: String,
    val rentalPricePerDay: Double
) {
    abstract fun calculateRentalCost(days: Int): Double
    fun showDetails() {
        println("Vehicle Name         : $vehicleName")
        println("Rental Price Per Day : %.2f".format(rentalPricePerDay))
    }
}

class Car(
    vehicleName: String,
    rentalPricePerDay: Double
) : Vehicle(vehicleName, rentalPricePerDay) {
    override fun calculateRentalCost(days: Int): Double {
        if(vehicleName.isBlank() || rentalPricePerDay <= 0 || !rentalPricePerDay.isFinite() || days <= 0) return -1.0
        else {
            showDetails()
            return rentalPricePerDay * days
        }
    }
}

class Bike(
    vehicleName: String,
    rentalPricePerDay: Double
) : Vehicle(vehicleName, rentalPricePerDay) {
    override fun calculateRentalCost(days: Int): Double {
        if(vehicleName.isBlank() || rentalPricePerDay <= 0 || !rentalPricePerDay.isFinite() || days <= 0) return -1.0
        else {
            showDetails()
            return rentalPricePerDay * days
        }
    }
}

fun main()
{
    val car = Car("Car", 2000.0)
    val bike = Bike("Bike", 500.0)

    val rentalCostForCar = car.calculateRentalCost(3)
    if(rentalCostForCar != -1.0) {
        println("Rental Cost for 3 days : %.2f".format(rentalCostForCar))
    } else {
        println("Invalid Rental Const or Days")
    }

    val rentalCostForBike = bike.calculateRentalCost(3)
    if(rentalCostForBike != -1.0) {
        println("Rental Cost for 3 days : %.2f".format(rentalCostForBike))
    } else {
        println("Invalid Rental Const or Days")
    }
}