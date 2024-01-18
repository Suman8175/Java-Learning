import java.util.Scanner;

public class ContinueBreak {
    static int CalculateTax(int income,String gender){
        int tax=0;
        int finalTax = 0;
        if(income<=350000){
            tax= (int) (0.01*income);
        }
        if(income>350000 && income<=450000){
            tax= (int) (0.01*350000);
            tax= (int) (tax+(0.1*(income-350000))); //Or we can write as  tax=(int)(3500+(0.1*(income-350000)))
        }
        if(income>450000 && income <=650000){

            tax= (int) (0.01*350000);
            tax= (int) (tax+(0.1*100000));
            tax= (int)(tax+(0.2*(income-450000))); //tax=(int)(3500+10000+(0.2*(income-450000)))
        }
        if(income>650000 && income<=2000000){
            tax= (int) (0.01*350000);
            tax= (int) (tax+(0.1*100000));
            tax= (int)(tax+(0.2*200000));
            tax=(int) (tax+(0.30*(income-650000))); //tax=(int) (3500+10000+40000+(0.30*(income-650000)))
        }
        if(income>2000000){
            tax= (int) (0.01*350000);
            tax= (int) (tax+(0.1*100000));
            tax= (int)(tax+(0.2*200000));
            tax=(int) (tax+(0.3*1350000));
            tax=(int)(tax+(0.36*(income-2000000)));
            //tax=(int)(3500+10000+40000+405000+(0.36*(income-2000000)))
        }
        switch (gender) {
            case "m", "M", "Male", "male" -> {
                finalTax=tax;
            }
            case "f", "Female", "female", "F" -> {
                int rebate = (int) (0.1 * tax);
               finalTax= tax-rebate;
            }
            default -> throw new IllegalStateException("Unexpected value: " + gender+" Use gender like Male,Female or M,F");
        }
        return  finalTax;
    }
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your gender 'M' or 'F'?");
//        String gender=sc.next();
//        System.out.println("Enter the annual income");
//        int income=sc.nextInt();

        System.out.println(CalculateTax(2100000,"F"));
        System.out.println(CalculateTax(2100000,"M"));
    }
}
