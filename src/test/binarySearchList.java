package test;

import java.util.ArrayList;

public class binarySearchList {
	
	    public static int binarySearchAL(ArrayList<Integer> list, int k) {
	        int left = 0;
	        int right = list.size() - 1;

	        // Binary search loop
	        while (left <= right) {
	            int mid = left + (right - left) / 2; // Avoid overflow for large indices

	            if (list.get(mid) == k) {
	                return mid; // Element found, return its index
	            } else if (list.get(mid) < k) {
	                left = mid + 1; // Search in the right half
	            } else {
	                right = mid - 1; // Search in the left half
	            }
	        }

	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(6);
	        list.add(7);
	        int k = 6;
	        System.out.println(binarySearchAL(list, k)); // Output: 4

	        k = 2;
	        System.out.println(binarySearchAL(list, k)); // Output: 1

	        k = 5;
	        System.out.println(binarySearchAL(list, k)); // Output: -1
	    }
	


}
