import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        int[] a1={1,12,3,5};
        for (int element: a1){
            al1.add(element);

        }


//        al1.forEach(System.out::println);
//        al1.forEach(n-> System.out.println(n)); Above can be written this way also

        Stream<Integer> stream= al1.stream();
//        stream.forEach(n-> System.out.print(n+" "));
//        stream.forEach(l-> System.out.print(l+" ")); this cannot be done as stream can only be used once.
//        long counter=stream.count();
//        System.out.println(counter);

      Stream<Integer>sortedData=stream.filter(e->e%2==0)
                                    .sorted()
                                    .map(n->n+2); //stream.sorted() returns Stream as we can see in .sorted() documentation
        sortedData.forEach(System.out::print);

    }
}
