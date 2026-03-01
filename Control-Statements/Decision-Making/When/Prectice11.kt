fun main()
{
    //Q11th
    /*
     Write a Kotlin program that takes salary as input
     and categorizes the income using when without argument.

    Rules:
    If salary is less than 0, print "Invalid Salary".
    If salary is 100000 or more, print "High Income".
    If salary is 50000 or more, print "Middle Income".
    Otherwise, print "Low Income".

    If the input is not a valid integer,
    print "Invalid Input".
    */

    print("Enter Salary : ")
    var salary = readln().toDoubleOrNull()
    if(salary == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    when
    {
        salary < 0 -> println("Invalid Salary!")
        salary >= 100000 -> println("High Income")
        salary >= 50000 -> println("Middle Income")
        else -> println("Low Income")
    }
}