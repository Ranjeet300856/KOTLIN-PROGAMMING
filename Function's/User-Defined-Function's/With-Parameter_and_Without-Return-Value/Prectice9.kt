fun displayProfile(name: String, age: Int, city: String)
{
    println("Name : $name")
    println("Age  : $age")
    println("City : $city")
}
fun main()
{
    //Q9th
    /*
    Write a Kotlin program that defines a function  
    displayProfile(name: String, age: Int, city: String)
    which prints the user profile.
    Example:
    Name : Ranjeet
    Age  : 20
    City : Jaipur
    */

    print("Enter Name : ")
    var name = readln().trim()
    print("Enter Age  : ")
    var age = readln().toIntOrNull()
    print("Enter City : ")
    var city = readln().trim()
    if(name.isEmpty() || city.isEmpty() || !name.all { it.isLetter() || it == ' ' } || !city.all { it.isLetter() || it == ' ' } || age == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    if(age < 0)
    {
        println("Invalid Age!")
        return
    }
    displayProfile(name,age,city)
}