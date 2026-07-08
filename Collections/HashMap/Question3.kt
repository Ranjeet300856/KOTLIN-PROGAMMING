/*
    Question 3: Word Frequency Counter Using HashMap
    Problem Statement:
    Create a Kotlin program to count the frequency of words using HashMap.

    Requirements:
    1. Ask the user to enter the total number of words.
    2. Read all words from the user.
    3. Store each word in a HashMap.
    4. If a word already exists, increase its count by 1.
    5. Display all words with their frequencies.
*/

fun main()
{
    val words = HashMap<String, Int>()
    print("Enter the total number of words : ")
    val inputSize = readln().trim().toIntOrNull()
    if(inputSize == null || inputSize <= 0)
    {
        println("Invalid Input")
        return
    }

    for(i in 0 until inputSize )
    {
        while(true)
        {
            print("Enter Word ${i + 1} : ")
            val inputWord = readln().trim()
            if(inputWord.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            if(words.containsKey(inputWord))
            {
                words[inputWord] = words[inputWord]!! + 1
                break
            }
            words.put(inputWord, 1)
            break
        }
    }

    for((key, value) in words.entries)
    println("$key : $value")
}