public class Practise2 {
    public static void main(String[] args) {
        String str="Suman Devkota";

        //To lower case
        System.out.println(str.toLowerCase());

        //Replace space with underscore
        System.out.println(str.replace(" ","_"));

        //replace name with some other
        String letter="Dear <|name|>.Thanks a lot.";
       letter= letter.replace("<|name|>","Suman");//This also shows string can't change as we replace "Suman" with any other name it still works.
        System.out.println(letter);

        //detect double spaces and triple spaces.
        String spaces="This   is double and triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
    }
}
