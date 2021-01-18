package violation;

public interface Switches { //ISP: Switches interface should be further divided into interfaces which all class can implement

    void startEngine();

    void shutDownEngine();

    void turnRadioOn();

    void turnRadioOff();

    void turnCameraOn();

    void turnCameraOff();
}
