package violation;

public abstract class Vehicle implements Switches {
    private String modelName;
    private int price;

    private int power;
    private int suspensionHeight;

    private boolean engineRunning;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }

    public void startVehicle() {
        System.out.println("Starting vehicle");
    }

    public void stopVehicle() {
        System.out.println("Stopping vehicle");
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

    // SRP: Driving the vehicle is responsibility of Driver class and not Vehicle class so moving it to separate class
    public void driveVehicle() {
        System.out.println("Driving the vehicle");
    }
}
