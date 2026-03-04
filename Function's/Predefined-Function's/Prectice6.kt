fun main()
{
    //Q7th - contains() Demo
    print("Enter a Word : ")
    var input = readln().trim()
    if(input.isBlank())
    {
        println("Input is Empty or Invalid Input")
        return
    }

    if (input.contains(" "))
    {
        println("Please enter only a single word (no spaces allowed).")
        return
    }

    if (input.contains('a', ignoreCase = true)) println("'a' is present in the word.")
    else  println("'a' is not present in the word.")
}