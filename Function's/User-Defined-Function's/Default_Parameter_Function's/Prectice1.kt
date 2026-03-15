/*
Question 1: Greeting Function with Default Parameter
Write a Kotlin function greetUser(name: String = "Guest")
that prints a greeting message.
If no name is provided, the function should greet "Guest".
 */

fun greetUser(name: String = "Guest")
{
    println("Hello, $name! Welcome to Kotlin Programming.")
}
fun main()
{
    greetUser()
    greetUser("Ranjeet")    
}
