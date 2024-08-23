package Recursion.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = getSubsequence(s);
        System.out.println(res);
    }

    public static ArrayList<String> getSubsequence(String s) {
        if(s.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(s);
            return res;
        }

        char ch = s.charAt(0);
        String sub = s.substring(1);
        ArrayList<String> res = getSubsequence(sub);
        ArrayList<String> mres= new ArrayList<>();
        for(String rstr: res){
            mres.add("_"+rstr);
        }
        for(String rstr: res){
            mres.add(ch+rstr);
        }
        return mres;
    }
}
