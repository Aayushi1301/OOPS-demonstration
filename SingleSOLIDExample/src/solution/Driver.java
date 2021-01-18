package solution;

public class Driver {
    String driverName;
    private Car car;

    public Driver(final Car car){
        this.car = car;
    }
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void driveVehicle() {
        System.out.println("Driving the vehicle");
    }
}
