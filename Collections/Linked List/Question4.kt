/*
    Question 4: Browser History Navigation System Using LinkedList
    Problem Statement:
    Create a Kotlin program to develop a Browser History Navigation System using LinkedList Collection.
    The program should simulate a simple browser history where users can visit new pages and navigate through the history. 
*/
import java.util.LinkedList

fun validateSize(size: Int?): Boolean
{
    if(size == null || size <= 0)
    {
        println("Invalid Size Input")
        return true
    }
    else return false
}

fun validateWebsite(name: String): Boolean
{
    if(name.isBlank())
    {
        println("Invalid Input")
        return true
    }
    else return false
}

fun input(list: LinkedList<String>)
{
    print("How many websites do you want to visit : ")
    val inputSize = readln().trim().toIntOrNull()
    if(validateSize(inputSize)) return

    for(i in 1..inputSize!!)
    {
        while(true)
        {
            print("Enter Website Name $i : ")
            val name = readln().trim()
            if(validateWebsite(name)) continue
            list.add(name)
            break
        }
    }
}

fun output(list: LinkedList<String>)
{
    println("\nCurrent History:")
    var x = 1
    for(value in list)
    {
        println("$x. $value")
        x++
    }
}

fun addNewWebsite(list: LinkedList<String>)
{
    print("\nEnter new website name : ")
    val newName = readln().trim()
    if(validateWebsite(newName)) return
    list.add(newName)
}

fun remove(list: LinkedList<String>)
{
    if(list.isNotEmpty())
    {
        val removeWebsite = list.removeLast()
        println("\nYou went back from: $removeWebsite")
    }
    else println("No websites in history.")
}

fun addUsingStack(list: LinkedList<String>)
{
    print("\nEnter new website name : ")
    val newName = readln().trim()
    if(validateWebsite(newName)) return
    list.push(newName)
}

fun removeUsingStack(list: LinkedList<String>)
{
    if(list.isNotEmpty())
    {
        val delete = list.pop()
        println("\n$delete Removed Successfully")
    }
    else println("No websites in history.")
}

fun search(list: LinkedList<String>)
{
    print("\nEnter Search Name : ")
    val searchName = readln().trim()
    if(validateWebsite(searchName)) return
    if(searchName in list) println("The position of $searchName is ${list.indexOf(searchName)}")
    else println("$searchName not found")
}

fun main()
{
    val websites = LinkedList<String>()
    input(websites)
    output(websites)

    addNewWebsite(websites)
    output(websites)

    remove(websites)
    output(websites)

    addUsingStack(websites)
    output(websites)

    removeUsingStack(websites)
    output(websites)

    search(websites)

    if(websites.isNotEmpty())
    {
        println("\nThe oldest visited website      : ${websites.getFirst()}")
        println("The most recent website         : ${websites.getLast()}")
        println("Total number of websites stored : ${websites.size}")
    }
    else println("No History")
}