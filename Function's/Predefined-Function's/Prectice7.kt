fun main()
{
    //Q8th - substring() Demo
    print("Enter a Word : ")
    var input = readln().trim()
    if(input.isBlank())
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    if(input.contains(" "))
    {
        println("Please enter only a single word (no spaces allowed).")
        return
    }

    if(input.length >= 3) println("Substring of $input is : ${input.substring(0,3)}")
    else println("Word must contain at least 3 characters.")
}