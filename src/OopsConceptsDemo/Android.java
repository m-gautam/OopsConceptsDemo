package OopsConceptsDemo;

import lombok.Getter;
import lombok.Setter;

public class Android extends Mobile {

    @Getter
    @Setter
    private String androidVersion;

    public Android(String manufacturer, String operatingSystem, int cost) {
        super(manufacturer, operatingSystem, cost);
    }

    @Override
    public void makeCall() {
        System.out.println("Android device makes a call");
    }

    @Override
    public void pickCall() {
        System.out.println("Picks a call on android device");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message from android device");
    }
}
