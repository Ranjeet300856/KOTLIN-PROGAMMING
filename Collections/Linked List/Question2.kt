/*
    Question 2: Number Processing System Using LinkedList
    Problem Statement:
    Create a Kotlin program to develop a Number Processing System using LinkedList Collection.
    The program should perform the following operations:

    Requirements:
    1. Create a LinkedList that stores integer numbers (Int data type).
    2. Add the following numbers into the LinkedList:
    20
    40
    60
    80
    100

    3. Perform special LinkedList insertion operations:
    Add 10 at the beginning of the LinkedList.
    Add 120 at the end of the LinkedList.

    4. Access and display:
    The first number using a LinkedList specific method.
    The last number using a LinkedList specific method.
    The number available at index 4.

    5. Update operations:
    Change the number 60 to 65.
    6. Remove operations:
    Remove the first number using a LinkedList specific method.
    Remove the last number using a LinkedList specific method.

    7. Queue and Stack operations:
    Add 5 using a Stack related method.
    Remove and display the top element using a Stack related method.
    Add 150 using a Queue related method.
    Display the first element using a Queue related method without removing it.

    8. Searching and Checking:
    Check whether 65 is available or not.
    Display the total number of elements.
    9. Display all numbers using a loop. 
*/

import java.util.LinkedList

//Display Function
fun display(list: LinkedList<Int>)
{
    for(value in list)
        print("$value ")
}

//Main Function
fun main()
{
    //Linked List Creation
    val numbers = LinkedList<Int>()
    numbers.add(20)
    numbers.add(40)
    numbers.add(60)
    numbers.add(80)
    numbers.add(100)
    print("List After Creation           : ")
    display(numbers)

    //Insertion Operation
    numbers.addFirst(10)
    numbers.addLast(120)
    print("\nList After Insertion Operatin : ")
    display(numbers)

    //Access and Display
    println("\n\nFirst Number      : ${numbers.first()}")
    println("Last Number       : ${numbers.last()}")
    println("Number at index 4 : ${numbers.get(4)}")

    //Update Operation
    if(numbers.contains(60))
    {
        val index = numbers.indexOf(60)
        numbers[index] = 65
    }
    else println("60 Not Found")
    print("\nList After Update Operation : ")
    display(numbers)

    //Remove Number
    if(numbers.isNotEmpty())
    {
        numbers.removeFirst()
        if(numbers.size >= 1) numbers.removeLast()
        else println("List Is Empty")
    }
    else println("List Is Empty")
    print("\nList After Remove Operation : ")
    display(numbers)

    //Queue and Stack Operation
    numbers.push(5)
    print("\n\nList After Push(5)   : ")
    display(numbers)
    println("\nPop Operation        : ${numbers.pop()}")

    numbers.offer(150)
    print("\nList After offer(150)  : ")
    display(numbers)
    println("\nPeek Operation       : ${numbers.peek()}")

    //Searching Operation
    if(numbers.contains(65)) println("\n65 Is Available")
    else println("65 Is Not Available")

    println("Total Numbers : ${numbers.size}")

    print("\nFinal Linked List : ")
    display(numbers)
}