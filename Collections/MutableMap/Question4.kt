/*
    Question 4 — Country Population Lookup System
    Problem Statement
    Create a Kotlin program that works as a Country Population Lookup System using a MutableMap.

    The program should store:
    Key = Country Name (String)
    Value = Population in Millions (Int) 
*/

fun main()
{
    val countryPopulation = mutableMapOf<String, Int>()
    countryPopulation.put("India", 1450)
    countryPopulation.put("China", 1410)
    countryPopulation.put("USA", 340)
    countryPopulation.put("Japan", 124)

    println("Population of India : ${countryPopulation.get("India")} Million")
    println("Population of Canada : ${countryPopulation.getOrDefault("Canada", "Data Not Available")}")

    var mostPopulated: Int? = null
    var mostPopulatedCountry: String? = null
    for((key, value) in countryPopulation) 
    {
        if((mostPopulated == null || mostPopulatedCountry == null) || value > mostPopulated)
        {
            mostPopulated = value
            mostPopulatedCountry = key
        }
    }
    
    println("Most Populated Country : $mostPopulatedCountry")
    println("Population             : $mostPopulated Million")

    println("\nFinal Record:")
    for((key, value) in countryPopulation)
    {
        println("Country Name : $key")
        println("Population   : $value Million")
    }
}