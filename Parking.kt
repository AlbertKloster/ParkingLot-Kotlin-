package parking

class Parking() {
    private var spots: List<Spot>? = null

    fun create(capacity: Int) {
        spots = List(capacity) { Spot(it + 1, null) }
    }

    fun park(car: Car): Spot? {
        if (spots == null) throw RuntimeException("Sorry, a parking lot has not been created.")
        for (spot in spots!!) {
            if (spot.car == null) {
                spot.car = car
                return spot
            }
        }
        return null
    }

    fun leave(spotNumber: Int): Car? {
        if (spots == null) throw RuntimeException("Sorry, a parking lot has not been created.")
        for (spot in spots!!) {
            if (spot.number == spotNumber) {
                val car = spot.car
                spot.car = null
                return car
            }
        }
        return null
    }

    fun getSpots(): List<Spot>? {
        return spots
    }

    fun getAllCarsByColor(color: String): List<Car?>? {
        if (spots == null) throw RuntimeException("Sorry, a parking lot has not been created.")
        return spots?.filter { it.car?.color?.lowercase() == color.lowercase() }?.map { it.car }
    }

    fun getAllSpotsByColor(color: String): List<Spot?>? {
        if (spots == null) throw RuntimeException("Sorry, a parking lot has not been created.")
        return spots?.filter { it.car?.color?.lowercase() == color.lowercase() }
    }

    fun getAllSpotsByReg(reg: String): List<Spot?>? {
        if (spots == null) throw RuntimeException("Sorry, a parking lot has not been created.")
        return spots?.filter { it.car?.registrationNumber == reg }
    }
}