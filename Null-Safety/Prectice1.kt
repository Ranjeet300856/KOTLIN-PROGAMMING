fun main()
{
    //------Basic------//
    //Q1st 
    var str: String? = null
    println(str ?: "No String")

    //Q2nd
    var x: Int? = 10
    println(x ?: 0)

    //Q3rd
    var userName: String? = null
    println(userName?.length ?: 0)

    //Q4th
    var y: Double? = null
    println("Double Value is ${y ?: 1.0}")

    //Q5th
    var z: Boolean? = null
    println(z ?: false)

    //Q6th
    var name: String? = "Ranjeet Suthar"
    if(name != null) println("Length of Name is : ${name.length}") else println("No Name Found")

    //Q7th
    var vname: String? = "Ranjeet"
    println("Length of Name is ${vname!!.length}")
} 