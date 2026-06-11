/*
    Question 1 — Greeting Function Factory
    Problem Statement
    Create a Kotlin Higher Order Function named createGreeting.

    The function should:
    1. Return a Lambda.
    2. The returned Lambda should take a String parameter (person's name).
    3. The Lambda should print a greeting message in the format: Hello, <name>!

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
*/

fun createGreeting(): (String) -> Unit
{
    return {
        name: String ->
        println("Hello $name!")
    }
}

fun main()
{
    print("Enter Name 1 : ")
    val name = readln().trim()

    print("Enter Name 2 : ")
    val name2 = readln().trim()

    print("Enter Name 3 : ")
    val name3 = readln().trim()
    if(name.isBlank() || name2.isBlank() || name3.isBlank())
    {
        println("Invalid Input")
        return
    }

    val output = createGreeting()
    output(name)
    output(name2)
    output(name3)
}