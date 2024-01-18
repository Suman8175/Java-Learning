public class ForEachLoop {
    public static void main(String[] args) {
        int [] marks={10,20,30,44};
        System.out.println(marks.length);
//    Printing arrays data by for loop
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("New");
        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
//        For Each Loop
        System.out.println("ForEach Loop");
    for (int elements:marks){
        if(elements==30){
            continue;
        }
        System.out.println(elements);
    }
    }



}
