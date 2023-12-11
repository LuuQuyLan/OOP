public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor1.
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * get info.
     */
    @Override
    public String getInfo() {
        String res = "Motor Bike:" + "\n\tBrand: " + brand + "\n\tModel: " + model
                + "\n\tRegistration Number: " + registrationNumber
                + "\n\tHas Side Car: " + hasSidecar
                + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
        return res;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
