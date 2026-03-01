fun main()
{
    //Q16th
    /*
     Write a Kotlin program that takes username and password as input
     and validates the login using when without argument.

     Rules:
     If username is blank, print "Invalid Username".
     If password length is less than 6, print "Weak Password".
     If username is "admin" and password is "123456",
     print "Login Success".
     Otherwise, print "Login Failed".

    Use when without argument for decision making.
     */

     print("Enter User Name : ")
     var username = readln().trim().lowercase()
     print("Enter Password : ")
     var password = readln()

     when
     {
        username.isBlank() -> println("Invalid User Name!")
        password.length < 6 ->  println("Weak Password!")
        username == "admin" && password == "123456" -> println("Login Success")
        else -> println("Login Failed!")
     }
}