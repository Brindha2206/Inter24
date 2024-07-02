package OOP;

class food
{
    public void cuisine() {
        System.out.println("The significant cuisines are: North Indian " +
                "South Indian " +
                "Italian " +
                "Japanese " +
                "Mexican " +
                "Chinese ");
    }
}
class desserts extends food{
    public void sweets(){
        System.out.println("The famous desert is:Gulab jamun with Ice cream");
    }
    public static void main(String[]args)
    {
       desserts order = new desserts();
       order.cuisine();
       order.sweets();
    }
}


//public class Single {
//        public static void main(String[]args)
//        {
//
//
//        }
//}
