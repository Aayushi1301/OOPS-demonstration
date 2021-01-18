package violation;

public abstract class Bicycle extends Vehicle {

    //LSP: Power and suspension height makes no sense for manual vehicles
    @Override
    public int getPower() {
        throw new UnsupportedOperationException();
    }
}
