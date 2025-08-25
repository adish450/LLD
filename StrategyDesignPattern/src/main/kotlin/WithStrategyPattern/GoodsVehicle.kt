package WithStrategyPattern

import WithStrategyPattern.Strategy.NormalDriveStrategy

class GoodsVehicle: Vehicle(NormalDriveStrategy()) {

}