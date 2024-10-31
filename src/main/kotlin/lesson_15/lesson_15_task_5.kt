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
        if (amountCargo > 0) println("Загрузили $amountCargo тонн груза в $name")
    }

    fun unload(amountCargo: Int, name: String) {
        if (amountCargo > 0) println("Разгрузили $amountCargo тонн груза из $name")
    }
}

interface PassengerMovement {
    fun seatPassenger(amountPassenger: Int, name: String) {
        if (amountPassenger > 0) println("Зашли $amountPassenger пассажира в $name")
    }

    fun dropOffPassenger(amountPassenger: Int, name: String) {
        if (amountPassenger > 0) println("Вышли $amountPassenger пассажира из $name")
    }
}

class Truck(
    val name: String,
    numberOfPassengers: Int,
    weightOfCargo: Int,
) : MovementCars, CargoMovement, PassengerMovement {
    private val maxPassengers = 1
    private val maxCargo = 2
    var maxNumberOfPassengers = numberOfPassengers
    var maxTransferCargo = weightOfCargo

    init {
        this.maxNumberOfPassengers = if (maxNumberOfPassengers > maxPassengers) maxPassengers else numberOfPassengers
        this.maxTransferCargo = if (maxTransferCargo > maxCargo) maxCargo else weightOfCargo
    }
}

class PassengerCar(
    val name: String,
    numberOfPassengers: Int,
) : MovementCars, PassengerMovement {
    private val maxPassengers = 3
    var maxNumberOfPassengers: Int = numberOfPassengers

    init {
        this.maxNumberOfPassengers = if (maxNumberOfPassengers > maxPassengers) maxPassengers else numberOfPassengers
    }
}

fun main() {

    var passengersNeedTransferred = 6
    var cargoNeedTransferred = 2


    do {
        val passengerCar = PassengerCar("Легковой автомобиль", passengersNeedTransferred)

        passengerCar.come(passengerCar.name)

        passengerCar.seatPassenger(passengerCar.maxNumberOfPassengers, passengerCar.name)
        passengersNeedTransferred -= passengerCar.maxNumberOfPassengers

        val truck = Truck("Грузовик", passengersNeedTransferred, cargoNeedTransferred)
        truck.come(truck.name)

        truck.seatPassenger(truck.maxNumberOfPassengers, truck.name)
        passengersNeedTransferred -= truck.maxNumberOfPassengers

        truck.download(truck.maxTransferCargo, truck.name)
        cargoNeedTransferred -= truck.maxTransferCargo

        passengerCar.leave(passengerCar.name)
        truck.leave(truck.name)

        passengerCar.comeToEnd(passengerCar.name)
        truck.comeToEnd(truck.name)

        passengerCar.dropOffPassenger(passengerCar.maxNumberOfPassengers, passengerCar.name)
        truck.dropOffPassenger(truck.maxNumberOfPassengers, truck.name)
        truck.unload(truck.maxTransferCargo, truck.name)

        println()

    } while (passengersNeedTransferred > 0 || cargoNeedTransferred > 0)

    println("Перемещение завершено.")

}