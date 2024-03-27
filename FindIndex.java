public class FindIndex {

    public static int indexOfArray(int A[],int left,int right,int number){
        int mid=(left+right)/2;
        if (A[mid]==number){
            return mid;
        }
        if (A[mid]>number){
            return indexOfArray( A,left,(mid-1),number);
        }
        return indexOfArray(A,mid+1,right,number);
    }


    public static void main(String[] args) {
        System.out.println(indexOfArray(new int[]{11, 16, 21, 24, 45, 76, 97},0,6,76));
    }
}
