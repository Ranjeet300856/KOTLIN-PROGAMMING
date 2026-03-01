fun main()
{
    //Q21st
    /*
    Write a Kotlin program that takes marks as input
    and assigns a grade using when as expression.

    Rules:
    If marks are 90 or more, assign "A".
    If marks are 75 or more, assign "B".
    Otherwise, assign "C".

    Store the grade in a variable and print it.

    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter Marks : ")
     var marks = readln().toIntOrNull()
     if(marks == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     if(marks < 0 || marks > 100)
     {
        println("Invalid Marks!")
        return
     }

     var grade = when
     {
        marks >= 90 -> 'A'
        marks >= 75 -> 'B'
        else -> 'C'
     }

     println("Grade : $grade")
}