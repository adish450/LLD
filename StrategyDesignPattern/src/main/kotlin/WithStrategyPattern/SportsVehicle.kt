package WithStrategyPattern

import WithStrategyPattern.Strategy.SpecialDriveStrategy

class SportsVehicle: Vehicle(SpecialDriveStrategy()) {
}