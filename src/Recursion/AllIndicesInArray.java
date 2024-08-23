package Recursion;

import java.util.Scanner;

public class AllIndicesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] iarr= allIndices(arr,x,0,0);
        if(iarr.length == 0){
            System.out.println("Empty Array");
            return;
        }

        for (int i=0;i<iarr.length;i++){
            System.out.print(iarr[i]+" ");
        }
    }
    private static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length) {
            return new int[fsf];
        }

        if(arr[idx] == x) {
            int[] iarr = allIndices(arr, x ,idx+1,fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }else {
            int[] iarr = allIndices(arr, x,idx+1,fsf);
            return iarr;
        }
    }
}
