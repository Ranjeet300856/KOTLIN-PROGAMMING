/*
    Question 4 — Generic Class: Type-Safe Storage

    Task:
    Create a Kotlin program with a generic class named Storage<T> 
    that can store multiple values of the same generic type and provide operations to add, retrieve, and display the stored values. 
*/

class Storage<T>(private val collection: MutableList<T>) {
    fun addItem(newValue: T) {
        collection.add(newValue)
    }

    fun getItem(index: Int): T? {
        if(index in collection.indices) {
            return collection[index]
        } else {
            return null
        }
    }

    fun getAllItems(): MutableList<T> {
        return collection
    }

    fun displayAllItems() {
        collection.forEach {
            println("$it : ${it!!::class.simpleName}")
        }
    }
}

fun main() 
{
    val storageInt = Storage(mutableListOf(10, 20, 30, 40 , 50))
    val storageString = Storage(mutableListOf("Ranjeet", "Rahul", "Suthar"))

    println("Storage Int:")
    storageInt.addItem(60)
    val receivedItem = storageInt.getItem(5)
    println("Received Item at Index 5 : $receivedItem")
    println("All Items : ${storageInt.getAllItems()}")
    println("All Items One by One:")
    storageInt.displayAllItems()

    println("\nStorage String:")
    storageString.addItem("Malpura")
    val receivedItem2 = storageString.getItem(5)
    println("Received Item at Index 5 : $receivedItem2")
    println("All Items : ${storageString.getAllItems()}")
    println("All Items One by One:")
    storageString.displayAllItems()
}