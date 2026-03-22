//Q5th
/*
    Write a Kotlin program that checks whether a person is eligible for a loan.
    Inputs:
    age (Int)
    salary (Int)
    hasJob (String: "yes" / "no")

    Rules:
    If age is less than 18 → print "Not Eligible"
    Otherwise:
    If hasJob is "yes":
    If salary ≥ 25000:
    If salary ≥ 50000 → print "Eligible for Premium Loan"
    Else → print "Eligible for Standard Loan"
    Else:
    If salary ≥ 50000 → print "Eligible (High Income Exception)"
    Else → print "Not Eligible"

    Output:
    Print the correct eligibility message
*/

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    print("Enter Salary : ")
    val salary = readln().trim().toIntOrNull()
    print("Has Job ? Enter Yes Or No : ")
    val hasJob = readln().trim().lowercase()
    if(age == null || salary == null)
    {
        println("Invalid Input")
        return
    }

    if(hasJob != "yes" && hasJob != "no")
    {
        println("Invalid input")
        return
    }

    if(age < 18)
    {
        println("Not Eligible")
    }
    else
    {
        if(hasJob == "yes")
        {
            if(salary >= 25000)
            {
                if(salary >= 50000)
                {
                    println("Eligible for Premium Loan")
                }
                else
                {
                    println("Eligible for Standard Loan")
                }
            }
            else
            {
                println("Low Salary - Not Eligible")
            } 
        }
        else
        {
            if(salary >= 50000)
            {
                println("Eligible (High Income Exception)")
            }
            else
            {
                println("Not Eligible")
            }
        }
    }
}