//Create a Kotlin program to manage a hospital patient record system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("Name : $personName")
        println("Age  : $personAge")
    }
}

open class Patient(
    protected val patientId: Int,
    val diseaseName: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayPatientDetails()
    {
        println("Patient ID   : $patientId")
        println("Disease Name : $diseaseName")
    }
}

class AdmittedPatient(
    val roomNumber: Int,
    private var treatmentCost: Double,
    var isDischarged: Boolean,
    patientId: Int,
    diseaseName: String,
    personName: String,
    personAge: Int
) : Patient(patientId, diseaseName, personName, personAge)
{
    fun displayAdmissionDetails()
    {
        println("\nRoom Number  : $roomNumber")
        println("Treatment Cost   : %.2f".format(treatmentCost))
        println("Discharge Status : ${if(isDischarged) "Discharged" else "Admitted"}")
    }
}

fun main()
{
    val admittedPatient = AdmittedPatient(1001, 500.00, true, 5001, "ABC", "Rahul", 18)
    admittedPatient.displayPersonDetails()
    admittedPatient.displayPatientDetails()
    admittedPatient.displayAdmissionDetails()
}