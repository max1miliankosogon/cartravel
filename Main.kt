class Car(val brand : String, val model : String, val year : Int, var fuelCapacity : Double, var fuelConsumption : Double, var fuelLevel : Double) {
    fun printInfo(){
        println("brand = $brand")
        println("model = $model")
        println("year = $year")
        println("fuel Capacity = $fuelCapacity")
        println("fuel Consumption = $fuelConsumption")
        println("fuel Level = $fuelLevel")


    }
    /*
    fuelCapacity - ємність паливного бака (у літрах)
    fuelConsumption - середнє споживання палива на 100 км (у літрах)
    fuelLevel - кількість пального який на даний момент в баці
    */
    fun drive(distance: Double) : Double {
        var fuelrequired : Double = distance / fuelConsumption // необхідна кількість палива щоб проїхати задану дистанцію

        if (fuelrequired > fuelLevel){ //Перевіряємо чи рівень палива достатній щоб проїхати всю дистанцію
            return -1.0
        }

        // Витрачаємо паливо на задану дистанцію
        fuelLevel -= fuelrequired

        // Повертаємо кількість витраченого палива
        return fuelrequired

    }


    fun refuel(amount: Double){
        var refueled = amount + fuelLevel
        if (refueled > fuelCapacity) {
            fuelLevel = fuelCapacity
        }else{
            fuelLevel = refueled
        }
        println("$refueled")

        }


    }


fun main() {
    val car1 = Car("BMW", "M5", 2021, 68.0, 12.1, 40.5)
    car1.printInfo()
    car1.drive(100.0)
    car1.refuel(35.0)

    val car2 = Car("Mercedes", "E", 2020, 70.0, 10.0, 50.4 )
    car2.printInfo()
    car2.drive(120.0)
    car2.refuel(40.0)

    val car3 = Car("Audi", "A4", 2019, 61.0, 9.0, 50.0)
    car3.printInfo()
    car3.drive(200.0)
    car3.refuel(20.0)

}




