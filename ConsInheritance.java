

class GrandFather1{
    GrandFather1(int z){
        System.out.println("Grandfather: "+z);
    }
}
class Father1 extends  GrandFather1{
    Father1(int x,int y){
        super(x);
        System.out.println("Father: "+x+ " & "+y);
    }
}
class Son1 extends Father1{
    int a=5;
    Son1(int a,int b,int c){
        super(a,b);
        System.out.println("Son :"+a + " & "+b+" & "+c);
    }
    static void s(){
        System.out.println("....");
    }
}

public class ConsInheritance {
    public static void main(String[] args) {
        Son1 s1=new Son1(1,2,3);
       Son1.s();
        System.out.println(s1.a);

    }
}
