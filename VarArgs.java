public class VarArgs {
    //Takes as much argument as provided using ...name
    static int Sum(int ...arg){
        int sum=0;
        for (int a:arg){
            sum += a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,3));
        System.out.println(Sum(1,2,3,4));
    }
}
