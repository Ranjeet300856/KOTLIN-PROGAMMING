/*
    Question 1: Student Record Management System Using ArrayList
    Problem Statement
    Create a Kotlin program to develop a simple Student Record Management System using ArrayList.
    You have to store student names in an ArrayList and perform different operations on the records. 
*/

fun display(list: ArrayList<String>)
{
    for(i in list.indices)
        println("${i + 1}. ${list[i]}")
}

fun main()
{
    val studentsName = ArrayList<String>()
    studentsName.add("Rahul")
    studentsName.add("Aman")
    studentsName.add("Priya")
    studentsName.add("Karan")
    studentsName.add("Anjali")
    display(studentsName)
    
    studentsName.add("Rohit")
    studentsName.add(2, "Sneha")
    println("\nUpdated List:")
    display(studentsName)

    if(studentsName.contains("Karan"))
    {
        val index = studentsName.indexOf("Karan")
        studentsName[index] = "Karan Sharma"
    }
    else println("Karan not exists")

    if(studentsName.contains("Aman"))
    {
        studentsName.remove("Aman")
        studentsName.removeAt(studentsName.lastIndex)
        println("Student Remove Successfully")
    }
    else println("Aman not exists")

    println("\nUpdated List After Update and Remove Operations:")
    display(studentsName)

    if("Priya" in studentsName) println("Priya Exists")
    else println("Priya Not Exists")
    if("Vikas" in studentsName) println("Vikas Exists")
    else println("Vikas Not Exists")

    println("\nTotal Students : ${studentsName.size}")
    if(studentsName.isEmpty()) println("List is empty")
    else println("List is not empty")
}