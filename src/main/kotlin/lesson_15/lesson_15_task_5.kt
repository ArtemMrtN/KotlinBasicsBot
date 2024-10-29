package org.example.lesson_15

interface MovementCars {
    fun come(name: String) {
        println("Приехал $name")
    }

    fun leave(name: String) {
        println("Уехал $name")
    }

    fun comeToEnd(name: String) {
        println("$name приехал в точку назначения")
    }
}

interface CargoMovement {
    fun download(amountCargo: Int, name: String) {
        println("Загрузили $amountCargo тонн груза в $name")
    }

    fun unload(amountCargo: Int, name: String) {
        println("Разгрузили $amountCargo тонн груза из $name")
    }
}

interface PassengerMovement {
    fun seatPassenger(amountPassenger: Int, name: String) {
        println("Зашли $amountPassenger пассажира в $name")
    }

    fun dropOffPassenger(amountPassenger: Int, name: String) {
        println("Вышли $amountPassenger пассажира из $name")
    }
}

class Truck(
    val name: String,
    val numberOfPassengers: Int,
    val weightOfCargo: Int,
) : MovementCars, CargoMovement, PassengerMovement {
    fun seatPassengers(fromTruck: Int) {
        if (fromTruck > 0) {
            seatPassenger(fromTruck, name)
        }
    }

    fun dropOffPassengers(fromTruck: Int) {
        if (fromTruck > 0) {
            dropOffPassenger(fromTruck, name)
        }
    }

    fun transferCargo(cargoToTransfer: Int) {
        if (cargoToTransfer > 0) {
            download(cargoToTransfer, name)
        }
    }

    fun dropOffCargo(cargoToTransfer: Int) {
        if (cargoToTransfer > 0) {
            unload(cargoToTransfer, name)
        }
    }
}

class PassengerCar(
    val name: String,
    val numberOfPassengers: Int,
) : MovementCars, PassengerMovement {
    fun seatPassengers(fromCar: Int) {
        if (fromCar > 0) {
            seatPassenger(fromCar, name)
        }
    }

    fun dropOffPassengers(fromCar: Int) {
        if (fromCar > 0) {
            dropOffPassenger(fromCar, name)
        }
    }
}

fun main() {

    var passengersNeedTransferred = 6
    var cargoNeedTransferred = 2

    val passengerCar = PassengerCar("Легковой автомобиль", 3)
    val truck = Truck("Грузовик", 1, 2)

    do {

        passengerCar.come(passengerCar.name)
        truck.come(truck.name)

        val passengersToSeat =
            minOf(passengersNeedTransferred, passengerCar.numberOfPassengers + truck.numberOfPassengers)
        val fromCar = minOf(passengerCar.numberOfPassengers, passengersToSeat)
        val fromTruck = passengersToSeat - fromCar

        passengerCar.seatPassengers(fromCar)
        passengersNeedTransferred -= fromCar

        truck.seatPassengers(fromTruck)
        passengersNeedTransferred -= fromTruck

        val cargoToTransfer = minOf(cargoNeedTransferred, truck.weightOfCargo)

        truck.transferCargo(cargoToTransfer)
        cargoNeedTransferred -= cargoToTransfer

        passengerCar.leave(passengerCar.name)
        truck.leave(truck.name)

        passengerCar.comeToEnd(passengerCar.name)
        truck.comeToEnd(truck.name)

        passengerCar.dropOffPassengers(fromCar)
        truck.dropOffPassengers(fromTruck)
        truck.dropOffCargo(cargoToTransfer)

        println()

    } while (passengersNeedTransferred > 0 || cargoNeedTransferred > 0)

    println("Перемещение завершено.")

}