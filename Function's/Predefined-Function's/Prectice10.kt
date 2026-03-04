fun main()
{
    //Q11th Contains() Demo for Kotlin Word Find
    print("Enter Sentence : ")
    var input = readln().trim().lowercase()
    if(input.isBlank())
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    if(input.contains("kotlin")) println("Sentence contains the word 'kotlin'.")
    else println("Sentence does not contain the word 'kotlin'.")
}