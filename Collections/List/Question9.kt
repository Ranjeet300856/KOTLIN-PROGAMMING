/*
    Question 9: Duplicate Number Analyzer

    Numbers:
    10, 20, 10, 30, 40,
    20, 50, 10, 30, 60

    Requirements:
    1. Print complete List.
    2. Print all elements.
    3. Count occurrences of 10.
    4. Count occurrences of 20.
    5. Count occurrences of 30.
    6. Find first occurrence index of 10.
    7. Find last occurrence index of 10.
    8. Print all indices where 10 appears.
    9. Count duplicate entries.
    10. Count unique entries.
    11. Check whether duplicates exist.

    Do not use:
    count(), filter(), distinct(),
    toSet(), groupBy(),
    indexOf(), lastIndexOf()
*/

fun main()
{
    val numbers = listOf(10, 20, 10, 30, 40, 20, 50, 10, 30, 60)

    println("Numbers : $numbers")

    print("All Elements : ")
    for(value in numbers) print("$value ")

    var count10 = 0
    var count20 = 0
    var count30 = 0
    var firstIndexOf10 = -1
    var lastIndexOf10 = -1
    for(i in numbers.indices)
    {
        val value = numbers[i]
        if(value == 10)
        {
            count10++
            if(firstIndexOf10 == -1) firstIndexOf10 = i

            lastIndexOf10 = i
        }
        if(value == 20) count20++
        if(value == 30) count30++
    }

    println("\nTotal 10          : $count10")
    println("Total 20          : $count20")
    println("Total 30          : $count30")
    println("First index of 10 : $firstIndexOf10")
    println("Last index of 10  : $lastIndexOf10")

    print("\nAll indices where 10 appears : ")
    for(i in numbers.indices)
        if(numbers[i] == 10) print("$i ")

    var countUnique = 0
    var countDuplicate = 0
    var hasDuplicate = false
    for(i in numbers.indices)
    {
        var alreadyFound = false

        for(j in 0 until i)
        {
            if(numbers[i] == numbers[j])
            {
                alreadyFound = true
                hasDuplicate = true
                break
            }
        }

        if(alreadyFound)
            countDuplicate++
        else
            countUnique++
    }

    println("\nUnique Entries    : $countUnique")
    println("Duplicate Entries : $countDuplicate")

    if(hasDuplicate)
        println("\nDuplicate values found")
    else
        println("\nNo duplicate values found")
}