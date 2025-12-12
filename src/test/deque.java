package test;

import java.util.ArrayDeque;

public class deque {

	   public static void pb(ArrayDeque<Integer> dq, int x) {
	        //  code here
	        dq.addLast(x);
	        
	    }

	    public static void ppb(ArrayDeque<Integer> dq) {

	        
	        //  code here
	    	if(!dq.isEmpty())
	    	{
	    		dq.removeLast();
	    	}
	    	
	    }

	        
	    public static int front_dq(ArrayDeque<Integer> dq) {
	        //  code here
	    	return dq.getFirst();
	    }
	        

	    public static void pf(ArrayDeque<Integer> dq, int x) {
	        //  code here
	    	dq.addFirst(x);
	    }
	
		 public static void main(String[] args) {

		        ArrayDeque<Integer> dq = new ArrayDeque<>();

		        // Given input queries
		        String[][] queries = {
		            {"pf", "5"},
		            {"pf", "10"},
		            {"pb", "6"},
		            {"f"},
		            {"pp_b"}
		        };

		        for (String[] q : queries) {
		            String op = q[0];

		            switch (op) {

		                case "pf":
		                    int x1 = Integer.parseInt(q[1]);
		                    pf(dq, x1);
		                    break;

		                case "pb":
		                    int x2 = Integer.parseInt(q[1]);
		                    pb(dq, x2);
		                    break;

		                case "pp_b":
		                    ppb(dq);
		                    break;

		                case "f":
		                    System.out.println(front_dq(dq));
		                    break;
		            }
		        }

		        // Print final deque content
		        System.out.println("Final Deque: " + dq);
		        
		    }
		}

