package Recursion;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0)
            return;

        System.out.println(n + "Pre");
        pzz(n - 1);
        System.out.println(n + "In");
        pzz(n - 1);
        System.out.println(n + "Post");
    }
}
