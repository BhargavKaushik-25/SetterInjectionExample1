package SetterInjectionPackage;



public class Airtel implements SimCard {
    @Override
    public void getSimCardInformation() {
        System.out.println("SERVICE PROVIDER AIRTEL.");
        System.out.println("5G ENABLED");
        System.out.println("STRONG NETWORK");
    }
}
