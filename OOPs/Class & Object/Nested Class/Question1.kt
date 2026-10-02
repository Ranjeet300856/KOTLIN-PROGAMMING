/*
    Question 1 — Basic Nested Class
    Student Management System

    Create a Kotlin program using a Nested Class. 
*/

class Student {
    class Address(
        val city: String,
        val state: String,
        val pinCode: Int
    ) {
        fun displayAddress() {
            println("City    : $city")
            println("State   : $state")
            println("PinCode : $pinCode")
        }
    }
}

fun main()
{
    val studentAddress = Student.Address("Jaipur", "Rajasthan", 302001)
    studentAddress.displayAddress()
}