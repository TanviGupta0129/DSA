package Arrays;

import java.util.Scanner;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if (arr[i][j] > x){
                j--;
            }else {
                i++;
            }
        }
        System.out.println("Not found");
    }
}

// input: 3
//        3 12 9
//        5 2 89
//        90 45 22
//89
//output: 1 , 2