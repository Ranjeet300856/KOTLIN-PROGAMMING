/*
    Problem Statement
    Create a Kotlin Higher Order Function named createPasswordValidator.

    The function should:
    1. Return a Lambda.
    2. The returned Lambda should take one String parameter (password).
    3. The Lambda should return true if the password is valid.
    4. The Lambda should return false otherwise.

    Password Rules:
    - Password length must be at least 8 characters.
    - Password must contain at least one digit.
    - Password must contain at least one uppercase letter.

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take password input from the user.
    - Handle empty input properly.
    - Print the validation result. 
*/

fun createPasswordValidator(): (String) -> Boolean
{
    return {
        password: String ->

        if(password.length >= 8)
        {
            var countDigit = 0
            var countUppercase = 0

            for(ch in password)
            {
                if(ch.isDigit()) countDigit++
                else if(ch in 'A'..'Z') countUppercase++
            }

            if(countDigit >= 1 && countUppercase >= 1) true
            else false
        }
        else false
    }
}

fun main()
{
    print("Enter Password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Password")
        return
    }

    val passwordValidation = createPasswordValidator()
    println("Valid Password : ${passwordValidation(password)}")
}