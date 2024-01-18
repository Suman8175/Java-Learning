public class Method_PS {

    //Method for multiplication of number
    static void Multiplication(int n){
        for (int i=0;i<=10;i++){
            System.out.println("Multiplication of number "+n+ " * "+i +" is "+n*i);
        }
    }
    //WAp to print
//    *
//    **
//    ***
//    ****
//    *****

    static void Pattern(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    //WAP to find sum of first n natural number using recursion
    static int NaturalNumber(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n+NaturalNumber(n-1);
        }
    }
    public static void main(String[] args) {
//        Multiplication(51);
        Pattern();
        System.out.println(NaturalNumber(6));
    }
}
