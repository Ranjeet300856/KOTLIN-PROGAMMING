/*
    Question 2: Analyze a String List with Duplicate Values

    Create an immutable List of Strings containing:
    Ranjeet, Aman, Rohit, Aman, Mohan, Rohit

    Perform the following operations:
    1. Create the List using listOf().
    2. Print the complete List.
    3. Print the total number of elements.
    4. Print the first student name.
    5. Print the last student name.
    6. Print the student name at index 3.
    7. Print all student names using a loop.
    8. Count and print how many times "Aman" appears.
    9. Count and print how many times "Rohit" appears.
    10. Check whether "Mohan" exists or not.
    11. Check whether "Sohan" exists or not.
    12. Print the total number of duplicate entries in the List.
*/

fun main()
{
    val student = listOf("Ranjeet", "Aman", "Rohit", "Aman", "Mohan", "Rohit")

    println("List                     : $student")
    println("Total Students           : ${student.size}")
    println("First Student            : ${student.firstOrNull()}")
    println("Last Student             : ${student.lastOrNull()}")
    println("Student at index 3       : ${student[3]}")

    print("Students name using loop : ")
    for(name in student) print("$name ")

    var duplicateEntries = 0
    for(i in student.indices)
    {
        var alreadyFound = false
        for(j in 0 until i)
        {
            if(student[i] == student[j])
            {
                alreadyFound = true
                break
            }
        }

        if(alreadyFound)
            duplicateEntries++
    }

    println("Duplicate Entries : $duplicateEntries")


    if("Mohan" in student) println("Mohan is exists in list")
    else println("Mohan is not exists in list")

    if("Sohan" in student) println("Sohan is exists in list")
    else println("Sohan is not exists in list")

    var count = 0
    for(i in student.indices)
    {
        for(j in (i + 1)..student.size - 1)
        {
            if(student[i] == student[j])
                count++
        }
    }

    println("Duplicate entries in the List : $count")
}