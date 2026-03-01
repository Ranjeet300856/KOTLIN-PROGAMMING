fun main()
{
    //Q13th
    /*
     Write a Kotlin program that takes marks as input
    and prints the corresponding grade using when without argument.

    Rules:
    If marks are less than 0 or greater than 100, print "Invalid Marks".
    If marks are 90 or more, print "Grade A".
    If marks are 75 or more, print "Grade B".
    If marks are 60 or more, print "Grade C".
    Otherwise, print "Fail".

    If the input is not a valid integer,
    print "Invalid Input".
    */

    print("Enter Marks (0 - 100) : ")
    var marks = readln().toIntOrNull()
    if(marks == null)
    {
        print("Input is Empty or Invalid Input!")
        return
    }

    when
    {
        marks < 0 || marks > 100 -> println("Invalid Marks!")
        marks >= 90 -> println("Grade A")
        marks >= 75 -> println("Grade B")
        marks >= 60 -> println("Grade C")
        else -> println("Fail!")
    }
}