/*
Question 3: User Profile Display with Default Parameters

Write a Kotlin function displayUserProfile(name: String,
age: Int = 18, country: String = "India") that prints the user profile.

The program should demonstrate calling the function using:
1. All arguments
2. Default parameters
3. Named arguments
*/

fun displayUserProfile(name: String, age: Int = 18, country: String = "India")
{
    println("Name    = $name")
    println("Age     = $age")
    println("Country = $country")
    println()
}
fun main()
{
    displayUserProfile("Ranjeet")
    displayUserProfile("Aman",22)
    displayUserProfile("John", country = "USA")
    displayUserProfile("Priya", 25, "India")
}