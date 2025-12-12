package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution1 {
    static ArrayList<Integer> commonElements(int[] a, int[] b) {

        int max = 100000;     // assume numbers are <= 10^5
        
        int cnt=0;
        Arrays.sort(a);
        Arrays.sort(b);
         max = (a[a.length-1]>= b[b.length-1] )? a[a.length-1] : b[b.length-1];
         int freq[] = new int[max + 1];
         
        System.out.println(a+ "\n" +b);
        // Count frequency in first array
        for (int x : a) {
        	cnt++;
            freq[x]++;
        }

        ArrayList<Integer> result = new ArrayList<>();
       System.out.println(cnt);
       cnt=0;
        // Check common elements (with duplicates)
        for (int x : b) {
        	cnt++;
            if (freq[x] > 0) {
                result.add(x);
                freq[x]--;     // decrease count
            }
        }
        System.out.println(cnt);
        // Sort result (small list)
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args)
    {
    	
        int[] a = {3, 4, 2, 2, 4};
        int[] b = {3, 2, 2, 7};

        ArrayList<Integer> commonElements = commonElements(a, b);
        for (int num : commonElements) {
            System.out.print(num + " "); 
    	 
		/*
		 * for(int j : result) { System.out.println(j +" "); }
		 */
    }
    }
    }


    
    

