/*
    Question 9 — Currency Information System
    Problem Statement
    Create a Kotlin program that works as a Currency Information System using an Immutable Map.
*/

fun displayCurrenciesInfo(currencies: Map<String, String>, currencyCode: String)
{
    if(currencies.containsKey(currencyCode))
    {
        println("Currency Code : $currencyCode")
        println("Currency Name : ${currencies[currencyCode]}")

        when(currencyCode)
        {
            "INR" -> println("Region        : Asia\n")
            "JPY" -> println("Region        : Asia\n")
            "USD" -> println("Region        : North America\n")
            "EUR" -> println("Region        : Europe\n")
            "AUD" -> println("Region        : Oceania\n")
        }
    }
    else
    {
        println("Currency Code : $currencyCode")
        println("Currency Not Found\n")
    }
}

fun main()
{
    val currencies = mapOf(
        "INR" to "Indian Rupee",
        "USD" to "US Dollar",
        "EUR" to "Euro",
        "JPY" to "Japanese Yen",
        "AUD" to "Australian Dollar"
    )

    val currencyCode = "USD"
    displayCurrenciesInfo(currencies, currencyCode)

    val code1 = "INR"
    displayCurrenciesInfo(currencies, code1)

    val code2 = "EUR"
    displayCurrenciesInfo(currencies, code2)

    val code3 = "CAD"
    displayCurrenciesInfo(currencies, code3)
}