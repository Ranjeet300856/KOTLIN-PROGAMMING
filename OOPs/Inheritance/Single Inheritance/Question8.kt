//Create a Kotlin program to manage vehicle service information using Single Inheritance.
open class Vehicle(protected val vehicleNumber: Int, val vehicleOwner: String, var vehicleModel: String)
{
    fun vehicleDetails()
    {
        println("\nVehicle Number : $vehicleNumber")
        println("Vehicle Owner  : $vehicleOwner")
        println("Vehicle Model  : $vehicleModel")
    }
}

class ServiceRecord(
    private var serviceCharge: Double,
    var isServiceCompleted: Boolean,
    vehicleNumber: Int,
    vehicleOwner: String,
    vehicleModel: String
) : Vehicle(vehicleNumber, vehicleOwner, vehicleModel)
{
    fun startService()
    {
        if(isServiceCompleted) println("Service is completed")
        else
        {
            println("Service start successfully")
        }
    }

    fun completeService()
    {
        if (isServiceCompleted)
        {
            println("Service is already completed.")
        }
        else
        {
            isServiceCompleted = true
            println("Service completed successfully.")
        }
    }

    fun updateServiceCharge(amount: Double)
    {
        if (isServiceCompleted)
        {
            println("Service charge cannot be updated after service completion.")
            return
        }

        serviceCharge = amount
        println("Service charge updated successfully.")
    }

    fun displayServiceRecord()
    {
        println("Service Charge : %.2f".format(serviceCharge))
        println("Service Status : ${if(isServiceCompleted) "Service is up to date" else "Service Required"}")
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

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for $text")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}

fun main()
{
    val vehicleNumber = inputInteger("Vehicle Number")
    val vehicleOwner = inputString("Owner Name")
    val vehicleModel = inputString("Vehicle Model")
    val serviceCharge = inputDouble("Service Charge")
    val isServiceCompleted = inputBoolean("Service Completed")

    val service = ServiceRecord(serviceCharge, isServiceCompleted, vehicleNumber, vehicleOwner, vehicleModel)
    service.startService()
    val newServiceCharge = inputDouble("New Service Charge")
    service.updateServiceCharge(newServiceCharge)
    service.completeService()
    service.vehicleDetails()
    service.displayServiceRecord()
}