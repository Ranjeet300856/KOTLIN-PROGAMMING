/*
    Question 3: Product Inventory Management System Using ArrayList Collection Constructor
    Problem Statement
    Create a Kotlin program to develop a Product Inventory Management System using ArrayList<String>.

    You already have a collection of products. Create a new ArrayList by copying that collection and perform inventory management operations.Question 3: Product Inventory Management System Using ArrayList Collection Constructor
    Problem Statement
    Create a Kotlin program to develop a Product Inventory Management System using ArrayList<String>.
    You already have a collection of products. Create a new ArrayList by copying that collection and perform inventory management operations.
*/

fun displayList(list: List<String>)
{
    for(i in list.indices)
        println("${i + 1}. ${list[i]}")
}

fun displayArrayList(list: ArrayList<String>)
{
    for(i in list.indices)
        println("${i + 1}. ${list[i]}")
}

fun searching(list: ArrayList<String>, searchItem: String)
{
    if(searchItem in list) println("$searchItem is available")
    else println("$searchItem is not available")
}

fun main()
{
    val productList = listOf(
        "Laptop",
        "Mouse",
        "Keyboard",
        "Monitor",
        "Printer"
    )

    val newProductsList = ArrayList<String>(productList)
    
    println("Original Product List:")
    displayList(productList)
    println("\nInventory Product List:")
    displayArrayList(newProductsList)

    newProductsList.add("Webcam")
    newProductsList.add(2, "Speaker")
    println("\nInventory Product List After Add New Produts:")
    displayArrayList(newProductsList)

    if("Printer" in newProductsList)
    {
        val index = newProductsList.indexOf("Printer")
        newProductsList[index] = "Wireless Printer"
        println("Printer to Wireless Printer Updated Successfully")
    }
    else println("Product Not Found")

    if(newProductsList.remove("Mouse"))
        println("Mouse remove successfully")
    else println("Mouse not found")

    if(newProductsList.isNotEmpty())
        newProductsList.removeAt(0)
    else println("Product List is Empty")

    println("\nUpdated List After Remove Operation:")
    displayArrayList(newProductsList)

    searching(newProductsList, "Laptop")
    searching(newProductsList, "Camera")

    //Final Result
    println("\nOriginal Product List:")
    displayList(productList)
    println("\nInventory Product List:")
    displayArrayList(newProductsList)
}