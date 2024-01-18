public class ArrayPractise {
    public static void main(String[] args) {
        //WAP to create an array of 5 floats and print their sum

//        float [] floatArray={1.0f,2.1f,3.2f,4.3f,5.4f};
//        float totalSum=0.0f;
//        for (float sum:floatArray){
//            totalSum=totalSum+sum;
//        }
//            System.out.println(totalSum);

        //WAP to find out whether the given number is present in an array or not
//        int [] numbers={6,12,18,20,24};
//        int givenNumber=19;
//        boolean isArray=false;
//        for (int i=0;i<numbers.length;i++){
//            if (numbers[i]==givenNumber){
//                System.out.println("Number "+givenNumber +" is present at "+"index "+i);
//
//            }
//
//        }
//        or
//    for (int element:numbers){
//        if (element==givenNumber){
//            isArray=true;
//        }
//    }
//    if (isArray==true){
//        System.out.println("It is in array");
//    }
//    else {
//        System.out.println("It is not in array");
//    }

    //WAP to calculate average marks in array using foreach loop
//        int[] marks={40,50,60,70,80};
//    float average=0;
//    for (int m:marks){
//        average=average+m;
//    }
//        System.out.println(average/marks.length);

        //WAP to multiply matrix of 2*3
//        int [][]first ={{2,3,4},{4,5,6}};
//        int [][]second ={{3,4,5},{6,7,8}};
//
//        for (int i=0;i< first.length;i++){
//            for (int j=0;j<first[i].length;j++){
//                System.out.print(second[i][j]*first[i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

        //WAP to reverse an array
        //desc
//        {2,4,6,8,10,12}
//
//        i=0
//        l=5
//
//        replace i with l-1-i
//        meaning 0th element with (6-1-0)=5th element
//
//        i=1
//        1th element with (6-1-1)=4th element
//
//        i=2
//        2th element with (6-1-2)=3rd element




        int []original={4,8,12,16,20,24};
       for (int i=0;i< original.length/2;i++){
           int temp=0;
          temp =original[i];
          original[i]=original[original.length-1-i];
           original[original.length-1-i]=temp;
       }
        for (int m:original){
            System.out.print(m+" ");
        }
  //If array is sorted or not
        int []arr={0,4,8,1,16,22};
        boolean isSorted=true;
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
