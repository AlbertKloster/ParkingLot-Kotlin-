package parking

val parking = Parking(20)

fun main() {
    var exit = false
    while (!exit) {
        val strings = readln().trim().split(Regex("\\s+"))
        try {
            when (Commands.getCommand(strings[0])) {
                Commands.PARK -> park(Car(strings[1], strings[2]))
                Commands.LEAVE -> leave(strings[1].toInt())
                Commands.EXIT -> exit = true
            }
        } catch (e: RuntimeException) {
            println(e.message)
        }
    }

}

private fun park(car: Car) {
    parking.park(car)
}

private fun leave(spotNumber: Int) {
    parking.leave(spotNumber)
}
