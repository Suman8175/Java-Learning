
abstract class Design{

   public int r=10;
    Design(){
        System.out.println("I am a design class constructor");
    }
    abstract public void greet();
}

class Chinese extends Design{
    @Override
    public void greet() {
        System.out.println(r);
        System.out.println("Nee how...");
    }
}

class Nepali extends Design{

    @Override
    public void greet() {
        System.out.println("Namaste");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        //    Design d1=new Design();   This throws error as we cannot create object of abstract class
        Chinese c1=new Chinese();
        c1.greet();
        Design d1=new Nepali(); //This is also possible and gives output as Namaste
        d1.greet();

    }
}
