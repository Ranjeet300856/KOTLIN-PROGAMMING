// Create a Kotlin program to develop a Laptop Inventory System using a Primary Constructor, a Single Secondary Constructor, and MutableList.
class Laptop(val laptopId: Int, val laptopName: String, var laptopPrice: Double)
{
    init {
        if(laptopPrice < 0)
        {
            println("Laptop price is invalid")
            laptopPrice = 0.0
        }   

        println("Primary constructor executed")
    }

    constructor(laptopName: String, laptopPrice: Double) : this(0, laptopName, laptopPrice)
    {
        println("Secondary constructor executed")
    }

    fun displayLaptopDetails()
    {
        println("Laptop Id : $laptopId")
        println("Laptop Name : $laptopName")
        println("Laptop Price : %.2f".format(laptopPrice))
    }
}

fun inputName(): String
{
    while(true)
    {
        print("Enter Laptop Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Name! Try Again")
            continue
        }

        return name
    }
}

fun inputId(): Int
{
    while(true)
    {
        print("Enter Laptop ID : ")
        val id = readln().trim().toIntOrNull()
        if(id == null || id <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return id    
    }
}

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun main()
{
    print("Enter how many laptop objects you want to create (1, 2, or 3) : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input !in 1..3)
    {
        println("Invalid Input!")
        return
    }

    val laptops = mutableListOf<Laptop>()
    for(i in 1..input)
    {
        println("\n----- Laptop $i -----\n")
        println("\nPress 1 to call primary constructor")
        println("Press 2 to call secondary constructor")
        print("Enter your choice (1 or 2) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input!")
            return
        }

        when(choice)
        {
            1 -> {
                val laptopId = inputId()
                val laptopName = inputName()
                val laptopPrice = inputPrice()
                val laptop = Laptop(laptopId, laptopName, laptopPrice)
                laptops.add(laptop)
            }

            2 -> {
                val laptopName = inputName()
                val laptopPrice = inputPrice()
                val laptop = Laptop(laptopName, laptopPrice)
                laptops.add(laptop)
            }
        }
    }

    var i = 1
    for(objects in laptops)
    {
        println("\n----- Laptop $i -----")
        objects.displayLaptopDetails()
        i++
    }
}