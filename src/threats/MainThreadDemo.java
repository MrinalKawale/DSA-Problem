package threats;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		Thread t = Thread.currentThread();
		System.out.println("Current running thread is "+t.getName());
		System.out.println("Current running thread is "+t.getPriority());
		t.setName("n1");
		t.setPriority(10);//can set priority to(1to10)
		System.out.println("Current running thread is "+t.getName());
		System.out.println("Current running thread is "+t.getPriority());
		

	}

}
