class GrandFather{
    public int hasMoney(){

        System.out.println("GrandFather's Money");
        return 5;
    }
}
class Father extends GrandFather{

    public int hasMoney(){


        System.out.println("Father's Money");
        return super.hasMoney()+4;
    }
}

class Son extends  Father {


    public int hasMoney(){

        System.out.println("Son's Money");
        return super.hasMoney()+6;
    }
}
public class Inheritance
{
    public static void main(String[] args) {

        Son s1=new Son();
        System.out.println(s1.hasMoney());
    }
}
