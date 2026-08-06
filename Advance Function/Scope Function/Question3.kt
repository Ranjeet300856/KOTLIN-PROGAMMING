//Create a Kotlin program to calculate an electricity bill using the `run` scope function.
class ElectricityBill(val customerName: String, var units: Int)
fun main()
{
    print("Enter customer name : ")
    val name = readln().trim()
    print("Enter number of electricity units consumed : ")
    val units = readln().trim().toIntOrNull()
    if(name.isBlank() || units == null || units < 0)
    {
        println("Invalid Input!")
        return
    }

    val electricityBill = ElectricityBill(name, units)
    val result = electricityBill.run {
        var billCharge = 0.0
        if(units > 200) billCharge = units * 5.0
        else
        {
            if(units <= 100) billCharge = units * 2.0
            else billCharge = ((units - 100) * 3.50) + 200.0
        }

        val serviceCharge = 50.0
        val finalBill = billCharge + serviceCharge
        """
        Customer Name      : $customerName
        Units Consumed     : $units
        Electricity Charge : ${"%.2f".format(billCharge)}
        Service charge     : ${"%.2f".format(serviceCharge)}
        Final Bill Amount  : ${"%.2f".format(finalBill)}
        """.trimIndent()
    }

    println(result)
}