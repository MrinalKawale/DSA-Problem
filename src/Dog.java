
public class Dog {
	String name;
	int age;
	
	public Dog(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public String full()
	{
		return ("Hi my Name is "+this.getName()+" and age is "+this.getAge());
	}
	
public static void main(String[]args)
{
	Dog raj = new Dog("Raj",10);
			System.out.println(raj.full());
	}

}
