package learn.dsa.Patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(4);
//        pattern4(5);
//        pattern5(5);
//        pattern7(4);
//        pattern8(5);
        pattern9(5);
    }

//        *
//        **
//        ***
//        ****

    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }


//            *****
//            ****
//            ***
//            **
//            *
    public static void pattern2(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

    public static void pattern3(int n){
        
        //way -1 
        
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = n-1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        
//        way -2
//        System.out.println(n/2);
//        for (int i = 0; i < n; i++) {
//            if(i < (n/2)){
//                for (int j = 0; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            }
//            else{
//                for (int j = n-i; j > 0; j--) {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n*2; i++) {
            int noOfCols = i > n ? n*2 - i  : i;
//            System.out.println(noOfCols);
            for (int j = 0; j < noOfCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



//                  *
//                 * *
//                * * *
//               * * * *
//              * * * * *
//               * * * *
//                * * *
//                 * *
//                  *
    public static void pattern4(int n){
//        for (int i = 0; i < n * 2; i++) {
////            int noOfSpaces = n-i;
////            int noOfSpaces = i > n ? i - n : n -i;
//            int noOfCols = i > n ? 2*n - i : i;
//            int noOfSpaces = n - noOfCols;
//            for (int j = 0; j < noOfSpaces; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < noOfCols; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int rows = 0; rows < n*2; rows++) {
            //for loop to add rows
            int noOfColsCount = rows > n ? n*2 -rows : rows;
            int noOfSpacesCount  = rows > n ? rows-n: n - rows;
            for (int i = 0; i < noOfSpacesCount; i++) {
                System.out.print(" ");
            }
            for (int noOfCols = 0; noOfCols < noOfColsCount; noOfCols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//                     1
//                    212
//                   32123
//                  4321234
//                 543212345
    public static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            int noOfColsCount ;
            int noOfSpacesCount = n - row;


            for (int noOfSpaces = 0; noOfSpaces < noOfSpacesCount; noOfSpaces++) {
                System.out.print(" ");
            }
            for (int col = row; col > 1; col--) {
                System.out.print(col);
            }
            for (int col2 = 1; col2 <= row ; col2++) {
                System.out.print(col2);
            }
            System.out.println();
        }
    }
/*  1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1          */
    public static void pattern6(int n){
        for (int row = 1; row < n*2; row++) {
            int spacesCount = row > n ? row -n : n -row;
            int colsCount = row > n ? n*2 - row: row;
            for (int spaces = 0; spaces < spacesCount; spaces++) {
                System.out.print(" ");
            }
            for (int col1 = colsCount; col1 > 1; col1--) {
                System.out.print(col1);
            }
            for (int col2 = 1; col2 <= colsCount; col2++) {
                System.out.print(col2);
            }

            System.out.println();
        }
    }
/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4 */
    /*Getting the distance from the wall and subtracting it with the n*/
    public static void pattern7(int n){
        int totalN = n *2;
        for (int row = 0; row <= totalN-2 ; row++) {

            for (int cols1 = 0; cols1 <= totalN-2 ; cols1++) {
                int atEveryIndex =  n - Math.min(Math.min((totalN-2) - row, row), Math.min(cols1, (totalN - 2) - cols1));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }


//            0
//            1 0
//            0 1 0
//            1 0 1 0
//            0 1 0 1 0
    public static void pattern8(int n){
//        boolean outerFlag = true;
        for(int i = 1; i<= n; i++){
            boolean flag = i%2==0?true:false;
            for(int j = 1; j<= i; j++ ){
                System.out.print((flag?1:0) + " ");
                flag = !flag;
            }
            System.out.println();
//            outerFlag = !outerFlag;
        }
    }
//            1        1
//            12      21
//            123    321
//            1234  4321
//            1234554321
    public static void pattern9(int n){
        for (int i = 1; i <= n; i++) {
        int tempN = n;
            for (int j = 1; j <= n*2; j++) {
                int num = j<=n?j:tempN--;
                System.out.print(num<=i?num:" ");
            }
            System.out.println();
        }
//            for (int k = n; k >= 1 ; k--) {
//                String num = k > i?" ":String.valueOf(k);
//                System.out.print(num);
//            }
    }
}
