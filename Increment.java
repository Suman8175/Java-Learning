public class Increment {
    public static void main(String[] args) {
        int a=10;
        int b=a++;//b is assigned 10 then a is increment meaning a is used first then increment
        System.out.println(b);
        System.out.println(a);
        int y=5;
        System.out.println(++y*6);
        char ch='b';
        System.out.println(--ch);
    }
}
