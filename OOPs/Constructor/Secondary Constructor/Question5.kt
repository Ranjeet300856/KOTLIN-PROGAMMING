//Create a Kotlin program to develop a Vehicle Registration System using a Primary Constructor, 
//Multiple Secondary Constructors, and a Menu Driven Program.
class Vehicle(val vehicleID: Int, val vehicleName: String, val vehicleBrand: String, var vehiclePrice: Double, var isElectric: Boolean)
{
    init {
        if(vehiclePrice < 0) vehiclePrice = 0.0
        println("Primary Constructor Executed")
    }
    constructor(name: String, brand: String) : this(0, name, brand, 0.0, false) 
    {
        println("Secondary Constructor 1 Executed")
    }
    constructor(name: String) : this(0, name, "Unknown", 0.0, false) 
    {
        println("Secondary Constructor 2 Executed")
    }

    fun displayVehicleDetails()
    {
        println("\nVehicle ID          : $vehicleID")
        println("Vehicle Name        : $vehicleName")
        println("Vehicle Brand       : $vehicleBrand")
        println("Vehilce Price       : %.2f".format(vehiclePrice))
        println("Vehicle Is Electric : $isElectric")
    }
}

fun inputVehicleName(): String
{
    while(true)
    {
        print("Enter Vehicle Name : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputVehicleBrand(): String
{
    while(true)
    {
        print("Enter Vehicle Brand : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputVehicleId(): Int
{
    while(true)
    {
        print("Enter Vehicle ID : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputVehiclePrice(): Double
{
    while(true)
    {
        print("Enter Vehicle Price : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputIsElectricStatus(): Boolean
{
    while(true)
    {
        print("Enter Electric Status (Yes or No) : ")
        val input = readln().trim().lowercase()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        if(input == "yes") return true
        else if(input == "no") return false
        else println("Invalid Input Status! Please Enter Yes/No")
    }
}

fun main()
{
    println("\n-----------------------------")
    println("Vehicle Registration System")
    println("-----------------------------\n")

    while(true)
    {
        println("\n1. Register using Primary Constructor")
        println("2. Register using Secondary Constructor 1")
        println("3. Register using Secondary Constructor 2")
        println("4. Exit")

        print("Enter your choice (1-4) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice) {
            1 -> {
                val id = inputVehicleId()
                val name = inputVehicleName()
                val brand = inputVehicleBrand()
                val price = inputVehiclePrice()
                val isElectric = inputIsElectricStatus()

                val vehicle = Vehicle(id, name, brand, price, isElectric)
                vehicle.displayVehicleDetails()
            }
            2 -> {
                val name = inputVehicleName()
                val brand = inputVehicleBrand()

                val vehicle = Vehicle(name, brand)
                vehicle.displayVehicleDetails()
            }
            3 -> {
                val name = inputVehicleName()
                val vehicle = Vehicle(name)
                vehicle.displayVehicleDetails()
            }
            4 -> {
                println("Program Exited Successfully")
                break
            }

            else -> println("Invalid Choice! Try Again")
        }
    }
}