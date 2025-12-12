package test;


import java.util.ArrayList;
import java.util.Collections;
	public class CountOccurrences {


		    public static int countOccurrences(ArrayList<Integer> list, int k) {
		        // Find the first occurrence of k
		        int first = findFirstOccurrence(list, k);
		        if(first ==-1 )
		        {
		        	return 0;
		        }
		        // Find the last occurrence of k
		        int last = findLastOccurrence(list, k);

		        // Return the count of occurrences
		        return last - first + 1;
		    }

		    private static int findFirstOccurrence(ArrayList<Integer> list, int k) {
		    	int first = 0; int last = list.size()-1;
		    	int result = -1;
		    	while(first <= last)
		    	{ int mid = first +(last-first)/2;
		    		if(list.get(mid)==k)
		    		{
		    			result = mid;
		    			last = mid-1;
		    		}
		    		else if(list.get(mid)<k)
		    		{
		    			first = first+1;
		    		}
		    		else
		    		{
		    			last  = last -1;
		    		}
		    	}
		    	
		        return result;
		    }

		    private static int findLastOccurrence(ArrayList<Integer> list, int k) {
		    	int first = 0; int last = list.size()-1; int result = -1;
		    			while(first <= last)
		    			{
		    				int mid = first + (last-first)/2;
		    				if(list.get(mid)==k)
		    				{
		    					result = mid;
		    					first = mid+1;
		    				}
		    				else if(list.get(mid)<k)
		    				{
		    					first = mid +1; 		 
		    				}
		    				else
		    				{ last = last -1;
		    				}
		    				
		    			}
		        return result;
		    }

		    public static void main(String[] args) {
		        ArrayList<Integer> list = new ArrayList<>();
		        Collections.addAll(list, 1, 2, 3, 4, 4, 4, 5, 5, 6, 7);
		        int arr[]= {1,2,3,4,5};
		        

		        int k = 4;
		        System.out.println("Count of " + k + " is: " + countOccurrences(list, k)); // Output: 3

		        k = 5;
		        System.out.println("Count of " + k + " is: " + countOccurrences(list, k)); // Output: 2

		        k = 8;
		        System.out.println("Count of " + k + " is: " + countOccurrences(list, k)); // Output: 0
		    }
		}

