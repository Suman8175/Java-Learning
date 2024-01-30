
//Q1)Create a class Cylinder and use getter and setter to set its radius and height

class Cylinder{
    private float radius;
    private float height;

    Cylinder(){
        setData(1,2);
    }

    public void setData(float radius,float height){
        this.radius=radius;
        this.height=height;
    }
    public String getData(){
        return radius+ " radius "+height+" height";
    }
    public float surfaceArea(){
//        2πrh+2πr²
        return (2*((float) Math.PI)*radius*height)+(2*((float) 22 /7)*radius*radius);
    }
    public float volume(){
//        π r² h
        return (float) (Math.PI*radius*radius*height);

    }

}

public class OOPPractise2 {
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setData(5f,6f);
        System.out.println(c1.getData());
        System.out.println("Surface Area: "+c1.surfaceArea());
        System.out.println("Volume: "+ String.format("%.2f",c1.volume()));
    }
}
