package OOP.Multiple;

import java.sql.SQLOutput;

public class Hotel extends meals implements MoringTiffin,Lunch,Dinner
{

    @Override
    public void dinner() {
        System.out.println("Dosa is the regular dinner");
    }

    @Override
    public void lunch() {
        System.out.println("South Indian meals will be perfect lunch");
    }

    @Override
    public void tiffin() {
        System.out.println("Idly is best");
    }
    public static void main(String[]args){
        Hotel obj = new Hotel();
        obj.dinner();
        obj.mealsLunch();
        obj.lunch();
        obj.tiffin();
    }
}
