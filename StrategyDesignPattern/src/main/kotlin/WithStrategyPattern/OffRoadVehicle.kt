package WithStrategyPattern

import WithStrategyPattern.Strategy.XyxDriveStrategy

class OffRoadVehicle: Vehicle(XyxDriveStrategy()) {
}