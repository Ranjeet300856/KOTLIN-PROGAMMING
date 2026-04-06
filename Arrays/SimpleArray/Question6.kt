//Write a Kotlin program to create an array using arrayOf() and count the frequency of each element in the array.
fun main() 
{
    val arr = arrayOf(10, 20, 10, 30, 20, 10)
    for(i in 0 until arr.size) 
    {
        // Step 1: check already counted or not
        var isVisited = false
        for(k in 0 until i) 
        {
            if(arr[i] == arr[k]) 
            {
                isVisited = true
                break
            }
        }

        if(isVisited) continue

        // Step 2: count frequency
        var count = 0
        for(j in 0 until arr.size) 
        {
            if(arr[i] == arr[j]) 
            {
                count++
            }
        }

        // Step 3: print
        println("${arr[i]} -> $count times")
    }
}