package basic;

public class Method {
    public void Chocolate()
    {
        System.out.println("Cadbury is best in chocolate");
    }
    public void shakes(String name,int price)
    {
        System.out.println("The " + name + " will be deliver soon.The price is "+ price);
    }
    public int order()
    {
        System.out.println("Your order is cancelled");
        return 5;
    }
    public static void  main(String[] args)
    {
        Method obj = new Method();
        obj.Chocolate();
        obj.shakes("Vannila Shake",150);

        int total = obj.order();
        System.out.println("The total no.of order is "+ total);

    }
}
