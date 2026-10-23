//Question 7: User Profile Management
class UserProfile(val userName: String) {
    var age: Int = 18
        private set
    val isAdult: Boolean
        get() = age >= 18
    fun updateAge(newAge: Int) {
        if(newAge in 1..120) {
            age = newAge
            println("Age Updated Successfully")
        } else println("Invalid Age!")
    }
}

fun displayUserInfo(user: UserProfile) {
    println("Current Age : ${user.age}")
    println("Is Adult    : ${user.isAdult}\n")
}

fun main()
{
    val user = UserProfile("Rahul")
    println("Username : ${user.userName}")
    displayUserInfo(user)

    user.updateAge(15)
    displayUserInfo(user)

    user.updateAge(150)
    displayUserInfo(user)
}