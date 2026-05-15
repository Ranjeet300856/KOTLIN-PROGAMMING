package Bank.validation
fun validateAccountHolderName(name: String): Boolean = !(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()})
fun validateDepositAmount(amount: Double?): Boolean = !((amount == null) || amount <= 0)