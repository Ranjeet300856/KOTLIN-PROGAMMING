//Create a Kotlin program using Abstraction through an Interface to simulate exporting data into different file formats.
interface FileExporter {
    fun export(_data: String): Boolean
    fun showFormat() {
        print("Export Format: ")
    }
}

class PDFExporter : FileExporter {
    override fun showFormat() {
        super.showFormat()
        println("PDF")
    }

    override fun export(_data: String): Boolean {
        if(_data.isBlank()) return false
        else {
            showFormat()
            println(_data)
            println("PDF export successful")
            return true
        }
    }
}

class CSVExporter : FileExporter {
    override fun showFormat() {
        super.showFormat()
        println("CSV")
    }

    override fun export(_data: String): Boolean {
        if(_data.isBlank()) return false
        else {
            showFormat()
            println(_data)
            println("CSV export successful")
            return true
        }
    }
}

fun main()
{
    val pdfExporter = PDFExporter()
    val csvExporter = CSVExporter()

    val pdfExporterResult = pdfExporter.export("PDF Data")
    if(!pdfExporterResult) println("Invalid PDF Data")

    println()
    val csvExporterResult = csvExporter.export("CSV Data")
    if(!csvExporterResult) println("Invalid CSV Data")
}