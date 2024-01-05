package SetterInjectionPackage;

public class Jio implements SimCard{
    @Override
    public void getSimCardInformation() {
        System.out.println("SERVICE PROVIDER JIO.");
        System.out.println("5G DISABLED");
        System.out.println("WEAK NETWORK");
    }
}
