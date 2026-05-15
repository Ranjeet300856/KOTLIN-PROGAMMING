package Bank.calculation
fun calculateSimpleInterest(p: Double, r: Double, t: Double): Double = (p * r * t) / 100
fun calculateFinalAmount(p: Double, r: Double, t: Double): Double = p + (p * r * t) / 100