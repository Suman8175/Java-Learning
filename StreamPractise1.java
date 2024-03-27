import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamPractise1 {
    public static void main(String[] args) {

        List<Integer>list=List.of(1,1,5,8);

        System.out.println(list);

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(65);
        arrayList.add(4);
        arrayList.add(25);

//        arrayList.stream().filter(n->n>20).map(n->n+1).sorted().forEach(System.out::println);
        List <Integer> newlist=arrayList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(newlist);

    }
}
