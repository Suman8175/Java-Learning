import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionPractise {

    //To print n natural numbers
    public static void naturalNumber(int i){

        if (i==0){
            return;
        }

        System.out.println(i);
        naturalNumber(i-1);
    }


    public static void naturalNumberByAscending(int i){
        if (i==0){
            return;
        }
        naturalNumberByAscending(i-1);
        System.out.println(i);
    }


    public static int factorial(int i){
        if (i==1){
            return 1;
        }
        return i* factorial(i-1);
    }

    public static int SumOf(int i){
        if (i<=0){
            return i;
        }
        return i + SumOf(i-1);
    }

    public static int SumOfDigits(int i){
        if (i<9){
            return i;
        }
        int r=i%10;
        int newValue=i/10;
        return r+SumOfDigits(newValue);
    }
    public static int sum;

   public static void Reverse(int i){
       if (i==0){
           return ;
       }
       int remainder=i %10;
       sum=sum*10+remainder;
       Reverse(i/10);
   }

    public static boolean palindrome(int i){
        Reverse(i);
            return i== sum;

    }

    public static boolean StringPalindrome(String num){
       if (num.length()==1 || num.isEmpty()){
           return true;
       }
       if ( num.charAt(0)==num.charAt(num.length()-1)){
           return StringPalindrome(num.substring(1,num.length()-1));
       }
return false;
    }

    public static int count;
    public static void countZero(int i){
       if (i<=0){
           return;
       }
       int remainder=i%10;
       if (remainder==0){
          count=count+1;
       }
      countZero(i/10);
    }


    public static int numberOfSteps(int i){
        return ToZero(i,0);
    };
    public static int ToZero(int i,int steps){
        if (i==0){
            return steps;
        }
        if (i%2!=0){
            i=i-1;
           return ToZero(i,steps+1);
        }
       return ToZero(i/2,steps+1);
    }

    public static  boolean sorted(int[] a,int index){
        if (index==a.length-1){
            return true;
        }
        return (a[index] <= a[index+1]) && sorted(a,index+1);
    }


    public  static  int search(int []a,int index,int target){
        if (index>a.length-1){
            return -1;
        }
        if (a[index]==target){
            return index;
        }
        return search(a,index+1,target);
    }


    public static int linearSearch(int []A,int count,int target){
        if (count== A.length){
            return -1;
        }
        if (A[count]==target){
            return count;
        }
        return linearSearch(A,count+1,target);
    }
    public static int binarySearch(int []A,int start,int end,int target){
        ArrayList<Integer> list=new ArrayList<>();
        int mid=end+(start-end)/2;
        if (A[mid]==target){
            return mid;
        }
        if (A[start]<A[mid]){
            //Sorted
            //Now check if value lies in this sorted array
            if (target>=A[start] && target<=A[mid]){
               return binarySearch(A,start,mid-1,target);
            }
            return binarySearch(A,mid+1,end,target);
        }
        else if (A[mid]<A[end]){
            if (target>=A[mid] && target<=A[end]){
                return binarySearch(A,mid+1,end,target);
            }
            return binarySearch(A,start,mid-1,target);
        }
return -1;
    }


    public static void pattern(int row,int column){
        if (row==0){
            return;
        }
        if (column<row){
            System.out.print("*");
            pattern(row,column+1);
        }
        else{
        System.out.println();
        pattern(row-1,0);

        }
    }

    public static ArrayList<Integer> rotatedSortedBinarySearch(int[] A, int start, int end, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int mid = start + (end - start) / 2;

        if (A[mid] == target) {
            result.add(mid);

            // Search left for more occurrences
            int left = mid - 1;
            while (left >= start && A[left] == target) {
                result.add(left);
                left--;
            }

            // Search right for more occurrences
            int right = mid + 1;
            while (right <= end && A[right] == target) {
                result.add(right);
                right++;
            }
        } else if (start < end) {
            if (A[start] <= A[mid]) {
                if (target >= A[start] && target <= A[mid]) {
                    return rotatedSortedBinarySearch(A, start, mid, target);
                } else {
                    return rotatedSortedBinarySearch(A, mid + 1, end, target);
                }
            } else {
                if (target >= A[mid] && target <= A[end]) {
                    return rotatedSortedBinarySearch(A, mid + 1, end, target);
                } else {
                    return rotatedSortedBinarySearch(A, start, mid, target);
                }
            }
        }

        return result;
    }

    public static void bubblesort(int []A,int index,int end){
        if (end==0){
            return;
        }
        if (index<end){
            if (A[index]>A[index+1]){
                int a=A[index];
                A[index]=A[index+1];
                A[index+1]=a;
            }
                  bubblesort(A,index+1,end);
        }
            else{

            bubblesort(A,0,end-1);
        }

    }

    public static int temp, index;
    public static void selectiveSort(int []A,int length){

       for (int i=0;i<length;i++){
           for (int j=i+1;j<=length;j++){
               if (A[j]<A[index]){
                   index=j;
               }
           }
           temp=A[i];
           A[i]=A[index];
           A[index]=temp;
       }
    }

    public static void selectionSortUsingRecursion(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        int maxIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[n];
        arr[n] = arr[maxIndex];
        arr[maxIndex] = temp;
        selectionSortUsingRecursion(arr, n - 1);
    }

    public static  void swapper(int[]A,int lastIndex){
        if (lastIndex==0){
            return;
        }
        int hold=0;
        for (int i=1;i<=lastIndex;i++){
            if (A[i]>A[hold]){
                hold=i;
            }
            swapper(A,lastIndex-1);
        }
    }


    public  static int[] me(int[] left,int []right,int[] result){
      int l,r,m;
      l=r=m=0;
      while (l<left.length && r<right.length){
          if (left[l]<=right[r]){
              result[m]= left[l];
              l++;
          }
          else {
              result[m]=right[r];
              r++;
          }
          m++;
      }

      while (m<left.length+right.length){
          if (l>left.length-1){
              while (m<result.length){
                  result[m]=right[r];
                  r++;
                  m++;
              }
          }
          if (r>right.length-1){
              while (m<result.length){
                  result[m]=left[l];
                  l++;
                  m++;
              }
          }
      }
      return result;
    }



    public static void main(String[] args) {
//        naturalNumber(10);
//        naturalNumberByAscending(5);
//        System.out.println(factorial(5));
//        System.out.println(SumOf(7));
//        System.out.println(SumOfDigits(117));
//        Reverse(24156);
//        System.out.println(sum);
//        System.out.println(palindrome(12343210));
//        System.out.println(StringPalindrome("23432"));
//        countZero(10001040);
//        System.out.println(count);
//        System.out.println( numberOfSteps(123));
//        System.out.println(sorted(new int[]{1,2,3, 2, 3,6,6,6,6},0));

//        System.out.println(search(new int[]{12,2,33,14,53,6},0,53));

//        System.out.println(linearSearch(new int[]{9,8,7,2,3,4,5,6},0,15));

//        int [] A=new int[]{7,8,9,1,2,3,4,5,6};
//        int length=A.length-1;
//        System.out.println(binarySearch(A,0,length,1));
////        pattern(4,0);
//        int[] arr= new int[]{6, 2, 8, 10, 1, 4};
//        bubblesort(arr, 0, 5);
//        System.out.println(Arrays.toString(arr));

//        int[] arr =new int[]{8,9,7,1,2,6,14,3};
//        int length=arr.length-1;
//        selectiveSort(arr,length);
//        selectionSortUsingRecursion(arr, length);
//        System.out.print(Arrays.toString(arr));


        int[] left=new int[]{3,5,6,15,16,18};
        int[] right=new int[]{4,7,9,14,20,22};
        int []result=new int[left.length+right.length];
        System.out.println(Arrays.toString(me(left, right, result)));

    }






}
