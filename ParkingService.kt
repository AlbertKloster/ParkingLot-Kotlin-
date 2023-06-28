package parking

class ParkingService {
    private var parking = Parking()

    fun printStatus() {
        val spots = parking.getSpots() ?: throw RuntimeException("Sorry, a parking lot has not been created.")
        if (isEmpty(spots)) throw RuntimeException("Parking lot is empty.")
        spots.filter { it.car != null }.map { "${it.number} ${it.car?.registrationNumber} ${it.car?.color}" }.forEach { println(it) }
    }

    private fun isEmpty(spots: List<Spot>): Boolean {
        return !spots.any { it.car != null }
    }

    fun createNewParking(capacity: Int) {
        parking.create(capacity)
        println("Created a parking lot with $capacity spots.")
    }

    fun parkCar(car: Car) {
        val spot = parking.park(car)
        if (spot == null)
            println("Sorry, the parking lot is full.")
        else
            println("${car.color.first().uppercase() + car.color.substring(1).lowercase()} car parked in spot ${spot.number}.")
    }

    fun leaveSpotNumber(spotNumber: Int) {
        val car = parking.leave(spotNumber)
        if (car == null)
            println("There is no car in spot $spotNumber.")
        else
            println("Spot $spotNumber is free.")
    }
}