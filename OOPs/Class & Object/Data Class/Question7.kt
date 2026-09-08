/*
    Question 7 — Shallow Copy Demonstration
    Create a data class named Address with the following properties:
    - city: String
    - state: String

    Create another data class named User with:
    - name: String
    - address: Address

    Create one User object with an Address object.
    Using the copy() function, create a copy of the User object.

    Your program should:
    1. Print the original User and copied User.
    2. Verify that the original User and copied User are different
       User objects.
    3. Verify whether the original User and copied User share the
       same Address object.
    4. Change the city through the copied User's Address.
    5. Print both Users after the change.
    6. Demonstrate whether changing the copied User's Address also
       affects the original User's Address.
    7. Explain the observed behavior using program output/comments.
*/

data class Address(
    var city: String,
    val state: String 
)

data class User(
    val name: String,
    val address: Address
)

fun main()
{
    val user = User("Ranjeet Suthar", Address("Jalore", "Rajasthan"))
    val user2 = user.copy()

    println("Original User : $user")
    println("Copied User   : $user2")

    println("\nAre original and copied User the same object? : ${user === user2}")
    println("Do both Users share the same Address object? : ${user.address === user2.address}")

    user2.address.city = "Ahore"
    println("\nUsers after updates:")
    println("Original User : $user")
    println("Copied User   : $user2")

    println("Original User City : ${user.address.city}")
    println("Copied User City   : ${user2.address.city}")
}