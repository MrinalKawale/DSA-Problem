
public class nextPrimaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 56;
		
		System.out.println("next Prime number = "+ nextPrime(n)) ;
		
	}
	
	public static int nextPrime(int num) {
		
		int nextNum = num+1;
		boolean prime = false;
		
		while(!isPrime(nextNum))
		{
			nextNum++;
		}
		return nextNum;
	}
	
	public static boolean isPrime(int n)
	{
		if (n <= 1) return false;
		System.out.println("**isPrime** "+n);
		boolean isPrime = false;
			for(int i = 2; i*i<=n;i++)
			{
				System.out.println("value of = "+ i+ ", tcondi = "+i*i +", num = "+n +", is true = "+ i%n);
				if(n%i==0) 
					{System.out.println(i);
					return false;
					}
				
			}
			return true;
	}

}
