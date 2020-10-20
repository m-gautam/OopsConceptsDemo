package OopsConceptsDemo;

public class Ios extends Mobile {

    public Ios(String manufacturer, String operatingSystem, int cost) {
        super(manufacturer, operatingSystem, cost);
    }

    @Override
    public void makeCall() {
        System.out.println("Ios device makes a call");
    }

    @Override
    public void pickCall() {
        System.out.println("Picks a call on ios device");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message from ios device");
    }
}
