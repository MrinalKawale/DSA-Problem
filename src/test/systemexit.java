package test;

public class systemexit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			System.out.println("try block");
			System.exit(0);
		}
		catch(RuntimeException e)
		{
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("call finally");
		}
	}

}
