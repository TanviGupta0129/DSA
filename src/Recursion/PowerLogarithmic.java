package Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(logarithmic(n, m));
    }

    public static int logarithmic(int n, int m) {
        if (m==0){
            return 1;
        }
        int xn = logarithmic(n, m/2);
        int xn2= xn * xn;
        if(m%2==1){
            xn2 = xn2 * n;
        }
        return xn2;
    }
}
