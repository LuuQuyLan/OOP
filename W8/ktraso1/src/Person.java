import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * constructor1.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add vehicle.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).registrationNumber == registrationNumber) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * get vehicles' info.
     */
    public String getVehiclesInfo() {
        String res = name + " ";
        if (vehicleList.isEmpty()) {
            res = res + "has no vehicle!";
        } else {
            res = res + "has:\n\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                res = res + vehicleList.get(i).getInfo();
            }
        }
        return res;
    }

    /**
     * getter and setter for each attribute.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

