/*
    Question 5: Mobile Store Sales Analyzer Using ArrayList
*/

fun displaySales(sales: ArrayList<Int>) {
    for (i in sales.indices) {
        println("Sale ${i + 1} : ${sales[i]}")
    }
}

fun calculateTotalRevenue(sales: ArrayList<Int>): Int {
    var total = 0

    for (price in sales) {
        total += price
    }

    return total
}

fun findHighestSale(sales: ArrayList<Int>): Int {
    var highest = sales[0]

    for (price in sales) {
        if (price > highest) {
            highest = price
        }
    }

    return highest
}

fun findLowestSale(sales: ArrayList<Int>): Int {
    var lowest = sales[0]

    for (price in sales) {
        if (price < lowest) {
            lowest = price
        }
    }

    return lowest
}

fun getCategory(price: Int): String {
    return when {
        price >= 40000 -> "Premium"
        price >= 25000 -> "Mid-Range"
        price >= 15000 -> "Budget"
        else -> "Entry Level"
    }
}

fun main() {

    val mobileSales = ArrayList<Int>()

    mobileSales.add(15000)
    mobileSales.add(22000)
    mobileSales.add(18000)
    mobileSales.add(45000)
    mobileSales.add(30000)
    mobileSales.add(22000)
    mobileSales.add(55000)
    mobileSales.add(12000)
    mobileSales.add(40000)
    mobileSales.add(25000)

    println("===== Sales Report =====")
    displaySales(mobileSales)


    val totalRevenue = calculateTotalRevenue(mobileSales)
    val averageSale = totalRevenue.toDouble() / mobileSales.size
    val highestSale = findHighestSale(mobileSales)
    val lowestSale = findLowestSale(mobileSales)


    println("\n===== Revenue Analysis =====")

    println("Total Revenue : $totalRevenue")
    println("Average Sale  : %.2f".format(averageSale))
    println("Highest Sale  : $highestSale")
    println("Lowest Sale   : $lowestSale")


    println("\n===== Sales Category Report =====")

    for (i in mobileSales.indices) {
        println(
            "Sale ${i + 1} (${mobileSales[i]}) -> ${getCategory(mobileSales[i])}"
        )
    }


    println("\n===== Duplicate Sales Analysis =====")

    val checkedPrices = ArrayList<Int>()

    for (price in mobileSales) {

        if (price !in checkedPrices) {

            var count = 0

            for (item in mobileSales) {
                if (item == price) {
                    count++
                }
            }

            if (count > 1) {
                println("$price sold $count times")
            }

            checkedPrices.add(price)
        }
    }


    println("\n===== Special Sales Report =====")

    var specialCount = 0
    var specialRevenue = 0

    for (price in mobileSales) {

        if (price > averageSale && price != highestSale) {
            println("$price")

            specialCount++
            specialRevenue += price
        }
    }

    println("Total Special Sales : $specialCount")
    println("Combined Revenue    : $specialRevenue")


    println("\n===== Business Insights =====")

    var premiumCount = 0
    var budgetCount = 0

    for (price in mobileSales) {

        if (getCategory(price) == "Premium") {
            premiumCount++
        }

        if (getCategory(price) == "Budget") {
            budgetCount++
        }
    }

    println("Premium Mobiles Sold : $premiumCount")
    println("Budget Mobiles Sold  : $budgetCount")


    if (premiumCount > budgetCount) {
        println("Premium category has more sales")
    }
    else if (budgetCount > premiumCount) {
        println("Budget category has more sales")
    }
    else {
        println("Both categories have equal sales")
    }
}