/*
    Question 10 — Advanced Data Class Challenge

    Create the following Kotlin data classes:
    1. Address
       - city: String
       - state: String

    2. Employee
       - id: Int
       - name: String
       - department: String
       - address: Address
       - skills: List<String>

    Create at least two Employee objects.

    Your program should:
    1. Print the complete information of both employees.
    2. Use destructuring declaration to extract the Employee's
       id, name, department, address, and skills.
    3. Demonstrate that two Employee objects containing exactly
       the same data are equal using ==.
    4. Demonstrate that equal Employee objects have the same hashCode().
    5. Create a copy of an Employee using copy().
    6. In the copied Employee:
       - Change the department.
       - Add one new skill.
       - Change the city inside the Address.
    7. Print the original and copied Employee after all updates.
    8. Verify that the original Employee's department remains unchanged.
    9. Verify whether the original and copied Employee are different
       objects.
    10. Verify whether the original and copied Employee share the
        same Address object.
    11. Explain the observed Address behavior based on the fact that
        data class copy() performs a shallow copy.
*/

data class Address(
    var city: String,
    val state: String
)

data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val address: Address,
    val skills: List<String>
)

fun display(id: Int, name: String, department: String, address: Address, skills: List<String>, i: Int)
{
    println("Employee $i")
    println("Employee ID         : ${id}")
    println("Employee Name       : ${name}")
    println("Employee Department : ${department}")
    println("Employee Address    : ${address}")
    println("Employee Skills     : ${skills}\n")
}

fun main()
{
    val employee1 = Employee(1001, "Ranjeet", "Software Development", Address("Jalore", "Rajasthan"), listOf("Kotlin", "Android Studio"))
    val employee2 = Employee(1001, "Ranjeet", "Software Development", Address("Jalore", "Rajasthan"), listOf("Kotlin", "Android Studio"))

    println("Employees Info:")
    println(employee1)
    println(employee2)

    val (id, name, department, address, skills) = employee1
    val (id2, name2, department2, address2, skills2) = employee2
    println("\nDestructuring Declaration:")
    display(id, name, department, address, skills, 1)
    display(id2, name2, department2, address2, skills2, 2)

    println("\nEmployees have same data ? : ${employee1 == employee2}")
    println("Same hashCode ? : ${employee1.hashCode() == employee2.hashCode()}")

    val newSkill = employee1.skills + "VS Code"
    val employee3 = employee1.copy(department = "Web Development", skills = newSkill)
    employee3.address.city = "Falna"

    println("\nEmployees After Update:")
    println("Original Employee (Employee1) : $employee1")
    println("Copied Employee (Employee3)   : $employee3")

    println("\nOrginal Employee Department and Copied Employee Department are diffrent ? : ${employee1.department != employee3.department}")
    println("Orginal Employee and Copied Employee are diffrent Object?                   : ${employee1 !== employee3}")
    println("Orginal Employee and Copied Employee are diffrent Address Object?           : ${employee1.address !== employee3.address}")
}