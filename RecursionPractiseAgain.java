import java.util.Arrays;

public class RecursionPractiseAgain {

    public static int BinarySearch(int [] A,int start,int end,int target){
        int mid=end+(start-end)/2;
        if (A[mid]==target){
            return mid;
        }
        if (A[mid]>target){
            return BinarySearch(A,start,mid-1,target);
        }
        else {

        return BinarySearch(A,mid+1,end,target);
        }
    }


    public static void bubbleSort(int[] A,int noOfTimes,int counter){
        if (noOfTimes==0){
            return;
        }
        if (counter<noOfTimes){
            if( A[counter]>A[counter+1]){
                 int temp=A[counter];
                 A[counter]=A[counter+1];
                 A[counter+1]=temp;
            }
            bubbleSort(A,noOfTimes,counter+1);
        }
        bubbleSort(A,noOfTimes-1,0);
    }




    public static int bruteForce(int [] A,int length,int start,int target){

        if (start>length){
            return -1;
        }

        if (A[start]==target){
            return start;
        }
        return bruteForce(A,length,start+1,target);
    }



    public static boolean sortedOrNot(int []A,int index){
      if (index==A.length-1){
      return true;
      }
      return A[index]<A[index+1]&&(sortedOrNot(A,index+1));
    }


    public static int rotatedBinarySearch(int[]A,int start,int end,int target){
        int mid=start+(end-start)/2;
        if (A[mid]==target){
            return mid;
        }
        if (A[start]<A[mid]){
            if (A[start]<target && A[mid]>target){
                return rotatedBinarySearch(A,start,mid-1,target);
            }
            return rotatedBinarySearch(A,mid+1,end,target);
        }
        else{
            if (A[mid]<target && A[end]>=target){
                return rotatedBinarySearch(A,mid+1,end,target);
            }
            return rotatedBinarySearch(A,start,mid-1,target);
        }
    }


    public static void main(String[] args) {
//        int [] A= new int[]{1,3,5,7,8,10,12};
        int [] A= new int[]{121,12,5,371,1,48,2,50,51};
//        int [] A= new int[]{7,8,9,1,2,3,4,5,6};
        int length=A.length-1;
//        System.out.println(BinarySearch(A,0,length,12));
//        System.out.println(bruteForce(A,length,0,410));
//        System.out.println(sortedOrNot(A,0));
//        System.out.println(rotatedBinarySearch(A,0,length,6));
        bubbleSort(A,length,0);
        System.out.println(Arrays.toString(A));
    }
}
