/*
Question 10: Ride Fare Calculator using Named Arguments and Default Parameters

This program simulates a ride fare calculator similar to Uber or Ola.
It calculates the total fare based on distance, base fare, and surge multiplier.
It demonstrates named arguments, multiple default parameters,
input validation, and formatted financial output.
*/

fun calculateRideFare(customerName: String, distanceKM: Double, pricePerKM: Double, baseFare: Double = 50.0, surgeMultiplier: Double = 1.0)
{
    val distanceCost = distanceKM * pricePerKM
    val fareBeforeSurge = baseFare + distanceCost
    val totalFare = fareBeforeSurge * surgeMultiplier

    println("Customer Name      : $customerName")
    println("Distance Travelled : %.2f".format(distanceKM) + "KM")
    println("Price Per KM       : %.2f".format(pricePerKM))
    println("Base Fare          : %.2f".format(baseFare))
    println("Surge Multiplier   : %.2f".format(surgeMultiplier))
    println("Total Fare         : %.2f".format(totalFare))
}

fun main()
{
    print("Enter Customer Name    : ")
    val name = readln().trim()
    print("Enter Distance (in KM) : ")
    val distance = readln().trim().toDoubleOrNull()
    print("Enter Price Per KM     : ")
    val price = readln().trim().toDoubleOrNull()

    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() })
    {
        println("Invalid Customer Name!")
        return
    }

    if(distance == null || price == null || distance <= 0 || price <= 0)
    {
        println("Invalid Distance or Price!")
        return
    }

    println()
    calculateRideFare(customerName = name, distanceKM = distance, pricePerKM = price)
}