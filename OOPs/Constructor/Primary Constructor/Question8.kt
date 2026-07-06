//Create a Kotlin program to develop an Electricity Bill Management System using a Primary Constructor.
class ElectricityBill(val consumerId: Int, val consumerName: String, var unitsConsumed: Double, var ratePerUnit: Double)
{
    init {
        if(unitsConsumed < 0)
        {
            println("Units Consumed is Negative or Invalid Input")
            unitsConsumed = 0.0
        }

        if(ratePerUnit < 0)
        {
            println("Rate is Negative or Invalid Input")
            ratePerUnit = 0.0
        }
    }

    var totalBill = 0.0

    fun calculateBill()
    {
        totalBill = unitsConsumed * ratePerUnit
    }
    fun applyDiscount(): Double
    {
        if(totalBill >= 5000.0) return 10.0
        else return 0.0
    }

    fun displayBillDetails()
    {
        println("Consumer ID       : $consumerId")
        println("Consumer Name     : $consumerName")
        println("Units Consumed    : %.2f".format(unitsConsumed))
        println("Rate Per Unit     : %.2f".format(ratePerUnit))

        val finalBill = totalBill - (totalBill * applyDiscount() / 100)
        println("Final Bill Amount : %.2f".format(finalBill))
    }
}

fun main()
{
    print("Enter Consumer ID : ")
    val id = readln().trim().toIntOrNull()
    print("Enter Consumer Name : ")
    val name = readln().trim()
    print("Enter Units Consumed : ")
    val unitsConsumed = readln().trim().toDoubleOrNull()
    print("Enter Rate Per Unit : ")
    val ratePerUnit = readln().trim().toDoubleOrNull()
    if(id == null || id <= 0 || name.isBlank() || unitsConsumed == null || ratePerUnit == null)
    {
        println("Invalid Input!")
        return
    }

    val bill1 = ElectricityBill(id, name, unitsConsumed, ratePerUnit)
    bill1.calculateBill()
    println("Discount Applied : ${bill1.applyDiscount()}%")
    bill1.displayBillDetails()
}