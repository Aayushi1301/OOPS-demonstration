package solution;

public class Bicycle extends Vehicle {

    //LSP: Power and suspension height makes no sense for manual vehicles
    void printNumberOfWheels(){
        System.out.println("I have 2 wheels");
    }
}