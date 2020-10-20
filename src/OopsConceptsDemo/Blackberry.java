package OopsConceptsDemo;

public class Blackberry extends Mobile {

    public double blackberryVersion;

    public Blackberry(String manufacturer, String operatingSystem, int cost) {
        super(manufacturer, operatingSystem, cost);
    }

    @Override
    public void makeCall() {
        System.out.println("Blackberry device makes a call");
    }

    @Override
    public void pickCall() {
        System.out.println("Picks a call on blackberry device");
    }

    @Override
    public void sendMessage() {
        System.out.println("Send message from blackberry device");
    }
}
