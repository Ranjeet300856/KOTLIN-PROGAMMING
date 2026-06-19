/*
    Question 3: Dynamic Shopping Cart Management System Using LinkedList
    Problem Statement:
    Create a Kotlin program to develop a Dynamic Shopping Cart Management System using LinkedList Collection.
    The program should allow the user to create and manage a shopping cart dynamically using user input. 
*/
import java.util.LinkedList

//Validate Product Name
fun validateProductName(item: String): Boolean
{
    if(item.isBlank())
    {
        println("Invalid Produt Name")
        return true
    }
    else return false
}

//Input Function
fun input(list: LinkedList<String>)
{
    print("How many products do you want to add? : ")
    val totalProducts = readln().trim().toIntOrNull()
    if(totalProducts == null || totalProducts <= 0)
    {
        println("Invalid Input")
        return
    }

    for(i in 1..totalProducts)
    {
        while(true)
        {
            print("Enter product $i : ")
            val productName = readln().trim()
            if(validateProductName(productName)) continue
            list.add(productName)
            break
        }
    }
}

//Output Function
fun output(list: LinkedList<String>)
{
    println("Current Shopping Cart:")
    for(i in list.indices)
    println("${i + 1}. ${list[i]}")
}

//Add New Item Function
fun addNewProduct(list: LinkedList<String>)
{
    print("\nEnter New Product Name : ")
    val newProduct = readln().trim()
    if(validateProductName(newProduct)) return

    list.addFirst(newProduct)
    println("Product Add Successfully")
}

//Remove Function
fun removeProduct(list: LinkedList<String>)
{
    print("\nEnter Product Name To Remove : ")
    val removeName = readln().trim()
    if(validateProductName(removeName)) return

    if(removeName in list)
    {
        list.remove(removeName)
        println("Product $removeName Removed Successfully")
    }
    else println("Product Not Found")
}

//Search Function
fun searchItem(list: LinkedList<String>)
{
    print("\nEnter Product Name To Search : ")
    val searchProduct = readln().trim()
    if(validateProductName(searchProduct)) return

    if(searchProduct in list) println("$searchProduct Found")
    else println("$searchProduct Not Found")
}

//Main Function
fun main()
{
    //LinkedList Creation
    val productNames = LinkedList<String>()

    //Input & Output
    input(productNames)
    output(productNames)

    //Add
    addNewProduct(productNames)
    output(productNames)

    //Remove
    removeProduct(productNames)
    output(productNames)

    //Search
    searchItem(productNames)

    //Queue Operation
    print("\nEnter product name to add using queue operation : ")
    val inputProduct = readln().trim()
    if(validateProductName(inputProduct)) return
    else productNames.offer(inputProduct)
    output(productNames)

    //Additional
    println("\nFirst Product  : ${productNames.getFirst()}")
    println("Last Product   : ${productNames.getLast()}")
    println("Total Products : ${productNames.size}")
}