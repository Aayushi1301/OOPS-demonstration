package violation;

public class Driver {
    private String name;
    private Car car;

    // DIP: Creating new object of type Car class in the constructor causes coupling. So Driver class should depend on abstraction instead of class.
    public Driver(){
        this.car = new Car();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
