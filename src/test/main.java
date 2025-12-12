package test;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> lst = new ArrayList<>();

		 System.out.println(lst.indexOf(0) );
		 lst.ensureCapacity(0);
	       for (int i = 3; i < 10; ++i) {

	           lst.add(i);
	       }
	       System.out.println(lst.size());
	       System.out.println(lst.toArray()[0]);
	}

}
