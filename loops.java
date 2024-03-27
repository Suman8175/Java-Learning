public class loops {


    public static void main(String[] args) {

//        1.
//                * * * *
//                * * * *
//                * * * *
//                * * * *

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //        2.
//                *
//                * *
//                * * *
//                * * * *
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //        3.
//                1
//                1 2
//                1 2 3
//                1 2 3 4

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //        3.
//                1
//                2 2
//                3 3 3
//                4 4 4 4

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //        5.
//                * * * *
//                * * *
//                * *
//                *
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //        6.
//                1 2 3 4 5
//                1 2 3 4
//                1 2 3
//                1 2
//                1

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //        7.
//                    *
//                   ***
//                  *****
//                 *******
//                *********


        for (int i = 0; i < n; i++) {
//            space
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

//            stars
            for (int l = 0; l < 2 * i + 1; l++) {
                System.out.print("*");
            }

//        space
            for (int k = 0; k <= n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //        8.
//                *********
//                 *******
//                  *****
//                   ***
//                    *
        System.out.println("--------");
        for (int i = 0; i <= n; i++) {
//      space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

//      stars
            for (int k = 0; k < (2 * n - (2 * i - 1)); k++) {
                System.out.print("*");
            }

//      space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


//  9
//   *
//   **
//   ***
//   ****
//   *****
//   ****
//   ***
//   **
//   *
        System.out.println("--------");
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

//10
//        1
//        01
//        101
//        0101
//        10101

        System.out.println("-------");
        int pattern = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                pattern = 1;
            } else {
                pattern = 0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(pattern);
                pattern = 1 - pattern;

            }

            System.out.println();
        }

//    11

//        1      1
//        12    21
//        123  321
//        12344321
        System.out.println("-----");
        int space=2*(n-1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
            space -=2;
        }
    }
}
