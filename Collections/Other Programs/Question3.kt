//Create a Kotlin program to validate and filter usernames for an online platform using Lambda with Collections / Collection Higher-Order Functions.
fun main()
{
    val usernames = mutableListOf("@Rahul", "Ranjeet_Suthar", "Jagdish Suthar", "Saloni", "Rahul8", "BhaveshKuma4", "Ravindra7", "Sonu2")
    val validUsernames = usernames.filter {
        it.length >= 5 && it.length <= 12 && !it.contains(" ") && it[0].isLetter() && it.any { it.isDigit() }
    }

    val totalOriginalUsernames = usernames.size
    val totalValidUsernames = validUsernames.size
    val rejectedUsername = totalOriginalUsernames - totalValidUsernames

    println("\n----- Original Usernames -----")
    usernames.forEach { println(it) }
    println("\n----- Valid Usernames -----")
    validUsernames.forEach { println(it) }

    println("\n----- Summary -----")
    println("Total Usernames    : $totalOriginalUsernames")
    println("Valid Usernames    : $totalValidUsernames")
    println("Rejected Usernames : $rejectedUsername")
}