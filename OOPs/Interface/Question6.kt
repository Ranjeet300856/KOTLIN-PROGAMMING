/*
    Create a generic interface named DataRepository<T> with the following abstract functions:

    save(data: T) — Stores the given data.
    getData(): T — Returns the stored data.

    Create two classes that implement this interface:

    1. StringRepository

    Implements DataRepository<String>.
    Stores a String value.
    Returns the stored String through getData().

    2. IntRepository

    Implements DataRepository<Int>.
    Stores an Integer value.
    Returns the stored Integer through getData(). 
*/

interface DataRepository<T> {
    fun save(_data: T)
    fun getData(): T
}

class StringRepository : DataRepository<String> {
    var strData = ""
    override fun save(_data: String) {
        strData = _data
    }

    override fun getData(): String = strData
}

class IntRepository : DataRepository<Int> {
    var intData = 0
    override fun save(_data: Int) {
        intData = _data
    }

    override fun getData(): Int = intData
}

fun <T> printRepositoryData(_data: DataRepository<T>) {
    println(_data.getData())
}

fun main() 
{
    val stringRepository = StringRepository()
    val intRepository = IntRepository()

    stringRepository.save("Kotlin")
    println("String Data 1 : ${stringRepository.getData()}")
    stringRepository.save("Jetpack Compose")
    println("String Data 2 : ${stringRepository.getData()}")

    intRepository.save(100)
    println("\nInt Data 1 : ${intRepository.getData()}")
    intRepository.save(200)
    println("Int Data 2 : ${intRepository.getData()}")

    printRepositoryData(stringRepository)
    printRepositoryData(intRepository)
}