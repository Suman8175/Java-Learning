
import java.util.Scanner;

public class Practise_3 {
    public static void main(String[] args) {


//        Q1) Take 3 subject marks as input a   nd all students have 2 condition to pass:

//        :::Students should have more than 33 marks in every subject.If student get less than 33 in even one subject he/she is fail.
//        :::Students should get more than 40 percentage to pass.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st subject name");
        byte marks1=sc.nextByte();
        System.out.println("Enter 2nd subject name");
        int marks2=sc.nextInt();//You can take byte instead of int as it is most efficient.
        System.out.println("Enter 3rd subject name");
        int marks3=sc.nextInt();

        float percentage=(marks1+marks2+marks3)/300.0f*100;

        if(marks1>=33 && marks2>=33 && marks3>=33 && percentage>=40) {
            System.out.println("You are pass.");
        }

            else {
                System.out.println("You are fail.");
            }

//            Q2)0-2.5Lakhs    Tax:0%,
//                 2.5-5.0Lakhs   Tax:5%
//                 5.0-10.0Lakhs   Tax:10%
//               Above 10.0 Lakhs   Tax:20%

        System.out.println("Enter your income of the year");
            float income=sc.nextFloat();

            if(income>=1000000){
                float amount=income*20/100;
                System.out.println("You paid 20 percent tax of amount : "+amount);
            } else if (500000<=income) {//You can also write as else if (500000<=income && income<1000000)
                float amount=income*10/100;
                System.out.println("You paid 10 percent tax of amount : "+amount);
            } else if (250000<=income) {
                float amount=income*5/100;
                System.out.println("You paid 5 percent tax of amount : "+amount);
            }
            else {
                System.out.println("You didn't pay any income tax amount as your income is less than 2.5lakhs.");
            }

            //Q3 WAP to find out day given the number.1=Sunday,2=Monday,etc

        System.out.println("Enter the day in  number");
        int day=sc.nextInt();

            switch (day){
                case 1:
                    System.out.println("Today is Sunday");
                    break;
                case 2:
                    System.out.println("Today is Monday");
                    break;
                case 3:
                    System.out.println("Today is Tuesday");
                    break;
                case  4:
                    System.out.println("Today is Wednesday");
                    break;
                case 5:
                    System.out.println("Today is Thursday");
                    break;
                case 6:
                    System.out.println("Today is Friday");
                    break;
                case 7:
                    System.out.println("Today is Saturday");
                    break;
                default:
                    System.out.println("There is no such day");
                    break;
            }

//            Q4)Leap year

        System.out.println("Enter the year");
        int year=sc.nextInt();
            if(year %4==0){
                System.out.println("Yes!!It is leap year.");
            }
            else {
                System.out.println("No!!It isn't leap year.");
            }

            //Q5)To find out website type: .com means commercial,.np means nepal,.org means organization

        System.out.println("Enter your website full name");
        String website=sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("Your website is commercial");
        }
        if (website.endsWith(".org")){
            System.out.println("Your website is organizational");
        }
        if (website.endsWith(".edu")){
            System.out.println("Your website is educational");
        }
        if (website.endsWith(".np")){
            System.out.println("Your website is nepal");
        }
    }

}
