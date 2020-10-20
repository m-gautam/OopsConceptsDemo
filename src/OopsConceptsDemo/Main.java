package OopsConceptsDemo;

public class Main {

    public static void main(String [] args){
        Mobile mobile = new Mobile("man", "iOS", 7000);

        System.out.println("Manufacturer: " + mobile.getManufacturer());
        System.out.println("OS: " + mobile.getOperatingSystem());

    }


}
