//Write a Kotlin program to create an array using arrayOf() and find all pairs of elements whose sum is equal to a given target.
fun main()
{
    val arr = arrayOf(2, 4, 3, 5, 7, 8)
    print("Enter Target : ")
    val target = readln().trim().toIntOrNull()
    if(target == null)
    {
        println("Invalid Input")
        return
    }

    var found = false
    println("Pairs: ")
    for(i in 0 until arr.size)
    {
        for(j in i + 1 until arr.size)
        {
            if(arr[i] + arr[j] == target)
            {
                println("(${arr[i]}, ${arr[j]})")
                found = true
            }
        }
    }

    if(!found) println("No Pairs Found")
}