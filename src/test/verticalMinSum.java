package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verticalMinSum {

	    public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
	        // Find the maximum number of columns across all rows
	        int maxColumns = 0;
	        for (ArrayList<Integer> row : arr) {
	            maxColumns = Math.max(maxColumns, row.size());
	        }
	        
	        // Initialize an array to store vertical sums
	        int[] verticalSums = new int[maxColumns];
	        
	        // Compute the vertical sums
	        for (int i = 0; i < arr.size(); i++) {
	            for (int j = 0; j < arr.get(i).size(); j++) {
	                verticalSums[j] += arr.get(i).get(j);
	            }
	        }
	        
	        // Find the minimum vertical sum
	        int minSum = Integer.MAX_VALUE;
	        for (int sum : verticalSums) {
	            minSum = Math.min(minSum, sum);
	        }
	        
	        return minSum;
	    }
	    
	    public static void main(String[] args) {
	        // Example 1
	        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
	        //List<Integer> l = new List<>();
	        
	        arr1.add(new ArrayList<>(Arrays.asList(2, 3, 5)));
	        arr1.add(new ArrayList<>(Arrays.asList(1, 2)));
	        arr1.add(new ArrayList<>(Arrays.asList(1, 4, 5, 1)));
	        System.out.println(minimumVerticalSum(arr1)); // Output: 1
	        
	        // Example 2
	        ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
	        arr2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
	        arr2.add(new ArrayList<>(Arrays.asList(3, 3)));
	        arr2.add(new ArrayList<>(Arrays.asList(1, 2, 5, 9)));
	        System.out.println(minimumVerticalSum(arr2)); // Output: 5
	    }
	


}
