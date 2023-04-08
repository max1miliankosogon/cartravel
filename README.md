# cartravel
Program about traveling by car

This is a program that simulates the operation of a car. It contains a Car class with the fields brand, model, year, fuelCapacity, fuelConsumption, and fuelLevel, which represent the car brand, model, year, fuel tank capacity, average fuel consumption, and fuel level in the tank, respectively.

The class contains printInfo, drive and refuel methods. The printInfo method displays information about the car on the screen. The drive method takes the distance to be driven and returns the amount of fuel that will be used for that distance. If there is not enough fuel in the tank to travel the specified distance, the method returns -1.0. The refuel method adds a specified amount of fuel to the tank. If the amount of fuel to be added exceeds the capacity of the tank, the method adds only as much fuel as possible to the tank.

In the main function, three objects of the Car class are created with different parameters and the printInfo, drive and refuel methods are executed for each of them. After execution, the program displays information about each car and the amount of fuel that was spent and added to the tank after driving the specified distance and refueling the car.
