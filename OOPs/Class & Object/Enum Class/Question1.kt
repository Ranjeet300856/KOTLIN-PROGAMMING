//Create a traffic light system using Kotlin's Enum Class. Each traffic light should have a predefined color and an associated action.
enum class TrafficLight(private val description: String) {
    RED("Red Traffic Light"),
    YELLOW("Yellow Traffic Light"),
    GREEN("Green Traffic Light");

    fun showAction() {
        println("Traffic Light : ${this.name}")
        println("Description   : $description")
        
        val action = when(this) {
            RED -> "Stop"
            YELLOW -> "Wait"
            GREEN -> "Go"
        }

        println("Action        : $action\n")
    }
}

fun main() 
{
    for(light in TrafficLight.entries) {
        light.showAction()
    }
}