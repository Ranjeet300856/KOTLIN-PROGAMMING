package course.discount
fun calculateDiscount(fee: Double): Double
{
    val discountPct = when
    {
        fee >= 50000 -> 20
        fee >= 30000 -> 10
        else -> 5
    }

    return fee * discountPct / 100
}