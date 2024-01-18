

class Student{
int id;
String name;
public int BigNumber(int a){
    return a;
}
}
public class JavaClass1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=2;
        s1.name="Suman";
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.BigNumber(4));
    }
}
