public class Decimal2Binary {
    static String Binary(int inputNumber,String result){
        if (inputNumber==0){
            return result;
        }
        result= String.valueOf(inputNumber%2)+result;
        return   Binary(inputNumber/2,result);
    }

    public static void main(String[] args) {
//        System.out.println(128/2);
//        System.out.println(127 % 2);
        System.out.println(Binary(124,""));
    }
}
