package SetterInjectionPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1. APPLE");
        System.out.println("2. SAMSUNG");
        int choice = scanner.nextInt();

        Mobile mobile = null;
        if (choice == 1){
            mobile = context.getBean("apple", Apple.class);
        }else if (choice == 2){
            mobile = context.getBean("samsung", Samsung.class);
        }else {
            System.out.println("INVALID CHOICE");
        }

        if (mobile != null){
            mobile.mobileInformation();
            mobile.getSimCardInformation();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
