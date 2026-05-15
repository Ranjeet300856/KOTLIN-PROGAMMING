/*
    Question 8 — Nested Utility Package with Alias Import
    Problem Statement - Create a Kotlin program that demonstrates:
    Nested Packages
    Alias Import
    Utility-based reusable functions

    all together in one project. 
*/

import textutils.formatter.formatTitle as titleFormatter
import textutils.validator.formatTitle as titleValidator

fun main()
{
    print("Enter a Text : ")
    val text = readln().trim()
    
    if(!titleValidator(text))
    {
        println("Invalid Title")
        return
    }
    else println("Formatted Title : ${titleFormatter(text)}")
}