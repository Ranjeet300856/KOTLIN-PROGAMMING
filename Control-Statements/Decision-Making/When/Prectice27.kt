fun main()
{
    //Q27th
    /*
    Write a Kotlin program that takes a user role as input
    and assigns access level using when as expression.

    Rules:
    If role is "admin", assign "Full Access".
    If role is "manager", assign "Limited Access".
    If role is "user", assign "Basic Access".
    Otherwise, assign "Guest Access".

    The role check should be case-insensitive.
    Store the result in a variable and print it.
     */

     print("Enter your Role : ")
     var role = readln().trim().lowercase()
     if(role.isBlank())
     {
        println("Invalid Input or Input is Empty!")
        return
     }

     var checkRole = when
     {
        role == "admin" -> "Full Access"
        role == "manager" -> "Limited Access"
        role == "user" -> "Basic Access"
        else -> "Guest Access"
     }

     println(checkRole)
}