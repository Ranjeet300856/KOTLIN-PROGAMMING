//Create a Kotlin program that validates a product's price using Custom Exception Handling.
class InvalidPriceException(message: String) : Exception(message)
fun validatePrice(price: Double)
{
    if(price <= 0) throw InvalidPriceException("Invalid Price!")
    println("Price Is Valid")
}

fun main()
{
    print("Enter Price : ")
    val price = readln().trim().toDoubleOrNull()
    if(price == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        validatePrice(price)
    } catch(e: InvalidPriceException) {
        println(e.message)
    }
}