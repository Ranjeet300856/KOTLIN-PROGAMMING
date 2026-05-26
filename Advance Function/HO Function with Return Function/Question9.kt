/*
    Create a Kotlin program where:

    You have separate normal functions for:
    Encrypt Text using Caesar Cipher (+3 shift)
    Decrypt Text using Caesar Cipher (-3 shift)
    Convert Text to Binary
    Count Total Words in Text

    Create a Higher Order Function
    Create a function named: getTextProcessor()
    that:
    takes a String parameter
    returns a function 
*/

fun encrypt(text: String): String
{
    val encryptedText = StringBuilder()

    for(ch in text)
    {
        when
        {
            ch in 'a'..'z' ->
            {
                val encryptedChar = if(ch + 3 > 'z')
                    ch - 23
                else
                    ch + 3

                encryptedText.append(encryptedChar)
            }

            ch in 'A'..'Z' ->
            {
                val encryptedChar = if(ch + 3 > 'Z')
                    ch - 23
                else
                    ch + 3

                encryptedText.append(encryptedChar)
            }

            else -> encryptedText.append(ch)
        }
    }

    return encryptedText.toString()
}

//Decrypt Text using Caesar Cipher
fun decrypt(text: String): String
{
    val decryptedText = StringBuilder()

    for(ch in text)
    {
        when
        {
            ch in 'a'..'z' ->
            {
                val decryptedChar = if(ch - 3 < 'a')
                    ch + 23
                else
                    ch - 3

                decryptedText.append(decryptedChar)
            }

            ch in 'A'..'Z' ->
            {
                val decryptedChar = if(ch - 3 < 'A')
                    ch + 23
                else
                    ch - 3

                decryptedText.append(decryptedChar)
            }

            else -> decryptedText.append(ch)
        }
    }

    return decryptedText.toString()
}

fun convertToBinary(text: String): String
{
    val binaryText = StringBuilder()
    for(ch in text)
    {
        binaryText.append(ch.code.toString(2))
        binaryText.append(" ")
    }

    return binaryText.toString().trim()
}

fun invalidChoice(text: String): String = "Invalid Operation"

fun countTotalWords(text: String): String = "Total Words : ${text.split(" ").size}"

//Higher Order Function
fun getTextProcessor(choice: String): (String) -> String
{
    return when(choice.lowercase())
    {
        "encrypt" -> ::encrypt
        "decrypt" -> ::decrypt
        "words" -> ::countTotalWords
        "binary" -> ::convertToBinary
        else -> ::invalidChoice
    } 
}

//Main Function
fun main()
{
    print("Enter a text : ")
    val text = readln().trim()
    if(text.isBlank())
    {
        println("Invalid Input")
        return
    }

    println("\nText Operation\n")

    println("1. Encrypt Text")
    println("2. Decrypt Text")
    println("3. Total Words")
    println("4. Text to Binary Text")

    print("\nEnter any operation (encrypt, decrypt, words, binary) : ")
    val choice = readln().trim()
    if(choice.isBlank())
    {
        println("Invalid Choice")
        return
    }

    val textProcessor = getTextProcessor(choice)
    val result = textProcessor(text)
    println(result)
}