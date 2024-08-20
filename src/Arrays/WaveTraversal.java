package Arrays;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}

//input: 2 , 3
//11
//12
//13
//21
//22
//23
//output: 11 21 22 12 13 23