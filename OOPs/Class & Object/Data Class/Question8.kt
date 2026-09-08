/*
    Question 8 — Immutable User State
    Create a Kotlin data class named UserState with the following properties:
    - username: String
    - isLoggedIn: Boolean
    - loginCount: Int

    Create an initial UserState representing a logged-out user.

    Your program should simulate the following state transitions:
    1. User logs in for the first time.
    2. User logs out.
    3. User logs in again.

    For every state transition:

    - Create a new UserState object using the copy() function.
    - Do not modify the existing UserState object.
    - Print the previous state and the new state.
    - Print whether the previous and new states are different objects.

    Additional requirements:

    - The original initial state must remain unchanged throughout
      the program.
    - Demonstrate that copy() can update only the required properties
      while preserving the remaining properties.
    - Do not use mutable properties (`var`) inside the UserState data class.
    - Do not manually override equals(), hashCode(), toString(), or copy().
    - At the end, print all states in their transition order.
*/

data class UserState(
    val username: String,
    val isLoggedIn: Boolean,
    val loginCount: Int
)

fun main()
{
    val initialState = UserState("Ranjeet", false, 0)

    val userState1 = initialState.copy(isLoggedIn = true, loginCount = 1)
    println("\nPrevious State   : $initialState")
    println("New State        : $userState1")
    println("Are objects different? : ${initialState !== userState1}")

    val userState2 = userState1.copy(isLoggedIn = false)
    println("\nPrevious State   : $userState1")
    println("New State        : $userState2")
    println("Are objects different? : ${userState1 !== userState2}")

    val userState3 = userState2.copy(isLoggedIn = true, loginCount = 2)
    println("\nPrevious State   : $userState2")
    println("New State        : $userState3")
    println("Are objects different? : ${userState2 !== userState3}")

    println("\nAt the end:")
    println("Initial State   : $initialState")
    println("User State 1     : $userState1")
    println("User State 2     : $userState2")
    println("User State 3     : $userState3")
}