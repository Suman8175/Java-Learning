public class PS_3 {
    public static void main(String[] args) {
//     byte n=4;
//      for (int i=n;i>0;i--){
//          for (int j=0;j<i;j++){
//
//          System.out.print("*");
//          }
//          System.out.print("\n");
//      }
        //Program to print sum of n even numbers
        int n=4;
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+(2*i);
        }
        System.out.println(sum);

        //Multiplication table
        int number=5;
        for (int i=1;i<=10;i++){
            System.out.println(number+ "*"+i+"="+(number*i));
        }
//        Multiplication table in reverse

        for (int i=10;i>=0;i--){
            System.out.println(number +"*"+i+"="+(number*i));
        }

        //Factorial of given numbers
        int factorial=1;
        for (int i=1;i<=number;i++){
            factorial=factorial*i;
            System.out.println(factorial);
        }
    }
}
