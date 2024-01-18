import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
//        if(age>48){
//            System.out.println("You may be most experienced person here.");
//        } else if (age>38) {
//            System.out.println("You might be more experienced as you age more than 38 but less than 48");
//        } else if (age>28) {
//            System.out.println("You might have less experience as you age more than 28 but less than 18");
//        }
//        else{
//            System.out.println("You donot have any experience at all");
//        }


        //example of switch
        switch(age){
            case (18):
                System.out.println("You are 18 years old");
                break;//break is necessary else if you dont put break after matching one case it is gonna run all cases after it.
            case  21:
                System.out.println("You are 21 years old");
                break;//Suppose you dont use break anywhere and put age as 21 so below 21 all cases are gonna execute including default case.So dont forget to use break
            case 30:
                System.out.println("Happy married life");
                break;
            case 60:
                System.out.println("Happy retirement");
                break;
            default:
                System.out.println("I am default runner");
                break;
        }

        //switch case 2
        System.out.println("Enter your name");
        String str=sc.nextLine();
        switch (str){
            case "Suman":
            case "suman":
                System.out.println("Hello Suman or suman");
                break;
            case "Sulabh":
            case "sulabh":
            case "bishal":
            case "Bishal":
                System.out.println("Hello Bishal or Sulabh");
                break;
            default:
                System.out.println("I don't know you!!");
                break;
        }


    }
}
