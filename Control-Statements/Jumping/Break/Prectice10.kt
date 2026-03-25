// Q10: Password attempt system using break

fun main()
{
    val correctPassword = "admin123"
    for (i in 1..3) 
    {
        print("Attempt $i - Enter password: ")
        val input = readln()
        if (input == correctPassword) 
        {
            println("Access Granted")
            break
        } 
        else println("Wrong Password")

        if (i == 3) println("Access Denied")
    }
}