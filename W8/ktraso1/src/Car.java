public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor1.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get info.
     */
    public String getInfo() {
        String res = "Car:" + "\n\tBrand: " + brand + "\n\tModel: " + model
                + "\n\tRegistration Number: " + registrationNumber
                + "\n\tNumber of Doors: " + numberOfDoors
                + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
        return res;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
