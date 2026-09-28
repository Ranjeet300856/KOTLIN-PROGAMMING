/*
    Question 10 — Generic Repository with Type Constraint
    Task:
    Create a generic class named Repository<T> that stores objects of any type and provides basic operations to add, retrieve, and display items.
    Use a type constraint so that T must be a subtype of a class named Entity. 
*/

open class Entity(val id: Int)
class User(id: Int) : Entity(id)
class Product(id: Int) : Entity(id)

class Repository<T : Entity> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getById(id: Int): T? {
        return items.find { it.id == id }
    }

    fun displayAll() {
        items.forEach {
            println("ID : ${it.id}")
        }
    }
}

fun main()
{
    val userRepository = Repository<User>()
    val productRepository = Repository<Product>()

    userRepository.add(User(1001))
    userRepository.add(User(1002))

    productRepository.add(Product(2001))
    productRepository.add(Product(2002))

    userRepository.displayAll()
    productRepository.displayAll()
    
    val user = userRepository.getById(1001)
    val product = productRepository.getById(2001)
    
    println(user)
    println(product)
}