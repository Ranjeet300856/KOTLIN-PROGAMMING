//Question 3: Employee ID Navigator Using TreeMap
import java.util.TreeMap

fun inputEmployeeId(): Int
{
    while(true)
    {
        print("\nEnter Employee ID : ")
        val inputId = readln().trim().toIntOrNull()
        if(inputId == null || inputId <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputId
    }
}

fun inputEmployeeName(): String
{
    while(true)
    {
        print("Enter Employee Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun hasEmployees(employees: TreeMap<Int, String>): Boolean
{
    if(employees.isEmpty())
    {
        println("No employee records available.")
        return false
    }
    else return true
}

fun addEmployee(employees: TreeMap<Int, String>)
{
    while(true)
    {
        val employeeId = inputEmployeeId()
        if(employees.containsKey(employeeId))
        {
            println("Employee already exists.")
            continue
        }
        
        val employeeName = inputEmployeeName()
        employees[employeeId] = employeeName
        println("Employee Added Successfully")
        break
    }
}

fun findNextEmployee(employees: TreeMap<Int, String>)
{
    if(!hasEmployees(employees)) return
    val employeeId = inputEmployeeId()
    val nextEmployee = employees.higherEntry(employeeId)
    if(nextEmployee == null) println("No next employee found.")
    else
    {
        println("Next Employee ID   : ${nextEmployee.key}")
        println("Next Employee Name : ${nextEmployee.value}")
    }
}

fun findPreviousEmployee(employees: TreeMap<Int, String>)
{
    if(!hasEmployees(employees)) return
    val employeeId = inputEmployeeId()
    val previousEmployee = employees.lowerEntry(employeeId)
    if(previousEmployee == null) println("No previous employee found.")
    else
    {
        println("Previous Employee ID   : ${previousEmployee.key}")
        println("Previous Employee Name : ${previousEmployee.value}")
    }
}

fun displayAllEmployee(employees: TreeMap<Int, String>)
{
    if(!hasEmployees(employees)) return
    println("\nAll Employees Records:")
    for((key, value) in employees.entries)
    {
        println("Employee ID   : $key")
        println("Employee Name : $value")
    }
}

fun main()
{
    val employees = TreeMap<Int, String>()
    println("\n===== Employee ID Navigator =====\n")
    while(true)
    {
        println("\n1. Add Employee")
        println("2. Find Next Employee")
        println("3. Find Previous Employee")
        println("4. Display All Employees")
        println("5. Exit")

        print("\nEnter your choice (1..5) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addEmployee(employees)
            2 -> findNextEmployee(employees)
            3 -> findPreviousEmployee(employees)
            4 -> displayAllEmployee(employees)
            5 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Please Enter 1..5")
        }
    }
}