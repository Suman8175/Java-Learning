
class Base{
    void print(){
        System.out.println("Base");
    }
    void as(){
        System.out.println("awdawd");
    }
}
class Derived extends Base{
    void print(){
        System.out.println("Derived");
    }
    void as(){
        System.out.println("sdad");
    }
}

public class interview {
   public static void DoPrint(Base o){
        o.print();
    }

    public static void main(String[] args) {
        Base b1=new Base();
        Derived d1=new Derived();
        Base b=new Derived();
        b.as();
        DoPrint(b1);
        DoPrint(d1);
        DoPrint(b);

    }
}
