import java.util.Scanner;

public class sip
{
    public static void main(String[] args)
    {
        System.out.println("SIP Calculator");
        Scanner value = new Scanner(System.in);
        //monthly investment
        System.out.println("Enter Your Monthly Investment:");
        int invest = value.nextInt();
        //Return rate
        System.out.println("Expected return rate(in %):");
        int interest = value.nextInt();
        //Time Period
        System.out.println("Enter time period:");
        int period = value.nextInt();


        //to know investment amount
        int principle = invest*period;
        System.out.println("The principle amount is "+ principle);
        //Est returns
        int returns = invest*interest/100;
        System.out.println("The estimated returns is "+ returns);
        //total value
        int total =  principle+returns;
        System.out.println("The total vallue is "+ total);


    }
}
