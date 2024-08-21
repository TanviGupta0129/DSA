package Arrays;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int svj=0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]){
                    svj=j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if (flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}


//input: 3
//       1 2 3
//       4 5 6
//       7 8 9
//output:7