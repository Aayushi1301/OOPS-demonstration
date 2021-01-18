package solution;

public class EventHandler {

    private EngineVehicle vehicle;

    public EventHandler(final EngineVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
        // OCP: now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
    }
}
