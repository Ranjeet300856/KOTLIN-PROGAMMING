fun main()
{
    //Q15th
    /*
     Write a Kotlin program that takes three sides of a triangle as input
    and determines the type of triangle using when without argument.

    Rules:
    If any side is less than or equal to 0, print "Invalid Triangle".
    If all three sides are equal, print "Equilateral Triangle".
    If any two sides are equal, print "Isosceles Triangle".
    Otherwise, print "Scalene Triangle".

    If the input is not a valid number,
    print "Invalid Input".
     */

     print("Enter Side A of Tringle : ")
     var a = readln().toIntOrNull()
     print("Enter Side B of Tringle : ")
     var b = readln().toIntOrNull()
     print("Enter Side C of Tringle : ")
     var c = readln().toIntOrNull()
     if(a == null || b == null || c == null)
     {
        println("Input is Empty of Invalid Input!")
        return
     }

     when
     {
        (a <= 0 || b <= 0 || c <= 0) || (a + b <= c || a + c <= b || b + c <= a) -> println("Invalid Tringle!")
        a == b && b == c -> println("Equilateral Triangle")
        a == b || b == c || a == c -> println("Isosceles Triangle")
        else -> println("Scalene Triangle")
     }
}