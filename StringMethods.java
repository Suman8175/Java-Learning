public class StringMethods {
    public static void main(String[] args) {
        String name=" Suman is a student  ";

        String name1=new String("Suman Devkota");
        String name2=new String("Ok");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        //Length of string
        int length=name.length();
        System.out.println("Length is : "+length);

        //To lower case
        System.out.println(name.toLowerCase());

        //To uppercase
        System.out.println(name.toUpperCase());

        //Trim:it removes spaces leading and trailing of string.Meaning first and last spaces are removed.
        System.out.println(name.trim());

        //Substring:It has 2 variance.substring(beginIndex) gives result from after given index.For Suman if beginIndex:2 then man is shown
        System.out.println(name.substring(2));

//        .substring(beginIndex,endIndex) gives result from after begin index to end Index.For Suman if beginIndex:1 and endIndex is 3 then Su is shown
        System.out.println(name.substring(1,3));

        //.replace() replaces old character with newly given character.Also string is possible to be replaced
        System.out.println(name.replace('s','t'));
        System.out.println(name.replace("uman","ajit"));

        //.startsWith() checks if it starts with given String and give boolean value and same as .endsWith
        System.out.println(name.startsWith(" suman"));
        System.out.println(name.startsWith("sssuman"));
        System.out.println(name.endsWith("student  "));
        System.out.println(name.endsWith("student123"));

        //.charAt(int number) returns character which is at given integer number.If Suman and provided 2 then m is returned.
        System.out.println(name.charAt(2));

        //.indexOf() gives first index in which supplied string/character is presented.If given word is Sustans and .indexOf("S")gives 0,.indexOf("S") gives 2.
        System.out.println(name.indexOf("um"));

        //.equals checks and returns boolean value
        System.out.println(name2.equals("ok"));
        System.out.println(name2.equalsIgnoreCase("ok"));

//        escape characters  like: \n,\t >tab \" prints " \\ gives us access to print \.
        System.out.println("I am \n in new line");
        System.out.println("Double cotation used \" like this");
        System.out.println("Back slash is used  \\ like this");
        System.out.println("Tab Space is given \t using like this");


    }
}
