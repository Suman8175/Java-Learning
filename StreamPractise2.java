import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MyEmployee{

    int id;
    String name;
    String gender;
    int salary;
    String address;

    public MyEmployee(int id, String name, String gender, int salary,String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary + '\'' +
                ", address=" + address +
                '}'+'\n';
    }
}

public class StreamPractise2 {
    public static void main(String[] args) {
        ArrayList<MyEmployee> e1=new ArrayList<MyEmployee>();
        e1.add(new MyEmployee(1,"Suman","M",12000,"Pokhara"));
       e1.add(new MyEmployee(2,"Max","F",11000,"Chitwan"));
        e1.add(new MyEmployee(3,"David","F",28000,"Kathmandu"));
        e1.add(new MyEmployee(4,"Sher","M",17000,"Pokhara"));
        e1.add(new MyEmployee(5,"Tiger","M",7000,"Pokhara"));
        e1.add(new MyEmployee(6,"Rohan","M",14000,"Kathmandu"));
        e1.add(new MyEmployee(2,"Ram","F",41000,"Pokhara"));


        //1...To get employee based on cities in descending order.

//        answer

       /* List names=e1.stream().filter(emp->emp.getAddress().equals("Pokhara")).sorted(Comparator.comparing(MyEmployee::getName,Comparator.reverseOrder())).collect(Collectors.toList());  */
        //Remove Comparator.reverseOrder() to make it in ascending order


//       2. Find all genders
//answer
       /*List getgender= e1.stream().map(MyEmployee::getGender).distinct().collect(Collectors.toList());
        System.out.println(getgender);*/

//       3.Count employees based on gender

//        answer
        /*Map<String,Long> collect = e1.stream().collect(Collectors.groupingBy(MyEmployee::getGender,Collectors.counting()));
        System.out.println(collect);*/


//        4.Get Average salary based on gender

//        answer
       /* Map<String, Double> collect = e1.stream().collect(Collectors.groupingBy(MyEmployee::getGender, Collectors.averagingInt(MyEmployee::getSalary)));
        System.out.println(collectc);*/


    }


}
