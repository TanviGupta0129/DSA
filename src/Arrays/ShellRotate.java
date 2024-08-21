package Arrays;

import java.util.Scanner;

public class ShellRotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt(); // Shell number
        int r = scn.nextInt(); // Number of rotations

        rotateShell(arr, s, r);
        display(arr);
        scn.close();
    }

    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oneD = fillOneDFromShell(arr, s);
        rotate(oneD, r);
        fillShellFromOneD(arr, s, oneD);
    }

    public static int[] fillOneDFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int size = 2 * (maxr - minr + maxc - minc);
        int[] oneD = new int[size];

        int idx = 0;
        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        // top wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        return oneD;
    }

    public static void fillShellFromOneD(int[][] arr, int s, int[] oneD) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int idx = 0;
        // left wall
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }
        // bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }
        // right wall
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
        // top wall
        for (int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }
    }

    public static void rotate(int[] oneD, int r) {
        r = r % oneD.length;
        if (r < 0) {
            r = r + oneD.length;
        }

        reverse(oneD, 0, oneD.length - r - 1);
        reverse(oneD, oneD.length - r, oneD.length - 1);
        reverse(oneD, 0, oneD.length - 1);
    }

    public static void reverse(int[] oneD, int left, int right) {
        while (left < right) {
            int temp = oneD[left];
            oneD[left] = oneD[right];
            oneD[right] = temp;
            left++;
            right--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}