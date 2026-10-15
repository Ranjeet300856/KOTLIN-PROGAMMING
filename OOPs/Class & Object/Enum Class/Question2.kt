//Create an employee role management system using Kotlin's Enum Class. Each employee role must have a predefined role name and a base salary.
enum class EmployeeRole(val baseSalary: Int) {
    INTERN(15000),
    JUNIOR_DEVELOPER(30000),
    SENIOR_DEVELOPER(60000),
    MANAGER(90000);

    fun displayRoleDetails() {
        println("Role Name      : ${this.name}")
        println("Base Salary    : $baseSalary")
        println("Role Position  : ${this.ordinal}")

        val responsibility = when(this) {
            INTERN -> "Assists the development team"
            JUNIOR_DEVELOPER -> "Develops and maintains basic features"
            SENIOR_DEVELOPER -> "Designs and develops complex features"
            MANAGER -> "Manages the team and project delivery"
        }

        println("Responsibility : $responsibility\n")
    }
}

fun main()
{
    for(employee in EmployeeRole.entries) {
        employee.displayRoleDetails()
    }
}