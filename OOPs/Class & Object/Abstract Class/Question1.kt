/*
    Question 1 — Basic Abstract Class
    Task:

    Create a Kotlin program using an abstract class named Animal.

    Your program should:
    Create an abstract class Animal.
    Add a normal function eat() that prints "Animal is eating".
    Add an abstract function sound().
    Create a Dog class that inherits from Animal.
    Override sound() in Dog and print "Dog is barking".
    Create a Dog object in main().
    Call both eat() and sound() using the Dog object. 
*/

abstract class Animal {
    fun eat() {
        println("Animal is Eating")
    }

    abstract fun sound()
}

class Dog : Animal() {
    override fun sound() {
        println("Dog is Barking")
    }
}

fun main()
{
    val dog = Dog()
    dog.eat()
    dog.sound()
}