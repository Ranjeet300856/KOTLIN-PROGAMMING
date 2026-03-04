fun main()
{
    //Q6th - String Length
    print("Enter String/Sentence : ")
    var string = readln()
    if(string.isBlank())
    {
        println("Invalid Input or String is Empty!")
        return
    }

    println("Length of String is : ${string.length}")
}