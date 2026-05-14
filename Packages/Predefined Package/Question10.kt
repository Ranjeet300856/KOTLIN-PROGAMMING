//Question 10 — Mini User Registration System Using Predefined Packages

//Input FullName
fun inputFullName(): String
{
    while(true)
    {
        print("Enter Full Name : ")
        val name = readln().trim()

        //Validation
        if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() })
        {
            println("Invalid Full Name! Try Again")
            continue
        }

        return name
    }
}

//Input Username
fun inputUsername(username: Array<String>): String
{
    while(true)
    {
        print("Enter Username : ")
        val uname = readln().trim()

        //Validation
        var isValid = true
        if(uname.isBlank() || uname.length < 5 || uname.length > 15 || uname.contains(" ") || !uname[0].isLetter())
            isValid = false

        //Validate letters, digits, and underscore
        for(ch in uname)
        {
            if(ch.isLetter()) continue
            else if(ch.isDigit()) continue
            else if(ch == '_') continue
            else isValid = false
        }

        if(!isValid)
        {
            println("Invalid Username! Try Again")
            continue
        }

        return uname
    }

}

//Input Email Address
fun inputEmailAddress(): String
{
    while(true)
    {
        print("Enter Email Address : ")
        val email = readln().trim()

        //Validation
        var isValid = true
        var countAt = 0

        if(email.isBlank()) isValid = false
        for(ch in email) if(ch == '@') countAt++

        if(countAt != 1) isValid = false
        if(email.substringAfter("@").count{ it == '.' } != 1) isValid = false
        if(email.contains(" ")) isValid = false

        if(!isValid)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return email
    }
}

//Input Password
fun inputPassword(): String
{
    while(true)
    {
        print("Enter Password : ")
        val password = readln().trim()

        //Validation
        var isValid = true

        if(password.length < 8) isValid = false
        var hasUpper = false
        var hasLower = false
        var hasDigit = false
        var hasSpecialChar = false

        for(ch in password)
        {
            if(ch.isUpperCase()) hasUpper = true
            else if(ch.isLowerCase()) hasLower = true
            else if(ch.isDigit()) hasDigit = true
            else hasSpecialChar = true
        }

        if(!(hasUpper && hasLower && hasDigit && hasSpecialChar)) isValid = false

        if(!isValid)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return password
    }
}

//Input Function
fun inputData(fullName: Array<String>, username: Array<String>, email: Array<String>, password: Array<String>)
{
    for(i in fullName.indices) //Loop Range = fullName.length because all array stored same length
    {
        println("Enter User${i + 1} Data: ")
        fullName[i] = inputFullName()
        username[i] = inputUsername(username)
        email[i] = inputEmailAddress()
        password[i] = inputPassword()

        println()
    }
}

//Output Function
fun output(fullName: Array<String>, username: Array<String>, email: Array<String>, password: Array<String>)
{
    println("\n-------- User Registration Report --------\n")

    for(i in fullName.indices)
    {
        println(fullName[i])
        println("Username      : ${username[i]}")
        println("Email Address : ${email[i]}")
        println("Password      : ${password[i]}")
        println()
    }
    println()

    println("\nUppercase Usernames: ")
    for(name in username)
        println(name.uppercase())
    
    println("\nLowercase Emails: ")
    for(lowrEmail in email)
        println(lowrEmail.lowercase())
}

//Search User Function
fun searchUser(username: Array<String>)
{
    print("Search Username : ")
    val name = readln().trim().lowercase()

    var isFound = false
    for(uname in username)
    {
        if(uname.lowercase() == name)
        {
            println("User Found")
            isFound = true
            break
        }
    }

    if(!isFound) println("No user found")
}

//Main Function
fun main()
{
    //Array Creation
    val fullName = Array(5) { "" }
    val username = Array(5) { "" }
    val emailAddress = Array(5) { "" }
    val password = Array(5) { "" }

    inputData(fullName, username, emailAddress, password)
    output(fullName, username, emailAddress, password)
    searchUser(username)
}