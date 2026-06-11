/*
    Question 7: Movie Rating Analyzer

    Ratings:
    9, 7, 4, 10, 6,
    8, 3, 5, 9, 2

    Requirements:
    1. Print complete List.
    2. Print all ratings.
    3. Count Excellent ratings.
    4. Count Good ratings.
    5. Count Average ratings.
    6. Count Poor ratings.
    7. Find highest rating.
    8. Find lowest rating.
    9. Calculate average rating.
    10. Print Excellent ratings.
    11. Print Poor ratings.
    12. Determine movie category based on average rating.

    Do not use:
    count(), filter(), average(),
    maxOrNull(), minOrNull(), groupBy()
*/

fun main()
{
    val rating = listOf(    9, 7, 4, 10, 6, 8, 3, 5, 9, 2)

    println("Ratings           : $rating")
    print("Rantings using loop : ")
    for(value in rating) print("$value ")

    var countExellent = 0
    var countGood = 0
    var countAverage = 0
    var countPoor = 0
    var highestRating = rating[0]
    var lowestRating = rating[0]
    var sum = 0.0

    for(value in rating)
    {
        sum += value

        when
        {
            value >= 9 -> countExellent++
            value >= 7 -> countGood++
            value >= 5 -> countAverage++
            else -> countPoor++
        }

        if(value > highestRating) highestRating = value
        if(value < lowestRating) lowestRating = value
    }

    println("\nCount Exellent Rating   : $countExellent")
    println("Count Good Rating       : $countGood")
    println("Count Average Rating    : $countAverage")
    println("Count Poor Rating       : $countPoor")
    println("Highest Rating          : $highestRating")
    println("Lowest Rating           : $lowestRating")

    var averageRating = if(rating.size > 0) sum / rating.size else 0.0
    println("\nAverage Rating          : %.2f".format(averageRating))

    print("\n\nAll Exellent Rating : ")
    for(value in rating)
        if(value >= 9) print("$value ")
    
    print("\n\nAll Poor Rating     : ")
    for(value in rating)
        if(value <= 4) print("$value ")

    if(averageRating >= 8) println("\nExcellent Movie")
    else if(averageRating >= 6) println("\nGood Movie")
    else if(averageRating >= 4) println("\nAverage Movie")
    else println("\nPoor Movie")
}