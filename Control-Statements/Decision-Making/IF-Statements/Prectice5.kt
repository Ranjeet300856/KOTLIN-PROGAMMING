//Q5ht
/*
    Write a Kotlin program that takes a person's age as input and checks whether the person is eligible to vote.
    If the age is 18 or greater, print:
    The person is eligible to vote
    If the age is less than 18, the program should print nothing.
*/

fun main()
{
    print("Enter your Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(age >= 18) println("The person is eligible to vote")
}