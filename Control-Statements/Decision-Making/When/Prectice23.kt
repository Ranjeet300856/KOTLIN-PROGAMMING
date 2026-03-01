fun main()
{
    //Q23th
    /*
    Write a Kotlin program that takes username and password as input
    and assigns login status using when as expression.

    Rules:
    If username is blank, assign "Invalid Username".
    If password length is less than 6, assign "Weak Password".
    If username is "admin" and password is "123456",
    assign "Login Success".
    Otherwise, assign "Login Failed".

    Store the result in a variable and print it.
     */

     print("Enter UserName : ")
     var username = readln().trim().lowercase()
     print("Enter Password : ")
     var password = readln().trim()

     var status = when
     {
        username.isBlank() -> "Invalid UserName!"
        password.length < 6 -> "Weak Password!"
        username == "admin" && password == "123456" -> "Login Success"
        else -> "Login Failed!"
     }

     println(status)
}