

public class DP {

public static int Fibo(int n, int[] qb){
    if (n==0 || n==1){
        return n;
    }
    if (qb[n]!=0){
        return qb[n];
    }
    System.out.println("Using "+n);
    int ans= Fibo(n-1,qb)+Fibo(n-2,qb);
    qb[n]=ans;
    return ans;
}



    public static int findStep(int n)
    {
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;

        else
            return findStep(n - 3) + findStep(n - 2)
                    + findStep(n - 1);
    }

    public static int count(int n,int []qb){
    if (n==0){
        return 0;
    }
    else if( n <=2){
            return n;
        }
    else if (n==3) {
        return 4;
    }
    if (qb[n]>0){
        return qb[n];
    }
        System.out.println("Hello "+n);
        int step1 = count(n - 1,qb);
        int step2 = count(n - 2,qb);
        int step3 = count(n - 3,qb);
        int result= step1 + step2 + step3;
        qb[n]=result;
        return result;
    }



    public static void counter(int n,int[]value ,int[] qb){
        qb[qb.length-1]=1;
        for (int i=value.length-1;i>=0;i--){
//            i=0
            for (int j=1;j<=value[i] && i+j<qb.length;j++){
//
                qb[i]+=qb[i+j];
            }
        }
        System.out.println(qb[0]);
    }

    public static int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles, 0);
    }
    public static int helper(int target,int maxDoubles,int count){
        if (target==1){
            return count;
        }
        count++;
        if (target% 2==0 && maxDoubles>0){
            return helper(target/2,maxDoubles-1,count);
        }
        else {
            return helper(target-1,maxDoubles,count);
        }
    }

    public static int greedy(int num,int maxdoubles){
    if (num==0){
        return 1;
    }
    if (num%2==0 && maxdoubles>0){
        return 1+ greedy(num/2,maxdoubles-1);
    }
    return 2+greedy(num/2,maxdoubles);
    }


    public static int minMoves2(int target, int maxDoubles) {
    int count=0;
        while (target!=1){
            count++;
            if (target % 2==0 && maxDoubles>0){
                target=target/2;
                maxDoubles=maxDoubles-1;
            }
            else{
            target=target-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    int n=10;
//        System.out.println(Fibo(n,new int[n+1]));
//        System.out.println(findStep(6));
//        System.out.println(count(6, new int[n+1]));

        int n1=8;
        int[] value=new int[]{3,2,1,3,4,4,2};
        int [] qb=new int[n1];
       counter(n1,value,qb);
        System.out.println(minMoves2(656101987,1));
//        System.out.println(greedy(656101987,1));
    }
}
