//Create a Kotlin program to develop a Mobile Store System using a Primary Constructor and a Single Secondary Constructor.
class Mobile(val mobileId: Int, val mobileName: String, var mobilePrice: Double)
{
    init {
        if(mobilePrice < 0)
        {
            println("Invalid Mobile Price!")
            mobilePrice = 0.0
        }

        println("Primary Constructor Executed")
    }
    constructor(name: String, price: Double) : this(0, name, price)
    {
        println("Secondary Constructor Executed")
    }

    fun displayMobileDetails()
    {
        println("Mobile Name  : $mobileName")
        println("Mobile Id    : $mobileId")
        println("Mobile Price : %.2f".format(mobilePrice))
    }
}

fun inputName(): String
{
    while(true)
    {
        print("Enter Mobile Name : ")
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
        print("Enter Mobile ID : ")
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
    print("Enter how many mobile objects you want to create (1, 2, or 3) : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input !in 1..3)
    {
        println("Invalid Input!")
        return
    }

    for(i in 1..input)
    {
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
                val name = inputName()
                val id = inputId()
                val price = inputPrice()
                val mobile = Mobile(id, name, price)
                mobile.displayMobileDetails()
            }

            2 -> {
                val name = inputName()
                val price = inputPrice()
                val mobile = Mobile(name, price)
                mobile.displayMobileDetails()
            }

            else -> println("Invalid Choice! Please Enter 1-2")
        }
    }
}