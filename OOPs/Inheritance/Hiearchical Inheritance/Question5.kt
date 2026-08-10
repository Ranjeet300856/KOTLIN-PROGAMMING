//Create a Kotlin program to demonstrate Hierarchical Inheritance for a hospital management system.
open class Person(val name: String, val age: Int, val contactNumber: Long)
{
    fun displayPersonInfo()
    {
        println("Person Name         : $name")
        println("Person Age          : $age")
        println("Contact Number      : $contactNumber")
    }    
}

class Doctor(
    val specialization: String,
    val consultationFee: Double,
    name: String,
    age: Int,
    contactNumber: Long
) : Person(name, age, contactNumber)
{
    fun displayDoctorInfo()
    {
        println("\nDoctor Info:")
        displayPersonInfo()
        println("Specialization      : $specialization")
        println("Consultation Fee    : %.2f".format(consultationFee))
    }
}

class Patient(
    val disease: String,
    val isAdmitted: Boolean,
    name: String,
    age: Int,
    contactNumber: Long
) : Person(name, age, contactNumber)
{
    fun displayPatientInfo()
    {
        println("\nPatient Info:")
        displayPersonInfo()
        println("Disease             : $disease")
        println("Patient is Admitted : ${if(isAdmitted) "YES" else "NO"}")
    }
}

class Nurse(
    val shiftHours: Int,
    val department: String,
    name: String,
    age: Int,
    contactNumber: Long
) : Person(name, age, contactNumber)
{
    fun displayNurseInfo()
    {
        println("\nNurse Info:")
        displayPersonInfo()
        println("Shift Hourse        : $shiftHours")
        println("Department          : $department")
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputLong(text: String): Long
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toLongOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}

fun main()
{
    //Doctor
    val doctorName = inputString("Doctor Name")
    val doctorAge = inputInteger("Doctor Age")
    val doctorMN = inputLong("Contact Number")
    val specialization = inputString("Spacialization")
    val consultationFee = inputDouble("Consultation Fee")
    val doctor = Doctor(specialization, consultationFee, doctorName, doctorAge, doctorMN)

    //Patient
    println()
    val patientName = inputString("Patient Name")
    val patientAge = inputInteger("Patient Age")
    val patientMN = inputLong("Contact Number")
    val disease = inputString("Disease")
    val isAdmitted = inputBoolean("Yes or No for is Admitted")
    val patient = Patient(disease, isAdmitted, patientName, patientAge, patientMN)

    //Nurse
    println()
    val nurseName = inputString("Nurse Name")
    val nurseAge = inputInteger("Nurse Age")
    val nurseMN = inputLong("Contact Number")
    val shiftHours = inputInteger("Shift Hours")
    val department = inputString("Department")
    val nurse = Nurse(shiftHours, department, nurseName, nurseAge, nurseMN)

    //Output
    doctor.displayDoctorInfo()
    patient.displayPatientInfo()
    nurse.displayNurseInfo()
}