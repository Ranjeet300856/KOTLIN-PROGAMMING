/*
    Create a Kotlin Extension Function for the String class named maskEmail().
    The function should:
    1. Accept one parameter:
    - visibleCharacters (Int)

    2. Mask the email username (the part before '@') using '*'.
    3. Keep only the first 'visibleCharacters' characters visible.
    4. The domain name (the part after '@') should remain unchanged.
    5. Return the masked email as a String. 
*/

/*
    Problem Statement:
    Create a Kotlin Extension Function for the String class named maskEmail().

    The function should:
    1. Accept one parameter:
       - visibleCharacters (Int)

    2. Mask the email username (the part before '@') using '*'.
    3. Keep only the first 'visibleCharacters' characters visible.
    4. The domain name (the part after '@') should remain unchanged.
    5. Return the masked email as a String.
*/

fun String.maskEmail(visibleCharacters: Int): String
{
    if (this.isEmpty()) return this
    if (visibleCharacters < 0) return this
    val atPosition = this.indexOf('@')
    if (atPosition == -1) return this
    val userName = this.substring(0, atPosition)
    val domain = this.substring(atPosition)
    if (visibleCharacters >= userName.length)
    return this

    val visiblePart = userName.substring(0, visibleCharacters)
    val maskedPart = "*".repeat(userName.length - visibleCharacters)

    return visiblePart + maskedPart + domain
}

fun main()
{
    print("Enter Email Address      : ")
    val email = readln().trim()
    print("Enter Visible Characters : ")
    val visibleCharacters = readln().trim().toIntOrNull()
    if (visibleCharacters == null)
    {
        println("Invalid Input")
        return
    }

    val result = email.maskEmail(visibleCharacters)
    println("Original Email : $email")
    println("Masked Email   : $result")
}