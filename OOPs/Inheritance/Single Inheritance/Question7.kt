//Create a Kotlin program to manage hospital patient information using Single Inheritance.
open class Patient(val patientName: String, val patientId: Int, var patientAge: Int)
{
    fun displayPatientDetails()
    {
        println("Patient Name : $patientName")
        println("Patient ID   : $patientId")
        println("Patient Age  : $patientAge")
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

fun inputConsultationFee(): Double
{
    while(true)
    {
        print("Enter Consultation Fee : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputAdmitPatient(): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for patient admitted")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}

class MedicalRecord(
    var diseaseName: String,
    var consultationFee: Double,
    var isAdmitted: Boolean,
    patientName: String,
    patientId: Int,
    patientAge: Int
) : Patient(patientName, patientId, patientAge)
{
    fun admitPatient()
    {
        if(isAdmitted) println("Patient is already admitted")
        else
        {
            isAdmitted = true
            println("Patient admitted successfully")
        }
    }

    fun dischargePatient()
    {
        if(isAdmitted)
        {
            isAdmitted = false
            println("Discharge successfully")
        }
        else println("Patient is already discharge")
    }

    fun displayMedicalRecordDetails()
    {
        println("\nDisease Name     : $diseaseName")
        println("Consultation Fee : %.2f".format(consultationFee))
        println("Admit Status     : ${if(isAdmitted) "Patient is admitted" else "Patient is not admitted"}")
    }
}

fun main()
{
    val patientName = inputString("Patient Name")
    val patientId = inputInteger("Patient ID")
    val patientAge = inputInteger("Patient Age")
    val diseaseName = inputString("Disease Name")
    val consultationFee = inputConsultationFee()
    val isAdmitted = inputAdmitPatient()

    val medicalRecord = MedicalRecord(diseaseName, consultationFee, isAdmitted, patientName, patientId, patientAge)
    medicalRecord.displayPatientDetails()
    medicalRecord.admitPatient()
    medicalRecord.displayMedicalRecordDetails()
}