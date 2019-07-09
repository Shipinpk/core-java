
public class ConstructorDemo {
	
	//default constructor
	public ConstructorDemo()
	{
	  System.out.println("iam in the constructor demo and i will be executed when object invoke");
	  
	}
	
	//parameterized constructor
	public ConstructorDemo(int a, int b)
	{
		System.out.println("i am in the parmeterized constructor");
		int c=a+b;
		System.out.println(c);
	}
	//parameterized constructors
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	
	
	// sample given method
	public void getdata()
	{
		System.out.println("iam in the method ");
	}

	
	public static void main(String[] args) {
		
		// constructor means a block of code executed when the object creation
		//difference between constructor and method is that, methods will return values.but does not constructor.
		//the constructor name should be same of class
		//when ever you create an object the constructor will be called.
		// if you are not defined a constructor it will called default constructor
		
		ConstructorDemo cd=new ConstructorDemo();
		
		ConstructorDemo cdd=new ConstructorDemo(4,5);// iam passing the parameters value inside the object, so it will check the parameterized constructor
		
		ConstructorDemo str=new ConstructorDemo("hello");
		
	//	cd.getdata(); // still iam calling only the getdata method.
		
	}

}
