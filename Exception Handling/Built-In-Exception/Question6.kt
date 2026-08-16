//Write a Kotlin program that asks the user to enter their age and validates it.
fun ageValidation(age: Int)
{
    require(age in 0..120) { "Student record processing completed." }
    println("Valid Age : $age")
}

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        ageValidation(age)
    } catch(e: IllegalArgumentException) {
        println(e.message)
    }

    println("Age validation completed.")
}