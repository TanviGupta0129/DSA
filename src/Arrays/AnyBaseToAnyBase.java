package Arrays;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(getValue(n , b1, b2));
    }

    public static int getValue(int n, int b1, int b2){
       int dec = getValueInDecimal(n , b1);
       int dn = getValueInBase(dec , b2);
       return dn;
    }
    public static int getValueInDecimal(int n, int b){
        int res = 0;
        int p=1;
        while (n>0){
            int k = n % 10;
            n=n/10;
            res += k * p;
            p*=b;
        }
        return res;
    }

    public static int getValueInBase(int n, int b){
        int res = 0;
        int p=1;
        while (n>0){
            int k = n % b;
            n=n/b;
            res += k * p;
            p*=10;
        }
        return res;
    }
}

// input: 172 , 8 , 2
// output: 1111010