package OopsConceptsDemo;

public class Mac extends Computer {
    @Override
    public void launchApplication() {
        System.out.println("Launch the application on Mac");
    }

    @Override
    public void closeApplication() {
        System.out.println("close the application on Mac");
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
