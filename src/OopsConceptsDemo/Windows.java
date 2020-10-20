package OopsConceptsDemo;

public class Windows extends Computer {
    @Override
    public void launchApplication() {
        System.out.println("Launch the application on windows pc");
    }

    @Override
    public void closeApplication() {
        System.out.println("close the application on windows pc");
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
