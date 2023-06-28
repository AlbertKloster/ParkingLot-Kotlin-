package parking

val parking = Parking(2)

fun main() {
    parking.init()

    val strings = readln().trim().split(Regex("\\s+"))
    try {
        when (Commands.getCommand(strings[0])) {
            Commands.PARK -> park(Car(strings[1], strings[2]))
            Commands.LEAVE -> leave(strings[1].toInt())
        }
    } catch (e: RuntimeException) {
        println(e.message)
    }

}

private fun park(car: Car) {
    parking.park(car)
}

private fun leave(spotNumber: Int) {
    parking.leave(spotNumber)
}
