/*
    Question 3 — Employee Salary Management System (Intermediate Level)
    Problem Statement
    Create a Kotlin program that works as an Employee Salary Management System using a MutableMap.

    The program should store employee records where:
    Key = Employee ID (Int)
    Value = Salary (Double) 
*/

fun manageEmployees(employeesData: MutableMap<Int, Double>, displayData: (MutableMap<Int, Double>) -> Unit) = displayData(employeesData)

fun main()
{
    val employeesData = mutableMapOf<Int, Double>()
    manageEmployees(employeesData) {
        employees: MutableMap<Int, Double> ->

        employees.put(1001, 45000.0)
        employees.put(1002, 52000.0)
        employees.put(1003, 61000.0)
        employees.put(1004, 48000.0)

        println("All Employees:")
        for((key, value) in employees)
        {
            println("Employee ID   : $key")
            println("Salary        : %.2f".format(value))
        }

        employees[1002] = 55000.0

        if(employees.containsKey(1003)) println("\nEmployee Found")
        else println("Employee Not Found")

        if(employees.containsValue(61000.0)) println("Salary Record Found")
        else println("Salary Record Not Found")

        val removeEmployee = employees.remove(1004)
        if(removeEmployee != null) println("Employee Removed Successfully")
        else println("Employee Not Found")

        if(employees.isEmpty()) println("No Employee Records Available")
        else println("Employee Records Exist")

        if(employees.isNotEmpty()) println("Employee Database Active")
        else println("Employee Database Empty")

        println("Total Employees : ${employees.size}")

        println("\nOnly Employees Ids:")
        for(key in employees.keys) println("$key")

        println("\nOnly Salaries:")
        for(value in employees.values) println("$value")

        println("\nFinal Records: ")
        for((key, value) in employeesData)
        {
            println("Employee ID : $key")
            println("Salary        : $value")
        }
    }
}