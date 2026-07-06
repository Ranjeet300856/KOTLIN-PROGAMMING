//Create a Kotlin program to develop a Rectangle Calculator using Class and Regular Object.
class Rectangle
{
    var length = 0.0
    var width = 0.0

    fun calculateArea(len: Double, wid: Double): Double = len * wid
    fun calculatePerimeter(len: Double, wid: Double): Double = 2 * (len + wid)
    fun displayResult()
    {
        println("\n----------- Rectangle Details -----------\n")
        println("Length      : %.2f".format(length))
        println("Width       : %.2f".format(width))
        println("Area        : %.2f".format(calculateArea(length, width)))
        println("Perimeter   : %.2f".format(calculatePerimeter(length, width)))
        println("\n-----------------------------------------")
    }
}

fun main()
{
    print("Enter Length : ")
    val length = readln().trim().toDoubleOrNull()
    print("Enter Width  : ")
    val width = readln().trim().toDoubleOrNull()
    if(length == null || width == null)
    {
        println("Invalid Input")
        return
    }

    val rectangle1 = Rectangle()
    rectangle1.length = length
    rectangle1.width = width
    rectangle1.displayResult()
}