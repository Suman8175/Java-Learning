import java.util.ArrayList;
import java.util.Scanner;


public class JAVA_Generics {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();//If we write as ArrayList<Integer> arrayList=new ArrayList<>(); we don't need type-casting as we specified as there contains only integer value.But here we are writing object
        arrayList.add(6);
        arrayList.add("Suman");
        arrayList.add(7);
        arrayList.add(new Scanner(System.in));
//        int a=(int)arrayList.get(1);//This gives error as at 1 we have string, but we are storing it in int.We will not get compile time error but run time error.

       Class oo= arrayList.get(0).getClass();
        System.out.println(oo);
        System.out.println( arrayList.get(0).getClass());
        System.out.println( (arrayList.get(1)).getClass());
        System.out.println( (arrayList.get(2)).getClass());
        System.out.println( (arrayList.get(3)).getClass());
//        As we can see from above one arraylist can contain multiple data types like Integer,String,Scanner Object

        GenericsEg <String,Integer>g1=new GenericsEg<String,Integer>("Suman",14);
        String store=g1.getT1();
    }
}


class GenericsEg<T1,T2>{
    private T1 t1;
    private T2 t2;

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    GenericsEg(T1 t1, T2 t2){
        this.t1=t1;
        this.t2=t2;
    }
}