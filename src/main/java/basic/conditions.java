package basic;
import java.util.Scanner;
public class conditions
{
    public static void main(String[] args)
    {
        Scanner balance = new Scanner(System.in);
        System.out.println("Enter Your Balance:");
        double bal = balance.nextDouble();

        if (bal>=300)
        {
            System.out.println("You can able to book movie tickets");
            System.out.println("How many tickets you need to book:");
            int tickets = balance.nextInt();
            if(tickets>=5)
            {
                System.out.println("You will get extra 1 large popcorn and cococola!!");
            } else if (tickets==4)
            {
                System.out.println("If you book 1 more ticket,You will get extra 1 large popcorn and cococola!!");
            }
            else if (tickets==3)
            {
                System.out.println("If you book 2 more tickets,You will get extra 1 large popcorn and cococola!!");
            }
            else if (tickets==2)
            {
                System.out.println("If you book 3 more tickets,You will get extra 1 large popcorn and cococola!!");
            } else
            {
                System.out.println("As you are coming alone,We are providing you half the price in each snacks");
            }
        } else
        {
            System.out.println("We are sorry to inform you,you could not able to book tickets because of your insufficient balance");
        }
    }
}
