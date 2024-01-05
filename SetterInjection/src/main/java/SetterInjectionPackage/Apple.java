package SetterInjectionPackage;

public class Apple implements Mobile{
    //we have declared private simCard
    private SimCard simCard;
    //here we are generating setter method for performing setter injection
    public void setSimCard(SimCard simCard){
        this.simCard = simCard;
    }
    @Override
    public void mobileInformation() {
        System.out.println("MOBILE COMPANY NAME :- APPLE");
        System.out.println("OPERATING SYSTEM:- IOS");
        System.out.println("PRICE :- 54999.99");
        System.out.println("-------------------------------");
    }

    @Override
    public void getSimCardInformation() {
        //calling the method with the reference of simCard so that we can perform loose coupling
        simCard.getSimCardInformation();
    }
}
