import java.util.Scanner;

public class Pryamid {


    static public String RecursiveFactorial(String num1){
        if (num1.equals("")){
            return "";
        }
        return  RecursiveFactorial(num1.substring(1))+num1.charAt(0);
    }
    static public boolean isPalindrome(String num){
        if(num.length()==1 || num.isEmpty()){
            return true;
        }
           if (num.charAt(0)==num.charAt(num.length()-1)){
               return isPalindrome(num.substring(1,num.length()-1));

        }
           return false;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String t=in.nextLine();

//        System.out.println(t.substring(1)+t.charAt(0));
        System.out.println(isPalindrome("racecar"));
//        System.out.println(RecursiveFactorial(t));
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            double q = a;
//
//            for(int j=0;j<n;j++){
//                q += Math.pow(2,j)*b;
//                System.out.printf("%d ", (int)q);
//            }
//            System.out.println(" ");
//        }
    }
}
