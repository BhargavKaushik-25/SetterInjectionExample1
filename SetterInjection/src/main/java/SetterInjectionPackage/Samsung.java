package SetterInjectionPackage;

public class Samsung implements Mobile{

    //we have declared private simCard
    private SimCard simCard;
    //here we are generating setter method for performing setter injection
    public void setSimCard(SimCard simCard){
        this.simCard = simCard;
    }
    @Override
    public void mobileInformation() {
        System.out.println("MOBILE COMPANY NAME :- SAMSUNG");
        System.out.println("OPERATING SYSTEM:- ANDROID");
        System.out.println("PRICE :- 24999.99");
        System.out.println("--------------------------------");
    }

    @Override
    public void getSimCardInformation() {
        //calling the method with the reference of simCard so that we can perform loose coupling
        simCard.getSimCardInformation();
    }
}
