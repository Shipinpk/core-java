
public class SuperchildDemo extends SuperparentDemo {
	
	String name="i am in child demo";
	
	public void getdata()
	{
		System.out.println(super.name);// this is the super keyword which differentiate the same variable called name in child and parent
		System.out.println("iam in the child demo");
	}

	public void parentdemo()
	{
		super.parentdemo();// the super keyword will call the parent method (same method name in child and parent class)
		System.out.println("iam in the child demo method");
	}
	
	public SuperchildDemo()// so i create a child constructor 
	{
		super();
		System.out.println("i am in the child constructor");
	}
	
	public static void main(String[] args) {
		
		SuperchildDemo scd=new SuperchildDemo();
		scd.getdata();
		scd.parentdemo();
		
		
		
		
	}

}
