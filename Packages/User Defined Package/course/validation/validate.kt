package course.validation
fun validateStudentName(name: String): Boolean = !((name.isBlank()) || !(name.all { it.isLetter() || it.isWhitespace() }))
fun validateCourseName(cname: String): Boolean = !(cname.isBlank() || cname.length < 3)
fun validateCourseFee(fee: Double?): Boolean = !(fee == null || fee <= 0)