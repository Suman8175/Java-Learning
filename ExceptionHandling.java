import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionExample{
    public int [] ar1={30,40,50};
    public void showResult(int index,int number){
        System.out.println("You entered the value of index for array: "+index);
        System.out.println("You entered the divide value for array: "+number);
        try {
            System.out.println("Your array value at index is: " + ar1[index]);
            System.out.println("Your final value is: "+ar1[index]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is too much");
            System.out.println(e.getLocalizedMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception Occured");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Some other exception occured");
            System.out.println(e.getMessage());
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
            ExceptionExample e1=new ExceptionExample();
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter value of index");
        int a=sc.nextInt();
        System.out.println("Enter value of dividor");
        int b=sc.nextInt();
        e1.showResult(a,b);}
        catch (InputMismatchException e){
            System.out.println("Please input a valid decimal value");
            System.out.println( e.getMessage());
        }
    }

}
