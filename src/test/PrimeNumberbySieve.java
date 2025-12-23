package test;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberbySieve {
	
	public static boolean prime(int n)
	{
		
		boolean isPrime = true;
		
		
		
		for(int p = 2;p*p<=n; p++)
		{
			if(n%p==0)
				return false;
						
		}
			
		
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 1; i<30;i++)
			if(prime(i))
			{
				list.add(i);
			
			}
			
		System.out.println("number = " + 127 + (prime(127) ? " is Prime" : " not Prime"));
		System.out.println(list);
	 	
		
	}

}
