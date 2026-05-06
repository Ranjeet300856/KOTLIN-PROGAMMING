//Write a Kotlin program that prints a formatted multi-line message using Raw String and removes unnecessary indentation using trimIndent().

fun main()
{
    val rawStr = """
            Hello Everyone,
            My Name is Ranjeet Suthar
            I am pursuing BCA from S.P.U. (P.G) College, Falna.
            My Father Name is Jasraj Suthar
    """.trimIndent()

    println(rawStr)
}