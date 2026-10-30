import java.util.ArrayList;
public class UseCar {

// Tests the Car and CarOwner classes.
    public static void main(String[] args) {

// Creates owners.
        CarOwner owner1 = new CarOwner("John Smith", "Bloomington, In");
        CarOwner owner2 = new CarOwner("Mike Johnson", "Indianapolis, In");

// Creates vehicle's.
        Car car1 = new Car("Chevrolet", "Corvette", 2023, 130000.00, owner1);
        Car car2 = new Car("Chevrolet", "Silverado", 2024, 70000.00, owner1);
        Car car3 = new Car("Dodge", "Charger", 2022, 90000.00, owner2);

// Stores the cars in a ArrayList
        ArrayList<Car> cars = new ArrayList<>();

// Adds all three cars to the list.
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

// Displays the information for each vehicle.
        for (Car car : cars){
        System.out.println(car);
        System.out.println();
}
}
}