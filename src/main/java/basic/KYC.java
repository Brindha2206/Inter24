package basic;
import java.util.Scanner;
public class KYC {
    public static void main(String[] args)
    {
        System.out.println("Welcome to MEC BANK");
        System.out.println("To initiate KYC, we are requesting you to provide your details");

        Scanner mec = new Scanner(System.in);

        //Customer's details:
        //name
        System.out.println("Enter Your Name:");
        String name = mec.nextLine();
        //dob
        System.out.println("Enter Your Date of Birth");
        String dob = mec.nextLine();
        //email
        System.out.println("Enter Your E-mail:");
        String mail = mec.nextLine();
        //Contact
        System.out.println("Enter Your Contact Number:");
        Long number = mec.nextLong();
        //Aadhar
        System.out.println("Enter Your Aadhar Number:");
        Long aadhar = mec.nextLong();
        //pan
        System.out.println("Enter Your Pan Number:");
        String pan = mec.next();
        //ack
        System.out.println("Thanks for Contacting MEC Bank "+name + ".You are Successfully Submitted your details and we'll let you know soon about your KYC update.");


    }
}
