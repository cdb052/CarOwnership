public class CarOwner {
// Stores the car owner's name.
    private String name;
// Stores the car owners address.
    private String address;
// Creates a car owner with default values.
    public CarOwner() {
        name = "";
        address = "";
}
// Creates a car owner with a specified name and address.
    public CarOwner(String name, String address){
        this.name = name;
        this.address = address;
}
// Returns the car owner's name.
    public String getName() {
        return name;
}
// Returns the car owner's address.
    public String getAddress() {
        return address;
}
// Updates the car owner's name.
    public void setName(String name) {
        this.name = name;
}
// Updates the car owner's address.
    public void setAddress(String address) {
        this.address = address;
}
// Returns the car owner's name and address as text.
    @Override
    public String toString(){
        return name + ", " + address;

}
}
