//Create a Kotlin program to manage laptop battery information using appropriate Visibility Modifiers.
class Laptop(val brandName: String, private var batteryPercentage: Int)
{
    fun displayLaptopDetails()
    {
        println("\nBrand Name         : $brandName")
        println("Battery Percentage : $batteryPercentage")
    }

    fun chargeBattery(amount: Int)
    {
        if(amount > 0 && amount + batteryPercentage <= 100)
        {
            batteryPercentage += amount
            println("Battery charged successfully.")
        }
        else println("Invalid charging amount.")
    }

    fun useBattery(amount: Int)
    {
        if(amount in 1..100)
        {
            if(batteryPercentage - amount >= 0)
            {
                batteryPercentage -= amount
                println("Battery used successfully.")
            }
            else println("Insufficient battery.")
        }
        else println("Invalid usage amount.")
    }
}

fun inputBrand(): String
{
    while(true)
    {
        print("Enter Laptop Brand : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBatteryPct(): Int
{
    while(true)
    {
        print("Enter Battery Percentage : ")
        val input = readln().trim().toIntOrNull()
        if(input == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    println("Enter Laptop 1 Information:")
    val brandName1 = inputBrand()
    val batteryPercentage1 = inputBatteryPct()
    val laptop1 = Laptop(brandName1, batteryPercentage1)

    println("\nEnter Laptop 2 Information:")
    val brandName2 = inputBrand()
    val batteryPercentage2 = inputBatteryPct()
    val laptop2 = Laptop(brandName2, batteryPercentage2)

    print("\nEnter Charge Amount For First Laptop : ")
    val inputChargeAmount = readln().trim().toIntOrNull()
    if(inputChargeAmount == null) 
    {
        println("Invalid Amount!")
        return
    }
    laptop1.chargeBattery(inputChargeAmount)

    print("\nEnter Use Amount For Second Laptop : ")
    val inputUseAmount = readln().trim().toIntOrNull()
    if(inputUseAmount == null) 
    {
        println("Invalid Amount!")
        return
    }
    laptop2.useBattery(inputUseAmount)

    println("\nFirst Laptop:")
    laptop1.displayLaptopDetails()
    println("\nSecond Laptop:")
    laptop2.displayLaptopDetails()
}