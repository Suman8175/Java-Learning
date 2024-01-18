import java.util.Scanner;

class Subject{
    int fullMarks=100;
    int obt;
}

public class Prbm1_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Subject s1=new Subject();
        System.out.println("Enter 1st subject marks");
         s1.obt=sc.nextInt();
        System.out.println("Enter 2nd subject marks");
        Subject s2=new Subject();
        s2.obt=sc.nextInt();
        System.out.println("Enter 3rd subject marks");
        Subject s3=new Subject();
       s3.obt=sc.nextInt();
        System.out.println("Enter 4th subject marks");
        Subject s4=new Subject();
        s4.obt=sc.nextInt();
        System.out.println("Enter 5th subject marks");
        Subject s5=new Subject();
        s5.obt=sc.nextInt();
        float totalPercentage= (float) (s1.obt + s2.obt + s3.obt + s4.obt + s5.obt) / (s1.fullMarks*5) *100;
        System.out.println("You got percentage of :"+totalPercentage +" %");
    }
}
