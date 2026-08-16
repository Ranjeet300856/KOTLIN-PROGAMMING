//Write a Kotlin program that simulates a simple user login state.
fun accessProfile(isLoggedIn: Boolean)
{
    check(isLoggedIn) { "Error: User must be logged in to access the profile." }
    println("Profile accessed successfully.")
} 

fun main()
{
    print("Enter yes or no for is logged in ? ")
    val input = readln().trim().lowercase()
    if(input.isBlank())
    {
        println("Invalid Input!")
        return
    }

    var state: Boolean = false
    if(input == "yes") state = true
    else if(input == "no") state = false
    else
    {
        println("Invalid Input!")
        return
    }
    
    try {
        accessProfile(state)
    } catch(e: IllegalStateException) {
        println(e.message)
    }

    println("Profile access process completed.")
}