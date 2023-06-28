package parking

fun main() {
    val parkingService = ParkingService()
    var exit = false
    while (!exit) {
        val strings = readln().trim().split(Regex("\\s+"))
        try {
            when (Commands.getCommand(strings[0])) {
                Commands.CREATE -> parkingService.createNewParking(strings[1].toInt())
                Commands.EXIT -> exit = true
                Commands.LEAVE -> parkingService.leaveSpotNumber(strings[1].toInt())
                Commands.PARK -> parkingService.parkCar(Car(strings[1], strings[2]))
                Commands.REG_BY_COLOR -> parkingService.getRegByColor(strings[1])
                Commands.SPOT_BY_COLOR -> parkingService.getSpotByColor(strings[1])
                Commands.SPOT_BY_REG -> parkingService.getSpotByReg(strings[1])
                Commands.STATUS -> parkingService.printStatus()
            }
        } catch (e: RuntimeException) {
            println(e.message)
        }
    }

}


