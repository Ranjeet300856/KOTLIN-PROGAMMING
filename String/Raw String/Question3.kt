/*
    Write a Kotlin program that prints a structured multi-line message using Raw String 
    and formats it using trimMargin() with a custom margin prefix. 
*/

fun main()
{
    val message = """
         #Hello,
         #My name is Ranjeet Suthar
         #Age: 19
         #Mobile Number: 7016XXXXXX
    """.trimMargin("#")

    println(message)
}
