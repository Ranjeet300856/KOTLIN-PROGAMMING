/*
    Question 3: Mobile Inventory Management System
    Problem Statement
    Create a Kotlin program to develop a Mobile Inventory Management System using Class and Regular Objects. 
*/

class Mobile
{
    var brandName = ""
    var modelName = ""
    var price = 0.0
    var storage = 0
    var is5GSupported = false

    fun displayMobileInfo()
    {
        println("\n----------- Mobile Information -----------\n")
        println("Brand Name      : $brandName")
        println("Model Name      : $modelName")
        println("Price           : %.2f".format(price))
        println("Storage (GB)    : $storage")
        println("5G Supported    : $is5GSupported")
        println("\n------------------------------------------\n")
    }
}

fun main()
{
    val mobile1 = Mobile()
    val mobile2 = Mobile()
    val mobile3 = Mobile()
    val mobile4 = Mobile()

    mobile1.brandName = "Apple"
    mobile1.modelName = "Iphone XR"
    mobile1.price = 40000.00
    mobile1.storage = 128
    mobile1.is5GSupported = false

    mobile2.brandName = "Apple"
    mobile2.modelName = "Iphone 18"
    mobile2.price = 200000.00
    mobile2.storage = 512
    mobile2.is5GSupported = true

    mobile3.brandName = "Realme"
    mobile3.modelName = "Realme C30s"
    mobile3.price = 10000.00
    mobile3.storage = 32
    mobile3.is5GSupported = false

    mobile4.brandName = "Samsung"
    mobile4.modelName = "Sumsung S24"
    mobile4.price = 80000.00
    mobile4.storage = 256
    mobile4.is5GSupported = true

    mobile1.displayMobileInfo()
    mobile2.displayMobileInfo()
    mobile3.displayMobileInfo()
    mobile4.displayMobileInfo()
}