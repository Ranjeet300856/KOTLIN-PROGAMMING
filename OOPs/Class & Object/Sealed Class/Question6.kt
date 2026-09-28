/*
    Question 6 — Sealed Class with Exhaustive when and Business Logic

    Task:
    Create a Kotlin program using a sealed class named OrderState to represent the state of an e-commerce order.

    The order can have these states:

    Placed — order has been placed and contains the orderId.
    Shipped — order has been shipped and contains the trackingId.
    Delivered — order has been delivered and contains the deliveryDate.
    Cancelled — order has been cancelled and contains a reason. 
*/

sealed class OrderState
class Placed(val orderId: String) : OrderState()
class Shipped(val trackingId: String) : OrderState()
class Delivered(val deliveryDate: String) : OrderState()
class Cancelled(val cancleledResason: String) : OrderState()

fun input(_data: String): String
{
    while(true) {
        print("Enter ${_data} : ")
        val inputData = readln().trim()
        if(inputData.isBlank()) {
            println("Invalid Input! Try Again")
            continue
        }

        return inputData
    }
}

fun getOrderMessage(orderState: OrderState): String {
    when(orderState) {
        is Placed -> return "Order Placed: Order ID =  ${orderState.orderId}"
        is Shipped -> return "Order Shipped: Tracking ID =  ${orderState.trackingId}"
        is Delivered -> return "Order Delivered: Delivery Date =  ${orderState.deliveryDate}"
        is Cancelled -> return "Order Cancelled: Reason = ${orderState.cancleledResason}"
    }
}

fun main()
{
    val orderId = input("Order Id")
    val trackingId = input("Trancking Id")
    val deliveryDate = input("Delivery Date")
    val cancleledResason = input("Reason for Cancelled")

    val placed = Placed(orderId)
    val shipped = Shipped(trackingId)
    val delivered = Delivered(deliveryDate)
    val cancelled = Cancelled(cancleledResason)

    println()
    println(getOrderMessage(placed))
    println(getOrderMessage(shipped))
    println(getOrderMessage(delivered))
    println(getOrderMessage(cancelled))
}