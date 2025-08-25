package WithStrategyPattern

import WithStrategyPattern.Strategy.DriveStrategy

open class Vehicle(private val driveStrategy: DriveStrategy) {

    fun drive(): Unit {
        driveStrategy.drive()
    }

}