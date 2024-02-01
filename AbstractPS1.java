
abstract class Pen{
     abstract void write();
    abstract void refill();
}




class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Writing from fountain pen");
    }

    @Override
    void refill() {
        System.out.println("Refilling");
    }
    void changeNib(){
        System.out.println("Changing Nibble");
    }
}

interface basicAnimal{
    default void eat(){
        System.out.println("They eat");
    }
    default void sleep(){
        System.out.println("They sleep");
    }
}

abstract class Monkey{
    abstract void jump();
    abstract void bite();
}

class Human extends Monkey implements basicAnimal{

    @Override
    void jump() {
        System.out.println("Jump");
    }

    @Override
    void bite() {
        System.out.println("Bite");
    }
}

class Dog extends Monkey implements basicAnimal{

    @Override
    void jump() {
        System.out.println("Jump doggy");
    }

    @Override
    void bite() {
        System.out.println("Bite doggy");
    }
}



public class AbstractPS1 {
    public static void main(String[] args) {
Monkey b1=new Dog();
b1.bite();
b1.jump();
    }
}
