/*
    Question 2 — Unique Product ID Management System

    Problem Statement:
    Create a Kotlin program for a warehouse inventory system using
    MutableSet<Int>. The system should store only unique product IDs,
    perform add/remove operations, check product availability,
    and display updated inventory details.
*/

fun main()
{
    val productIDs = mutableSetOf(101, 102, 103, 104, 102, 103, 105)

    print("All Product IDs : ")
    for(id in productIDs) print("$id ")

    println("\nTotal unique products ${productIDs.size}")

    if(104 in productIDs) println("\nProduct ID 104 is exists in list")
    else println("\nProduct ID 104 is not exists in list")

    if(200 in productIDs) println("Product ID 200 is exists in list")
    else println("Prouduct ID 200 is not exists in list")

    productIDs.add(106)

    if(productIDs.remove(101)) println("\nProduct ID 101 removed successfully")
    else println("\nProduct ID 101 dose not exists")

    print("\nUpdated Products ID : ")
    for(id in productIDs) print("$id ")

    println("\n\nTotal products IDs after updated : ${productIDs.size}")

    if(productIDs.isEmpty()) println("Set is empty")
    else println("Set is not empty")
}