

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("I am thread 1");
            threa();
            System.out.println("I am happy.....");
        }
    }
    public void threa(){

            System.out.println("Different method of Thread 1");

    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("I am thread 2");
            threa2();
            System.out.println("I am sad!!!");
        }
    }
    public void threa2(){

            System.out.println("Different method of Thread 2");
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();


    }
}
