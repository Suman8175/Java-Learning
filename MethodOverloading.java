public class MethodOverloading {
    static void greet(){
        System.out.println("Good morning!!");
    }
    static void greet(int a){
        System.out.println("Good morning "+a+" you "+a);
    }
    static void greet(String name){
        System.out.println(name);
    }

    //Method Overloading means same method name with different use and different parameters.
    //But changing the return type in method overloading it gives error.
//    Suppose static void greet() and static int void() gives error as both greet() cant have both int and void return type.
    public static void main(String[] args) {
        greet();
        greet(2);
        greet("Suman");
        greet("2");

    }
}
