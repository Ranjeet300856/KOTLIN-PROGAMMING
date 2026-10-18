//Question 4: Message Formatter
class MessageFormatter {
    fun format(value: String) = value.uppercase()
    fun format(value: String, prefix: String) = prefix + value
    fun format(value: String, prefix: String, suffix: String) = prefix + value + suffix
}

fun main()
{
    val messageFormatter = MessageFormatter()

    val inUppercase = messageFormatter.format("hello")
    val withPrefix = messageFormatter.format("hello", "INFO: ")
    val withPrefixAndSuffix = messageFormatter.format("hello", "[", "]")

    println("Hello in Uppercase           : $inUppercase")
    println("Hello with Prefix            : $withPrefix")
    println("Hello with Prefix and Suffix : $withPrefixAndSuffix")
}