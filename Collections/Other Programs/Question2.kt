//Create a Kotlin program to analyze the prices of products in an inventory using Lambda with Collections / Collection Higher-Order Functions.
fun main()
{
    val products = mutableListOf(500.0, 1000.0, 1800.0, 1500.0, 250.0, 820.0, 2500.0)

    var budgetProducts = 0
    var standardProducts = 0
    var premiumProducts = 0
    var totalOriginalPrice = 0.0
    var totalFinalPrice = 0.0
    products.forEachIndexed {
        index, value ->

        totalOriginalPrice += value
        var discountPercentage = 0.0
        println("\nProduct ${index + 1}")
        println("Original Price : %.2f".format(value))
        if(value >= 1500.0)
        {
            println("Category       : Premium")
            discountPercentage = 15.0
            premiumProducts++
        }
        else if(value >= 500)
        {
            println("Category       : Standard")
            discountPercentage = 10.0
            standardProducts++
        }
        else
        {
            println("Category       : Budget")
            discountPercentage = 5.0
            budgetProducts++
        }

        val finalPrice = value - (value * discountPercentage) / 100
        totalFinalPrice += finalPrice
        println("Final Price    : %.2f".format(finalPrice))
    }

    println("\n----- Inventory Summary -----")
    println("Total Products       : ${products.size}")
    println("Budget Products      : $budgetProducts")
    println("Standard Products    : $standardProducts")
    println("Premium Products     : $premiumProducts")
    println("Total Original Price : %.2f".format(totalOriginalPrice))
    println("Total Final Price    : %.2f".format(totalFinalPrice))
}