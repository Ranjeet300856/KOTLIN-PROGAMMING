/*
    Question 4 — Country Code Lookup System
    Problem Statement
    Create a Kotlin program that works as a Country Code Lookup System using an Immutable Map.

    Requirements
    Create an immutable map named countryCodes.
    Store the following data:
    "IN" -> "India"
    "US" -> "United States"
    "JP" -> "Japan"
    "AU" -> "Australia"
    "CA" -> "Canada"

    Create a variable:
    val countryCode = "JP"
    Using the map, display the country name associated with countryCode.

    Validation Requirement
    Check whether the given country code exists in the map.
    If the code exists:
    Country Found : Japan
    If the code does not exist:
    Invalid Country Code

    Additional Test Cases
    After completing the first lookup, test the following codes one by one:
    val code1 = "IN"
    val code2 = "CA"
    val code3 = "UK"
    Print appropriate messages for each code. 
*/

fun checksCountryCode(code: String, countryCodes: Map<String, String>)
{
    if(countryCodes.containsKey(code))
    {
        println("Code : $code")
        println("Country Found : ${countryCodes[code]}\n")
    }
    else println("Invalid Country Code\n")
}

fun main()
{
    val countryCodes = mapOf(
        "IN" to "India",
        "US" to "United States",
        "JP" to "Japan",
        "AU" to "Australia",
        "CA" to "Canada"
    )

    val countryCode = "JP"
    checksCountryCode(countryCode, countryCodes)

    val code1 = "IN"
    checksCountryCode(code1, countryCodes)

    val code2 = "CA"
    checksCountryCode(code2, countryCodes)

    val code3 = "UK"
    checksCountryCode(code3, countryCodes)
}