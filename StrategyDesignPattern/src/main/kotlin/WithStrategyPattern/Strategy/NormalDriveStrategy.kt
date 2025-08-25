package WithStrategyPattern.Strategy

class NormalDriveStrategy : DriveStrategy {
    override fun drive() {
        println("Normal drive capability")
    }
}