//Create a Kotlin program to develop a Fan Speed Controller using Class and Regular Object.
class Fan
{
    var brandName = ""
    var currentSpeed = 0

    fun increaseSpeed() = currentSpeed++
    fun decreaseSpeed()
    {
        if(currentSpeed > 0) currentSpeed--
        else println("Fan is already stopped.")
    }

    fun displayStatus()
    {
        println("\n----------- Fan Status -----------\n")
        println("Brand Name   : $brandName")
        println("Current Speed: $currentSpeed")
        println("----------------------------------")
    }
}

fun main()
{
    print("Enter Brand Name : ")
    val brand = readln().trim()
    if(brand.isBlank())
    {
        println("Invalid Input")
        return
    }

    val fan = Fan()
    fan.brandName = brand  
    fan.increaseSpeed()
    fan.increaseSpeed()
    fan.increaseSpeed()
    fan.decreaseSpeed()
    fan.displayStatus()
}