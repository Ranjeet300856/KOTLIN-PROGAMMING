fun main() {
    print("Enter a word : ")

    val word = readln().trim()

    if (word.isEmpty()) {
        println("Input is Empty or Invalid Input!")
        return
    }

    if (word.any { it.isWhitespace() }) {
        println("Please enter only a single word (no spaces allowed).")
        return
    }

    val result = word.replace("a", "@", ignoreCase = true)

    println("After replace: $result")
}