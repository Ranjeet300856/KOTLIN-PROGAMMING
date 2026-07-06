/*
    Create a Kotlin Extension Function for the String class named isStrongPassword().
    The function should check whether a password is strong or not.
    A password is considered strong if:
    1. It contains at least 8 characters.
    2. It contains at least one uppercase letter.
    3. It contains at least one lowercase letter.
    4. It contains at least one digit.
    5. It contains at least one special character.

    The function should return:
    - true  -> if the password is strong.
    - false -> otherwise. 
*/

fun String.isStrongPassword(): Boolean
{
    if(this.isEmpty())
    return false

    var hasUppercase = false
    var hasLowercase = false
    var hasDigit = false
    var hasSpecialChar = false

    for(ch in this)
    {
        if(ch in 'A'..'Z') hasUppercase = true
        else if(ch in 'a'..'z') hasLowercase = true
        else if(ch.isDigit()) hasDigit = true
        else hasSpecialChar = true
    }

    return hasUppercase && hasLowercase && hasDigit && hasSpecialChar && (this.length >= 8)
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

    val checkStraingth = password.isStrongPassword()
    println(checkStraingth)
}