//Question 1: Animal Sound System
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

class Cow : Animal() {
    override fun makeSound() {
        println("Cow moos")
    }
}

fun main() 
{
    val dog: Animal = Dog()
    val cat: Animal = Cat()
    val cow: Animal = Cow()
    val animalList = listOf(dog, cat, cow)

    for(animal in animalList) {
        animal.makeSound()
    }
}