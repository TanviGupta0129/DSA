package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] b = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (m != r){
            System.out.println("ERROR");
            return;
        }

        int[][] product = new int[n][c];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < m; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int[] ints : product) {
            for (int j = 0; j < product[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }
}

//input: M1: 2, 3
//11
//12
//13
//21
//22
//23
//       M2: 3, 4
//11
//12
//13
//14
//21
//22
//23
//24
//31
//32
//33
//34
//output: 776 812 859 884 
//        1406 1472 1559 1604 