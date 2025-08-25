package WithStrategyPattern.Strategy

class SpecialDriveStrategy: DriveStrategy {
    override fun drive() {
        println("Special drive capability")
    }
}