/*
    Kotlin Jagged Array Project #4
    Online Store Order Management using String Jagged Array
*/

//--------------- Input Function ---------------//
fun inputProducts(arr: Array<Array<String?>>)
{
    for(row in arr.indices)
    {
        println("Enter Customer ${row + 1} Orders: ")
        for(col in arr[row].indices)
        {
            while(true)
            {
                //Input Products From User
                print("Enter Product ${col + 1} : ")
                val product = readln().trim()

                //Input Validation
                if(product.isBlank() || !product.all { it.isLetterOrDigit() || it.isWhitespace()} )
                {
                    println("Invalid Product Name! Try Again")
                    continue
                }

                arr[row][col] = product
                break
            }
        }
        println()
    }
    println()
}


//--------------- Output Function ---------------//

fun output(arr: Array<Array<String?>>)
{
    //Variables for Overall Info
    var highestProduct = 0
    var highestProductCustomer = -1
    var lowestProduct = 0
    var lowestProductCustomer = -1
    var totalProductInStore = 0
    var longestProductName: String? = null
    var shortestProductName: String? = null

    print("\n===== Online Store Order Management =====\n")

    for(row in arr.indices)
    {
        //Variable declare for each customer
        var totalProduct = 0
        var longName: String? = null
        var shortName: String? = null
        val firstProduct = arr[row][0]
        var lastProduct: String? = null

        print("Customer ${row + 1} Products : ")
        for(col in arr[row].indices)
        {
            val productName = arr[row][col]
            //Print All Product
            print("$productName\t")

            //Count Total Products
            totalProduct++
            totalProductInStore++

            //Find Long and Short Product Name
            if(longName == null || productName!!.length > longName.length) longName = productName
            if(shortName == null || productName!!.length < shortName.length) shortName = productName

            //Last Product
            lastProduct = productName
        } 

        println()
        println("Total Products      : $totalProduct")
        println("Longest Name        : $longName")
        println("Shortest Name       : $shortName")
        println("First Product       : $firstProduct") 
        println("Last Product        : $lastProduct")
        println("\n")

        //Count Highest and Lowest Product
        if(totalProduct > highestProduct)
        {
            highestProduct = totalProduct
            highestProductCustomer = row + 1
        }
        if(lowestProduct == 0 || totalProduct < lowestProduct)
        {
            lowestProduct = totalProduct
            lowestProductCustomer = row + 1
        }

        //Find Longest and Shortest Product Name
        if(longestProductName == null || longName == null || longName.length > longestProductName.length)
            longestProductName = longName
        if(shortestProductName == null || shortName == null || shortName.length < shortestProductName.length)
            shortestProductName = shortName
    }

    println("--------------------------------------------------\n")

    println("Customer with Highest Products : Customer $highestProductCustomer ($highestProduct)")
    println("Customer with Lowest Products  : Customer $lowestProductCustomer  ($lowestProduct)")
    println("Total Products in Store        : $totalProductInStore")
    println("Longest Product Name           : $longestProductName")
    println("Shortest Product Name          : $shortestProductName")
}


//--------------- Main Function ---------------//

fun main()
{
    //Array Creation
    var totalProduct: Int? = null
    val customer = Array(5) { row -> 
        while(true)
        {
            print("Enter Total Products of Customer ${row + 1} : ")
            totalProduct = readln().trim().toIntOrNull()
            if(totalProduct == null || totalProduct <= 0)
            {
                println("Invalid Input! Try Again")
                continue
            }

            break
        }

        arrayOfNulls<String>(totalProduct)
    }
    println()

    //Input Product Names for Each Customer
    inputProducts(customer)

    //Output
    output(customer)
}