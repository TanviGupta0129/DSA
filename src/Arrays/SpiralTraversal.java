package Arrays;

import java.util.Scanner;

public class SpiralTraversal {
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

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = n * m;
        int cnt = 0;

        while (true) {
            // left wall
            for (int i = minr , j = minc; i <= maxr && cnt < tne; i++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            minc++;

            // bottom wall
            for (int i = maxr , j = minc; j <= maxc && cnt < tne; j++) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            maxr--;

            // right wall
            for (int i = maxr , j = maxc; i >= minr && cnt < tne; i--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            maxc--;

            // top wall
            for (int i = minr , j = maxc; j >= minc && cnt < tne; j--) {
                System.out.print(arr[i][j] + " ");
                cnt++;
            }
            minr++;
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