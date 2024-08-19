package Arrays;

import java.util.*;
public class DigitsFrequency {
    public static void main(String[] args) {  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d= sc.nextInt();
        int count=0;
        while(n>0){
            int k=n%10;
            if(k==d){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

// input: 9927329
// output: 3