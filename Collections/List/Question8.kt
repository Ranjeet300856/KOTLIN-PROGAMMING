/*
    Question 8: Survey Result Analyzer

    Answers:
    Yes, No, Yes, Yes, No,
    Yes, No, Yes, Yes, No,
    Yes, Yes

    Requirements:
    1. Print complete List.
    2. Print all answers.
    3. Count Yes answers.
    4. Count No answers.
    5. Calculate Yes percentage.
    6. Calculate No percentage.
    7. Determine survey result.
    8. Find first No index.
    9. Find last Yes index.
    10. Print all indices where No appears.

    Do not use:
    count(), filter(),
    indexOf(), lastIndexOf(), groupBy()
*/

fun main()
{
    val surveyAnalyzer = listOf("Yes", "No", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "No", "Yes", "Yes")

    println("Survey Result : $surveyAnalyzer")

    print("All answer : ")
    for(value in surveyAnalyzer) print("$value ")

    var countYes = 0
    var countNo = 0
    var firstNoIndex = -1
    var lastYesIndex = -1
    for(i in surveyAnalyzer.indices)
    {
        val value = surveyAnalyzer[i]
        if(value == "Yes")
        {
            countYes++
            lastYesIndex = i
        }
        if(value == "No")
        {
            countNo++
            if(firstNoIndex == -1) firstNoIndex = i
        }
    }

    println("\nTotal yes : $countYes")
    println("Total no  : $countNo")

    val yesPercentage = if(surveyAnalyzer.size > 0) (countYes * 100).toDouble() / surveyAnalyzer.size else 0.0
    val noPercentage = if(surveyAnalyzer.size > 0) (countNo * 100).toDouble() / surveyAnalyzer.size else 0.0

    println("\nYes Percentage : %.2f".format(yesPercentage))
    println("No Percentage  : %.2f".format(noPercentage))

    if(yesPercentage > noPercentage) println("\nKotlin is Popular")
    else if(noPercentage > yesPercentage) println("\nKotlin is Not Popular")
    else println("\nSurvey Tied")

    println("\nFirst no index : $firstNoIndex")
    println("Last yes index  : $lastYesIndex")

    print("\nIndices where No appears : ")
    for(i in surveyAnalyzer.indices)
        if(surveyAnalyzer[i] == "No") print("$i ")
}