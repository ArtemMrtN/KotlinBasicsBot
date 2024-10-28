package org.example.lesson_15

interface CargoMovement {
    fun download(amountCargo: Int) {
        println("Загрузили $amountCargo тонн груза")
    }

    fun unload(amountCargo: Int) {
        println("Разгрузили $amountCargo тонн груза")
    }
}

interface PassengerMovement {
    fun seatPassenger(amountPassenger: Int) {
        println("Зашли $amountPassenger пассажира")
    }

    fun dropOffPassenger(amountPassenger: Int) {
        println("Вышли $amountPassenger пассажира")
    }
}

class Truck(
    val numberOfPassengers: Int,
    val weightOfCargo: Int,
) : CargoMovement, PassengerMovement

class PassengerCar(
    val numberOfPassengers: Int,
) : PassengerMovement

fun main() {

    var passengersNeedTransferred = 6
    var cargoNeedTransferred = 2

    val passengerCar = PassengerCar(3)
    val truck = Truck(1, 2)

    do {

        val passengersToSeat = minOf(passengersNeedTransferred, passengerCar.numberOfPassengers + truck.numberOfPassengers)
        val fromCar = minOf(passengerCar.numberOfPassengers, passengersToSeat)
        val fromTruck = passengersToSeat - fromCar

        if (fromCar > 0) {
            passengerCar.seatPassenger(fromCar)
            passengersNeedTransferred -= fromCar
        }
        if (fromTruck > 0) {
            truck.seatPassenger(fromTruck)
            passengersNeedTransferred -= fromTruck
        }

        val cargoToTransfer = minOf(cargoNeedTransferred, truck.weightOfCargo)
        if (cargoToTransfer > 0) {
            truck.download(cargoToTransfer)
            cargoNeedTransferred -= cargoToTransfer
        }

        if (fromCar > 0) {
            passengerCar.dropOffPassenger(fromCar)
        }
        if (fromTruck > 0) {
            truck.dropOffPassenger(fromTruck)
        }

        if (cargoToTransfer > 0) {
            truck.unload(cargoToTransfer)
        }
        println()

    } while (passengersNeedTransferred > 0 || cargoNeedTransferred > 0)

    println("Перемещение завершено.")

}