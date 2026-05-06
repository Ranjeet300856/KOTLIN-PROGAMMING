/*
    Write a Kotlin program that generates a formatted restaurant menu using Raw String and dynamic data. 
    The menu should conditionally display a 'Special Offer' section only when the offer is available. 
*/

fun main()
{
    //Input
    print("Enter Restaurant Name : ")
    val restaurantName = readln()

    print("Enter Food Item       : ")
    val foodItem = readln()

    print("Enter Price           : ")
    val price = readln().toDoubleOrNull()

    print("Enter Offer Status    : ")
    val offer = readln().lowercase()

    if(restaurantName.isBlank() || foodItem.isBlank())
    {
        println("Invalid Restaurant Name or Food Item")
        return
    }

    if(price == null || price < 0)
    {
        println("Invalid Price")
        return
    }

    var specialOffer = false
    if(offer == "yes") specialOffer = true
    else if(offer != "no")
    {
        println("Invalid Offer Status")
        return
    }

    //Raw String
    val menuCard = """
    #========== FOOD MENU ==========
#
    #Restaurant : $restaurantName
    #Food Item  : $foodItem
    #Price      : ${'$'}${"%.2f".format(price)}
#
    #${if(specialOffer) "*** Special Offer Available ***" else ""}
    #${if(specialOffer) "Get 20% OFF on your next order!" else ""}
#
    #================================
    """.trimMargin("#")

    //Output
    println(menuCard)
}