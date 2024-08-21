package Arrays;

import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int g = 0; g < arr.length; g++ ) {
            for (int i =0 , j = g ; j < arr.length ; i++ , j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

// input: 2
//        11
//        12
//        21
//        22
// output:11 22 12