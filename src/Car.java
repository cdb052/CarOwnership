public class Car {
// Stores the make.
    private String make;
// Stores the model.
    private String model;
// Stores the vehicle's year.
    private int year;
// Stores the vehicle's price.
    private double price;
// Stores the vehicle's owner.
    private CarOwner owner;
// Creates a vehicle with default values.
    public Car() {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
        owner = new CarOwner();
}
// Creates a vehicle with specific values.
    public Car(String make, String model, int year, double price, CarOwner owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.owner = owner;

}
// Returns the vehicle's make.
    public String getMake(){
        return make;
}
// Returns the vehicle's model.
    public String getModel(){
        return model;
}
// Returns the vehicle's year.
    public int getYear (){
        return year;
}
// Returns the vehicle's price.
    public double getPrice(){
        return price;
}
// Returns the vehicle's owner.
    public CarOwner getOwner() {
        return owner;
}
// Updates the vehicle's make.
    public void setMake(String make) {
        this.make = make;
}
// Updates the vehicle's model.
    public void setModel(String model) {
        this.model = model;
}
// Updates the vehicle's year.
    public void setYear(int year) {
        this.year = year;
}
// Updates the vehicle's price.
    public void setPrice(double price) {
        this.price = price;
}
// Updates the vehicle's owner.
    public void setOwner(CarOwner owner) {
        this.owner = owner;
}
// Returns the vehicle's information as text.
    @Override
    public String toString(){
        return "Make: " + make +
                ", Model: " + model +
                ", Year: " + year +
                ", Price: $" + String.format("%,.2f", price) +
                ", Owner: " + owner;
}
}