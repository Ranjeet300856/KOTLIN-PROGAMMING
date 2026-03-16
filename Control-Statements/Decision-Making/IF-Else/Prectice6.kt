//Q6th
/*
    Write a Kotlin program that takes a person's age as input.
    If the age is 60 or greater, print:
    Eligible for senior citizen discount
    Otherwise print:
    Not eligible for senior citizen discount
*/

fun main()
{
    print("Enter Person Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null || age < 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(age >= 60) println("Eligible for senior citizen discount")
    else println("Not eligible for senior citizen discount")
}