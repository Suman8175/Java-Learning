import java.util.Scanner;

class InvalidInputException extends  Exception{
    @Override
    public String getMessage(){
        return "Cannot have any input than number";
    }
}

class DivideByZero extends  Exception{
    @Override
    public String getMessage(){
        return "Cannot divide number by zero";
    }
}
class MaxInput extends  Exception{
    @Override
    public String getMessage(){
        return "Cannot have any input greater than 100,000";
    }
}
class MaxMultiplier extends  Exception{
    @Override
    public String getMessage(){
        return "Cannot have any multiplier greater than 7000";
    }
}

class Calculator{
    public void getValue(int a,int b) throws InvalidInputException,DivideByZero,MaxInput,MaxMultiplier{

        if (b==0){
            throw new DivideByZero();
        }
        if (a>100000 || b>100000){
            throw new MaxInput();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice ");
        System.out.println("1:Addition");
        System.out.println("2:Subtraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        int choice=sc.nextInt();
        sc.close();
        switch (choice){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                if (a>7000 || b>7000){
                    throw new MaxMultiplier();
                }
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Division: "+(a/b));
                break;
             default:
                 System.out.println("Enter valid number");
        }
    }
}

public class Building_Calculator_Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator c1=new Calculator();
        System.out.println("Enter two numbers");
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            c1.getValue(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}













