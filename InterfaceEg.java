

interface Bicycle{
    void speed(int increment);
    void brake(int decrement);
}
interface Car{
    void speed(int increment,int factor);
    void brake(int decrement,int factor);
}

class Honey implements Bicycle,Car{

    @Override
    public void speed(int increment,int factor) {
     increment++;
        System.out.println(increment);
    }
    @Override
    public void speed(int increment) {
        increment++;
        System.out.println(increment);
    }

    @Override
    public void brake(int decrement,int factor) {
        decrement--;
        System.out.println(decrement);
    }
    @Override
    public void brake(int decrement) {
        decrement--;
        System.out.println(decrement);
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        Honey b1=new Honey();
        b1.brake(40);
        b1.speed(21);
    }
}
