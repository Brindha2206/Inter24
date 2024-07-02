package OOP.Polymorphism;

public class OverLoading {

    public void products(String prod1,String prod2,String prod3)
    {

        System.out.println("The product you've purchased are:"+"\n"+prod1+"\n"+prod2+"\n"+prod3);
    }
    public int products(int price1,int price2,int price3)
    {
        int total = price1+price2+price3;
        System.out.println("The total amount of your purchase is "+total);
        return total;
    }
    public void Review (float Review1,float Review2,float Review3)
    {
        if(Review1>Review2){
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        obj.products("Soap","Shampoo","Condtioner");
        obj.products(100,200,250);
        System.out.println("Give reviews for each product that should be 1-5");
    }

}
