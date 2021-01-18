package solution;

public class Drone extends AutomaticVehicle implements CameraSwitch {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

    @Override
    public void turnCameraOn() {
        cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        cameraOn = false;
    }
}
