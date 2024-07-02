package OOP;




class book {
    public void  choices(){
        String type1 = "Fictional";
        String type2 = "Non-fictional";
        System.out.println("There are two types of books." + type1 +" and " + type2);
    }
}
class Fiction extends book{
    public void fic()
    {
        String author = "Collen Hoover";
        int numbers = 10;
        System.out.println("Fav author in fiction is " + author);
    }
}
class Genre extends Fiction {
    public void gen() {
        String genre1 = "Thriller";
        String genre2 = "Horror";
        System.out.println("Famous genre in Fiction are " + genre1 + " " + genre2);
    }


    public class Multilevel {
        public  void main(String[] args) {
            Genre obj = new Genre();
            obj.choices();
            obj.fic();
            obj.gen();
        }
    }
}
