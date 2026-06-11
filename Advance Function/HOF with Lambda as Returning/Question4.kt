/*
    Problem Statement
    Create a Kotlin Higher Order Function named createVotingEligibilityChecker.

    The function should:
    1. Return a Lambda.
    2. The returned Lambda should take one Int parameter (age).
    3. The Lambda should return true if the person is eligible to vote.
    4. The Lambda should return false otherwise.

    Voting Rule:
    A person is eligible to vote if age is 18 or greater.

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take age input from the user.
    - Age cannot be negative.
    - Print the eligibility result.
    - Handle invalid input properly.
*/

fun createVotingEligibilityChecker(): (Int) -> Boolean
{
    return {
        age: Int ->
        if(age >= 18) true
        else false
    }
}

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null || age < 0)
    {
        println("Invalid Input")
        return
    }

    val checkEligibility = createVotingEligibilityChecker()
    println("Eligible to Vote : ${checkEligibility(age)}")
}