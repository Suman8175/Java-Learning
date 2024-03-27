


public class TowerOfHannoi {

    public static void TOH(int k,int start,int end){
        if (k==0){
           return;
        }
        else {
            int aux=6-start-end;
            TOH(k-1,start,aux);
            System.out.println("Move from "+start+" to "+end);
            TOH(k-1,aux,end);
        }
    }

    public static void main(String[] args) {
        TOH(1,1,3);
    }
}
