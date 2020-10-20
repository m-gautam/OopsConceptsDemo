package OopsConceptsDemo;

import lombok.Getter;
import lombok.Setter;

public class Mobile implements CommunicationDevice {

    @Getter
    @Setter
    private String manufacturer;

    @Getter
    @Setter
    private String operatingSystem;

    @Getter
    @Setter
    private int cost;

    public Mobile(String manufacturer, String operatingSystem, int cost) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.cost = cost;
    }

    @Override
    public void makeCall() {
        System.out.println("This device makes a call");
    }

    @Override
    public void pickCall() {
        System.out.println("Picks a call");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message");
    }

    @Override
    public void getDeviceOn() {
        System.out.println("Get device on");
    }

    @Override
    public void getDeviceOff() {
        System.out.println("Get device off");
    }
}
