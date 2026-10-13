/*
    Create an interface named Animal with an abstract function makeSound().

    Implement this interface in two classes: Dog and Cat.
    The Dog class must print "Dog barks" when makeSound() is called.
    The Cat class must print "Cat meows" when makeSound() is called.

    In the main() function, create objects of both classes and call their makeSound() functions. 
*/

interface Animal {
    fun makeSound()
}

class Dog : Animal {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cat : Animal {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun main()
{
    val dog: Animal = Dog()
    val cat: Animal = Cat()

    dog.makeSound()
    cat.makeSound()
}