
class Thrd1 extends Thread{
    Thrd1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while (i<50){
            System.out.println("I'm watching T.V");
            i++;
        }
    }
}

class Thrd2 implements Runnable{

    @Override
    public void run() {
        int i=0;
        while (i<50){
            System.out.println("I'm reading a book");
            i++;
        }
    }
}


public class ThreadConstructor {
    public static void main(String[] args) {
        Thrd1 t1 = new Thrd1("Suman");
        Thrd2 t2 = new Thrd2();
        Thread gun = new Thread(t2, "Sulabh");
        t1.start();
        gun.start();
            System.out.println("Thread one id is : " + t1.getName());
            System.out.println("Thread one id is : " + t1.getId());
            System.out.println("Thread two id is : " + gun.getName());
            System.out.println("Thread two id is : " + gun.getId());

    }

}
