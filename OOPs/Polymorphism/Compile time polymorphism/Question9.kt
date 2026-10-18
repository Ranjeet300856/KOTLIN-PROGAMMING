//Question 9: Text Analyzer Using Function Overloading
class TextAnalyzer {
    fun analyze(text: String) = text.length
    fun analyze(text: String, countWords: Boolean): Int {
        if(countWords) {
            return (text.trim().split("\\s+".toRegex())).size
        } else {
            return text.length
        }
    }
}

fun String.wordCount(): Int {
    return (this.trim().split("\\s+".toRegex())).size
}

fun main()
{
    val textAnalyzer = TextAnalyzer()

    val totalCharacters = textAnalyzer.analyze("Kotlin is fun")
    val totalWords = textAnalyzer.analyze("Kotlin is fun", true)
    val totalWordsUsingExtensionFun1 = "Hello World".wordCount()
    val totalWordsUsingExtensionFun2 = " ".wordCount()
    val totalWordsUsingExtensionFun3 = "Kotlin is fun".wordCount()
    
    println("Total Characters in [Kotlin is fun] : $totalCharacters")
    println("Total Words in [Kotlin is fun]      : $totalWords")

    println("\nTotal Words Using Extension Function in [Hello World]   : $totalWordsUsingExtensionFun1")
    println("Total Words Using Extension Function in [ ]             : $totalWordsUsingExtensionFun2")
    println("Total Words Using Extension Function in [Kotlin is fun] : $totalWordsUsingExtensionFun3")
}