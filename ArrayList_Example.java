import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(144);
        a2.add(21);
        a2.add(14);
        a1.add(143);//Use to add in arrayList
        a1.add(1458);
        a1.add(0,21); //At first at index 0 21 is added.
        a1.add(0,214);//This adds 214 at index 0 and replace 21 at index 1.
//        a1.retainAll(a2);//Selects only common value from a1 and a2 and removes other
//        a1.addAll(a2);//This adds all data from a2 into a1.
//        a1.set(0,200);//Remove/Replace 0th element with 200.Meaning 0th element is replaced by 200 and previous 0th element is deleted now.
        for (int i=0;i<a1.size();i++){
           System.out.print(a1.get(i));
           System.out.print(" ,");
       }
        System.out.println();
//        a1.clear();  This clears up the all data from a1.
      System.out.println(a1.contains(2));   // Returns boolean value true if a1 has the provided value else false.
        System.out.println(a1.indexOf(14));
        Collections.sort(a1);
        for (int i=0;i<a1.size();i++){
            System.out.print(a1.get(i));
            System.out.print(" ,");
        }
        ArrayList<String> s1=new ArrayList<String>();
        s1.add("Banana");
        s1.add("Cat");
        s1.add("Apple");

    Collections.sort(s1);//It can sort both integers and Strings
        for (int i=0;i<s1.size();i++){
            System.out.print(s1.get(i));
            System.out.print(" ,");
        }
        System.out.println();
        //Or you can use for each loop
        for (String i:s1){
            if (i.contains("Apple")){
                System.out.println("An Apple a Day Keeps A Doctor Away");
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
        s1.trimToSize();
        
    }
}
