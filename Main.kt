package parking

fun main() {
    val parkingService = ParkingService()
    var exit = false
    while (!exit) {
        val strings = readln().trim().split(Regex("\\s+"))
        try {
            when (Commands.getCommand(strings[0])) {
                Commands.PARK -> parkingService.parkCar(Car(strings[1], strings[2]))
                Commands.LEAVE -> parkingService.leaveSpotNumber(strings[1].toInt())
                Commands.CREATE -> parkingService.createNewParking(strings[1].toInt())
                Commands.STATUS -> parkingService.printStatus()
                Commands.EXIT -> exit = true
            }
        } catch (e: RuntimeException) {
            println(e.message)
        }
    }

}


