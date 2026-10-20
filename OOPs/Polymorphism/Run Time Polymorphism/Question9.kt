//Question 9: Data Export System
abstract class DataExporter(val fileName: String) {
    abstract fun exportData(_data: String): Boolean
    open fun validateData(_data: String): Boolean {
        if(_data.isBlank()) return false
        else return true
    }
}

class CSVExporter(fileName: String) : DataExporter(fileName) {
    override fun exportData(_data: String): Boolean {
        val validation = super.validateData(_data)
        if(validation) {
            println("CSV export successful : $fileName")
            return true
        } else {
            println("CSV export failed: Invalid data")
            return false
        }
    }
}

class JSONExporter(fileName: String) : DataExporter(fileName) {
    override fun exportData(_data: String): Boolean {
        val validation = super.validateData(_data)
        if(validation) {
            println("JSON export successful : $fileName")
            return true
        } else {
            println("JSON export failed: Invalid data")
            return false
        }
    }
}

class XMLExporter(fileName: String) : DataExporter(fileName) {
    override fun exportData(_data: String): Boolean {
        val validation = super.validateData(_data)
        if(validation) {
            println("XML export successful : $fileName")
            return true
        } else {
            println("XML export failed: Invalid data")
            return false
        }
    }
}

fun exportAll(exporters: List<DataExporter>, _data: String) {
    for(exporter in exporters) {
        val result = exporter.exportData(_data)
        if(result) {
            println("Exporter Successfully")
        } else {
            println("Invalid Data")
        }
        println()
    }
}

fun main()
{
    val cvsExporter = CSVExporter("students.csv")
    val jsonExporter = JSONExporter("students.json")
    val xmlExporter = XMLExporter("students.xml")

    val exporters = listOf(cvsExporter, jsonExporter, xmlExporter)
    exportAll(exporters, "Exporter Data")
    exportAll(exporters, "   ")
}