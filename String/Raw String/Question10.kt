/*
    Write a Kotlin program that generates a professional employee salary report using Raw String, 
    custom margin formatting, conditional sections, and string templates. 
*/

fun main()
{
    //Input
    print("Enter Employee Name   : ")
    val employeeName = readln()
    
    print("Enter Department Name : ")
    val departmentName = readln()

    print("Enter Basic Salary    : ")
    val basicSalary = readln().toDoubleOrNull()

    print("Enter Bonus Amount    : ")
    val bonus = readln().toDoubleOrNull()

    print("Enter Tex Percentages : ")
    val taxPercentage = readln().toDoubleOrNull()

    //Validation
    if(employeeName.isBlank() || departmentName.isBlank())
    {
        print("Invalid Employee Name or Department Name")
        return
    }

    if(basicSalary == null || basicSalary < 0 || bonus == null || bonus < 0)
    {
        print("Invalid Basic Salary or Bonus")
        return
    }

    if(taxPercentage == null || taxPercentage < 0 || taxPercentage > 100)
    {
        println("Invalid Tax Percentage")
        return
    }

    //Calculation
    val grossSalary = basicSalary + bonus
    val texAmount = grossSalary * taxPercentage / 100
    val netSalary = grossSalary - texAmount

    //Conditional sections
    val bonusSection = if(bonus > 0) { 
        """
    #Bonus Included
    #Bonus Amount  : ${'$'}${"%.2f".format(bonus)}
    """.trimMargin("#")
    }
    else ""

    //Employee Salary Report
    val report = """
    #========= EMPLOYEE REPORT =========
#
    #Employee Name : $employeeName
    #Department    : $departmentName
#
    #Basic Salary  : ${'$'}${"%.2f".format(basicSalary)}
    #$bonusSection
    #Gross Salary  : ${'$'}${"%.2f".format(grossSalary)}
    #Tax Amount    : ${'$'}${"%.2f".format(texAmount)}
#
    #Net Salary    : ${'$'}${"%.2f".format(netSalary)}
#
    #===================================
    """.trimMargin("#")

    //Output
    print(report)
}