public class Pryamid {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");

        }
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("x");
                System.out.print(" ");
            }
            System.out.print("\n");

        }
    }
}
