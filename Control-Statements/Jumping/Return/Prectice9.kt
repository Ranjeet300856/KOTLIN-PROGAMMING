//Q9th
/*
    Write a Kotlin function that takes three integers a, b, and c as input and:

    If any of the values is less than or equal to 0 → return "Invalid Input"
    Check if the three numbers can form a triangle:
    If not → return "Not a Triangle"
    If they form a triangle:
    If all three sides are equal → return "Equilateral"
    If any two sides are equal → return "Isosceles"
    If all sides are different → return "Scalene" 
*/

fun triangleIs(a: Int, b: Int, c: Int): String
{
    if(a <= 0 || b <= 0 || c <= 0) return "Invalid Input"
    if(a + b <= c || b + c <= a || a + c <= b) return "Not a Triangle"
    if(a == b && b == c) return "Equilateral"
    if(a == b || b == c || a == c) return "Isosceles"
    return "Scalene"

}

fun main()
{
    print("Enter Side A : ")
    val a = readln().trim().toIntOrNull()
    print("Enter Side B : ")
    val b = readln().trim().toIntOrNull()
    print("Enter Side C : ")
    val c = readln().trim().toIntOrNull()
    if(a == null || b == null || c == null)
    {
        println("Invalid Input")
        return
    }

    println(triangleIs(a, b, c))
}