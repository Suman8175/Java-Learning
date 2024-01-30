
class Phone{
    public void on(){
        System.out.println("Phone is on.....");
    }
    public void Time(){
        System.out.println("Time is 8 am");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("SmartPhone is on...");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
public class ObjectAdvance {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();//Object SmartPhone is equal to reference of Phone.
//    SmartPhone obj2=new Phone();   This is error as sub class cannot reference super class.For remember use: super-sub formula.
        obj.on();//SmartPhone is on
        obj.Time();//Phone time is showing ....as reference  is made of phone and every phone can show Time
//        obj.playMusic();  Error.... as reference is made of Phone and not every phone can play music
    }
}
