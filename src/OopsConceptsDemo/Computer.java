package OopsConceptsDemo;

import lombok.Getter;
import lombok.Setter;

public class Computer implements ComputationDevice {

    @Getter
    @Setter
    private String manufacturer;

    @Getter
    @Setter
    private String operatingSystem;

    @Getter
    @Setter
    private int cost;

    @Override
    public void launchApplication() {
        System.out.println("Launch the application");
    }

    @Override
    public void closeApplication() {
        System.out.println("close the application");
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
