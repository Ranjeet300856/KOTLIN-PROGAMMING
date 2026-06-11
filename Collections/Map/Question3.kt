/*
    Question 3 — Employee Information Lookup
    Problem Statement
    Create a Kotlin program to manage employee information using an Immutable Map.

    Requirements
    Create an immutable map named employees.
    Store the following data:
    'A' -> "Manager"
    'B' -> "Developer"
    'C' -> "Designer"
    'D' -> "Tester"
    'E' -> "HR"

    Print the complete map.
    Print the total number of employees/designations stored.
    Print all employee codes.
    Print all designations.
    Print the designation assigned to employee code 'C'.
    Check whether employee code 'F' exists or not.
    Check whether designation "Manager" exists or not.
    Print appropriate messages for all checks.

    Additional Requirement
    Create the following variables:
    val employeeCode = 'D'
    val designation = "CEO"

    Then:
    Check whether employeeCode exists in the map.
    Check whether designation exists in the map.
    Print appropriate messages. 
*/

fun main()
{
    val employees = mapOf(
        'A' to "Manager",
        'B' to "Developer",
        'C' to "Designer",
        'D' to "Tester",
        'E' to "HR"
    )

    println("All Employees      : $employees")
    println("Total Employees    : ${employees.size}")
    println("All Employee Codes : ${employees.keys}")
    println("All Designations   : ${employees.values}")
    println("Code C Designation : ${employees['C']}")

    if(employees.containsKey('F')) println("\nEmployee Code F Exists")
    else println("\nEmployee Code F Not Exists")

    if(employees.containsValue("Manager")) println("Manager Exists")
    else println("Manager Not Exists")

    val employeeCode = 'D'
    val designation = "CEO"
    if(employees.containsKey(employeeCode)) println("Employee Code D Is Exists")
    else println("Employee Code D Not Exists")

    if(employees.containsValue(designation)) println("CEO Exists")
    else println("CEO Not Exists")
}