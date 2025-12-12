package test;

import java.util.Scanner;

class Solution {
    // Complete this function
    public int typeCast(double d) {
        // code here
        int a = (int)d;
        return a;
    }
    public static void main (String [] Args)
    {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        Solution s = new Solution();
        
        int a =    s.typeCast(d); 
        System.out.println(a);
    }
}