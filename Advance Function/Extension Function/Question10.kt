/*
    Create a Kotlin Extension Function for the Int class named formatNumber().
    The function should:
    1. Accept one parameter:
    - totalDigits (Int)

    2. Return the number as a String.
    3. If the number contains fewer digits than totalDigits,
    add leading zeros until the required length is reached.

    4. If the number already contains totalDigits or more digits,
    return the original number as a String.

    5. Handle invalid values safely. 
*/

fun Int.formatNumber(totalDigits: Int): String
{
    if(totalDigits <= this.toString().length || totalDigits <= 0) return this.toString()
    val x = "0".repeat(totalDigits - this.toString().length)
    return x + this.toString()
}

fun main()
{
    print("Enter a long number : ")
    val number = readln().trim().toIntOrNull()
    print("Enter total digits  : ")
    val totalDigits = readln().trim().toIntOrNull()
    if(number == null || totalDigits == null)
    {
        println("Invalid Input")
        return
    }

    val result = number.formatNumber(totalDigits)
    println(result)
}