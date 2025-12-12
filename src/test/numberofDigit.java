package test;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class numberofDigit {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		deq.add(1);
		deq.add(2);
		deq.add(4);
		deq.add(5);
		deq.add(6);
		int x = 3;
		//deq = [1 2 4 5 6]
		
		 if(x<0||x>deq.size()) return;
	        int dex=0;
	        Iterator <Integer> tx = deq.iterator();
	        while(tx.hasNext())
	        {
	        	tx.next();
	        	if(dex==x)
	        	{
	        		tx.remove();
	        	}
	        	dex++;
	        }
	       
	        System.out.println("dex=" + dex);
	        ArrayList<Integer> a = new ArrayList<>();
	        
		a.get(dex)
	}

	
}


