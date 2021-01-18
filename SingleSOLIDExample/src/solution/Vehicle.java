package solution;

public class Vehicle {
    private String modelName;
    private int price;

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

    public void startVehicle() {
        System.out.println("Starting vehicle");
    }

    public void stopVehicle() {
        System.out.println("Stopping vehicle");
    }
}
