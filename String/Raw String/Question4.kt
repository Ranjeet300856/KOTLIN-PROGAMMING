/*
    Write a Kotlin program that creates a formatted multi-line user profile using Raw String 
    and inserts dynamic values using string templates. 
*/

fun main()
{
    val name = "Ranjeet Suthar"
    val age = 19
    val course = "BCA"
    val city = "Jalore"
    val college = "S.P.U. (P.G.) College, Falna"

    val message = """
    Name:    $name
    Age:     $age
    Course:  $course
    City:    $city
    College: $college
    """.trimIndent()

    println(message)
}