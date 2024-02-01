

interface Camera11{
    void takesPicture();
    void takesVideo();
}
interface Camera111{
    void takesPicture1();
    void takesVideo1();
}

interface Camera4k extends Camera11,Camera111{  //interface can extend another interface
    void Quality4K();
    default void shutter(){
        System.out.println("This is default for shutter");
    }
}

class Nokia implements Camera4k{

    @Override
    public void takesPicture() {
        System.out.println("Taking Normal Picture");
    }

    @Override
    public void takesVideo() {
        System.out.println("Taking Normal Photo");
    }

    @Override
    public void takesPicture1() {
        System.out.println("Taking Normal Picture 1");
    }

    @Override
    public void takesVideo1() {
        System.out.println("Taking Normal Video 1");
    }

    @Override
    public void Quality4K() {
        System.out.println("Taking 4k Picture");
    }

//    @Override
//    public void shutter() {
//        System.out.println("Taking 4k shutter");
//    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Nokia nokia=new Nokia();
        nokia.takesPicture();
        nokia.Quality4K();
        nokia.shutter();
    }
}
