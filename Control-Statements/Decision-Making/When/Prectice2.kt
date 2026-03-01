fun main()
{
    //Q2nd
    /*
     Write a Kotlin program that takes a single character as input 
     representing a mathematical operator (+, -, *, /).
     Use when with argument to identify the operator 
     and print the corresponding operation name.
     If the input is not one of these operators,
     print "Invalid Operator".
     */

     print("Enter Math Operator : ")
     var x = readln()

     if(x.isBlank() || x.length != 1)
     {
        println("Invalid Input")
        return
     }

     var ch = x[0]

     when(ch)
     {
        '+' -> println("Plus")
        '-' -> println("Minus")
        '*' -> println("Multiplication")
        '/' -> println("Division")
        '%' -> println("Modulo")
        else -> println("Invalid Operator")
     }
}