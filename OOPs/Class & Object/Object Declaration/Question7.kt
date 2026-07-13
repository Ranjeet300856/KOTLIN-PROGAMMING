/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the inventory of products in a store.
    The Singleton Object should store product names along with their available quantities 
    and provide functions to add products, update stock, remove products, and display the complete inventory. 
*/

object InventoryManager
{
    private val inventory = mutableMapOf<String, Int>()

    private fun isAvailable(productName: String): Boolean
    {
        if(inventory.containsKey(productName)) return true
        else
        {
            println("Product not found!")
            return false
        }
    }

    fun addProduct(productName: String, quantity: Int)
    {
        if(productName.isBlank() || quantity <= 0)
        {
            println("Invalid product name or quantity")
            return
        }

        if(inventory.containsKey(productName)) println("Product already exists!")
        else
        {
            inventory[productName] = quantity
            println("Product added successfully")
        }
    }

    fun updateStock(productName: String, quantity: Int)
    {
        if(quantity > 0)
        {
            if(isAvailable(productName))
            {
                inventory[productName] = inventory[productName]!! + quantity
                println("Stock updated successfully")
            }
            else return
        }
        else println("Quantity must be greater than 0.")
    }

    fun removeProduct(productName: String)
    {
        if(isAvailable(productName))
        {
            inventory.remove(productName)
            println("Product removed successfully")
        }
        else return
    }

    fun displayInventory()
    {
        if(inventory.isEmpty())
        {
            println("No product available")
            return
        }

        println("========== Inventory ==========")
        for((key, value) in inventory.entries)
        println("$key\t-> $value")
        println("===============================")
    }

    fun displayTotalProducts() = println("Total Products : ${inventory.size}")
}

fun main()
{
    println("\nDefault Data:")
    InventoryManager.displayInventory()

    println("\nAdd Operation:")
    InventoryManager.addProduct("Laptop", 5)
    InventoryManager.addProduct("Mouse", 10)
    InventoryManager.addProduct("Keyboard", 8)
    InventoryManager.displayInventory()
    InventoryManager.displayTotalProducts()

    println("\nUpdate Operation:")
    InventoryManager.updateStock("Laptop", 3)
    InventoryManager.displayInventory()
    
    println("Try to add duplicate product:")
    InventoryManager.addProduct("Laptop", 8)
    InventoryManager.displayInventory()

    println("\nRemove Operation:")
    InventoryManager.removeProduct("Mouse")
    InventoryManager.displayInventory()
    InventoryManager.displayTotalProducts()

    println("\nTry updating a product that does not exist.")
    InventoryManager.updateStock("Printer", 5)
    InventoryManager.displayInventory()

    println("\nTry removing a product that does not exist.")
    InventoryManager.removeProduct("Printer")
    InventoryManager.displayInventory()
}