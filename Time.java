

class Timee{
    int hour;
    int minute;
    int second;
    Timee(int hour,int minute,int second){
       this.hour= hour;
       this.minute= minute;
       this.second= second;
    }
    public Timee AddTime(Timee other){
        int totalSecond=this.second+ other.second;
        int totalMinute=this.minute+ other.minute+totalSecond/60;
        int totalHour=this.hour+ other.hour+totalMinute/60;
        return new Timee(totalHour,totalMinute %60,totalSecond %60);
    }
    public String toString(){
        return hour + ": "+minute+": "+second;
    }
}

class AddString{
    String name;
    AddString(String name){
      this.name=name;
    }
    public AddString add(AddString other){
        String twoNames=this.name+" "+other.name;
        return new AddString(twoNames);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Time {
    public static void main(String[] args) {
        Timee t1=new Timee(2,30,31);
        Timee t2=new Timee(2,30,31);
        Timee sum=t1.AddTime(t2);
        System.out.println(sum.minute);
        System.out.println(sum.hour);
        System.out.println(sum.second);
        AddString a1=new AddString("Suman");
        AddString a2=new AddString("David");
        AddString s=a1.add(a2);
        System.out.println(s);
    }
}
