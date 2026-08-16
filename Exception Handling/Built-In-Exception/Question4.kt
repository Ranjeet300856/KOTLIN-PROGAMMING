//Write a Kotlin program that asks the user to enter a string and an index, then accesses the character at that index.
fun main()
{
    print("Enter a String : ")
    val text = readln().trim()
    print("Enter a index  : ")
    val index = readln().trim().toIntOrNull()
    if(text.isBlank() || index == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        println("Character at index $index : ${text[index]}")
    } catch(e: StringIndexOutOfBoundsException) {
        println("Error: Invalid string index.")
    }

    println("String access process completed.")
}