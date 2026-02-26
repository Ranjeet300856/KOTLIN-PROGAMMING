fun main()
{
    //------Intermediate------//
    //Q8th 
    var strName: String? = "Rahul Suthar"
    var finalName = strName ?: "Guest"
    println(finalName)

    //Q9th
    var x: Int? = 10
    println(x?.toString())

    //Q10th
    var str: String? = null
    println("Length of Name is : ${str?.length ?: 0}")

    //Q11th
    var list: String? = null
    var finalList = list ?: "Empaty List"
    println(finalList)

    //Q12th
    var vname: String? = "Ranjeet Suthar"
    println("Name is ${vname?.uppercase()}")

    //Q13th
    var y: Int? = 5
    // var multi = (y ?: 0) * 5
    var multi = y?.times(5)
    println(multi)

    //Q14th
    var string: String? = null
    var finalString = string ?: "No Name"
    string = finalString
    println(finalString)

    //------Advanced------//
    //Q15th
    print("Enter Name : ")
    var str2: String? = readln()
    if(str2 != null) println("Name : $str2")
    else println("String is Null")

    //Q16th
    var vint: Int? = 10
    println(vint!!)

    print("Enter String : ")
    var str3: String? = readln()
    if(str3 == null) println("Invalid Input")
    else if(str3.isEmpty()) println("String is Empaty!")
    else println("String Length is : ${str3.length}")
}