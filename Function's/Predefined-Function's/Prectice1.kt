fun main() 
{
    //Q1st
    print("Enter your First Name : ")

    var name = readln().trim()

    if (name.isEmpty()) {
        println("Input is empty or Invalid Input!")
        return
    }

    if (!name.all { it.isLetter() }) {
        println("Name should contain only alphabets!")
        return
    }

    name = name.uppercase()

    println("Name: $name")

    //Q2nd
    print("Enter a Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    println("Your Int Number is $number")
    
}