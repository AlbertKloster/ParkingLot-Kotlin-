package parking

class Parking(capacity: Int) {
    private val spots = List(capacity) { Spot(it + 1, null) }

    fun park(car: Car) {
        for (spot in spots) {
            if (spot.car == null) {
                spot.car = car
                println("${car.color.first().uppercase() + car.color.substring(1).lowercase()} car parked in spot ${spot.number}.")
                return
            }
        }
        println("Sorry, the parking lot is full.")
    }

    fun leave(spotNumber: Int) {
        for (spot in spots) {
            if (spot.number == spotNumber) {
                spot.car ?: throw RuntimeException("There is no car in spot $spotNumber.")
                spot.car = null
                println("Spot ${spot.number} is free.")
            }
        }
    }
}