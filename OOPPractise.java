
class Employee{
    int Salary;
    String name;

    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int newSalary){
        Salary=newSalary;
    }

}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibration(){
        System.out.println("Vibrating");
    }
    public void silent(){
        System.out.println("Silent");
    }
}

 class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class OOPPractise {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Suman";
        e1.Salary=12000;
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        e1.setSalary(14000);
        System.out.println(e1.getSalary());

        CellPhone c1=new CellPhone();
        c1.ringing();
        c1.silent();
        c1.vibration();

        System.out.println("xxxxxxxxxxxxxxxxxxxx");

        Square s1=new Square();
        s1.side=5;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

    }
}
