import java.util.Scanner;

class NegativeRadius extends  Exception{
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}

class AreaOfCircle{

    public double getArea(double radius) throws NegativeRadius{
        if(radius<0){
            throw new NegativeRadius();
        }
        double area=Math.PI*radius*radius;
        return  area;
    }
}

public class Exception_throw_throws {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AreaOfCircle a1=new AreaOfCircle();
        boolean check=true;
        while (check){

            System.out.println("Enter radius of circle");
            double radius= scanner.nextDouble();
            try {

                double result=a1.getArea(radius);
                System.out.println(result);
                check=false;

            }
            catch (NegativeRadius e){
                System.out.println(e.getMessage());
            }
        }

//        a1.getArea(3);  We cannot directly write it as this methods may throw NegativeRadius Exception

    }
}
