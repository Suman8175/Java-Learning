import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("You Entered :"+a);
        System.out.println("Enter second number");
        float b=sc.nextFloat();
        System.out.println("Your Entered number is "+b);
        System.out.println("Sum is :"+(a+b));
        System.out.println("Enter third number to check if you provided int or not");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        String str1=sc.next();//Reads only 1 word so if user writes "Hello every one" only Hello is stored.
        System.out.println(str1);
        String str2=sc.nextLine();//Reads all string provided with space so if user writes "Hello every one" all Hello every one is stored.
        System.out.println(str2);
    }
}
