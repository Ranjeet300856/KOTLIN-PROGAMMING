/*
    Question 7 — Sealed Class with State Transitions

    Task:
    Create a Kotlin program using a sealed class named OrderState to model the lifecycle of an order.

    An order can move through these states:

    Created — order is created and contains orderId.
    Paid — payment is completed and contains paymentId.
    Shipped — order is shipped and contains trackingId.
    Delivered — order is delivered and contains deliveryDate.
    Cancelled — order is cancelled and contains a reason. 
*/

sealed class OrderState
class Created(val orderId: String) : OrderState()
class Paid(val paymentId: String) : OrderState()
class Shipped(val trackingId: String) : OrderState()
class Delivered(val deliveryDate: String) : OrderState()
class Cancelled(val reason: String) : OrderState()

fun getNextState(
    state: OrderState,
    paymentId: String = "",
    trackingId: String = "",
    deliveryDate: String = "",
    reason: String = ""
): OrderState {

    return when (state) {
        is Created -> Paid(paymentId)
        is Paid -> Shipped(trackingId)
        is Shipped -> Delivered(deliveryDate)
        is Delivered -> Delivered(state.deliveryDate)
        is Cancelled -> Cancelled(state.reason)
    }
}


fun main() {
    val created = Created("12345")
    val paid = Paid("ABCD12345")
    val shipped = Shipped("12345ABCDE00")
    val delivered = Delivered("01 Feb 2026")
    val cancelled = Cancelled("Not Interested")

    val nextState1 = getNextState(
        created,
        paymentId = paid.paymentId
    )
    println("Created -> Paid")
    println("Order ID: ${created.orderId}")
    println("Payment ID: ${(nextState1 as Paid).paymentId}")


    val nextState2 = getNextState(
        paid,
        trackingId = shipped.trackingId
    )
    println("\nPaid -> Shipped")
    println("Payment ID: ${paid.paymentId}")
    println("Tracking ID: ${(nextState2 as Shipped).trackingId}")


    val nextState3 = getNextState(
        shipped,
        deliveryDate = delivered.deliveryDate
    )
    println("\nShipped -> Delivered")
    println("Tracking ID: ${shipped.trackingId}")
    println("Delivery Date: ${(nextState3 as Delivered).deliveryDate}")


    val nextState4 = getNextState(delivered)
    println("\nDelivered -> Delivered")
    println("Delivery Date: ${(nextState4 as Delivered).deliveryDate}")


    val nextState5 = getNextState(cancelled)
    println("\nCancelled -> Cancelled")
    println("Reason: ${(nextState5 as Cancelled).reason}")
}
