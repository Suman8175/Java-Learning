

class SumanDevkota{
//    int i=0;
    public void show(){
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(2000);

                System.out.println(i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        SumanDevkota s1=new SumanDevkota();
        s1.show();
    }
}
